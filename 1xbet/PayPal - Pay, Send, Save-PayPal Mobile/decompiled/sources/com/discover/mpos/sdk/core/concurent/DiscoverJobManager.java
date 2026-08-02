package com.discover.mpos.sdk.core.concurent;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/DiscoverJobManager;", "Lcom/discover/mpos/sdk/core/concurent/JobManager;", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;", "jobFactory", "<init>", "(Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;)V", "", "cancelAll", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "getJob", "(J)Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;", "", "jobList", "Ljava/util/List;", "Companion"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DiscoverJobManager implements com.discover.mpos.sdk.core.concurent.JobManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.core.concurent.DiscoverJobManager.Companion INSTANCE = new com.discover.mpos.sdk.core.concurent.DiscoverJobManager.Companion(null);
    private final com.discover.mpos.sdk.core.concurent.DiscoverJobFactory jobFactory;
    private final java.util.List<com.discover.mpos.sdk.core.concurent.DiscoverJob<?>> jobList;

    public DiscoverJobManager(com.discover.mpos.sdk.core.concurent.DiscoverJobFactory discoverJobFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discoverJobFactory, "");
        this.jobFactory = discoverJobFactory;
        this.jobList = new java.util.ArrayList();
    }

    @Override // com.discover.mpos.sdk.core.concurent.JobManager
    public final <R> com.discover.mpos.sdk.core.concurent.DiscoverJob<R> getJob(long timeout) {
        com.discover.mpos.sdk.core.concurent.DiscoverJob<R> createJob;
        synchronized (this) {
            createJob = this.jobFactory.createJob(timeout);
            this.jobList.add(createJob);
        }
        return createJob;
    }

    @Override // com.discover.mpos.sdk.core.concurent.JobManager
    public final void cancelAll() {
        this.jobFactory.reset();
        synchronized (this) {
            java.util.Iterator<T> it = this.jobList.iterator();
            while (it.hasNext()) {
                ((com.discover.mpos.sdk.core.concurent.DiscoverJob) it.next()).cancel();
            }
            this.jobList.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/DiscoverJobManager$Companion;", "", "<init>", "()V", "Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;", "discoverJobFactory", "Lcom/discover/mpos/sdk/core/concurent/JobManager;", "newInstance", "(Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;)Lcom/discover/mpos/sdk/core/concurent/JobManager;"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ com.discover.mpos.sdk.core.concurent.JobManager newInstance$default(com.discover.mpos.sdk.core.concurent.DiscoverJobManager.Companion companion, com.discover.mpos.sdk.core.concurent.DiscoverJobFactory discoverJobFactory, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                discoverJobFactory = new com.discover.mpos.sdk.core.concurent.coroutines.CoroutineDiscoverJobFactory(null, 1, null);
            }
            return companion.newInstance(discoverJobFactory);
        }

        public final com.discover.mpos.sdk.core.concurent.JobManager newInstance(com.discover.mpos.sdk.core.concurent.DiscoverJobFactory discoverJobFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(discoverJobFactory, "");
            return new com.discover.mpos.sdk.core.concurent.DiscoverJobManager(discoverJobFactory);
        }
    }
}
