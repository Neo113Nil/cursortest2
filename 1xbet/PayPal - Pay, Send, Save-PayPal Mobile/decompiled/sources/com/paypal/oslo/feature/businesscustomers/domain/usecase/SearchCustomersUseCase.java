package com.paypal.oslo.feature.businesscustomers.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/SearchCustomersUseCase;", "", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "customersRepository", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;)V", "", "query", "", "page", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersPage;", "invoke", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchCustomersUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SearchCustomersUseCase(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersRepository, "");
        this.getHighSpeedVideoSizes = customersRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage>> continuation) {
        return this.getHighSpeedVideoSizes.searchCustomers(str, i, continuation);
    }
}
