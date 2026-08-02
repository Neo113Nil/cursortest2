package com.payair.logic.managers;

@com.payair.Generated
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\t"}, d2 = {"Lcom/payair/logic/managers/CoroutineDispatcherProviderImpl;", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "getDefaultScope", "()Lkotlinx/coroutines/CoroutineScope;", "getIODispatcher", "getIOScope", "getMainDispatcher", "getMainScope"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineDispatcherProviderImpl implements com.payair.logic.managers.CoroutineDispatcherProvider {
    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineDispatcher getDefaultDispatcher() {
        return kotlinx.coroutines.Dispatchers.getDefault();
    }

    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineScope getDefaultScope() {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getDefaultDispatcher());
    }

    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineDispatcher getIODispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineScope getIOScope() {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getIODispatcher());
    }

    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineDispatcher getMainDispatcher() {
        return kotlinx.coroutines.Dispatchers.getMain();
    }

    @Override // com.payair.logic.managers.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineScope getMainScope() {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getMainDispatcher());
    }
}
