package com.paypal.oslo.feature.wallet.amexandp3.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/usecase/ProvisionInstrumentsUseCase;", "", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/ProvisionInstrumentsRepository;", "provisionInstrumentsRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/ProvisionInstrumentsRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentsError;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/repository/ProvisionInstrumentsRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ProvisionInstrumentsUseCase(com.paypal.oslo.feature.wallet.amexandp3.domain.repository.ProvisionInstrumentsRepository provisionInstrumentsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstrumentsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = provisionInstrumentsRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError, com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.provisionEligibleInstruments(continuation);
    }
}
