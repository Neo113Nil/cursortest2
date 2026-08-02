package com.paypal.oslo.feature.taptopay.ui.router.paymode;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRouterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getAllCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "payLaterExpiryChecker", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/router/paymode/PayModeRoutingState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "routingState", "Lkotlinx/coroutines/flow/StateFlow;", "getRoutingState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayModeRouterViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState> routingState;

    @javax.inject.Inject
    public PayModeRouterViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterExpiryChecker, "");
        this.Camera2StreamConfigurationMap = payPalGetAllCardsUseCase;
        this.getHighSpeedVideoFpsRanges = payLaterExpiryChecker;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.routingState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel$determineRoute$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState> getRoutingState() {
        return this.routingState;
    }
}
