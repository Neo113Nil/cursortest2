package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/di/SharedViewModelModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/InvoiceRepositoryFake;", "fakeRepository", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;", "realRepository", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "provideInvoiceRepository", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/InvoiceRepositoryFake;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/PurchaseRepositoryFake;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;", "providePurchaseRepository", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/mock/PurchaseRepositoryFake;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/PurchaseRepositoryImpl;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/PurchaseRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class SharedViewModelModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule();

    private SharedViewModelModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository provideInvoiceRepository(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.InvoiceRepositoryFake fakeRepository, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fakeRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.InvoiceMockController.INSTANCE.getUseMockEnabled()) {
            return fakeRepository;
        }
        return realRepository;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository providePurchaseRepository(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake fakeRepository, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl realRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fakeRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRepository, "");
        if (com.paypal.oslo.feature.businesspayandgetpaid.shared.featureflags.mock.PurchaseMockController.INSTANCE.getUseMockEnabled()) {
            return fakeRepository;
        }
        return realRepository;
    }
}
