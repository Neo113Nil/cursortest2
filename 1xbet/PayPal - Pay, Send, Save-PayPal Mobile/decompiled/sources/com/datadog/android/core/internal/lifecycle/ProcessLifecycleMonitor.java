package com.datadog.android.core.internal.lifecycle;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Ljava/util/concurrent/atomic/AtomicInteger;", "activitiesResumedCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "getActivitiesResumedCounter", "()Ljava/util/concurrent/atomic/AtomicInteger;", "activitiesStartedCounter", "getActivitiesStartedCounter", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "getCallback", "()Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "wasPaused", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getWasPaused", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "wasStopped", "getWasStopped", "Callback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProcessLifecycleMonitor implements android.app.Application.ActivityLifecycleCallbacks {
    private final java.util.concurrent.atomic.AtomicInteger activitiesResumedCounter;
    private final java.util.concurrent.atomic.AtomicInteger activitiesStartedCounter;
    private final com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback callback;
    private final java.util.concurrent.atomic.AtomicBoolean wasPaused;
    private final java.util.concurrent.atomic.AtomicBoolean wasStopped;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "", "", "onPaused", "()V", "onResumed", "onStarted", "onStopped"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void onPaused();

        void onResumed();

        void onStarted();

        void onStopped();
    }

    public ProcessLifecycleMonitor(com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.callback = callback;
        this.activitiesResumedCounter = new java.util.concurrent.atomic.AtomicInteger(0);
        this.activitiesStartedCounter = new java.util.concurrent.atomic.AtomicInteger(0);
        this.wasPaused = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.wasStopped = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public final com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback getCallback() {
        return this.callback;
    }

    public final java.util.concurrent.atomic.AtomicInteger getActivitiesResumedCounter() {
        return this.activitiesResumedCounter;
    }

    public final java.util.concurrent.atomic.AtomicInteger getActivitiesStartedCounter() {
        return this.activitiesStartedCounter;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getWasPaused() {
        return this.wasPaused;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getWasStopped() {
        return this.wasStopped;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.activitiesResumedCounter.decrementAndGet() != 0 || this.wasPaused.getAndSet(true)) {
            return;
        }
        this.callback.onPaused();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.activitiesStartedCounter.incrementAndGet() == 1 && this.wasStopped.getAndSet(false)) {
            this.callback.onStarted();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.activitiesStartedCounter.decrementAndGet() == 0 && this.wasPaused.get()) {
            this.callback.onStopped();
            this.wasStopped.set(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.activitiesResumedCounter.incrementAndGet() == 1 && this.wasPaused.getAndSet(false)) {
            this.callback.onResumed();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }
}
