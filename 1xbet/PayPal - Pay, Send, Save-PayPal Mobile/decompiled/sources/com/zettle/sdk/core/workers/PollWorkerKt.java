package com.zettle.sdk.core.workers;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "pollRequest", "()Landroidx/work/PeriodicWorkRequest;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PollWorkerKt {
    public static final androidx.work.PeriodicWorkRequest pollRequest() {
        return new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.zettle.sdk.core.workers.PollWorker.class, 15L, java.util.concurrent.TimeUnit.MINUTES, 1L, java.util.concurrent.TimeUnit.MINUTES).setInitialDelay(0L, java.util.concurrent.TimeUnit.SECONDS).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build()).addTag(com.zettle.sdk.core.workers.PollWorker.POOL_WORKER_TAG).build();
    }
}
