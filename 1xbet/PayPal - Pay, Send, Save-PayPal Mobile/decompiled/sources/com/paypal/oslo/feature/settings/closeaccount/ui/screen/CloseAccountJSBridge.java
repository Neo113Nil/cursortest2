package com.paypal.oslo.feature.settings.closeaccount.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/screen/CloseAccountJSBridge;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseAccountWebViewModel;", "viewModel", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseAccountWebViewModel;)V", "", "closeAccountCallback", "()V", "dismissWebview", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseAccountWebViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountJSBridge {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel getHighResolutionOutputSizeshNQ4ISI;

    public CloseAccountJSBridge(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel closeAccountWebViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountWebViewModel, "");
        this.getHighResolutionOutputSizeshNQ4ISI = closeAccountWebViewModel;
    }

    @android.webkit.JavascriptInterface
    public final void closeAccountCallback() {
        this.getHighResolutionOutputSizeshNQ4ISI.setResult$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.CLOSE);
    }

    @android.webkit.JavascriptInterface
    public final void dismissWebview() {
        this.getHighResolutionOutputSizeshNQ4ISI.setResult$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.DISMISS);
    }
}
