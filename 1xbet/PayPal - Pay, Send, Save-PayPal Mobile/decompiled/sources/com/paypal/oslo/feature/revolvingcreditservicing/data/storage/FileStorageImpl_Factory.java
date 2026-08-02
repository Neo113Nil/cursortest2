package com.paypal.oslo.feature.revolvingcreditservicing.data.storage;

/* loaded from: classes14.dex */
public final class FileStorageImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private FileStorageImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl newInstance(android.content.Context context, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorageImpl(context, coroutineDispatcher);
    }
}
