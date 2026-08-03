package com.facebook.share.internal;

/* loaded from: classes2.dex */
public class VideoUploader {
    private static final java.lang.String ERROR_BAD_SERVER_RESPONSE = "Unexpected error in server response";
    private static final java.lang.String ERROR_UPLOAD = "Video upload failed";
    private static final int MAX_RETRIES_PER_PHASE = 2;
    private static final java.lang.String PARAM_DESCRIPTION = "description";
    private static final java.lang.String PARAM_END_OFFSET = "end_offset";
    private static final java.lang.String PARAM_FILE_SIZE = "file_size";
    private static final java.lang.String PARAM_REF = "ref";
    private static final java.lang.String PARAM_SESSION_ID = "upload_session_id";
    private static final java.lang.String PARAM_START_OFFSET = "start_offset";
    private static final java.lang.String PARAM_TITLE = "title";
    private static final java.lang.String PARAM_UPLOAD_PHASE = "upload_phase";
    private static final java.lang.String PARAM_VALUE_UPLOAD_FINISH_PHASE = "finish";
    private static final java.lang.String PARAM_VALUE_UPLOAD_START_PHASE = "start";
    private static final java.lang.String PARAM_VALUE_UPLOAD_TRANSFER_PHASE = "transfer";
    private static final java.lang.String PARAM_VIDEO_FILE_CHUNK = "video_file_chunk";
    private static final java.lang.String PARAM_VIDEO_ID = "video_id";
    private static final int RETRY_DELAY_BACK_OFF_FACTOR = 3;
    private static final int RETRY_DELAY_UNIT_MS = 5000;
    private static final java.lang.String TAG = "VideoUploader";
    private static final int UPLOAD_QUEUE_MAX_CONCURRENT = 8;
    private static com.facebook.AccessTokenTracker accessTokenTracker;
    private static android.os.Handler handler;
    private static boolean initialized;
    private static com.facebook.internal.WorkQueue uploadQueue = new com.facebook.internal.WorkQueue(8);
    private static java.util.Set<com.facebook.share.internal.VideoUploader.UploadContext> pendingUploads = new java.util.HashSet();

