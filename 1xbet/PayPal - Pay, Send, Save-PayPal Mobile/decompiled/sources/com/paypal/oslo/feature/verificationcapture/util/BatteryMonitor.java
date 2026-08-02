package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/BatteryMonitor;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startMonitoring", "()V", "stopMonitoring", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "getBatteryInfo", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryInfo;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BatteryDetail;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BatteryMonitor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;
    private com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    public BatteryMonitor(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    public final void startMonitoring() {
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI.add(highSpeedVideoFpsRangesFor);
    }

    public final void stopMonitoring() {
        this.getHighResolutionOutputSizeshNQ4ISI.add(getHighSpeedVideoFpsRangesFor());
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo getBatteryInfo() {
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail batteryDetail = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail batteryDetail2 = (com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI);
        boolean z = false;
        if (batteryDetail != null && batteryDetail2 != null && batteryDetail.getCurrent() != batteryDetail2.getCurrent()) {
            z = true;
        }
        return new com.paypal.oslo.feature.verificationcapture.domain.model.BatteryInfo(z, this.getHighResolutionOutputSizeshNQ4ISI.size(), kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    private final com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail getHighSpeedVideoFpsRangesFor() {
        android.content.Intent registerReceiver = this.getHighSpeedVideoSizes.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        return new com.paypal.oslo.feature.verificationcapture.domain.model.BatteryDetail((intExtra < 0 || intExtra2 <= 0) ? 0 : (int) ((intExtra * 100) / intExtra2), 100, (registerReceiver != null ? registerReceiver.getIntExtra("temperature", -1) : -1) / 10.0f);
    }
}
