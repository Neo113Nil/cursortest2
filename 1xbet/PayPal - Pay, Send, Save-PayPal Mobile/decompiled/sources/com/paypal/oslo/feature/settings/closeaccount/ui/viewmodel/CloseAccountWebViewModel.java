package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseAccountWebViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;", "useCases", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;)V", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountWebViewResult;", "result", "", "setResult$settings_prodRelease", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountWebViewResult;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/SharedFlow;", "webViewResult", "Lkotlinx/coroutines/flow/SharedFlow;", "getWebViewResult", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountWebViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult> webViewResult;

    @javax.inject.Inject
    public CloseAccountWebViewModel(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUseCasesProvider, "");
        this.Camera2StreamConfigurationMap = closeAccountUseCasesProvider;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableSharedFlow$default;
        this.webViewResult = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult> getWebViewResult() {
        return this.webViewResult;
    }

    public final void setResult$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        int i = com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel.WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$1(this, null), 3, null);
        } else {
            if (i == 2) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel$setResult$2(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountWebViewResult.DISMISS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
