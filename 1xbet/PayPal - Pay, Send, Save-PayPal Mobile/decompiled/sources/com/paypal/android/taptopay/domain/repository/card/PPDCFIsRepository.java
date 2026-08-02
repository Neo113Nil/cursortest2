package com.paypal.android.taptopay.domain.repository.card;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/card/PPDCFIsRepository;", "", "getFIs", "Lcom/paypal/android/taptopay/domain/repository/ApiResponse;", "Lcom/paypal/android/taptopay/domain/repository/payment/PPDCFIResponse;", "paypalCardId", "", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "entryPoint", "challengePresenter", "Lcom/paypal/android/foundation/core/operations/ChallengePresenter;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/foundation/core/operations/ChallengePresenter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultFI", "Lcom/paypal/android/taptopay/domain/repository/payment/ChangeFundingPreferenceResponse;", "cardResourceId", "fundingSourceId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tap-to-pay-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PPDCFIsRepository {
    java.lang.Object getFIs(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.android.foundation.core.operations.ChallengePresenter challengePresenter, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.repository.ApiResponse<com.paypal.android.taptopay.domain.repository.payment.PPDCFIResponse>> continuation);

    java.lang.Object setDefaultFI(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.repository.ApiResponse<com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse>> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object setDefaultFI(com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository pPDCFIsRepository, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.repository.ApiResponse<com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse>> continuation) {
            return new com.paypal.android.taptopay.domain.repository.ApiResponse.Failure("Not implemented yet", 0, 2, null);
        }
    }
}
