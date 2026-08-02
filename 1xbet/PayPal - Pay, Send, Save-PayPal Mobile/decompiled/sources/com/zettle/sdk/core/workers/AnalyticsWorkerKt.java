package com.zettle.sdk.core.workers;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "initialDelayMs", "", "preventRoaming", "isDebug", "Landroidx/work/OneTimeWorkRequest;", "analyticsRequest", "(JZZ)Landroidx/work/OneTimeWorkRequest;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsWorkerKt {
    public static final androidx.work.OneTimeWorkRequest analyticsRequest(long j, boolean z, boolean z2) {
        androidx.work.NetworkType networkType;
        if (z) {
            networkType = androidx.work.NetworkType.NOT_ROAMING;
        } else {
            networkType = androidx.work.NetworkType.CONNECTED;
        }
        androidx.work.OneTimeWorkRequest.Builder backoffCriteria = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.zettle.sdk.core.workers.AnalyticsWorker.class).setInitialDelay(j, java.util.concurrent.TimeUnit.MILLISECONDS).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(networkType).build()).addTag(com.zettle.sdk.core.workers.AnalyticsWorker.ANALYTICS_WORKER_TAG).setBackoffCriteria(androidx.work.BackoffPolicy.LINEAR, 10L, java.util.concurrent.TimeUnit.MINUTES);
        androidx.work.Data build = new androidx.work.Data.Builder().putBoolean(com.zettle.sdk.core.workers.AnalyticsWorker.DEBUG_KEY, z2).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return backoffCriteria.setInputData(build).build();
    }
}
