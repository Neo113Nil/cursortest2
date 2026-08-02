package com.paypal.oslo.downloads.impl.di;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadBindingsModule;", "", "Lcom/paypal/oslo/downloads/impl/data/DownloadHttpClientImpl;", "impl", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "bindDownloadHttpClient", "(Lcom/paypal/oslo/downloads/impl/data/DownloadHttpClientImpl;)Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "Lcom/paypal/oslo/downloads/impl/di/DefaultDownloadDispatchers;", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "bindDownloadDispatchers", "(Lcom/paypal/oslo/downloads/impl/di/DefaultDownloadDispatchers;)Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "Lcom/paypal/oslo/downloads/impl/validation/DefaultUrlValidator;", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "bindUrlValidator", "(Lcom/paypal/oslo/downloads/impl/validation/DefaultUrlValidator;)Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "Lcom/paypal/oslo/downloads/impl/validation/DefaultContentValidator;", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "bindContentValidator", "(Lcom/paypal/oslo/downloads/impl/validation/DefaultContentValidator;)Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadEngineImpl;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "bindDownloadEngine", "(Lcom/paypal/oslo/downloads/impl/engine/DownloadEngineImpl;)Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "Lcom/paypal/oslo/downloads/impl/storage/DefaultDownloadStorageProvider;", "Lcom/paypal/oslo/downloads/api/DownloadStorageProvider;", "bindDownloadStorageProvider", "(Lcom/paypal/oslo/downloads/impl/storage/DefaultDownloadStorageProvider;)Lcom/paypal/oslo/downloads/api/DownloadStorageProvider;", "Lcom/paypal/oslo/downloads/impl/DownloadManagerImpl;", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "bindDownloadManager", "(Lcom/paypal/oslo/downloads/impl/DownloadManagerImpl;)Lcom/paypal/oslo/downloads/api/DownloadManager;", "Lcom/paypal/oslo/downloads/impl/util/DefaultFileDeleter;", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "bindFileDeleter", "(Lcom/paypal/oslo/downloads/impl/util/DefaultFileDeleter;)Lcom/paypal/oslo/downloads/impl/util/FileDeleter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface DownloadBindingsModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.api.validation.ContentValidator bindContentValidator(com.paypal.oslo.downloads.impl.validation.DefaultContentValidator impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.impl.di.DownloadDispatchers bindDownloadDispatchers(com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.impl.engine.DownloadEngine bindDownloadEngine(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.api.DownloadHttpClient bindDownloadHttpClient(com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.api.DownloadManager bindDownloadManager(com.paypal.oslo.downloads.impl.DownloadManagerImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.api.DownloadStorageProvider bindDownloadStorageProvider(com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.impl.util.FileDeleter bindFileDeleter(com.paypal.oslo.downloads.impl.util.DefaultFileDeleter impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.downloads.api.validation.UrlValidator bindUrlValidator(com.paypal.oslo.downloads.impl.validation.DefaultUrlValidator impl);
}
