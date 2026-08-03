package com.vungle.ads.internal.util;

/* compiled from: ActivityManager.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0003()*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J.\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "callbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "foregroundActivityCount", "", "isAppInForeground", "", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "targetActivityInfo", "Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "addListener", "", "callback", "deInit", "context", "Landroid/content/Context;", com.ironsource.X3.a.f, "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "removeListener", "startActivitySafely", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "LifeCycleCallback", "TargetActivityInfo", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivityManager implements android.app.Application.ActivityLifecycleCallbacks {
    private static final java.lang.String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;
    private volatile com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo targetActivityInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.util.ActivityManager.Companion INSTANCE = new com.vungle.ads.internal.util.ActivityManager.Companion(null);
    private static final com.vungle.ads.internal.util.ActivityManager instance = new com.vungle.ads.internal.util.ActivityManager();
    private final java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.CopyOnWriteArraySet<com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback> callbacks = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* compiled from: ActivityManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "", "()V", "onActivityPaused", "", "activity", "Landroid/app/Activity;", "onActivityResumed", "onBackground", "onForeground", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class LifeCycleCallback {
        public void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public void onBackground() {
        }

        public void onForeground() {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "outState");
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(android.content.Context context) {
        java.lang.Object m10798constructorimpl;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.util.ActivityManager activityManager = this;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(this);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error initializing ActivityManager", m10801exceptionOrNullimpl);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback callback) {
        this.callbacks.add(callback);
    }

    public final void removeListener(com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            android.content.Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                com.vungle.ads.internal.util.ActivityManager.Companion companion = INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        java.util.Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            java.util.Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.util.Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.util.Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback) it.next()).onActivityPaused(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(android.content.Context context, android.content.Intent deepLinkOverrideIntent, android.content.Intent defaultIntent, com.vungle.ads.internal.ui.PresenterAdOpenCallback adOpenCallback) {
        try {
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to start activity: " + e);
            if (deepLinkOverrideIntent != null && adOpenCallback != null) {
                try {
                    adOpenCallback.onDeeplinkClick(false);
                } catch (java.lang.Exception unused) {
                }
            }
            if (deepLinkOverrideIntent != null && defaultIntent != null) {
                context.startActivity(defaultIntent);
                return true;
            }
        }
        if (deepLinkOverrideIntent == null) {
            if (defaultIntent != null) {
                context.startActivity(defaultIntent);
            }
            return false;
        }
        context.startActivity(deepLinkOverrideIntent);
        if (adOpenCallback != null) {
            adOpenCallback.onDeeplinkClick(true);
        }
        return true;
    }

    /* compiled from: ActivityManager.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$TargetActivityInfo;", "", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "(Ljava/lang/ref/WeakReference;Landroid/content/Intent;Landroid/content/Intent;Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;)V", "getAdOpenCallback", "()Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "getContext", "()Ljava/lang/ref/WeakReference;", "getDeepLinkOverrideIntent", "()Landroid/content/Intent;", "getDefaultIntent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final /* data */ class TargetActivityInfo {
        private final com.vungle.ads.internal.ui.PresenterAdOpenCallback adOpenCallback;
        private final java.lang.ref.WeakReference<android.content.Context> context;
        private final android.content.Intent deepLinkOverrideIntent;
        private final android.content.Intent defaultIntent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo copy$default(com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo targetActivityInfo, java.lang.ref.WeakReference weakReference, android.content.Intent intent, android.content.Intent intent2, com.vungle.ads.internal.ui.PresenterAdOpenCallback presenterAdOpenCallback, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        public final java.lang.ref.WeakReference<android.content.Context> component1() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final android.content.Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        /* renamed from: component3, reason: from getter */
        public final android.content.Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        /* renamed from: component4, reason: from getter */
        public final com.vungle.ads.internal.ui.PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        public final com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo copy(java.lang.ref.WeakReference<android.content.Context> context, android.content.Intent deepLinkOverrideIntent, android.content.Intent defaultIntent, com.vungle.ads.internal.ui.PresenterAdOpenCallback adOpenCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo)) {
                return false;
            }
            com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo targetActivityInfo = (com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.context, targetActivityInfo.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultIntent, targetActivityInfo.defaultIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        public int hashCode() {
            int hashCode = this.context.hashCode() * 31;
            android.content.Intent intent = this.deepLinkOverrideIntent;
            int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            android.content.Intent intent2 = this.defaultIntent;
            int hashCode3 = (hashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            com.vungle.ads.internal.ui.PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return hashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }

        public TargetActivityInfo(java.lang.ref.WeakReference<android.content.Context> context, android.content.Intent intent, android.content.Intent intent2, com.vungle.ads.internal.ui.PresenterAdOpenCallback presenterAdOpenCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        public final java.lang.ref.WeakReference<android.content.Context> getContext() {
            return this.context;
        }

        public final android.content.Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        public final android.content.Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public final com.vungle.ads.internal.ui.PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }
    }

    /* compiled from: ActivityManager.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ,\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/internal/util/ActivityManager$Companion;", "", "()V", "TAG", "", com.ironsource.C3232q2.p, "Lcom/vungle/ads/internal/util/ActivityManager;", "getInstance$vungle_ads_release$annotations", "getInstance$vungle_ads_release", "()Lcom/vungle/ads/internal/util/ActivityManager;", "addLifecycleListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/util/ActivityManager$LifeCycleCallback;", "deInit", "context", "Landroid/content/Context;", "deInit$vungle_ads_release", com.ironsource.X3.a.f, "isForeground", "", "removeLifecycleListener", "startWhenForeground", "deepLinkOverrideIntent", "Landroid/content/Intent;", "defaultIntent", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        private Companion() {
        }

        public final com.vungle.ads.internal.util.ActivityManager getInstance$vungle_ads_release() {
            return com.vungle.ads.internal.util.ActivityManager.instance;
        }

        public final boolean startWhenForeground(android.content.Context context, android.content.Intent deepLinkOverrideIntent, android.content.Intent defaultIntent, com.vungle.ads.internal.ui.PresenterAdOpenCallback adOpenCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new com.vungle.ads.internal.util.ActivityManager.TargetActivityInfo(new java.lang.ref.WeakReference(context), deepLinkOverrideIntent, defaultIntent, adOpenCallback);
            return false;
        }

        public final void init(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void addLifecycleListener(com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void removeLifecycleListener(com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final void deInit$vungle_ads_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }
    }
}
