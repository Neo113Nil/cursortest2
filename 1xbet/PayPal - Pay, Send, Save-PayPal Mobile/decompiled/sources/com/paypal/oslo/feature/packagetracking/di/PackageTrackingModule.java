package com.paypal.oslo.feature.packagetracking.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/di/PackageTrackingModule;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCaseImpl;", "repository", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCase;", "bindGeoCoderUseCase", "(Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCaseImpl;)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCase;", "Lcom/paypal/oslo/feature/packagetracking/data/source/ApolloPackageGraphQLExecutor;", "executor", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;", "bindPackageGraphQLExecutor", "(Lcom/paypal/oslo/feature/packagetracking/data/source/ApolloPackageGraphQLExecutor;)Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;", "Lcom/paypal/oslo/feature/packagetracking/data/repository/SettingsRepositoryImpl;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "bindSettingsRepository", "(Lcom/paypal/oslo/feature/packagetracking/data/repository/SettingsRepositoryImpl;)Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface PackageTrackingModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase bindGeoCoderUseCase(com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl repository);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor bindPackageGraphQLExecutor(com.paypal.oslo.feature.packagetracking.data.source.ApolloPackageGraphQLExecutor executor);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository bindSettingsRepository(com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl repository);
}
