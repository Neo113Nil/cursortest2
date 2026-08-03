package com.facebook.appevents.suggestedevents;

/* compiled from: ViewObserver.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalLayout", "", "process", "startTracking", "stopTracking", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewObserver implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private static final int MAX_TEXT_LENGTH = 300;
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private final java.util.concurrent.atomic.AtomicBoolean isTracking;
    private final android.os.Handler uiThreadHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.suggestedevents.ViewObserver.Companion INSTANCE = new com.facebook.appevents.suggestedevents.ViewObserver.Companion(null);
    private static final java.util.Map<java.lang.Integer, com.facebook.appevents.suggestedevents.ViewObserver> observers = new java.util.HashMap();

    public /* synthetic */ ViewObserver(android.app.Activity activity, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    @kotlin.jvm.JvmStatic
    public static final void startTrackingActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.startTrackingActivity(activity);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void stopTrackingActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.stopTrackingActivity(activity);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
        }
    }

    private ViewObserver(android.app.Activity activity) {
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isTracking = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final /* synthetic */ java.util.Map access$getObservers$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(com.facebook.appevents.suggestedevents.ViewObserver viewObserver) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.startTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
        }
    }

    public static final /* synthetic */ void access$stopTracking(com.facebook.appevents.suggestedevents.ViewObserver viewObserver) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return;
        }
        try {
            viewObserver.stopTracking();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
        }
    }

    private final void startTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
            android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(this.activityWeakReference.get());
            if (rootView == null) {
                return;
            }
            android.view.ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                process();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void stopTracking() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false)) {
                com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(this.activityWeakReference.get());
                if (rootView == null) {
                    return;
                }
                android.view.ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            process();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void process() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facebook.appevents.suggestedevents.ViewObserver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.suggestedevents.ViewObserver.m5151process$lambda0(com.facebook.appevents.suggestedevents.ViewObserver.this);
                }
            };
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: process$lambda-0, reason: not valid java name */
    public static final void m5151process$lambda0(com.facebook.appevents.suggestedevents.ViewObserver this$0) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.ViewObserver.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                android.view.View rootView = com.facebook.appevents.internal.AppEventUtility.getRootView(this$0.activityWeakReference.get());
                android.app.Activity activity = this$0.activityWeakReference.get();
                if (rootView != null && activity != null) {
                    com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy suggestedEventViewHierarchy = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.INSTANCE;
                    for (android.view.View view : com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.getAllClickableViews(rootView)) {
                        com.facebook.appevents.codeless.internal.SensitiveUserDataUtils sensitiveUserDataUtils = com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.INSTANCE;
                        if (!com.facebook.appevents.codeless.internal.SensitiveUserDataUtils.isSensitiveUserData(view)) {
                            com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy suggestedEventViewHierarchy2 = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.INSTANCE;
                            java.lang.String textOfViewRecursively = com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy.getTextOfViewRecursively(view);
                            if (textOfViewRecursively.length() > 0 && textOfViewRecursively.length() <= 300) {
                                com.facebook.appevents.suggestedevents.ViewOnClickListener.Companion companion = com.facebook.appevents.suggestedevents.ViewOnClickListener.INSTANCE;
                                java.lang.String localClassName = activity.getLocalClassName();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                companion.attachListener$facebook_core_release(view, rootView, localClassName);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.ViewObserver.class);
        }
    }

    /* compiled from: ViewObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/suggestedevents/ViewObserver;", "startTrackingActivity", "", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void startTrackingActivity(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            java.util.Map access$getObservers$cp = com.facebook.appevents.suggestedevents.ViewObserver.access$getObservers$cp();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            java.lang.Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new com.facebook.appevents.suggestedevents.ViewObserver(activity, null);
                access$getObservers$cp.put(valueOf, obj);
            }
            com.facebook.appevents.suggestedevents.ViewObserver.access$startTracking((com.facebook.appevents.suggestedevents.ViewObserver) obj);
        }

        @kotlin.jvm.JvmStatic
        public final void stopTrackingActivity(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            com.facebook.appevents.suggestedevents.ViewObserver viewObserver = (com.facebook.appevents.suggestedevents.ViewObserver) com.facebook.appevents.suggestedevents.ViewObserver.access$getObservers$cp().remove(java.lang.Integer.valueOf(activity.hashCode()));
            if (viewObserver == null) {
                return;
            }
            com.facebook.appevents.suggestedevents.ViewObserver.access$stopTracking(viewObserver);
        }
    }
}
