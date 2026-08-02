package androidx.core.view;

/* loaded from: classes3.dex */
public final class OneShotPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    private final java.lang.Runnable Camera2StreamConfigurationMap;
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private android.view.ViewTreeObserver getHighSpeedVideoSizes;

    private OneShotPreDrawListener(android.view.View view, java.lang.Runnable runnable) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.getHighSpeedVideoSizes = view.getViewTreeObserver();
        this.Camera2StreamConfigurationMap = runnable;
    }

    public static androidx.core.view.OneShotPreDrawListener add(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            throw new java.lang.NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new java.lang.NullPointerException("runnable == null");
        }
        androidx.core.view.OneShotPreDrawListener oneShotPreDrawListener = new androidx.core.view.OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        removeListener();
        this.Camera2StreamConfigurationMap.run();
        return true;
    }

    public final void removeListener() {
        if (this.getHighSpeedVideoSizes.isAlive()) {
            this.getHighSpeedVideoSizes.removeOnPreDrawListener(this);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.getHighSpeedVideoSizes = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        removeListener();
    }
}
