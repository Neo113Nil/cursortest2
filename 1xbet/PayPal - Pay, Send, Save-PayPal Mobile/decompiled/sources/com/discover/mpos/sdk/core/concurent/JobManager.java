package com.discover.mpos.sdk.core.concurent;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/JobManager;", "", "", "cancelAll", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "getJob", "(J)Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface JobManager {
    void cancelAll();

    <R> com.discover.mpos.sdk.core.concurent.DiscoverJob<R> getJob(long timeout);

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ com.discover.mpos.sdk.core.concurent.DiscoverJob getJob$default(com.discover.mpos.sdk.core.concurent.JobManager jobManager, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getJob");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            return jobManager.getJob(j);
        }
    }
}
