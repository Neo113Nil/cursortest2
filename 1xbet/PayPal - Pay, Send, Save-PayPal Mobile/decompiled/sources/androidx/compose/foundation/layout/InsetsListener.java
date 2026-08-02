package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0011\u0010 \u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020!8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b \u0010#R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b$\u0010&"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "p0", "<init>", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "Landroidx/core/view/WindowInsetsAnimationCompat;", "", "onPrepare", "(Landroidx/core/view/WindowInsetsAnimationCompat;)V", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "p1", "onStart", "(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/core/view/WindowInsetsCompat;", "", "onProgress", "(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;", "onEnd", "Landroid/view/View;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/core/view/WindowInsetsCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InsetsListener extends androidx.core.view.WindowInsetsAnimationCompat.Callback implements java.lang.Runnable, androidx.core.view.OnApplyWindowInsetsListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public androidx.core.view.WindowInsetsCompat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.WindowInsetsHolder getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View p0) {
    }

    public InsetsListener(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.getHighSpeedVideoSizes = windowInsetsHolder;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(androidx.core.view.WindowInsetsAnimationCompat p0) {
        this.Camera2StreamConfigurationMap = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        super.onPrepare(p0);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat p0, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat p1) {
        this.Camera2StreamConfigurationMap = false;
        return super.onStart(p0, p1);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat p0, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> p1) {
        androidx.compose.foundation.layout.WindowInsetsHolder.update$default(this.getHighSpeedVideoSizes, p0, 0, 2, null);
        return this.getHighSpeedVideoSizes.getConsumes() ? androidx.core.view.WindowInsetsCompat.CONSUMED : p0;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(androidx.core.view.WindowInsetsAnimationCompat p0) {
        this.Camera2StreamConfigurationMap = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.getHighSpeedVideoFpsRangesFor;
        if (p0.getDurationMillis() > 0 && windowInsetsCompat != null) {
            this.getHighSpeedVideoSizes.updateImeAnimationSource(windowInsetsCompat);
            this.getHighSpeedVideoSizes.updateImeAnimationTarget(windowInsetsCompat);
            androidx.compose.foundation.layout.WindowInsetsHolder.update$default(this.getHighSpeedVideoSizes, windowInsetsCompat, 0, 2, null);
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        super.onEnd(p0);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View p0, androidx.core.view.WindowInsetsCompat p1) {
        this.getHighSpeedVideoFpsRangesFor = p1;
        this.getHighSpeedVideoSizes.updateImeAnimationTarget(p1);
        if (this.Camera2StreamConfigurationMap) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                p0.post(this);
            }
        } else if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.updateImeAnimationSource(p1);
            androidx.compose.foundation.layout.WindowInsetsHolder.update$default(this.getHighSpeedVideoSizes, p1, 0, 2, null);
        }
        return this.getHighSpeedVideoSizes.getConsumes() ? androidx.core.view.WindowInsetsCompat.CONSUMED : p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.getHighSpeedVideoFpsRangesFor;
            if (windowInsetsCompat != null) {
                this.getHighSpeedVideoSizes.updateImeAnimationSource(windowInsetsCompat);
                androidx.compose.foundation.layout.WindowInsetsHolder.update$default(this.getHighSpeedVideoSizes, windowInsetsCompat, 0, 2, null);
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View p0) {
        p0.requestApplyInsets();
    }
}
