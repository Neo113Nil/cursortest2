package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class t implements WindowManager {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f10264a;

    /* renamed from: b, reason: collision with root package name */
    public final n f10265b;

    public t(WindowManager windowManager, n nVar) {
        this.f10264a = windowManager;
        this.f10265b = nVar;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f10264a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f10265b;
        if (nVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            nVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f10264a.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.f10264a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f10264a.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f10264a.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f10264a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        n nVar = this.f10265b;
        if (nVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            nVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        n nVar = this.f10265b;
        if (nVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            nVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f10265b;
        if (nVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            nVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f10264a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
