package com.ingo.sdk.kotlin.common.features.validate_promo_code;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi", f = "PromoCodeApi.kt", i = {0, 1, 1}, l = {110, 49}, m = "applyPromoCode", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class PromoCodeApi$applyPromoCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.applyPromoCode(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoCodeApi$applyPromoCode$1(com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi promoCodeApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi$applyPromoCode$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = promoCodeApi;
    }
}
