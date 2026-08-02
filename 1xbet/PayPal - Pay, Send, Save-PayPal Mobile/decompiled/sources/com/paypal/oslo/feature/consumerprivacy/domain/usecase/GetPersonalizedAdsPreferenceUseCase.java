package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedAdsPreferenceUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedAdsPreference;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPersonalizedAdsPreferenceUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetPersonalizedAdsPreferenceUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedAdsRepository personalizedAdsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedAdsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = personalizedAdsRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getPersonalizedAdsPreference(continuation);
    }
}
