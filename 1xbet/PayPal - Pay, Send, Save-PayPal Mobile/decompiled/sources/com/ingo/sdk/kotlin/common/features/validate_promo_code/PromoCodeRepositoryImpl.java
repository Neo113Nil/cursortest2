package com.ingo.sdk.kotlin.common.features.validate_promo_code;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeRepository;", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeApi;", "promoCodeApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeApi;)V", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/model/PromoCodeResponse;", "applyPromoCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/features/validate_promo_code/PromoCodeApi;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PromoCodeRepositoryImpl implements com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi getHighSpeedVideoFpsRangesFor;

    public PromoCodeRepositoryImpl(com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeApi promoCodeApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCodeApi, "");
        this.getHighSpeedVideoFpsRangesFor = promoCodeApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.validate_promo_code.PromoCodeRepository
    public final java.lang.Object applyPromoCode(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.validate_promo_code.model.PromoCodeResponse>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.applyPromoCode(str, str2, str3, continuation);
    }
}
