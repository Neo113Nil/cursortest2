package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineContextManager;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDispatcherProvider;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineContextInitializer;", "", "cancelJob", "()V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface CoroutineContextManager extends com.discover.mpos.sdk.core.concurent.coroutines.CoroutineContextInitializer, com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider, kotlinx.coroutines.CoroutineScope {
    void cancelJob();
}
