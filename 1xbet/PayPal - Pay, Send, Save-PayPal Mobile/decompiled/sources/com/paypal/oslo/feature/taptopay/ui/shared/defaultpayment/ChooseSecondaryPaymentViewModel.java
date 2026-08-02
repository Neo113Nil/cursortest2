package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/ChooseSecondaryPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;", "isDefaultPaymentAppUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;", "isForegroundSettingEnabledUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;)V", "", "onReturnFromSettings", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsDefaultPaymentAppUseCase;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseSecondaryPaymentEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseSecondaryPaymentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ChooseSecondaryPaymentViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase isDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase isForegroundSettingEnabledUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDefaultPaymentAppUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isForegroundSettingEnabledUseCase, "");
        this.getHighSpeedVideoSizes = isDefaultPaymentAppUseCase;
        this.getHighSpeedVideoFpsRangesFor = isForegroundSettingEnabledUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect> getEffects() {
        return this.effects;
    }

    public final void onReturnFromSettings() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Returned from settings, checking status", null, null, 6, null);
        boolean invoke = this.getHighSpeedVideoSizes.invoke();
        boolean invoke2 = this.getHighSpeedVideoFpsRangesFor.invoke();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Status check results", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDefaultPaymentApp", java.lang.Boolean.valueOf(invoke)), kotlin.TuplesKt.to("isForegroundSettingEnabled", java.lang.Boolean.valueOf(invoke2))), null, 4, null);
        if (invoke || invoke2) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "At least one condition met, navigating to success", null, null, 6, null);
            this.Camera2StreamConfigurationMap.tryEmit(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect.SetupComplete.INSTANCE);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No conditions met, dismissing flow", null, null, 6, null);
            this.Camera2StreamConfigurationMap.tryEmit(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect.SetupDismissed.INSTANCE);
        }
    }
}
