package com.paypal.oslo.feature.bankingbundle.di.data;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/di/data/DataModule;", "", "Lcom/paypal/oslo/feature/bankingbundle/data/repository/BankingBundleRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;", "bindBankingBundleRepository", "(Lcom/paypal/oslo/feature/bankingbundle/data/repository/BankingBundleRepositoryImpl;)Lcom/paypal/oslo/feature/bankingbundle/domain/repository/BankingBundleRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public interface DataModule {
    @dagger.Binds
    com.paypal.oslo.feature.bankingbundle.domain.repository.BankingBundleRepository bindBankingBundleRepository(com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl impl);
}
