package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDispatcherProvider;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcherIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setDispatcherIO", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "dispatcherIO", "getDispatcherUI", "setDispatcherUI", "dispatcherUI"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface CoroutineDispatcherProvider {
    kotlinx.coroutines.CoroutineDispatcher getDispatcherIO();

    kotlinx.coroutines.CoroutineDispatcher getDispatcherUI();

    void setDispatcherIO(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher);

    void setDispatcherUI(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher);
}
