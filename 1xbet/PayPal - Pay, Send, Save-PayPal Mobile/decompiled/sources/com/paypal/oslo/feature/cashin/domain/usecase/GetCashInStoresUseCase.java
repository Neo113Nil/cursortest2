package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInStoresUseCase;", "", "Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;", "storesRepository", "<init>", "(Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;)V", "", "latitude", "longitude", "", "limit", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "invoke", "(DDILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetCashInStoresUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.repository.StoresRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCashInStoresUseCase(com.paypal.oslo.feature.cashin.domain.repository.StoresRepository storesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storesRepository, "");
        this.getHighSpeedVideoFpsRangesFor = storesRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase getCashInStoresUseCase, double d, double d2, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 10;
        }
        return getCashInStoresUseCase.invoke(d, d2, i, continuation);
    }

    public final java.lang.Object invoke(double d, double d2, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getNearbyStores(new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(d, d2), i, continuation);
    }
}
