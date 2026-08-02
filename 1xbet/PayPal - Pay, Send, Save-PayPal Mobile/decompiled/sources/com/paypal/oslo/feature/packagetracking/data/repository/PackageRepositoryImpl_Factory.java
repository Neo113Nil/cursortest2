package com.paypal.oslo.feature.packagetracking.data.repository;

/* loaded from: classes13.dex */
public final class PackageRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource> Camera2StreamConfigurationMap;

    private PackageRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource> provider) {
        return new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl newInstance(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource) {
        return new com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl(packageRemoteDataSource);
    }
}
