package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorStateTracker;", "", "<init>", "()V", "", "sensorType", "", "values", "", "onSensorEvent", "(I[F)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorData;", "getSensorData", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorData;", "reset", "p0", "", "getHighSpeedVideoSizes", "([F)Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "[F", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SensorStateTracker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private float[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private float[] getHighSpeedVideoSizesFor;

    public final void onSensorEvent(int sensorType, float[] values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        if (sensorType == 1) {
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor = new float[]{values[0], values[1], values[2]};
        } else if (sensorType == 4) {
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap = new float[]{values[0], values[1], values[2]};
        } else {
            if (sensorType != 10) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor = new float[]{values[0], values[1], values[2]};
        }
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorData getSensorData() {
        boolean z = this.getHighSpeedVideoFpsRanges;
        boolean z2 = this.getHighSpeedVideoSizes;
        boolean z3 = this.getHighResolutionOutputSizeshNQ4ISI;
        float[] fArr = this.Camera2StreamConfigurationMap;
        java.lang.String highSpeedVideoSizes = fArr != null ? getHighSpeedVideoSizes(fArr) : null;
        float[] fArr2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String highSpeedVideoSizes2 = fArr2 != null ? getHighSpeedVideoSizes(fArr2) : null;
        float[] fArr3 = this.getHighSpeedVideoSizesFor;
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorData(z, z2, z3, highSpeedVideoSizes, highSpeedVideoSizes2, fArr3 != null ? getHighSpeedVideoSizes(fArr3) : null);
    }

    public final void reset() {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizesFor = null;
    }

    private static java.lang.String getHighSpeedVideoSizes(float[] p0) {
        java.lang.String joinToString$default = kotlin.collections.ArraysKt.joinToString$default(p0, (java.lang.CharSequence) ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(joinToString$default);
        sb.append("]");
        return sb.toString();
    }
}
