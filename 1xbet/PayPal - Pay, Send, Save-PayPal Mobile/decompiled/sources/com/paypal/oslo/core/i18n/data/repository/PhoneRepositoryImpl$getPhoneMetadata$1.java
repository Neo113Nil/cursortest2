package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl", f = "PhoneRepositoryImpl.kt", i = {0}, l = {66}, m = "getPhoneMetadata-n_l99Nk", n = {"regionCode"}, nl = {146}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class PhoneRepositoryImpl$getPhoneMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.mo11235getPhoneMetadatan_l99Nk(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneRepositoryImpl$getPhoneMetadata$1(com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl phoneRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.PhoneRepositoryImpl$getPhoneMetadata$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = phoneRepositoryImpl;
    }
}
