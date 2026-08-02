package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u001d\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayLifecycleCallback;", "Lcom/datadog/android/sessionreplay/internal/LifecycleCallback;", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;", "onWindowRefreshedCallback", "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;)V", "", "Landroid/view/Window;", "getCurrentWindows", "()Ljava/util/List;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "windows", "onWindowsAdded", "(Ljava/util/List;)V", "onWindowsRemoved", "registerFragmentLifecycleCallbacks", "setCurrentWindow", "Ljava/util/WeakHashMap;", "", "Camera2StreamConfigurationMap", "Ljava/util/WeakHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/OnWindowRefreshedCallback;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayLifecycleCallback implements com.datadog.android.sessionreplay.internal.LifecycleCallback, com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.WeakHashMap<android.view.Window, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback getHighSpeedVideoFpsRanges;

    public SessionReplayLifecycleCallback(com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback onWindowRefreshedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onWindowRefreshedCallback, "");
        this.getHighSpeedVideoFpsRanges = onWindowRefreshedCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.WeakHashMap<>();
    }

    public final void setCurrentWindow(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        if (window != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(window, null);
        }
    }

    public final void registerFragmentLifecycleCallbacks(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            ((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new com.datadog.android.sessionreplay.internal.recorder.callback.RecorderFragmentLifecycleCallback(this), true);
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback
    public final void onWindowsAdded(java.util.List<? extends android.view.Window> windows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        java.util.Iterator<T> it = windows.iterator();
        while (it.hasNext()) {
            this.getHighResolutionOutputSizeshNQ4ISI.put((android.view.Window) it.next(), null);
        }
        this.getHighSpeedVideoFpsRanges.onWindowsAdded(windows);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.callback.OnWindowRefreshedCallback
    public final void onWindowsRemoved(java.util.List<? extends android.view.Window> windows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        java.util.Iterator<T> it = windows.iterator();
        while (it.hasNext()) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove((android.view.Window) it.next());
        }
        this.getHighSpeedVideoFpsRanges.onWindowsRemoved(windows);
    }

    @Override // com.datadog.android.sessionreplay.internal.LifecycleCallback
    public final java.util.List<android.view.Window> getCurrentWindows() {
        java.util.Set<android.view.Window> keySet = this.getHighResolutionOutputSizeshNQ4ISI.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
        return kotlin.collections.CollectionsKt.toList(keySet);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        registerFragmentLifecycleCallbacks(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        if (window != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(window, null);
            this.getHighSpeedVideoFpsRanges.onWindowsAdded(kotlin.collections.CollectionsKt.listOf(window));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.view.Window window = activity.getWindow();
        if (window != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(window);
            this.getHighSpeedVideoFpsRanges.onWindowsRemoved(kotlin.collections.CollectionsKt.listOf(window));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
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
}
