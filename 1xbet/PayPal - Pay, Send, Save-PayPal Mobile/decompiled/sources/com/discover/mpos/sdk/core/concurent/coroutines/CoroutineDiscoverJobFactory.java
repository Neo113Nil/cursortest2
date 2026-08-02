package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineDiscoverJobFactory;", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;", "coroutineManager", "<init>", "(Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "createJob", "(J)Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "", "reset", "()V", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineManager;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class CoroutineDiscoverJobFactory implements com.discover.mpos.sdk.core.concurent.DiscoverJobFactory {
    private final com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager;

    public CoroutineDiscoverJobFactory(com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineManager, "");
        this.coroutineManager = coroutineManager;
    }

    public /* synthetic */ CoroutineDiscoverJobFactory(com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager() : coroutineManager);
    }

    @Override // com.discover.mpos.sdk.core.concurent.DiscoverJobFactory
    public final <R> com.discover.mpos.sdk.core.concurent.DiscoverJob<R> createJob(long timeout) {
        return new com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob(timeout, this.coroutineManager);
    }

    @Override // com.discover.mpos.sdk.core.concurent.DiscoverJobFactory
    public final void reset() {
        this.coroutineManager.reset$mpos_sdk_core_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineDiscoverJobFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
