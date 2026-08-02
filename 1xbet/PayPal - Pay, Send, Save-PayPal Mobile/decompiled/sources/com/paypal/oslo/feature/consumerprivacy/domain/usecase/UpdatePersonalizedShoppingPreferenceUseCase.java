package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedShoppingPreferenceUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;)V", "", "enabled", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShoppingError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedShopping;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedShoppingRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePersonalizedShoppingPreferenceUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdatePersonalizedShoppingPreferenceUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.PersonalizedShoppingRepository personalizedShoppingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingRepository, "");
        this.getHighSpeedVideoSizes = personalizedShoppingRepository;
    }

    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping>> continuation) {
        return this.getHighSpeedVideoSizes.updatePersonalizedShoppingPreference(z, continuation);
    }
}
