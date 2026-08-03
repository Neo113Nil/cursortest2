package com.facebook.appevents.codeless;

/* compiled from: ViewIndexer.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0006\u0010\u0015\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityReference", "Ljava/lang/ref/WeakReference;", "indexingTimer", "Ljava/util/Timer;", "previousDigest", "", "uiThreadHandler", "Landroid/os/Handler;", "processRequest", "", "request", "Lcom/facebook/GraphRequest;", "currentDigest", "schedule", "sendToServer", com.facebook.appevents.codeless.ViewIndexer.TREE_PARAM, "unschedule", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ScreenshotTaker", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewIndexer {
    private static final java.lang.String APP_VERSION_PARAM = "app_version";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.codeless.ViewIndexer.Companion INSTANCE = new com.facebook.appevents.codeless.ViewIndexer.Companion(null);
    private static final java.lang.String PLATFORM_PARAM = "platform";
    private static final java.lang.String REQUEST_TYPE = "request_type";
    private static final java.lang.String SUCCESS = "success";
    private static final java.lang.String TAG;
    private static final java.lang.String TREE_PARAM = "tree";
    private static com.facebook.appevents.codeless.ViewIndexer instance;
    private final java.lang.ref.WeakReference<android.app.Activity> activityReference;
    private java.util.Timer indexingTimer;
    private java.lang.String previousDigest;
    private final android.os.Handler uiThreadHandler;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest buildAppIndexingRequest(java.lang.String str, com.facebook.AccessToken accessToken, java.lang.String str2, java.lang.String str3) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return null;
        }
        try {
            return INSTANCE.buildAppIndexingRequest(str, accessToken, str2, str3);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void sendToServerUnityInstance(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return;
        }
        try {
            INSTANCE.sendToServerUnityInstance(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
        }
    }

    public ViewIndexer(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.activityReference = new java.lang.ref.WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        instance = this;
    }

    public static final /* synthetic */ java.lang.ref.WeakReference access$getActivityReference$p(com.facebook.appevents.codeless.ViewIndexer viewIndexer) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.activityReference;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
            return null;
        }
    }

    public static final /* synthetic */ com.facebook.appevents.codeless.ViewIndexer access$getInstance$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return null;
        }
        try {
            return instance;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
            return null;
        }
    }

    public static final /* synthetic */ android.os.Handler access$getUiThreadHandler$p(com.facebook.appevents.codeless.ViewIndexer viewIndexer) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.uiThreadHandler;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$sendToServer(com.facebook.appevents.codeless.ViewIndexer viewIndexer, java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return;
        }
        try {
            viewIndexer.sendToServer(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
        }
    }

    public final void schedule() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            final java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        android.app.Activity activity = (android.app.Activity) com.facebook.appevents.codeless.ViewIndexer.access$getActivityReference$p(com.facebook.appevents.codeless.ViewIndexer.this).get();
                        com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                        android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(activity);
                        if (activity != null && rootView != null) {
                            java.lang.String simpleName = activity.getClass().getSimpleName();
                            com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
                            if (com.facebook.appevents.codeless.CodelessManager.getIsAppIndexingEnabled$facebook_core_release()) {
                                com.facebook.internal.InternalSettings internalSettings = com.facebook.internal.InternalSettings.INSTANCE;
                                if (com.facebook.internal.InternalSettings.isUnityApp()) {
                                    com.facebook.appevents.codeless.internal.UnityReflection unityReflection = com.facebook.appevents.codeless.internal.UnityReflection.INSTANCE;
                                    com.facebook.appevents.codeless.internal.UnityReflection.captureViewHierarchy();
                                    return;
                                }
                                java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.facebook.appevents.codeless.ViewIndexer.ScreenshotTaker(rootView));
                                com.facebook.appevents.codeless.ViewIndexer.access$getUiThreadHandler$p(com.facebook.appevents.codeless.ViewIndexer.this).post(futureTask);
                                java.lang.String str = "";
                                try {
                                    str = (java.lang.String) futureTask.get(1L, java.util.concurrent.TimeUnit.SECONDS);
                                } catch (java.lang.Exception e) {
                                    android.util.Log.e(com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp(), "Failed to take screenshot.", e);
                                }
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.SCREEN_NAME_KEY, simpleName);
                                    jSONObject.put("screenshot", str);
                                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                                    com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                                    jSONArray.put(com.facebook.appevents.codeless.internal.ViewHierarchy.getDictionaryOfView(rootView));
                                    jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, jSONArray);
                                } catch (org.json.JSONException unused) {
                                    android.util.Log.e(com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp(), "Failed to create JSONObject");
                                }
                                java.lang.String jSONObject2 = jSONObject.toString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
                                com.facebook.appevents.codeless.ViewIndexer.access$sendToServer(com.facebook.appevents.codeless.ViewIndexer.this, jSONObject2);
                            }
                        }
                    } catch (java.lang.Exception e2) {
                        android.util.Log.e(com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp(), "UI Component tree indexing failure!", e2);
                    }
                }
            };
            try {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.codeless.ViewIndexer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.codeless.ViewIndexer.m5124schedule$lambda0(com.facebook.appevents.codeless.ViewIndexer.this, timerTask);
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e) {
                android.util.Log.e(TAG, "Error scheduling indexing job", e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: schedule$lambda-0, reason: not valid java name */
    public static final void m5124schedule$lambda0(com.facebook.appevents.codeless.ViewIndexer this$0, java.util.TimerTask indexingTask) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                java.util.Timer timer = this$0.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.previousDigest = null;
                java.util.Timer timer2 = new java.util.Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.indexingTimer = timer2;
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, "Error scheduling indexing job", e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
        }
    }

    public final void unschedule() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.activityReference.get() == null) {
                return;
            }
            try {
                java.util.Timer timer = this.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.indexingTimer = null;
            } catch (java.lang.Exception e) {
                android.util.Log.e(TAG, "Error unscheduling indexing job", e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void sendToServer(final java.lang.String tree) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.codeless.ViewIndexer$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.codeless.ViewIndexer.m5125sendToServer$lambda1(tree, this);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendToServer$lambda-1, reason: not valid java name */
    public static final void m5125sendToServer$lambda1(java.lang.String tree, com.facebook.appevents.codeless.ViewIndexer this$0) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.ViewIndexer.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tree, "$tree");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.lang.String md5hash = com.facebook.internal.Utility.md5hash(tree);
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
            if (md5hash == null || !kotlin.jvm.internal.Intrinsics.areEqual(md5hash, this$0.previousDigest)) {
                com.facebook.appevents.codeless.ViewIndexer.Companion companion = INSTANCE;
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                this$0.processRequest(companion.buildAppIndexingRequest(tree, currentAccessToken, com.facebook.FacebookSdk.getApplicationId(), com.facebook.appevents.codeless.internal.Constants.APP_INDEXING), md5hash);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.ViewIndexer.class);
        }
    }

    public final void processRequest(com.facebook.GraphRequest request, java.lang.String currentDigest) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || request == null) {
            return;
        }
        try {
            com.facebook.GraphResponse executeAndWait = request.executeAndWait();
            try {
                org.json.JSONObject graphObject = executeAndWait.getGraphObject();
                if (graphObject != null) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual("true", graphObject.optString("success"))) {
                        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "Successfully send UI component tree to server");
                        this.previousDigest = currentDigest;
                    }
                    if (graphObject.has(com.facebook.appevents.codeless.internal.Constants.APP_INDEXING_ENABLED)) {
                        boolean z = graphObject.getBoolean(com.facebook.appevents.codeless.internal.Constants.APP_INDEXING_ENABLED);
                        com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
                        com.facebook.appevents.codeless.CodelessManager.updateAppIndexing$facebook_core_release(z);
                        return;
                    }
                    return;
                }
                android.util.Log.e(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Error sending UI component tree to Facebook: ", executeAndWait.getError()));
            } catch (org.json.JSONException e) {
                android.util.Log.e(TAG, "Error decoding server response.", e);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ViewIndexer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$ScreenshotTaker;", "Ljava/util/concurrent/Callable;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "Ljava/lang/ref/WeakReference;", "call", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    static final class ScreenshotTaker implements java.util.concurrent.Callable<java.lang.String> {
        private final java.lang.ref.WeakReference<android.view.View> rootView;

        public ScreenshotTaker(android.view.View rootView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.rootView = new java.lang.ref.WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        public java.lang.String call() {
            android.view.View view = this.rootView.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
            view.draw(new android.graphics.Canvas(createBitmap));
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* compiled from: ViewIndexer.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$Companion;", "", "()V", "APP_VERSION_PARAM", "", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", com.ironsource.C3232q2.p, "Lcom/facebook/appevents/codeless/ViewIndexer;", "buildAppIndexingRequest", "Lcom/facebook/GraphRequest;", "appIndex", "accessToken", "Lcom/facebook/AccessToken;", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "requestType", "sendToServerUnityInstance", "", com.facebook.appevents.codeless.ViewIndexer.TREE_PARAM, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void sendToServerUnityInstance(java.lang.String tree) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tree, "tree");
            com.facebook.appevents.codeless.ViewIndexer access$getInstance$cp = com.facebook.appevents.codeless.ViewIndexer.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                return;
            }
            com.facebook.appevents.codeless.ViewIndexer.access$sendToServer(access$getInstance$cp, tree);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest buildAppIndexingRequest(java.lang.String appIndex, com.facebook.AccessToken accessToken, java.lang.String appId, java.lang.String requestType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (appIndex == null) {
                return null;
            }
            com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s/app_indexing", java.util.Arrays.copyOf(new java.lang.Object[]{appId}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            com.facebook.GraphRequest newPostRequest = companion.newPostRequest(accessToken, format, null, null);
            android.os.Bundle parameters = newPostRequest.getParameters();
            if (parameters == null) {
                parameters = new android.os.Bundle();
            }
            parameters.putString(com.facebook.appevents.codeless.ViewIndexer.TREE_PARAM, appIndex);
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            parameters.putString(com.facebook.appevents.codeless.ViewIndexer.APP_VERSION_PARAM, com.facebook.appevents.internal.AppEventUtility.getAppVersion());
            parameters.putString("platform", "android");
            parameters.putString(com.facebook.appevents.codeless.ViewIndexer.REQUEST_TYPE, requestType);
            if (kotlin.jvm.internal.Intrinsics.areEqual(requestType, com.facebook.appevents.codeless.internal.Constants.APP_INDEXING)) {
                com.facebook.appevents.codeless.CodelessManager codelessManager = com.facebook.appevents.codeless.CodelessManager.INSTANCE;
                parameters.putString(com.facebook.appevents.codeless.internal.Constants.DEVICE_SESSION_ID, com.facebook.appevents.codeless.CodelessManager.getCurrentDeviceSessionID$facebook_core_release());
            }
            newPostRequest.setParameters(parameters);
            newPostRequest.setCallback(new com.facebook.GraphRequest.Callback() { // from class: com.facebook.appevents.codeless.ViewIndexer$Companion$$ExternalSyntheticLambda0
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.appevents.codeless.ViewIndexer.Companion.m5126buildAppIndexingRequest$lambda0(graphResponse);
                }
            });
            return newPostRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: buildAppIndexingRequest$lambda-0, reason: not valid java name */
        public static final void m5126buildAppIndexingRequest$lambda0(com.facebook.GraphResponse it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, com.facebook.appevents.codeless.ViewIndexer.access$getTAG$cp(), "App index sent to FB!");
        }
    }

    static {
        java.lang.String canonicalName = com.facebook.appevents.codeless.ViewIndexer.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        TAG = canonicalName;
    }
}
