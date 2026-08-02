package com.discover.mpos.sdk.core.concurent;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/DiscoverJobFactory;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "createJob", "(J)Lcom/discover/mpos/sdk/core/concurent/DiscoverJob;", "", "reset", "()V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface DiscoverJobFactory {
    <R> com.discover.mpos.sdk.core.concurent.DiscoverJob<R> createJob(long timeout);

    void reset();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ com.discover.mpos.sdk.core.concurent.DiscoverJob createJob$default(com.discover.mpos.sdk.core.concurent.DiscoverJobFactory discoverJobFactory, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createJob");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            return discoverJobFactory.createJob(j);
        }
    }
}
