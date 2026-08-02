package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes5.dex */
public final class DownloadSerializationModule_ProvideJsonFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideJson();
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadSerializationModule_ProvideJsonFactory create() {
        return com.paypal.oslo.downloads.impl.di.DownloadSerializationModule_ProvideJsonFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.serialization.json.Json provideJson() {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.downloads.impl.di.DownloadSerializationModule.INSTANCE.provideJson());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.di.DownloadSerializationModule_ProvideJsonFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.downloads.impl.di.DownloadSerializationModule_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }
}
