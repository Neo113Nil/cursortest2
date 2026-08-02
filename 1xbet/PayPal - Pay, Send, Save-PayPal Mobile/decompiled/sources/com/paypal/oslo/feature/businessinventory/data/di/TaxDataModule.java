package com.paypal.oslo.feature.businessinventory.data.di;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/di/TaxDataModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;", "provideItemLibraryAnalytics", "()Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryAnalytics;", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidatorImpl;", "impl", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;", "provideTaxEntityValidator", "(Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidatorImpl;)Lcom/paypal/oslo/feature/businessinventory/domain/validator/TaxEntityValidator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class TaxDataModule {
    public static final int $stable = 0;

    @dagger.Provides
    public final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics provideItemLibraryAnalytics() {
        return new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics() { // from class: com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule$provideItemLibraryAnalytics$1
            @Override // com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics
            public final void logTaxListLoad(boolean isSuccessful) {
            }

            @Override // com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics
            public final void logAddNewTax(com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin origin) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
            }
        };
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator provideTaxEntityValidator(com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl impl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impl, "");
        return impl;
    }
}
