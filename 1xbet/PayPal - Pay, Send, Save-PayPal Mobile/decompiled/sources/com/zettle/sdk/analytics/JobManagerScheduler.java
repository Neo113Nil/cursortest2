package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/zettle/sdk/analytics/JobManagerScheduler;", "Lcom/zettle/sdk/analytics/Scheduler;", "Landroid/content/Context;", "p0", "", "p1", "Ljava/util/concurrent/TimeUnit;", "p2", "Lcom/zettle/sdk/meta/PlatformInfo;", "p3", "", "p4", "p5", "<init>", "(Landroid/content/Context;JLjava/util/concurrent/TimeUnit;Lcom/zettle/sdk/meta/PlatformInfo;ZZ)V", "", "schedule", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "J", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/PlatformInfo;", "getOutputMinFrameDuration", "Ljava/util/concurrent/TimeUnit;", "getInputSizeshNQ4ISI", "Landroidx/work/WorkManager;", "getHighSpeedVideoSizesFor", "Landroidx/work/WorkManager;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class JobManagerScheduler implements com.zettle.sdk.analytics.Scheduler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.PlatformInfo getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private androidx.work.WorkManager getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;

    public JobManagerScheduler(android.content.Context context, long j, java.util.concurrent.TimeUnit timeUnit, com.zettle.sdk.meta.PlatformInfo platformInfo, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getInputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = platformInfo;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "");
        this.getHighSpeedVideoSizesFor = workManager;
    }

    @Override // com.zettle.sdk.analytics.Scheduler
    public final void schedule() {
        this.getHighSpeedVideoSizesFor.enqueueUniqueWork("analytics_work_manager_unique_name", androidx.work.ExistingWorkPolicy.KEEP, com.zettle.sdk.core.workers.AnalyticsWorkerKt.analyticsRequest(this.getInputSizeshNQ4ISI.toMillis(this.getHighResolutionOutputSizeshNQ4ISI), this.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes.isVersionAtLeast(com.zettle.sdk.meta.AndroidVersion.Nougat), this.getHighSpeedVideoFpsRangesFor));
    }
}
