package com.paypal.oslo.downloads.impl.di;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DefaultDownloadDispatchers;", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultDownloadDispatchers implements com.paypal.oslo.downloads.impl.di.DownloadDispatchers {
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = kotlinx.coroutines.Dispatchers.getIO();

    @javax.inject.Inject
    public DefaultDownloadDispatchers() {
    }

    @Override // com.paypal.oslo.downloads.impl.di.DownloadDispatchers
    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }
}
