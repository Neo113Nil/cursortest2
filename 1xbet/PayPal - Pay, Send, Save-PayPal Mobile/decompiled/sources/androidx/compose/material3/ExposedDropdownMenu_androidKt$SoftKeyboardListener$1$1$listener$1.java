package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/View;", "p0", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "onGlobalLayout", "()V", "getHighSpeedVideoFpsRangesFor", "dispose", "", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(android.view.View view, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.Camera2StreamConfigurationMap = function0;
        view.addOnAttachStateChangeListener(this);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View p0) {
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.Camera2StreamConfigurationMap.invoke();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRanges || !this.getHighResolutionOutputSizeshNQ4ISI.isAttachedToWindow()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final void dispose() {
        if (this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.getHighSpeedVideoFpsRanges = false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View p0) {
        if (this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.getHighSpeedVideoFpsRanges = false;
        }
    }
}
