package com.ingo.sdk.kotlin.common.core;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/IngoDispatchersImpl;", "Lcom/ingo/sdk/kotlin/common/core/IngoDispatchers;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getMainDispatcher"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoDispatchersImpl implements com.ingo.sdk.kotlin.common.core.IngoDispatchers {
    @Override // com.ingo.sdk.kotlin.common.core.IngoDispatchers
    public final kotlinx.coroutines.CoroutineDispatcher getBackgroundDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }

    @Override // com.ingo.sdk.kotlin.common.core.IngoDispatchers
    public final kotlinx.coroutines.CoroutineDispatcher getMainDispatcher() {
        return kotlinx.coroutines.Dispatchers.getMain();
    }
}
