package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl", f = "CurrencyRepositoryImpl.kt", i = {0}, l = {77}, m = "getCurrencyMetadata", n = {"locale"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class CurrencyRepositoryImpl$getCurrencyMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getCurrencyMetadata(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyRepositoryImpl$getCurrencyMetadata$1(com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl$getCurrencyMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = currencyRepositoryImpl;
    }
}
