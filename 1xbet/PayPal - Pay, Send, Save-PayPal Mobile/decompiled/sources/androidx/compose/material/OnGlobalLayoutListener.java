package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015"}, d2 = {"Landroidx/compose/material/OnGlobalLayoutListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/View;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "()V", "Camera2StreamConfigurationMap", "Landroid/view/View;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnGlobalLayoutListener implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final android.view.View getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    public OnGlobalLayoutListener(android.view.View view, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRanges = view;
        this.getHighSpeedVideoSizes = function0;
        view.addOnAttachStateChangeListener(this);
        Camera2StreamConfigurationMap();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View p0) {
        Camera2StreamConfigurationMap();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.getHighSpeedVideoSizes.invoke();
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.getHighResolutionOutputSizeshNQ4ISI || !this.getHighSpeedVideoFpsRanges.isAttachedToWindow()) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View p0) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }
}
