package com.paypal.oslo.feature.dataprivacy.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/di/RepositoryModule;", "", "Lcom/paypal/oslo/feature/dataprivacy/data/repository/UserAccountRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "bindUserAccountRepository", "(Lcom/paypal/oslo/feature/dataprivacy/data/repository/UserAccountRepositoryImpl;)Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "Lcom/paypal/oslo/feature/dataprivacy/data/repository/DataAccessRequestRepositoryImpl;", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "bindDataAccessRequestRepository", "(Lcom/paypal/oslo/feature/dataprivacy/data/repository/DataAccessRequestRepositoryImpl;)Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "Lcom/paypal/oslo/feature/dataprivacy/data/util/FileSaverImpl;", "Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;", "bindFileSaver", "(Lcom/paypal/oslo/feature/dataprivacy/data/util/FileSaverImpl;)Lcom/paypal/oslo/feature/dataprivacy/domain/util/FileSaver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface RepositoryModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository bindDataAccessRequestRepository(com.paypal.oslo.feature.dataprivacy.data.repository.DataAccessRequestRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.dataprivacy.domain.util.FileSaver bindFileSaver(com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository bindUserAccountRepository(com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl impl);
}
