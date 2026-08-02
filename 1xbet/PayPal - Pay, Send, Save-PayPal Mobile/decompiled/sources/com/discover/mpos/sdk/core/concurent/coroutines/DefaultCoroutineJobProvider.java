package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007"}, d2 = {"Lcom/discover/mpos/sdk/core/concurent/coroutines/DefaultCoroutineJobProvider;", "Lcom/discover/mpos/sdk/core/concurent/coroutines/CoroutineJobProvider;", "<init>", "()V", "Lkotlinx/coroutines/Job;", "job", "()Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DefaultCoroutineJobProvider implements com.discover.mpos.sdk.core.concurent.coroutines.CoroutineJobProvider {
    private kotlinx.coroutines.Job job;

    @Override // com.discover.mpos.sdk.core.concurent.coroutines.CoroutineJobProvider
    public final kotlinx.coroutines.Job job() {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlinx.coroutines.Job job = this.job;
        if (job == null || job.isCancelled()) {
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            this.job = Job$default;
        }
        kotlinx.coroutines.Job job2 = this.job;
        kotlin.jvm.internal.Intrinsics.checkNotNull(job2);
        return job2;
    }
}
