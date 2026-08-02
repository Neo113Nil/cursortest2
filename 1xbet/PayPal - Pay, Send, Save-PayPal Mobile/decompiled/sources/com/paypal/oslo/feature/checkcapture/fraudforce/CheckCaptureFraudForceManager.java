package com.paypal.oslo.feature.checkcapture.fraudforce;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;", "", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/FraudForceWrapper;", "fraudForceWrapper", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/checkcapture/fraudforce/FraudForceWrapper;)V", "", "initialize", "()V", "", "generateDeviceBlackbox", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/FraudForceWrapper;", "getHighSpeedVideoSizes", "", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckCaptureFraudForceManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CheckCaptureFraudForceManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper fraudForceWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudForceWrapper, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = fraudForceWrapper;
    }

    public final void initialize() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        synchronized (this) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoSizes.initialize(this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoFpsRangesFor = true;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.lang.String generateDeviceBlackbox() {
        initialize();
        return this.getHighSpeedVideoSizes.getBlackbox(this.getHighSpeedVideoFpsRanges);
    }
}
