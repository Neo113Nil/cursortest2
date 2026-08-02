package com.paypal.oslo.core.persistence.data.repository;

/* loaded from: classes10.dex */
public final class FileOperationsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private FileOperationsRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl newInstance(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.core.persistence.data.repository.FileOperationsRepositoryImpl(context, coroutineDispatcher);
    }
}
