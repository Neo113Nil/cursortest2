package com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase", f = "ClearRememberedUserProfileUseCase.kt", i = {}, l = {47, 50, 54}, m = "invoke", n = {}, nl = {50, 54, 55}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ClearRememberedUserProfileUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClearRememberedUserProfileUseCase$invoke$1(com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase clearRememberedUserProfileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = clearRememberedUserProfileUseCase;
    }
}
