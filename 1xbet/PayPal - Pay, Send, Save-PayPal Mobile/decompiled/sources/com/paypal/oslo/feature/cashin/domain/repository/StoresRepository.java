package com.paypal.oslo.feature.cashin.domain.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ4\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "geoLocation", "", "limit", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getNearbyStores", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StoresRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.domain.repository.StoresRepository.Companion INSTANCE = com.paypal.oslo.feature.cashin.domain.repository.StoresRepository.Companion.Camera2StreamConfigurationMap;
    public static final int DEFAULT_LIMIT = 10;

    java.lang.Object getNearbyStores(com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getNearbyStores$default(com.paypal.oslo.feature.cashin.domain.repository.StoresRepository storesRepository, com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyStores");
        }
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return storesRepository.getNearbyStores(cashInGeoLocation, i, continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository$Companion;", "", "<init>", "()V", "", "DEFAULT_LIMIT", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.cashin.domain.repository.StoresRepository.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cashin.domain.repository.StoresRepository.Companion();
        public static final int DEFAULT_LIMIT = 10;

        private Companion() {
        }
    }
}
