package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010$\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/SensorCollector;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startMonitoring", "()V", "stopMonitoring", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "getSensorData", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/SensorData;", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorManager;", "getOutputFormats", "Landroid/hardware/SensorManager;", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "[F", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "getHighSpeedVideoSizes", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SensorCollector implements android.hardware.SensorEventListener {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private float[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private float[] getHighSpeedVideoSizesFor;
    private float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float[] Camera2StreamConfigurationMap;
    private float[] getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final android.hardware.SensorManager getHighSpeedVideoFpsRanges;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {
    }

    public SensorCollector(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.hardware.SensorManager) systemService;
    }

    public final void startMonitoring() {
        android.hardware.Sensor defaultSensor = this.getHighSpeedVideoFpsRanges.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.getHighSpeedVideoFpsRanges.registerListener(this, defaultSensor, 3);
        }
        android.hardware.Sensor defaultSensor2 = this.getHighSpeedVideoFpsRanges.getDefaultSensor(4);
        if (defaultSensor2 != null) {
            this.getHighSpeedVideoFpsRanges.registerListener(this, defaultSensor2, 3);
        }
        android.hardware.Sensor defaultSensor3 = this.getHighSpeedVideoFpsRanges.getDefaultSensor(10);
        if (defaultSensor3 != null) {
            this.getHighSpeedVideoFpsRanges.registerListener(this, defaultSensor3, 3);
        }
    }

    public final void stopMonitoring() {
        this.getHighSpeedVideoFpsRanges.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent event) {
        if (event != null) {
            this.getInputSizeshNQ4ISI++;
            int type = event.sensor.getType();
            if (type == 1) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (float[]) event.values.clone();
                }
                this.getHighSpeedVideoFpsRangesFor = (float[]) event.values.clone();
            } else if (type == 4) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = (float[]) event.values.clone();
                }
                this.getHighSpeedVideoSizes = (float[]) event.values.clone();
            } else {
                if (type != 10) {
                    return;
                }
                if (this.getInputFormats == null) {
                    this.getInputFormats = (float[]) event.values.clone();
                }
                this.getHighSpeedVideoSizesFor = (float[]) event.values.clone();
            }
        }
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SensorData getSensorData() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        boolean z = false;
        boolean z2 = (this.getInputFormats == null || (fArr = this.getHighSpeedVideoSizesFor) == null) ? false : !java.util.Arrays.equals(r0, fArr);
        boolean z3 = (this.getHighResolutionOutputSizeshNQ4ISI == null || (fArr2 = this.getHighSpeedVideoFpsRangesFor) == null) ? false : !java.util.Arrays.equals(r0, fArr2);
        float[] fArr4 = this.Camera2StreamConfigurationMap;
        if (fArr4 != null && (fArr3 = this.getHighSpeedVideoSizes) != null) {
            z = !java.util.Arrays.equals(fArr4, fArr3);
        }
        return new com.paypal.oslo.feature.verificationcapture.domain.model.SensorData(z2, z3, z, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }
}
