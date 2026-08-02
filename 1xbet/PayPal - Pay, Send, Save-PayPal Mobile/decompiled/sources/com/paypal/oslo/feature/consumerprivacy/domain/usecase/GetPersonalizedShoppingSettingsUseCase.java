package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedShoppingSettingsUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPersonalizedShoppingSettingsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetPersonalizedShoppingSettingsUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository personalizedShoppingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingRepository, "");
        this.getHighSpeedVideoFpsRangesFor = personalizedShoppingRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getPersonalizedShoppingSettings(continuation);
    }
}
