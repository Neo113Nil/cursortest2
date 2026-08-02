package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonSensorCollector;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startMonitoring", "()V", "stopMonitoring", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorData;", "getSensorData", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorData;", "reset", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorManager;", "getHighSpeedVideoSizes", "Landroid/hardware/SensorManager;", "getHighSpeedVideoFpsRanges", "", "[I", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorStateTracker;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SensorStateTracker;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonSensorCollector implements android.hardware.SensorEventListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorStateTracker getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.hardware.SensorManager getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    public DaonSensorCollector(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.hardware.SensorManager) systemService;
        this.getHighSpeedVideoSizes = new int[]{4, 1, 10};
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorStateTracker();
    }

    public final void startMonitoring() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonSensor] Starting sensor monitoring", null, null, 6, null);
        for (int i : this.getHighSpeedVideoSizes) {
            android.hardware.Sensor defaultSensor = this.getHighSpeedVideoFpsRanges.getDefaultSensor(i);
            if (defaultSensor != null) {
                this.getHighSpeedVideoFpsRanges.registerListener(this, defaultSensor, 2);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonSensor] Registered sensor", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sensor_name", defaultSensor.getName()), kotlin.TuplesKt.to("sensor_type", java.lang.Integer.valueOf(i))), null, 4, null);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonSensor] Sensor not available", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sensor_type", java.lang.Integer.valueOf(i))), null, 4, null);
            }
        }
    }

    public final void stopMonitoring() {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonSensor] Stopping sensor monitoring", null, null, 6, null);
        this.getHighSpeedVideoFpsRanges.unregisterListener(this);
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorData getSensorData() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSensorData();
    }

    public final void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SensorStateTracker sensorStateTracker = this.getHighResolutionOutputSizeshNQ4ISI;
        int type = event.sensor.getType();
        float[] fArr = event.values;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr, "");
        sensorStateTracker.onSensorEvent(type, fArr);
        int type2 = event.sensor.getType();
        if (type2 == 1) {
            com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
            kotlin.Pair pair = kotlin.TuplesKt.to("sensor_type", "ACCELEROMETER");
            float[] fArr2 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr2, "");
            kotlin.Pair pair2 = kotlin.TuplesKt.to("x", kotlin.collections.ArraysKt.getOrNull(fArr2, 0));
            float[] fArr3 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr3, "");
            kotlin.Pair pair3 = kotlin.TuplesKt.to("y", kotlin.collections.ArraysKt.getOrNull(fArr3, 1));
            float[] fArr4 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr4, "");
            com.paypal.android.logger.Logger.d$default(log, "[DaonSensor] Sensor event received", kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to("z", kotlin.collections.ArraysKt.getOrNull(fArr4, 2))), null, 4, null);
            return;
        }
        if (type2 == 4) {
            com.paypal.android.logger.Logger log2 = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
            kotlin.Pair pair4 = kotlin.TuplesKt.to("sensor_type", "GYROSCOPE");
            float[] fArr5 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr5, "");
            kotlin.Pair pair5 = kotlin.TuplesKt.to("x", kotlin.collections.ArraysKt.getOrNull(fArr5, 0));
            float[] fArr6 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr6, "");
            kotlin.Pair pair6 = kotlin.TuplesKt.to("y", kotlin.collections.ArraysKt.getOrNull(fArr6, 1));
            float[] fArr7 = event.values;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr7, "");
            com.paypal.android.logger.Logger.d$default(log2, "[DaonSensor] Sensor event received", kotlin.collections.MapsKt.mapOf(pair4, pair5, pair6, kotlin.TuplesKt.to("z", kotlin.collections.ArraysKt.getOrNull(fArr7, 2))), null, 4, null);
            return;
        }
        if (type2 != 10) {
            return;
        }
        com.paypal.android.logger.Logger log3 = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        kotlin.Pair pair7 = kotlin.TuplesKt.to("sensor_type", "LINEAR_ACCELERATION");
        float[] fArr8 = event.values;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr8, "");
        kotlin.Pair pair8 = kotlin.TuplesKt.to("x", kotlin.collections.ArraysKt.getOrNull(fArr8, 0));
        float[] fArr9 = event.values;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr9, "");
        kotlin.Pair pair9 = kotlin.TuplesKt.to("y", kotlin.collections.ArraysKt.getOrNull(fArr9, 1));
        float[] fArr10 = event.values;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr10, "");
        com.paypal.android.logger.Logger.d$default(log3, "[DaonSensor] Sensor event received", kotlin.collections.MapsKt.mapOf(pair7, pair8, pair9, kotlin.TuplesKt.to("z", kotlin.collections.ArraysKt.getOrNull(fArr10, 2))), null, 4, null);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensor, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonSensor] Sensor accuracy changed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sensor_name", sensor.getName()), kotlin.TuplesKt.to("accuracy", java.lang.Integer.valueOf(accuracy))), null, 4, null);
    }
}
