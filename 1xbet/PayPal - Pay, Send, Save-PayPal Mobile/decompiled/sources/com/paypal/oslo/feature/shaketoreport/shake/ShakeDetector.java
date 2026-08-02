package com.paypal.oslo.feature.shaketoreport.shake;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0005&'()%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector;", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorManager;", "sensorManager", "<init>", "(Landroid/hardware/SensorManager;)V", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnShakeDetectorListener", "(Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Listener;)V", "", "sensorDelay", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(I)Z", "stop", "()V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/SensorManager;", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SampleQueue;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SampleQueue;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroid/hardware/Sensor;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Listener;", "Companion", "Listener", "SampleQueue", "Sample", "SamplePool"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShakeDetector implements android.hardware.SensorEventListener {
    private final android.hardware.SensorManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private android.hardware.Sensor getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Listener getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SampleQueue Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Listener;", "", "", "onShake", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Listener {
        void onShake();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Sample {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        boolean getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SamplePool;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class SamplePool {
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample getHighSpeedVideoFpsRangesFor;
    }

    @javax.inject.Inject
    public ShakeDetector(android.hardware.SensorManager sensorManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sensorManager;
        this.Camera2StreamConfigurationMap = new com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SampleQueue();
    }

    public final void setOnShakeDetectorListener(com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Listener listener) {
        this.getHighSpeedVideoFpsRanges = listener;
    }

    public static /* synthetic */ boolean start$default(com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector shakeDetector, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return shakeDetector.start(i);
    }

    public final boolean start(int sensorDelay) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "accelerometer is not null. ShakeDetector already started", null, null, 6, null);
            return true;
        }
        android.hardware.Sensor defaultSensor = this.getHighResolutionOutputSizeshNQ4ISI.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.getHighSpeedVideoFpsRangesFor = defaultSensor;
            this.getHighResolutionOutputSizeshNQ4ISI.registerListener(this, defaultSensor, sensorDelay);
        } else {
            defaultSensor = null;
        }
        return defaultSensor != null;
    }

    public final void stop() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
            this.getHighResolutionOutputSizeshNQ4ISI.unregisterListener(this, this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRangesFor = null;
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "accelerometer is null. ShakeDetector already stopped", null, null, 6, null);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SampleQueue;", "", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SamplePool;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$SamplePool;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeDetector$Sample;", "getHighSpeedVideoSizes", "", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class SampleQueue {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SamplePool getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SamplePool();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample Camera2StreamConfigurationMap;

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            while (true) {
                com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample = this.getHighSpeedVideoSizes;
                if (sample == null) {
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getHighSpeedVideoFpsRanges = 0;
                    return;
                } else if (sample != null) {
                    this.getHighSpeedVideoSizes = sample.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SamplePool samplePool = this.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sample, "");
                    sample.getHighSpeedVideoFpsRanges = samplePool.getHighSpeedVideoFpsRangesFor;
                    samplePool.getHighSpeedVideoFpsRangesFor = sample;
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent event) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        float f = event.values[0];
        float f2 = event.values[1];
        float f3 = event.values[2];
        boolean z = ((double) (((f * f) + (f2 * f2)) + (f3 * f3))) > 169.0d;
        long j2 = event.timestamp;
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SampleQueue sampleQueue = this.Camera2StreamConfigurationMap;
        long j3 = j2 - 500000000;
        while (true) {
            if (sampleQueue.getHighResolutionOutputSizeshNQ4ISI < 4) {
                j = j2;
                break;
            }
            com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample = sampleQueue.getHighSpeedVideoSizes;
            j = j2;
            if (j3 - (sample != null ? sample.getHighResolutionOutputSizeshNQ4ISI : 0L) <= 0) {
                break;
            }
            com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample2 = sampleQueue.getHighSpeedVideoSizes;
            if (sample2 != null) {
                if (sample2.getHighSpeedVideoFpsRangesFor) {
                    sampleQueue.getHighSpeedVideoFpsRanges--;
                }
                sampleQueue.getHighResolutionOutputSizeshNQ4ISI--;
                com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample3 = sample2.getHighSpeedVideoFpsRanges;
                sampleQueue.getHighSpeedVideoSizes = sample3;
                if (sample3 == null) {
                    sampleQueue.Camera2StreamConfigurationMap = null;
                }
                com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SamplePool samplePool = sampleQueue.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sample2, "");
                sample2.getHighSpeedVideoFpsRanges = samplePool.getHighSpeedVideoFpsRangesFor;
                samplePool.getHighSpeedVideoFpsRangesFor = sample2;
            }
            j2 = j;
        }
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SamplePool samplePool2 = sampleQueue.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample4 = samplePool2.getHighSpeedVideoFpsRangesFor;
        if (sample4 == null) {
            sample4 = new com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample();
        } else {
            samplePool2.getHighSpeedVideoFpsRangesFor = sample4.getHighSpeedVideoFpsRanges;
        }
        sample4.getHighResolutionOutputSizeshNQ4ISI = j;
        sample4.getHighSpeedVideoFpsRangesFor = z;
        sample4.getHighSpeedVideoFpsRanges = null;
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample5 = sampleQueue.Camera2StreamConfigurationMap;
        if (sample5 != null) {
            sample5.getHighSpeedVideoFpsRanges = sample4;
        }
        sampleQueue.Camera2StreamConfigurationMap = sample4;
        if (sampleQueue.getHighSpeedVideoSizes == null) {
            sampleQueue.getHighSpeedVideoSizes = sample4;
        }
        sampleQueue.getHighResolutionOutputSizeshNQ4ISI++;
        if (z) {
            sampleQueue.getHighSpeedVideoFpsRanges++;
        }
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.SampleQueue sampleQueue2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample6 = sampleQueue2.Camera2StreamConfigurationMap;
        long j4 = sample6 != null ? sample6.getHighResolutionOutputSizeshNQ4ISI : 0L;
        com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Sample sample7 = sampleQueue2.getHighSpeedVideoSizes;
        if (j4 - (sample7 != null ? sample7.getHighResolutionOutputSizeshNQ4ISI : 0L) >= 250000000) {
            int i = sampleQueue2.getHighSpeedVideoFpsRanges;
            int i2 = sampleQueue2.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= (i2 >> 1) + (i2 >> 2)) {
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector.Listener listener = this.getHighSpeedVideoFpsRanges;
                if (listener != null) {
                    listener.onShake();
                }
            }
        }
    }

    public final boolean start() {
        return start$default(this, 0, 1, null);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensor, "");
    }
}
