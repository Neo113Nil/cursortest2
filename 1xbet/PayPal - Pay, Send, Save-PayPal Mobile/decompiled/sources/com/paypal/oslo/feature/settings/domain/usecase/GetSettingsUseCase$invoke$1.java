package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase", f = "GetSettingsUseCase.kt", i = {}, l = {27}, m = "invoke", n = {}, nl = {34}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class GetSettingsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetSettingsUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase getSettingsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetSettingsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getSettingsUseCase;
    }
}
