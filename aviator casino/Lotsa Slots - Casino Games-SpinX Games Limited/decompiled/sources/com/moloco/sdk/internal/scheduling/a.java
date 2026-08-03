package com.moloco.sdk.internal.scheduling;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.internal.scheduling.DispatcherProvider {
    @Override // com.moloco.sdk.internal.scheduling.DispatcherProvider
    public kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return kotlinx.coroutines.Dispatchers.getDefault();
    }

    @Override // com.moloco.sdk.internal.scheduling.DispatcherProvider
    public kotlinx.coroutines.CoroutineDispatcher getIo() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @Override // com.moloco.sdk.internal.scheduling.DispatcherProvider
    public kotlinx.coroutines.CoroutineDispatcher getMain() {
        return kotlinx.coroutines.Dispatchers.getMain();
    }

    @Override // com.moloco.sdk.internal.scheduling.DispatcherProvider
    public kotlinx.coroutines.CoroutineDispatcher getMainImmediate() {
        return kotlinx.coroutines.Dispatchers.getMain().getImmediate();
    }

    @Override // com.moloco.sdk.internal.scheduling.DispatcherProvider
    public kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
        return kotlinx.coroutines.Dispatchers.getUnconfined();
    }
}
