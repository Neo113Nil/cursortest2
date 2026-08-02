package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase", f = "SaveDistributionConfigurationUseCase.kt", i = {0}, l = {117}, m = "invoke", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class SaveDistributionConfigurationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveDistributionConfigurationUseCase$invoke$1(com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = saveDistributionConfigurationUseCase;
    }
}
