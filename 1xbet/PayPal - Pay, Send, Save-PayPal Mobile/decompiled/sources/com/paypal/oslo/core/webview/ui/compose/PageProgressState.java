package com.paypal.oslo.core.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/compose/PageProgressState;", "Lcom/paypal/oslo/core/webview/ui/state/PageLoadProgressHandler;", "<init>", "()V", "", "newProgress", "", "onProgressChanged", "(I)V", "onPageStarted", "onPageFinished", "Landroidx/compose/runtime/MutableIntState;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/State;", "", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRangesFor", "getProgressState", "()Landroidx/compose/runtime/State;", "progressState", "isLoadingState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PageProgressState implements com.paypal.oslo.core.webview.ui.state.PageLoadProgressHandler {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(1);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.webview.ui.compose.PageProgressState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(com.paypal.oslo.core.webview.ui.compose.PageProgressState.$r8$lambda$mmXx1jrQs0kScf0Cxkm4A6APNjY(com.paypal.oslo.core.webview.ui.compose.PageProgressState.this));
        }
    });

    public final androidx.compose.runtime.State<java.lang.Integer> getProgressState() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.compose.runtime.State<java.lang.Boolean> isLoadingState() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.core.webview.ui.state.PageLoadProgressHandler
    public final void onProgressChanged(int newProgress) {
        androidx.compose.runtime.MutableIntState mutableIntState = this.Camera2StreamConfigurationMap;
        if (newProgress >= 100) {
            newProgress = 100;
        } else if (newProgress <= 0) {
            newProgress = 1;
        }
        mutableIntState.setIntValue(newProgress);
    }

    @Override // com.paypal.oslo.core.webview.ui.state.PageLoadProgressHandler
    public final void onPageStarted() {
        this.Camera2StreamConfigurationMap.setIntValue(1);
    }

    @Override // com.paypal.oslo.core.webview.ui.state.PageLoadProgressHandler
    public final void onPageFinished() {
        this.Camera2StreamConfigurationMap.setIntValue(100);
    }

    public static /* synthetic */ boolean $r8$lambda$mmXx1jrQs0kScf0Cxkm4A6APNjY(com.paypal.oslo.core.webview.ui.compose.PageProgressState pageProgressState) {
        int intValue = pageProgressState.Camera2StreamConfigurationMap.getIntValue();
        return intValue > 0 && intValue < 100;
    }
}
