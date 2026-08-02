package com.paypal.oslo.feature.identity.rememberedlogin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl", f = "RememberedLoginRepositoryImpl.kt", i = {}, l = {37}, m = "getRememberedUser", n = {}, nl = {76}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class RememberedLoginRepositoryImpl$getRememberedUser$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getRememberedUser(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedLoginRepositoryImpl$getRememberedUser$1(com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl rememberedLoginRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl$getRememberedUser$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = rememberedLoginRepositoryImpl;
    }
}
