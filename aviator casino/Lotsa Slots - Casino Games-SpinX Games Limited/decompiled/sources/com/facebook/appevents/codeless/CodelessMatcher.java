package com.facebook.appevents.codeless;

/* compiled from: CodelessMatcher.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0006\u001a4\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007j\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\f`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher;", "", "()V", "activitiesSet", "", "Landroid/app/Activity;", "activityToListenerMap", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "listenerSet", "uiThreadHandler", "Landroid/os/Handler;", "viewMatchers", "Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "add", "", "activity", "destroy", "matchViews", "remove", "startTracking", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MatchedView", "ViewMatcher", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CodelessMatcher {
    private static final java.lang.String CURRENT_CLASS_NAME = ".";
    private static final java.lang.String PARENT_CLASS_NAME = "..";
    private static com.facebook.appevents.codeless.CodelessMatcher codelessMatcher;
    private final java.util.Set<android.app.Activity> activitiesSet;
    private final java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.String>> activityToListenerMap;
    private java.util.HashSet<java.lang.String> listenerSet;
    private final android.os.Handler uiThreadHandler;
    private final java.util.Set<com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher> viewMatchers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.codeless.CodelessMatcher.Companion INSTANCE = new com.facebook.appevents.codeless.CodelessMatcher.Companion(null);
    private static final java.lang.String TAG = com.facebook.appevents.codeless.CodelessMatcher.class.getCanonicalName();

    public /* synthetic */ CodelessMatcher(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized com.facebook.appevents.codeless.CodelessMatcher getInstance() {
        synchronized (com.facebook.appevents.codeless.CodelessMatcher.class) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
                return null;
            }
            try {
                return INSTANCE.getInstance();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
                return null;
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle getParameters(com.facebook.appevents.codeless.internal.EventBinding eventBinding, android.view.View view, android.view.View view2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
            return null;
        }
        try {
            return INSTANCE.getParameters(eventBinding, view, view2);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
            return null;
        }
    }

    private CodelessMatcher() {
        this.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.Set<android.app.Activity> newSetFromMap = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = newSetFromMap;
        this.viewMatchers = new java.util.LinkedHashSet();
        this.listenerSet = new java.util.HashSet<>();
        this.activityToListenerMap = new java.util.HashMap<>();
    }

    public static final /* synthetic */ com.facebook.appevents.codeless.CodelessMatcher access$getCodelessMatcher$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
            return null;
        }
        try {
            return codelessMatcher;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCodelessMatcher$cp(com.facebook.appevents.codeless.CodelessMatcher codelessMatcher2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
            return;
        }
        try {
            codelessMatcher = codelessMatcher2;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
        }
    }

    public final void add(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.facebook.internal.InternalSettings internalSettings = com.facebook.internal.InternalSettings.INSTANCE;
            if (com.facebook.internal.InternalSettings.isUnityApp()) {
                return;
            }
            if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                throw new com.facebook.FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            java.util.HashSet<java.lang.String> hashSet = this.activityToListenerMap.get(java.lang.Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            startTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void remove(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.facebook.internal.InternalSettings internalSettings = com.facebook.internal.InternalSettings.INSTANCE;
            if (com.facebook.internal.InternalSettings.isUnityApp()) {
                return;
            }
            if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                throw new com.facebook.FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            this.activityToListenerMap.put(java.lang.Integer.valueOf(activity.hashCode()), (java.util.HashSet) this.listenerSet.clone());
            this.listenerSet.clear();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void destroy(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            this.activityToListenerMap.remove(java.lang.Integer.valueOf(activity.hashCode()));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void startTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                matchViews();
            } else {
                this.uiThreadHandler.post(new java.lang.Runnable() { // from class: com.facebook.appevents.codeless.CodelessMatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.appevents.codeless.CodelessMatcher.m5123startTracking$lambda1(com.facebook.appevents.codeless.CodelessMatcher.this);
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startTracking$lambda-1, reason: not valid java name */
    public static final void m5123startTracking$lambda1(com.facebook.appevents.codeless.CodelessMatcher this$0) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.codeless.CodelessMatcher.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.matchViews();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.codeless.CodelessMatcher.class);
        }
    }

    private final void matchViews() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (android.app.Activity activity : this.activitiesSet) {
                if (activity != null) {
                    com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                    android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(activity);
                    java.lang.String activityName = activity.getClass().getSimpleName();
                    android.os.Handler handler = this.uiThreadHandler;
                    java.util.HashSet<java.lang.String> hashSet = this.listenerSet;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.viewMatchers.add(new com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher(rootView, handler, hashSet, activityName));
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "viewMapKey", "", "(Landroid/view/View;Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "getViewMapKey", "()Ljava/lang/String;", "getView", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MatchedView {
        private final java.lang.ref.WeakReference<android.view.View> view;
        private final java.lang.String viewMapKey;

        public MatchedView(android.view.View view, java.lang.String viewMapKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.view = new java.lang.ref.WeakReference<>(view);
            this.viewMapKey = viewMapKey;
        }

        public final java.lang.String getViewMapKey() {
            return this.viewMapKey;
        }

        public final android.view.View getView() {
            java.lang.ref.WeakReference<android.view.View> weakReference = this.view;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB7\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u001c\u0010\u001a\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "rootView", "Landroid/view/View;", "handler", "Landroid/os/Handler;", "listenerSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "activityName", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "eventBindings", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "attachListener", "", "matchedView", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "attachOnClickListener", "attachOnItemClickListener", "attachRCTListener", "findView", "onGlobalLayout", "onScrollChanged", "run", "startMatch", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ViewMatcher implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, java.lang.Runnable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.Companion INSTANCE = new com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.Companion(null);
        private final java.lang.String activityName;
        private java.util.List<com.facebook.appevents.codeless.internal.EventBinding> eventBindings;
        private final android.os.Handler handler;
        private final java.util.HashSet<java.lang.String> listenerSet;
        private final java.lang.ref.WeakReference<android.view.View> rootView;

        @kotlin.jvm.JvmStatic
        public static final java.util.List<com.facebook.appevents.codeless.CodelessMatcher.MatchedView> findViewByPath(com.facebook.appevents.codeless.internal.EventBinding eventBinding, android.view.View view, java.util.List<com.facebook.appevents.codeless.internal.PathComponent> list, int i, int i2, java.lang.String str) {
            return INSTANCE.findViewByPath(eventBinding, view, list, i, i2, str);
        }

        public ViewMatcher(android.view.View view, android.os.Handler handler, java.util.HashSet<java.lang.String> listenerSet, java.lang.String activityName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.rootView = new java.lang.ref.WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = listenerSet;
            this.activityName = activityName;
            handler.postDelayed(this, 200L);
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.View view;
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
                    com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
                    com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                    if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        java.util.List<com.facebook.appevents.codeless.internal.EventBinding> parseArray = com.facebook.appevents.codeless.internal.EventBinding.INSTANCE.parseArray(appSettingsWithoutQuery.getEventBindings());
                        this.eventBindings = parseArray;
                        if (parseArray == null || (view = this.rootView.get()) == null) {
                            return;
                        }
                        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        startMatch();
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            startMatch();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            startMatch();
        }

        private final void startMatch() {
            int size;
            java.util.List<com.facebook.appevents.codeless.internal.EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                findView(list.get(i), this.rootView.get());
                if (i2 > size) {
                    return;
                } else {
                    i = i2;
                }
            }
        }

        private final void findView(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView) {
            if (mapping == null || rootView == null) {
                return;
            }
            java.lang.String activityName = mapping.getActivityName();
            if (activityName == null || activityName.length() == 0 || kotlin.jvm.internal.Intrinsics.areEqual(mapping.getActivityName(), this.activityName)) {
                java.util.List<com.facebook.appevents.codeless.internal.PathComponent> viewPath = mapping.getViewPath();
                if (viewPath.size() > 25) {
                    return;
                }
                java.util.Iterator<com.facebook.appevents.codeless.CodelessMatcher.MatchedView> it = INSTANCE.findViewByPath(mapping, rootView, viewPath, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    attachListener(it.next(), rootView, mapping);
                }
            }
        }

        private final void attachListener(com.facebook.appevents.codeless.CodelessMatcher.MatchedView matchedView, android.view.View rootView, com.facebook.appevents.codeless.internal.EventBinding mapping) {
            if (mapping == null) {
                return;
            }
            try {
                android.view.View view = matchedView.getView();
                if (view == null) {
                    return;
                }
                com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                android.view.View findRCTRootView = com.facebook.appevents.codeless.internal.ViewHierarchy.findRCTRootView(view);
                if (findRCTRootView != null && com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE.isRCTButton(view, findRCTRootView)) {
                    attachRCTListener(matchedView, rootView, mapping);
                    return;
                }
                java.lang.String name = view.getClass().getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (kotlin.text.StringsKt.startsWith$default(name, "com.facebook.react", false, 2, (java.lang.Object) null)) {
                    return;
                }
                if (!(view instanceof android.widget.AdapterView)) {
                    attachOnClickListener(matchedView, rootView, mapping);
                } else if (view instanceof android.widget.ListView) {
                    attachOnItemClickListener(matchedView, rootView, mapping);
                }
            } catch (java.lang.Exception e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd(com.facebook.appevents.codeless.CodelessMatcher.access$getTAG$cp(), e);
            }
        }

        private final void attachOnClickListener(com.facebook.appevents.codeless.CodelessMatcher.MatchedView matchedView, android.view.View rootView, com.facebook.appevents.codeless.internal.EventBinding mapping) {
            boolean z;
            android.view.View view = matchedView.getView();
            if (view == null) {
                return;
            }
            java.lang.String viewMapKey = matchedView.getViewMapKey();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            android.view.View.OnClickListener existingOnClickListener = com.facebook.appevents.codeless.internal.ViewHierarchy.getExistingOnClickListener(view);
            if (existingOnClickListener instanceof com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener) {
                if (existingOnClickListener == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener) existingOnClickListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    com.facebook.appevents.codeless.CodelessLoggingEventListener codelessLoggingEventListener = com.facebook.appevents.codeless.CodelessLoggingEventListener.INSTANCE;
                    view.setOnClickListener(com.facebook.appevents.codeless.CodelessLoggingEventListener.getOnClickListener(mapping, rootView, view));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        private final void attachOnItemClickListener(com.facebook.appevents.codeless.CodelessMatcher.MatchedView matchedView, android.view.View rootView, com.facebook.appevents.codeless.internal.EventBinding mapping) {
            boolean z;
            android.widget.AdapterView adapterView = (android.widget.AdapterView) matchedView.getView();
            if (adapterView == null) {
                return;
            }
            java.lang.String viewMapKey = matchedView.getViewMapKey();
            android.widget.AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener) {
                if (onItemClickListener == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    com.facebook.appevents.codeless.CodelessLoggingEventListener codelessLoggingEventListener = com.facebook.appevents.codeless.CodelessLoggingEventListener.INSTANCE;
                    adapterView.setOnItemClickListener(com.facebook.appevents.codeless.CodelessLoggingEventListener.getOnItemClickListener(mapping, rootView, adapterView));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        private final void attachRCTListener(com.facebook.appevents.codeless.CodelessMatcher.MatchedView matchedView, android.view.View rootView, com.facebook.appevents.codeless.internal.EventBinding mapping) {
            boolean z;
            android.view.View view = matchedView.getView();
            if (view == null) {
                return;
            }
            java.lang.String viewMapKey = matchedView.getViewMapKey();
            com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
            android.view.View.OnTouchListener existingOnTouchListener = com.facebook.appevents.codeless.internal.ViewHierarchy.getExistingOnTouchListener(view);
            if (existingOnTouchListener instanceof com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) {
                if (existingOnTouchListener == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) existingOnTouchListener).getSupportCodelessLogging()) {
                    z = true;
                    if (!this.listenerSet.contains(viewMapKey) || z) {
                    }
                    com.facebook.appevents.codeless.RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.INSTANCE;
                    view.setOnTouchListener(com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.getOnTouchListener(mapping, rootView, view));
                    this.listenerSet.add(viewMapKey);
                    return;
                }
            }
            z = false;
            if (this.listenerSet.contains(viewMapKey)) {
            }
        }

        /* compiled from: CodelessMatcher.kt */
        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher$Companion;", "", "()V", "findViewByPath", "", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "path", "Lcom/facebook/appevents/codeless/internal/PathComponent;", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "mapKey", "", "findVisibleChildren", "viewGroup", "Landroid/view/ViewGroup;", "isTheSameView", "", "targetView", "pathElement", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final java.util.List<com.facebook.appevents.codeless.CodelessMatcher.MatchedView> findViewByPath(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View view, java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path, int level, int index, java.lang.String mapKey) {
                java.util.List<android.view.View> findVisibleChildren;
                int size;
                java.util.List<android.view.View> findVisibleChildren2;
                int size2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                java.lang.String str = mapKey + '.' + index;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (level >= path.size()) {
                    arrayList.add(new com.facebook.appevents.codeless.CodelessMatcher.MatchedView(view, str));
                } else {
                    com.facebook.appevents.codeless.internal.PathComponent pathComponent = path.get(level);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pathComponent.getClassName(), com.facebook.appevents.codeless.CodelessMatcher.PARENT_CLASS_NAME)) {
                        android.view.ViewParent parent = view.getParent();
                        if ((parent instanceof android.view.ViewGroup) && (size = (findVisibleChildren = findVisibleChildren((android.view.ViewGroup) parent)).size()) > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                arrayList.addAll(findViewByPath(mapping, findVisibleChildren.get(i), path, level + 1, i, str));
                                if (i2 >= size) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return arrayList;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pathComponent.getClassName(), com.facebook.appevents.codeless.CodelessMatcher.CURRENT_CLASS_NAME)) {
                        arrayList.add(new com.facebook.appevents.codeless.CodelessMatcher.MatchedView(view, str));
                        return arrayList;
                    }
                    if (!isTheSameView(view, pathComponent, index)) {
                        return arrayList;
                    }
                    if (level == path.size() - 1) {
                        arrayList.add(new com.facebook.appevents.codeless.CodelessMatcher.MatchedView(view, str));
                    }
                }
                if ((view instanceof android.view.ViewGroup) && (size2 = (findVisibleChildren2 = findVisibleChildren((android.view.ViewGroup) view)).size()) > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        arrayList.addAll(findViewByPath(mapping, findVisibleChildren2.get(i3), path, level + 1, i3, str));
                        if (i4 >= size2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final boolean isTheSameView(android.view.View targetView, com.facebook.appevents.codeless.internal.PathComponent pathElement, int index) {
                if (pathElement.getIndex() != -1 && index != pathElement.getIndex()) {
                    return false;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(targetView.getClass().getCanonicalName(), pathElement.getClassName())) {
                    if (new kotlin.text.Regex(".*android\\..*").matches(pathElement.getClassName())) {
                        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) pathElement.getClassName(), new java.lang.String[]{com.facebook.appevents.codeless.CodelessMatcher.CURRENT_CLASS_NAME}, false, 0, 6, (java.lang.Object) null);
                        if (!split$default.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((pathElement.getMatchBitmask() & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID.getValue()) > 0 && pathElement.getId() != targetView.getId()) {
                    return false;
                }
                if ((pathElement.getMatchBitmask() & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) {
                    java.lang.String text = pathElement.getText();
                    com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                    java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(targetView);
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    java.lang.String coerceValueIfNullOrEmpty = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(com.facebook.internal.Utility.sha256hash(textOfView), "");
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(text, textOfView) && !kotlin.jvm.internal.Intrinsics.areEqual(text, coerceValueIfNullOrEmpty)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                    java.lang.String description = pathElement.getDescription();
                    java.lang.String obj = targetView.getContentDescription() == null ? "" : targetView.getContentDescription().toString();
                    com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                    java.lang.String coerceValueIfNullOrEmpty2 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(com.facebook.internal.Utility.sha256hash(obj), "");
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(description, obj) && !kotlin.jvm.internal.Intrinsics.areEqual(description, coerceValueIfNullOrEmpty2)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT.getValue()) > 0) {
                    java.lang.String hint = pathElement.getHint();
                    com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy2 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                    java.lang.String hintOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getHintOfView(targetView);
                    com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
                    java.lang.String coerceValueIfNullOrEmpty3 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(com.facebook.internal.Utility.sha256hash(hintOfView), "");
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(hint, hintOfView) && !kotlin.jvm.internal.Intrinsics.areEqual(hint, coerceValueIfNullOrEmpty3)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                    java.lang.String tag = pathElement.getTag();
                    java.lang.String obj2 = targetView.getTag() == null ? "" : targetView.getTag().toString();
                    com.facebook.internal.Utility utility7 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility utility8 = com.facebook.internal.Utility.INSTANCE;
                    java.lang.String coerceValueIfNullOrEmpty4 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(com.facebook.internal.Utility.sha256hash(obj2), "");
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(tag, obj2) && !kotlin.jvm.internal.Intrinsics.areEqual(tag, coerceValueIfNullOrEmpty4)) {
                        return false;
                    }
                }
                return true;
            }

            private final java.util.List<android.view.View> findVisibleChildren(android.view.ViewGroup viewGroup) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        android.view.View child = viewGroup.getChildAt(i);
                        if (child.getVisibility() == 0) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(child, "child");
                            arrayList.add(child);
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                return arrayList;
            }
        }
    }

    /* compiled from: CodelessMatcher.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0007J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$Companion;", "", "()V", "CURRENT_CLASS_NAME", "", "PARENT_CLASS_NAME", "TAG", "kotlin.jvm.PlatformType", "codelessMatcher", "Lcom/facebook/appevents/codeless/CodelessMatcher;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "getParameters", "Landroid/os/Bundle;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final synchronized com.facebook.appevents.codeless.CodelessMatcher getInstance() {
            com.facebook.appevents.codeless.CodelessMatcher access$getCodelessMatcher$cp;
            if (com.facebook.appevents.codeless.CodelessMatcher.access$getCodelessMatcher$cp() == null) {
                com.facebook.appevents.codeless.CodelessMatcher.access$setCodelessMatcher$cp(new com.facebook.appevents.codeless.CodelessMatcher(null));
            }
            access$getCodelessMatcher$cp = com.facebook.appevents.codeless.CodelessMatcher.access$getCodelessMatcher$cp();
            if (access$getCodelessMatcher$cp == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return access$getCodelessMatcher$cp;
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle getParameters(com.facebook.appevents.codeless.internal.EventBinding mapping, android.view.View rootView, android.view.View hostView) {
            java.util.List<com.facebook.appevents.codeless.internal.ParameterComponent> viewParameters;
            java.util.List<com.facebook.appevents.codeless.CodelessMatcher.MatchedView> findViewByPath;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostView, "hostView");
            android.os.Bundle bundle = new android.os.Bundle();
            if (mapping != null && (viewParameters = mapping.getViewParameters()) != null) {
                for (com.facebook.appevents.codeless.internal.ParameterComponent parameterComponent : viewParameters) {
                    if (parameterComponent.getValue() != null && parameterComponent.getValue().length() > 0) {
                        bundle.putString(parameterComponent.getName(), parameterComponent.getValue());
                    } else if (parameterComponent.getPath().size() > 0) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(parameterComponent.getPathType(), com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_RELATIVE)) {
                            com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.Companion companion = com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.INSTANCE;
                            java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path = parameterComponent.getPath();
                            java.lang.String simpleName = hostView.getClass().getSimpleName();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            findViewByPath = companion.findViewByPath(mapping, hostView, path, 0, -1, simpleName);
                        } else {
                            com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.Companion companion2 = com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.INSTANCE;
                            java.util.List<com.facebook.appevents.codeless.internal.PathComponent> path2 = parameterComponent.getPath();
                            java.lang.String simpleName2 = rootView.getClass().getSimpleName();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            findViewByPath = companion2.findViewByPath(mapping, rootView, path2, 0, -1, simpleName2);
                        }
                        java.util.Iterator<com.facebook.appevents.codeless.CodelessMatcher.MatchedView> it = findViewByPath.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                com.facebook.appevents.codeless.CodelessMatcher.MatchedView next = it.next();
                                if (next.getView() != null) {
                                    com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                                    java.lang.String textOfView = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(next.getView());
                                    if (textOfView.length() > 0) {
                                        bundle.putString(parameterComponent.getName(), textOfView);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }
}
