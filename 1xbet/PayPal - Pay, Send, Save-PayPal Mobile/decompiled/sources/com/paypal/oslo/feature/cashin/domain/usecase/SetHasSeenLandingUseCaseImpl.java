package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCaseImpl;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;", "Lcom/paypal/oslo/feature/cashin/domain/repository/CashInPreferencesRepository;", "cashInPreferencesRepository", "<init>", "(Lcom/paypal/oslo/feature/cashin/domain/repository/CashInPreferencesRepository;)V", "", "hasSeen", "", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cashin/domain/repository/CashInPreferencesRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SetHasSeenLandingUseCaseImpl implements com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SetHasSeenLandingUseCaseImpl(com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository cashInPreferencesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInPreferencesRepository, "");
        this.getHighSpeedVideoFpsRangesFor = cashInPreferencesRepository;
    }

    @Override // com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase
    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object hasSeenLanding = this.getHighSpeedVideoFpsRangesFor.setHasSeenLanding(z, continuation);
        return hasSeenLanding == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? hasSeenLanding : kotlin.Unit.INSTANCE;
    }
}
