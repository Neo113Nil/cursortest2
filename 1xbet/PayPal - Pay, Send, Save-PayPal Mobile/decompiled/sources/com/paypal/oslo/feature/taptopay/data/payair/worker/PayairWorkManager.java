package com.paypal.oslo.feature.taptopay.data.payair.worker;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/worker/PayairWorkManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/work/Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "setupAndRunTheReplenishWork", "(Landroidx/work/Data;)V", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairWorkManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    @dagger.hilt.android.qualifiers.ApplicationContext
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PayairWorkManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRangesFor = 30L;
    }

    public final void setupAndRunTheReplenishWork(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker.class);
        builder.setInputData(data);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, this.getHighSpeedVideoFpsRangesFor, java.util.concurrent.TimeUnit.SECONDS);
        androidx.work.WorkManager.INSTANCE.getInstance(this.getHighSpeedVideoSizes).enqueue(builder.build());
    }
}
