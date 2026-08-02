package com.paypal.oslo.feature.packagetracking.data.source;

/* loaded from: classes13.dex */
public final class PackageRemoteDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor> getHighResolutionOutputSizeshNQ4ISI;

    private PackageRemoteDataSource_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor> provider) {
        return new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource newInstance(com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor packageGraphQLExecutor) {
        return new com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource(packageGraphQLExecutor);
    }
}
