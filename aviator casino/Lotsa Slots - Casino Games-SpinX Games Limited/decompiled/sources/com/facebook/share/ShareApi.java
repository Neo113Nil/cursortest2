package com.facebook.share;

/* loaded from: classes2.dex */
public final class ShareApi {
    private static final java.lang.String DEFAULT_CHARSET = "UTF-8";
    private static final java.lang.String DEFAULT_GRAPH_NODE = "me";
    private static final java.lang.String GRAPH_PATH_FORMAT = "%s/%s";
    private static final java.lang.String PHOTOS_EDGE = "photos";
    private static final java.lang.String TAG = "ShareApi";
    private java.lang.String graphNode = DEFAULT_GRAPH_NODE;
    private java.lang.String message;
    private final com.facebook.share.model.ShareContent shareContent;

    static /* synthetic */ void access$000(com.facebook.share.ShareApi shareApi, java.util.ArrayList arrayList, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.share.ShareApi.class)) {
            return;
        }
        try {
            shareApi.stageArrayList(arrayList, onMapValueCompleteListener);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.share.ShareApi.class);
        }
    }

    static /* synthetic */ void access$100(com.facebook.share.ShareApi shareApi, com.facebook.share.model.SharePhoto sharePhoto, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.share.ShareApi.class)) {
            return;
        }
        try {
            shareApi.stagePhoto(sharePhoto, onMapValueCompleteListener);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.share.ShareApi.class);
        }
    }

    public static void share(final com.facebook.share.model.ShareContent shareContent, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.share.ShareApi.class)) {
            return;
        }
        try {
            new com.facebook.share.ShareApi(shareContent).share(callback);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.share.ShareApi.class);
        }
    }

    public ShareApi(final com.facebook.share.model.ShareContent shareContent) {
        this.shareContent = shareContent;
    }

    public java.lang.String getMessage() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.message;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public void setMessage(final java.lang.String message) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.message = message;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public java.lang.String getGraphNode() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.graphNode;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public void setGraphNode(final java.lang.String graphNode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.graphNode = graphNode;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public com.facebook.share.model.ShareContent getShareContent() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.shareContent;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public boolean canShare() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (getShareContent() == null) {
                return false;
            }
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
            if (!com.facebook.AccessToken.isCurrentAccessTokenActive()) {
                return false;
            }
            java.util.Set<java.lang.String> permissions = currentAccessToken.getPermissions();
            if (permissions != null && permissions.contains("publish_actions")) {
                return true;
            }
            android.util.Log.w(TAG, "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
            return true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public void share(com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!canShare()) {
                com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithError(callback, "Insufficient permissions for sharing content via Api.");
                return;
            }
            com.facebook.share.model.ShareContent shareContent = getShareContent();
            try {
                com.facebook.share.internal.ShareContentValidation.validateForApiShare(shareContent);
                if (shareContent instanceof com.facebook.share.model.ShareLinkContent) {
                    shareLinkContent((com.facebook.share.model.ShareLinkContent) shareContent, callback);
                } else if (shareContent instanceof com.facebook.share.model.SharePhotoContent) {
                    sharePhotoContent((com.facebook.share.model.SharePhotoContent) shareContent, callback);
                } else if (shareContent instanceof com.facebook.share.model.ShareVideoContent) {
                    shareVideoContent((com.facebook.share.model.ShareVideoContent) shareContent, callback);
                }
            } catch (com.facebook.FacebookException e) {
                com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithException(callback, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private java.lang.String getGraphPath(final java.lang.String pathAfterGraphNode) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return java.lang.String.format(java.util.Locale.ROOT, GRAPH_PATH_FORMAT, java.net.URLEncoder.encode(getGraphNode(), "UTF-8"), pathAfterGraphNode);
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private void addCommonParameters(final android.os.Bundle bundle, com.facebook.share.model.ShareContent shareContent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.util.List<java.lang.String> peopleIds = shareContent.getPeopleIds();
            if (!com.facebook.internal.Utility.isNullOrEmpty(peopleIds)) {
                bundle.putString("tags", android.text.TextUtils.join(", ", peopleIds));
            }
            if (!com.facebook.internal.Utility.isNullOrEmpty(shareContent.getPlaceId())) {
                bundle.putString("place", shareContent.getPlaceId());
            }
            if (!com.facebook.internal.Utility.isNullOrEmpty(shareContent.getPageId())) {
                bundle.putString("page", shareContent.getPageId());
            }
            if (com.facebook.internal.Utility.isNullOrEmpty(shareContent.getRef())) {
                return;
            }
            bundle.putString("ref", shareContent.getRef());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private static void handleImagesOnAction(android.os.Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.share.ShareApi.class)) {
            return;
        }
        try {
            java.lang.String string = parameters.getString("image");
            if (string != null) {
                try {
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                putImageInBundleWithArrayFormat(parameters, i, optJSONObject);
                            } else {
                                parameters.putString(java.lang.String.format(java.util.Locale.ROOT, "image[%d][url]", java.lang.Integer.valueOf(i)), jSONArray.getString(i));
                            }
                        }
                        parameters.remove("image");
                    } catch (org.json.JSONException unused) {
                    }
                } catch (org.json.JSONException unused2) {
                    putImageInBundleWithArrayFormat(parameters, 0, new org.json.JSONObject(string));
                    parameters.remove("image");
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.share.ShareApi.class);
        }
    }

    private static void putImageInBundleWithArrayFormat(android.os.Bundle parameters, int index, org.json.JSONObject image) throws org.json.JSONException {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.share.ShareApi.class)) {
            return;
        }
        try {
            java.util.Iterator<java.lang.String> keys = image.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                parameters.putString(java.lang.String.format(java.util.Locale.ROOT, "image[%d][%s]", java.lang.Integer.valueOf(index), next), image.get(next).toString());
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.share.ShareApi.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, java.lang.Integer] */
    private void sharePhotoContent(final com.facebook.share.model.SharePhotoContent photoContent, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final com.facebook.internal.Mutable mutable = new com.facebook.internal.Mutable(0);
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.getCurrentAccessToken();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            final java.util.ArrayList arrayList3 = new java.util.ArrayList();
            com.facebook.GraphRequest.Callback callback2 = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.share.ShareApi.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(com.facebook.GraphResponse response) {
                    org.json.JSONObject graphObject = response.getGraphObject();
                    if (graphObject != null) {
                        arrayList2.add(graphObject);
                    }
                    if (response.getError() != null) {
                        arrayList3.add(response);
                    }
                    mutable.value = java.lang.Integer.valueOf(((java.lang.Integer) r0.value).intValue() - 1);
                    if (((java.lang.Integer) mutable.value).intValue() == 0) {
                        if (!arrayList3.isEmpty()) {
                            com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithResults(callback, null, (com.facebook.GraphResponse) arrayList3.get(0));
                        } else {
                            if (arrayList2.isEmpty()) {
                                return;
                            }
                            com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithResults(callback, ((org.json.JSONObject) arrayList2.get(0)).optString("id"), response);
                        }
                    }
                }
            };
            try {
                for (com.facebook.share.model.SharePhoto sharePhoto : photoContent.getPhotos()) {
                    try {
                        android.os.Bundle sharePhotoCommonParameters = getSharePhotoCommonParameters(sharePhoto, photoContent);
                        android.graphics.Bitmap bitmap = sharePhoto.getBitmap();
                        android.net.Uri imageUrl = sharePhoto.getImageUrl();
                        java.lang.String caption = sharePhoto.getCaption();
                        if (caption == null) {
                            caption = getMessage();
                        }
                        java.lang.String str = caption;
                        if (bitmap != null) {
                            arrayList.add(com.facebook.GraphRequest.newUploadPhotoRequest(currentAccessToken, getGraphPath(PHOTOS_EDGE), bitmap, str, sharePhotoCommonParameters, callback2));
                        } else if (imageUrl != null) {
                            arrayList.add(com.facebook.GraphRequest.newUploadPhotoRequest(currentAccessToken, getGraphPath(PHOTOS_EDGE), imageUrl, str, sharePhotoCommonParameters, callback2));
                        }
                    } catch (org.json.JSONException e) {
                        com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithException(callback, e);
                        return;
                    }
                }
                mutable.value = java.lang.Integer.valueOf(((java.lang.Integer) mutable.value).intValue() + arrayList.size());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.facebook.GraphRequest) it.next()).executeAsync();
                }
            } catch (java.io.FileNotFoundException e2) {
                com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithException(callback, e2);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void shareLinkContent(final com.facebook.share.model.ShareLinkContent linkContent, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.GraphRequest.Callback callback2 = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.share.ShareApi.2
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(com.facebook.GraphResponse response) {
                    org.json.JSONObject graphObject = response.getGraphObject();
                    com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithResults(callback, graphObject == null ? null : graphObject.optString("id"), response);
                }
            };
            android.os.Bundle bundle = new android.os.Bundle();
            addCommonParameters(bundle, linkContent);
            bundle.putString("message", getMessage());
            bundle.putString("link", com.facebook.internal.Utility.getUriString(linkContent.getContentUrl()));
            bundle.putString("ref", linkContent.getRef());
            new com.facebook.GraphRequest(com.facebook.AccessToken.getCurrentAccessToken(), getGraphPath("feed"), bundle, com.facebook.HttpMethod.POST, callback2).executeAsync();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void shareVideoContent(final com.facebook.share.model.ShareVideoContent videoContent, final com.facebook.FacebookCallback<com.facebook.share.Sharer.Result> callback) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            try {
                com.facebook.share.internal.VideoUploader.uploadAsync(videoContent, getGraphNode(), callback);
            } catch (java.io.FileNotFoundException e) {
                com.facebook.share.internal.ShareInternalUtility.invokeCallbackWithException(callback, e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private android.os.Bundle getSharePhotoCommonParameters(com.facebook.share.model.SharePhoto photo, com.facebook.share.model.SharePhotoContent photoContent) throws org.json.JSONException {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            android.os.Bundle parameters = photo.getParameters();
            if (!parameters.containsKey("place") && !com.facebook.internal.Utility.isNullOrEmpty(photoContent.getPlaceId())) {
                parameters.putString("place", photoContent.getPlaceId());
            }
            if (!parameters.containsKey("tags") && !com.facebook.internal.Utility.isNullOrEmpty(photoContent.getPeopleIds())) {
                java.util.List<java.lang.String> peopleIds = photoContent.getPeopleIds();
                if (!com.facebook.internal.Utility.isNullOrEmpty(peopleIds)) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (java.lang.String str : peopleIds) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("tag_uid", str);
                        jSONArray.put(jSONObject);
                    }
                    parameters.putString("tags", jSONArray.toString());
                }
            }
            if (!parameters.containsKey("ref") && !com.facebook.internal.Utility.isNullOrEmpty(photoContent.getRef())) {
                parameters.putString("ref", photoContent.getRef());
            }
            return parameters;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private void stageArrayList(final java.util.ArrayList arrayList, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onArrayListStagedListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final org.json.JSONArray jSONArray = new org.json.JSONArray();
            stageCollectionValues(new com.facebook.internal.CollectionMapper.Collection<java.lang.Integer>() { // from class: com.facebook.share.ShareApi.3
                @Override // com.facebook.internal.CollectionMapper.Collection
                public java.util.Iterator<java.lang.Integer> keyIterator() {
                    final int size = arrayList.size();
                    final com.facebook.internal.Mutable mutable = new com.facebook.internal.Mutable(0);
                    return new java.util.Iterator<java.lang.Integer>() { // from class: com.facebook.share.ShareApi.3.1
                        @Override // java.util.Iterator
                        public void remove() {
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return ((java.lang.Integer) mutable.value).intValue() < size;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Integer] */
                        @Override // java.util.Iterator
                        public java.lang.Integer next() {
                            java.lang.Integer num = (java.lang.Integer) mutable.value;
                            com.facebook.internal.Mutable mutable2 = mutable;
                            mutable2.value = java.lang.Integer.valueOf(((java.lang.Integer) mutable2.value).intValue() + 1);
                            return num;
                        }
                    };
                }

                @Override // com.facebook.internal.CollectionMapper.Collection
                public java.lang.Object get(java.lang.Integer key) {
                    return arrayList.get(key.intValue());
                }

                @Override // com.facebook.internal.CollectionMapper.Collection
                public void set(java.lang.Integer key, java.lang.Object value, com.facebook.internal.CollectionMapper.OnErrorListener onErrorListener) {
                    try {
                        jSONArray.put(key.intValue(), value);
                    } catch (org.json.JSONException e) {
                        java.lang.String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "Error staging object.";
                        }
                        onErrorListener.onError(new com.facebook.FacebookException(localizedMessage));
                    }
                }
            }, new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() { // from class: com.facebook.share.ShareApi.4
                @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
                public void onComplete() {
                    onArrayListStagedListener.onComplete(jSONArray);
                }

                @Override // com.facebook.internal.CollectionMapper.OnErrorListener
                public void onError(com.facebook.FacebookException exception) {
                    onArrayListStagedListener.onError(exception);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private <T> void stageCollectionValues(final com.facebook.internal.CollectionMapper.Collection<T> collection, final com.facebook.internal.CollectionMapper.OnMapperCompleteListener onCollectionValuesStagedListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.CollectionMapper.iterate(collection, new com.facebook.internal.CollectionMapper.ValueMapper() { // from class: com.facebook.share.ShareApi.5
                @Override // com.facebook.internal.CollectionMapper.ValueMapper
                public void mapValue(java.lang.Object value, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
                    if (value instanceof java.util.ArrayList) {
                        com.facebook.share.ShareApi.access$000(com.facebook.share.ShareApi.this, (java.util.ArrayList) value, onMapValueCompleteListener);
                    } else if (value instanceof com.facebook.share.model.SharePhoto) {
                        com.facebook.share.ShareApi.access$100(com.facebook.share.ShareApi.this, (com.facebook.share.model.SharePhoto) value, onMapValueCompleteListener);
                    } else {
                        onMapValueCompleteListener.onComplete(value);
                    }
                }
            }, onCollectionValuesStagedListener);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void stagePhoto(final com.facebook.share.model.SharePhoto photo, final com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onPhotoStagedListener) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            android.graphics.Bitmap bitmap = photo.getBitmap();
            android.net.Uri imageUrl = photo.getImageUrl();
            if (bitmap == null && imageUrl == null) {
                onPhotoStagedListener.onError(new com.facebook.FacebookException("Photos must have an imageURL or bitmap."));
                return;
            }
            com.facebook.GraphRequest.Callback callback = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.share.ShareApi.6
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(com.facebook.GraphResponse response) {
                    com.facebook.FacebookRequestError error = response.getError();
                    if (error != null) {
                        java.lang.String errorMessage = error.getErrorMessage();
                        onPhotoStagedListener.onError(new com.facebook.FacebookGraphResponseException(response, errorMessage != null ? errorMessage : "Error staging photo."));
                        return;
                    }
                    org.json.JSONObject graphObject = response.getGraphObject();
                    if (graphObject == null) {
                        onPhotoStagedListener.onError(new com.facebook.FacebookException("Error staging photo."));
                        return;
                    }
                    java.lang.String optString = graphObject.optString(com.facebook.share.internal.ShareConstants.MEDIA_URI);
                    if (optString == null) {
                        onPhotoStagedListener.onError(new com.facebook.FacebookException("Error staging photo."));
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("url", optString);
                        jSONObject.put(com.facebook.internal.NativeProtocol.IMAGE_USER_GENERATED_KEY, photo.getUserGenerated());
                        onPhotoStagedListener.onComplete(jSONObject);
                    } catch (org.json.JSONException e) {
                        java.lang.String localizedMessage = e.getLocalizedMessage();
                        onPhotoStagedListener.onError(new com.facebook.FacebookException(localizedMessage != null ? localizedMessage : "Error staging photo."));
                    }
                }
            };
            if (bitmap != null) {
                com.facebook.share.internal.ShareInternalUtility.newUploadStagingResourceWithImageRequest(com.facebook.AccessToken.getCurrentAccessToken(), bitmap, callback).executeAsync();
                return;
            }
            try {
                com.facebook.share.internal.ShareInternalUtility.newUploadStagingResourceWithImageRequest(com.facebook.AccessToken.getCurrentAccessToken(), imageUrl, callback).executeAsync();
            } catch (java.io.FileNotFoundException e) {
                java.lang.String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging photo.";
                }
                onPhotoStagedListener.onError(new com.facebook.FacebookException(localizedMessage));
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
