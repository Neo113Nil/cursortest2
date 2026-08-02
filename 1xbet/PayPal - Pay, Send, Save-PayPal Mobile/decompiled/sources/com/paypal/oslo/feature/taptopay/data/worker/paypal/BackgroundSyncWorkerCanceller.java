package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;", "Lcom/paypal/oslo/feature/taptopay/domain/worker/BackgroundSyncCanceller;", "Landroidx/work/WorkManager;", "workManager", "<init>", "(Landroidx/work/WorkManager;)V", "", "invoke", "()V", "getHighSpeedVideoSizes", "Landroidx/work/WorkManager;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundSyncWorkerCanceller implements com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.work.WorkManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public BackgroundSyncWorkerCanceller(androidx.work.WorkManager workManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        this.Camera2StreamConfigurationMap = workManager;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.worker.BackgroundSyncCanceller
    public final void invoke() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Cancelling all background sync workers", null, null, 6, null);
        this.Camera2StreamConfigurationMap.cancelAllWorkByTag(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler.TAG_BACKGROUND_SYNC_WORK);
    }
}
