package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/DefaultCoroutineContextManager;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineContextManager;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineJobProvider;", "jobProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcherUI", "dispatcherIO", "<init>", "(Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineJobProvider;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cancelJob", "()V", "reinitContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcherIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setDispatcherIO", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "getDispatcherUI", "setDispatcherUI", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineJobProvider;", "localContext", "Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DefaultCoroutineContextManager implements com.discover.mpos.sdk.core.concurent.coroutines.CoroutineContextManager {
    private kotlinx.coroutines.CoroutineDispatcher dispatcherIO;
    private kotlinx.coroutines.CoroutineDispatcher dispatcherUI;
    private final com.discover.mpos.sdk.core.concurent.coroutines.CoroutineJobProvider jobProvider;
    private kotlin.coroutines.CoroutineContext localContext;

    public DefaultCoroutineContextManager(com.discover.mpos.sdk.core.concurent.coroutines.CoroutineJobProvider coroutineJobProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineJobProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.jobProvider = coroutineJobProvider;
        this.dispatcherUI = coroutineDispatcher;
        this.dispatcherIO = coroutineDispatcher2;
        this.localContext = getDispatcherUI().plus(coroutineJobProvider.job());
    }

    public /* synthetic */ DefaultCoroutineContextManager(com.discover.mpos.sdk.core.concurent.coroutines.DefaultCoroutineJobProvider defaultCoroutineJobProvider, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.discover.mpos.sdk.core.concurent.coroutines.DefaultCoroutineJobProvider() : defaultCoroutineJobProvider, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineDispatcher getDispatcherUI() {
        return this.dispatcherUI;
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider
    public final void setDispatcherUI(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.dispatcherUI = coroutineDispatcher;
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider
    public final kotlinx.coroutines.CoroutineDispatcher getDispatcherIO() {
        return this.dispatcherIO;
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDispatcherProvider
    public final void setDispatcherIO(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.dispatcherIO = coroutineDispatcher;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.localContext;
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineContextManager
    public final void cancelJob() {
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineContextInitializer
    public final void reinitContext() {
        if (kotlinx.coroutines.JobKt.isActive(this.localContext)) {
            cancelJob();
        }
        this.localContext = getDispatcherUI().plus(this.jobProvider.job());
    }

    public DefaultCoroutineContextManager() {
        this(null, null, null, 7, null);
    }
}
