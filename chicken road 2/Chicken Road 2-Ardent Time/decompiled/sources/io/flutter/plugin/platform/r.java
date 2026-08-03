package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class r implements android.view.WindowManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowManager f7794a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.plugin.platform.l f7795b;

    public r(android.view.WindowManager windowManager, io.flutter.plugin.platform.l lVar) {
        this.f7794a = windowManager;
        this.f7795b = lVar;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f7794a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.flutter.plugin.platform.l lVar = this.f7795b;
        if (lVar == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            lVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final android.view.WindowMetrics getCurrentWindowMetrics() {
        android.view.WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f7794a.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final android.view.Display getDefaultDisplay() {
        return this.f7794a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final android.view.WindowMetrics getMaximumWindowMetrics() {
        android.view.WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f7794a.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f7794a.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f7794a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(android.view.View view) {
        io.flutter.plugin.platform.l lVar = this.f7795b;
        if (lVar == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            lVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(android.view.View view) {
        io.flutter.plugin.platform.l lVar = this.f7795b;
        if (lVar == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            lVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.flutter.plugin.platform.l lVar = this.f7795b;
        if (lVar == null) {
            android.util.Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            lVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        this.f7794a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