    public static synchronized void uploadAsyncWithProgressCallback(com.facebook.share.model.ShareVideoContent videoContent, com.facebook.GraphRequest.OnProgressCallback callback) throws java.io.FileNotFoundException {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            uploadAsync(videoContent, "me", null, callback);
        }
    }

    public static synchronized void uploadAsyncWithProgressCallback(com.facebook.share.model.ShareVideoContent videoContent, java.lang.String graphNode, com.facebook.GraphRequest.OnProgressCallback callback) throws java.io.FileNotFoundException {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            uploadAsync(videoContent, graphNode, null, callback);
        }
    }

    public static synchronized void uploadAsync(com.facebook.share.model.ShareVideoContent videoContent, java.lang.String graphNode, com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) throws java.io.FileNotFoundException {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            uploadAsync(videoContent, graphNode, callback, null);
        }
    }

    private static synchronized void uploadAsync(com.facebook.share.model.ShareVideoContent videoContent, java.lang.String graphNode, com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, com.facebook.GraphRequest.OnProgressCallback progressCallback) throws java.io.FileNotFoundException {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            if (!initialized) {
                registerAccessTokenTracker();
                initialized = true;
            }
            com.facebook.internal.Validate.notNull(videoContent, "videoContent");
            com.facebook.internal.Validate.notNull(graphNode, "graphNode");
            com.facebook.share.model.ShareVideo video = videoContent.getVideo();
            com.facebook.internal.Validate.notNull(video, "videoContent.video");
            com.facebook.internal.Validate.notNull(video.getLocalUrl(), "videoContent.video.localUrl");
            com.facebook.share.internal.VideoUploader.UploadContext uploadContext = new com.facebook.share.internal.VideoUploader.UploadContext(videoContent, graphNode, callback, progressCallback);
            uploadContext.initialize();
            pendingUploads.add(uploadContext);
            enqueueUploadStart(uploadContext, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void cancelAllRequests() {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            java.util.Iterator<com.facebook.share.internal.VideoUploader.UploadContext> it = pendingUploads.iterator();
            while (it.hasNext()) {
                it.next().isCanceled = true;
            }
        }
    }

    private static synchronized void removePendingUpload(com.facebook.share.internal.VideoUploader.UploadContext uploadContext) {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            pendingUploads.remove(uploadContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized android.os.Handler getHandler() {
        android.os.Handler handler2;
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler2 = handler;
        }
        return handler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void issueResponse(final com.facebook.share.internal.VideoUploader.UploadContext uploadContext, final com.facebook.FacebookException error, final com.facebook.GraphResponse response, final java.lang.String videoId) {
        removePendingUpload(uploadContext);
        com.facebook.internal.Utility.closeQuietly(uploadContext.videoStream);
        if (uploadContext.callback != null) {
            if (error != null) {
                com.facebook.share.internal.ShareInternalUtility.invokeOnErrorCallback(uploadContext.callback, error);
            } else if (uploadContext.isCanceled) {
                com.facebook.share.internal.ShareInternalUtility.invokeOnCancelCallback(uploadContext.callback);
            } else {
                com.facebook.share.internal.ShareInternalUtility.invokeOnSuccessCallback(uploadContext.callback, videoId);
            }
        }
        if (uploadContext.progressCallback != null) {
            if (response != null) {
                try {
                    if (response.getGraphObject() != null) {
                        response.getGraphObject().put(PARAM_VIDEO_ID, videoId);
                    }
                } catch (org.json.JSONException unused) {
                }
            }
            uploadContext.progressCallback.onCompleted(response);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enqueueUploadStart(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, int completedRetries) {
        enqueueRequest(uploadContext, new com.facebook.share.internal.VideoUploader.StartUploadWorkItem(uploadContext, completedRetries));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enqueueUploadChunk(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, java.lang.String chunkStart, java.lang.String chunkEnd, int completedRetries) {
        enqueueRequest(uploadContext, new com.facebook.share.internal.VideoUploader.TransferChunkWorkItem(uploadContext, chunkStart, chunkEnd, completedRetries));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void enqueueUploadFinish(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, int completedRetries) {
        enqueueRequest(uploadContext, new com.facebook.share.internal.VideoUploader.FinishUploadWorkItem(uploadContext, completedRetries));
    }

    private static synchronized void enqueueRequest(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, java.lang.Runnable workItem) {
        synchronized (com.facebook.share.internal.VideoUploader.class) {
            uploadContext.workItem = uploadQueue.addActiveWorkItem(workItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getChunk(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, java.lang.String chunkStart, java.lang.String chunkEnd) throws java.io.IOException {
        int read;
        if (!com.facebook.internal.Utility.areObjectsEqual(chunkStart, uploadContext.chunkStart)) {
            logError(null, "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", uploadContext.chunkStart, chunkStart);
            return null;
        }
        int parseLong = (int) (java.lang.Long.parseLong(chunkEnd) - java.lang.Long.parseLong(chunkStart));
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[java.lang.Math.min(8192, parseLong)];
        do {
            read = uploadContext.videoStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                parseLong -= read;
                if (parseLong == 0) {
                }
            }
            uploadContext.chunkStart = chunkEnd;
            return byteArrayOutputStream.toByteArray();
        } while (parseLong >= 0);
        logError(null, "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", java.lang.Integer.valueOf(parseLong + read), java.lang.Integer.valueOf(read));
        return null;
    }

    private static void registerAccessTokenTracker() {
        accessTokenTracker = new com.facebook.AccessTokenTracker() { // from class: com.facebook.share.internal.VideoUploader.1
            @Override // com.facebook.AccessTokenTracker
            protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken currentAccessToken) {
                if (oldAccessToken == null) {
                    return;
                }
                if (currentAccessToken == null || !com.facebook.internal.Utility.areObjectsEqual(currentAccessToken.getUserId(), oldAccessToken.getUserId())) {
                    com.facebook.share.internal.VideoUploader.cancelAllRequests();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logError(java.lang.Exception e, java.lang.String format, java.lang.Object... args) {
        android.util.Log.e(TAG, java.lang.String.format(java.util.Locale.ROOT, format, args), e);
    }

    private static class UploadContext {
        public final com.facebook.AccessToken accessToken;
        public final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback;
        public java.lang.String chunkStart;
        public final java.lang.String description;
        public final java.lang.String graphNode;
        public boolean isCanceled;
        public android.os.Bundle params;
        public final com.facebook.GraphRequest.OnProgressCallback progressCallback;
        public final java.lang.String ref;
        public java.lang.String sessionId;
        public final java.lang.String title;
        public java.lang.String videoId;
        public long videoSize;
        public java.io.InputStream videoStream;
        public final android.net.Uri videoUri;
        public com.facebook.internal.WorkQueue.WorkItem workItem;

        private UploadContext(com.facebook.share.model.ShareVideoContent videoContent, java.lang.String graphNode, com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback, com.facebook.GraphRequest.OnProgressCallback progressCallback) {
            this.chunkStart = "0";
            this.accessToken = com.facebook.AccessToken.getCurrentAccessToken();
            this.videoUri = videoContent.getVideo().getLocalUrl();
            this.title = videoContent.getContentTitle();
            this.description = videoContent.getContentDescription();
            this.ref = videoContent.getRef();
            this.graphNode = graphNode;
            this.callback = callback;
            this.progressCallback = progressCallback;
            this.params = videoContent.getVideo().getParameters();
            if (!com.facebook.internal.Utility.isNullOrEmpty(videoContent.getPeopleIds())) {
                this.params.putString("tags", android.text.TextUtils.join(", ", videoContent.getPeopleIds()));
            }
            if (!com.facebook.internal.Utility.isNullOrEmpty(videoContent.getPlaceId())) {
                this.params.putString("place", videoContent.getPlaceId());
            }
            if (com.facebook.internal.Utility.isNullOrEmpty(videoContent.getRef())) {
                return;
            }
            this.params.putString(com.facebook.share.internal.VideoUploader.PARAM_REF, videoContent.getRef());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initialize() throws java.io.FileNotFoundException {
            try {
                if (com.facebook.internal.Utility.isFileUri(this.videoUri)) {
                    android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(new java.io.File(this.videoUri.getPath()), 268435456);
                    this.videoSize = open.getStatSize();
                    this.videoStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(open);
                } else {
                    if (com.facebook.internal.Utility.isContentUri(this.videoUri)) {
                        this.videoSize = com.facebook.internal.Utility.getContentSize(this.videoUri);
                        this.videoStream = com.facebook.FacebookSdk.getApplicationContext().getContentResolver().openInputStream(this.videoUri);
                        return;
                    }
                    throw new com.facebook.FacebookException("Uri must be a content:// or file:// uri");
                }
            } catch (java.io.FileNotFoundException e) {
                com.facebook.internal.Utility.closeQuietly(this.videoStream);
                throw e;
            }
        }
    }

    private static class StartUploadWorkItem extends com.facebook.share.internal.VideoUploader.UploadWorkItemBase {
        static final java.util.Set<java.lang.Integer> transientErrorCodes = new java.util.HashSet<java.lang.Integer>() { // from class: com.facebook.share.internal.VideoUploader.StartUploadWorkItem.1
            {
                add(6000);
            }
        };

        public StartUploadWorkItem(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, int completedRetries) {
            super(uploadContext, completedRetries);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public android.os.Bundle getParameters() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_UPLOAD_PHASE, "start");
            bundle.putLong(com.facebook.share.internal.VideoUploader.PARAM_FILE_SIZE, this.uploadContext.videoSize);
            return bundle;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleSuccess(org.json.JSONObject jsonObject) throws org.json.JSONException {
            this.uploadContext.sessionId = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_SESSION_ID);
            this.uploadContext.videoId = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_VIDEO_ID);
            java.lang.String string = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_START_OFFSET);
            java.lang.String string2 = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_END_OFFSET);
            if (this.uploadContext.progressCallback != null) {
                this.uploadContext.progressCallback.onProgress(java.lang.Long.parseLong(string), this.uploadContext.videoSize);
            }
            com.facebook.share.internal.VideoUploader.enqueueUploadChunk(this.uploadContext, string, string2, 0);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleError(com.facebook.FacebookException error) {
            com.facebook.share.internal.VideoUploader.logError(error, "Error starting video upload", new java.lang.Object[0]);
            endUploadWithFailure(error);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected java.util.Set<java.lang.Integer> getTransientErrorCodes() {
            return transientErrorCodes;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void enqueueRetry(int retriesCompleted) {
            com.facebook.share.internal.VideoUploader.enqueueUploadStart(this.uploadContext, retriesCompleted);
        }
    }

    private static class TransferChunkWorkItem extends com.facebook.share.internal.VideoUploader.UploadWorkItemBase {
        static final java.util.Set<java.lang.Integer> transientErrorCodes = new java.util.HashSet<java.lang.Integer>() { // from class: com.facebook.share.internal.VideoUploader.TransferChunkWorkItem.1
            {
                add(1363019);
                add(1363021);
                add(1363030);
                add(1363033);
                add(1363041);
            }
        };
        private java.lang.String chunkEnd;
        private java.lang.String chunkStart;

        public TransferChunkWorkItem(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, java.lang.String chunkStart, java.lang.String chunkEnd, int completedRetries) {
            super(uploadContext, completedRetries);
            this.chunkStart = chunkStart;
            this.chunkEnd = chunkEnd;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public android.os.Bundle getParameters() throws java.io.IOException {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_UPLOAD_PHASE, com.facebook.share.internal.VideoUploader.PARAM_VALUE_UPLOAD_TRANSFER_PHASE);
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_SESSION_ID, this.uploadContext.sessionId);
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_START_OFFSET, this.chunkStart);
            byte[] chunk = com.facebook.share.internal.VideoUploader.getChunk(this.uploadContext, this.chunkStart, this.chunkEnd);
            if (chunk != null) {
                bundle.putByteArray(com.facebook.share.internal.VideoUploader.PARAM_VIDEO_FILE_CHUNK, chunk);
                return bundle;
            }
            throw new com.facebook.FacebookException("Error reading video");
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleSuccess(org.json.JSONObject jsonObject) throws org.json.JSONException {
            java.lang.String string = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_START_OFFSET);
            java.lang.String string2 = jsonObject.getString(com.facebook.share.internal.VideoUploader.PARAM_END_OFFSET);
            if (this.uploadContext.progressCallback != null) {
                this.uploadContext.progressCallback.onProgress(java.lang.Long.parseLong(string), this.uploadContext.videoSize);
            }
            if (com.facebook.internal.Utility.areObjectsEqual(string, string2)) {
                com.facebook.share.internal.VideoUploader.enqueueUploadFinish(this.uploadContext, 0);
            } else {
                com.facebook.share.internal.VideoUploader.enqueueUploadChunk(this.uploadContext, string, string2, 0);
            }
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleError(com.facebook.FacebookException error) {
            com.facebook.share.internal.VideoUploader.logError(error, "Error uploading video '%s'", this.uploadContext.videoId);
            endUploadWithFailure(error);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected java.util.Set<java.lang.Integer> getTransientErrorCodes() {
            return transientErrorCodes;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void enqueueRetry(int retriesCompleted) {
            com.facebook.share.internal.VideoUploader.enqueueUploadChunk(this.uploadContext, this.chunkStart, this.chunkEnd, retriesCompleted);
        }
    }

    private static class FinishUploadWorkItem extends com.facebook.share.internal.VideoUploader.UploadWorkItemBase {
        static final java.util.Set<java.lang.Integer> transientErrorCodes = new java.util.HashSet<java.lang.Integer>() { // from class: com.facebook.share.internal.VideoUploader.FinishUploadWorkItem.1
            {
                add(1363011);
            }
        };

        public FinishUploadWorkItem(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, int completedRetries) {
            super(uploadContext, completedRetries);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public android.os.Bundle getParameters() {
            android.os.Bundle bundle = new android.os.Bundle();
            if (this.uploadContext.params != null) {
                bundle.putAll(this.uploadContext.params);
            }
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_UPLOAD_PHASE, com.facebook.share.internal.VideoUploader.PARAM_VALUE_UPLOAD_FINISH_PHASE);
            bundle.putString(com.facebook.share.internal.VideoUploader.PARAM_SESSION_ID, this.uploadContext.sessionId);
            com.facebook.internal.Utility.putNonEmptyString(bundle, "title", this.uploadContext.title);
            com.facebook.internal.Utility.putNonEmptyString(bundle, "description", this.uploadContext.description);
            com.facebook.internal.Utility.putNonEmptyString(bundle, com.facebook.share.internal.VideoUploader.PARAM_REF, this.uploadContext.ref);
            return bundle;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleSuccess(org.json.JSONObject jsonObject) throws org.json.JSONException {
            if (jsonObject.getBoolean("success")) {
                issueResponseOnMainThread(null, this.uploadContext.videoId);
            } else {
                handleError(new com.facebook.FacebookException(com.facebook.share.internal.VideoUploader.ERROR_BAD_SERVER_RESPONSE));
            }
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void handleError(com.facebook.FacebookException error) {
            com.facebook.share.internal.VideoUploader.logError(error, "Video '%s' failed to finish uploading", this.uploadContext.videoId);
            endUploadWithFailure(error);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected java.util.Set<java.lang.Integer> getTransientErrorCodes() {
            return transientErrorCodes;
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        protected void enqueueRetry(int retriesCompleted) {
            com.facebook.share.internal.VideoUploader.enqueueUploadFinish(this.uploadContext, retriesCompleted);
        }
    }

    private static abstract class UploadWorkItemBase implements java.lang.Runnable {
        protected int completedRetries;
        protected com.facebook.GraphResponse response;
        protected com.facebook.share.internal.VideoUploader.UploadContext uploadContext;

        protected abstract void enqueueRetry(int retriesCompleted);

        protected abstract android.os.Bundle getParameters() throws java.lang.Exception;

        protected abstract java.util.Set<java.lang.Integer> getTransientErrorCodes();

        protected abstract void handleError(com.facebook.FacebookException error);

        protected abstract void handleSuccess(org.json.JSONObject jsonObject) throws org.json.JSONException;

        protected UploadWorkItemBase(com.facebook.share.internal.VideoUploader.UploadContext uploadContext, int completedRetries) {
            this.uploadContext = uploadContext;
            this.completedRetries = completedRetries;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (!this.uploadContext.isCanceled) {
                    try {
                        executeGraphRequestSynchronously(getParameters());
                        return;
                    } catch (com.facebook.FacebookException e) {
                        endUploadWithFailure(e);
                        return;
                    } catch (java.lang.Exception e2) {
                        endUploadWithFailure(new com.facebook.FacebookException(com.facebook.share.internal.VideoUploader.ERROR_UPLOAD, e2));
                        return;
                    }
                }
                endUploadWithFailure(null);
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            }
        }

        protected void executeGraphRequestSynchronously(android.os.Bundle parameters) {
            com.facebook.GraphResponse executeAndWait = new com.facebook.GraphRequest(this.uploadContext.accessToken, java.lang.String.format(java.util.Locale.ROOT, "%s/videos", this.uploadContext.graphNode), parameters, com.facebook.HttpMethod.POST, null).executeAndWait();
            this.response = executeAndWait;
            if (executeAndWait != null) {
                com.facebook.FacebookRequestError error = executeAndWait.getError();
                org.json.JSONObject graphObject = this.response.getGraphObject();
                if (error != null) {
                    if (attemptRetry(error.getSubErrorCode())) {
                        return;
                    }
                    handleError(new com.facebook.FacebookGraphResponseException(this.response, com.facebook.share.internal.VideoUploader.ERROR_UPLOAD));
                    return;
                } else {
                    if (graphObject != null) {
                        try {
                            handleSuccess(graphObject);
                            return;
                        } catch (org.json.JSONException e) {
                            endUploadWithFailure(new com.facebook.FacebookException(com.facebook.share.internal.VideoUploader.ERROR_BAD_SERVER_RESPONSE, e));
                            return;
                        }
                    }
                    handleError(new com.facebook.FacebookException(com.facebook.share.internal.VideoUploader.ERROR_BAD_SERVER_RESPONSE));
                    return;
                }
            }
            handleError(new com.facebook.FacebookException(com.facebook.share.internal.VideoUploader.ERROR_BAD_SERVER_RESPONSE));
        }

        private boolean attemptRetry(int errorCode) {
            if (this.completedRetries >= 2 || !getTransientErrorCodes().contains(java.lang.Integer.valueOf(errorCode))) {
                return false;
            }
            com.facebook.share.internal.VideoUploader.getHandler().postDelayed(new java.lang.Runnable() { // from class: com.facebook.share.internal.VideoUploader.UploadWorkItemBase.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        com.facebook.share.internal.VideoUploader.UploadWorkItemBase uploadWorkItemBase = com.facebook.share.internal.VideoUploader.UploadWorkItemBase.this;
                        uploadWorkItemBase.enqueueRetry(uploadWorkItemBase.completedRetries + 1);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            }, ((int) java.lang.Math.pow(3.0d, this.completedRetries)) * 5000);
            return true;
        }

        protected void endUploadWithFailure(com.facebook.FacebookException error) {
            issueResponseOnMainThread(error, null);
        }

        protected void issueResponseOnMainThread(final com.facebook.FacebookException error, final java.lang.String videoId) {
            com.facebook.share.internal.VideoUploader.getHandler().post(new java.lang.Runnable() { // from class: com.facebook.share.internal.VideoUploader.UploadWorkItemBase.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        com.facebook.share.internal.VideoUploader.issueResponse(com.facebook.share.internal.VideoUploader.UploadWorkItemBase.this.uploadContext, error, com.facebook.share.internal.VideoUploader.UploadWorkItemBase.this.response, videoId);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        }
    }
}
