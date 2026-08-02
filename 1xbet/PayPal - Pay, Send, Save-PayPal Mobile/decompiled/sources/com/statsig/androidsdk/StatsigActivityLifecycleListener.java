package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%"}, d2 = {"Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application;", "application", "Lcom/statsig/androidsdk/LifecycleEventListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/app/Application;Lcom/statsig/androidsdk/LifecycleEventListener;)V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "", "isApplicationInForeground", "()Z", "isApplicationVisible", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "shutdown", "()V", "Landroid/app/Application;", "currentActivity", "Landroid/app/Activity;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "", "paused", com.visa.cbp.getEncExpo.warmup, "resumed", "started", "stopped"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigActivityLifecycleListener implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Application application;
    private android.app.Activity currentActivity;
    private final com.statsig.androidsdk.LifecycleEventListener listener;
    private int paused;
    private int resumed;
    private int started;
    private int stopped;

    public StatsigActivityLifecycleListener(android.app.Application application, com.statsig.androidsdk.LifecycleEventListener lifecycleEventListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleEventListener, "");
        this.application = application;
        this.listener = lifecycleEventListener;
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void shutdown() {
        this.application.unregisterActivityLifecycleCallbacks(this);
    }

    public final android.app.Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.started++;
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.currentActivity = activity;
        this.resumed++;
        this.listener.onAppFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.paused++;
        if (isApplicationInForeground()) {
            return;
        }
        this.listener.onAppBlur();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.stopped++;
        this.currentActivity = null;
        if (isApplicationVisible()) {
            return;
        }
        this.listener.onAppBlur();
    }

    private final boolean isApplicationVisible() {
        return this.started > this.stopped;
    }

    private final boolean isApplicationInForeground() {
        return this.resumed > this.paused;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.currentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }
}
