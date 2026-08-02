package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class D implements WindowManager {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f14135a;

    /* renamed from: b, reason: collision with root package name */
    public final t f14136b;

    public D(WindowManager windowManager, t tVar) {
        this.f14135a = windowManager;
        this.f14136b = tVar;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f14135a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        t tVar = this.f14136b;
        if (tVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            tVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f14135a.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.f14135a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f14135a.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f14135a.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f14135a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        t tVar = this.f14136b;
        if (tVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            tVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        t tVar = this.f14136b;
        if (tVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            tVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        t tVar = this.f14136b;
        if (tVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            tVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f14135a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
