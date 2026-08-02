package my.com.softspace.common;

/* loaded from: classes17.dex */
public class SensorEntropy implements android.hardware.SensorEventListener {
    private android.hardware.SensorManager Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes = "SensorEntropy";
    private final my.com.softspace.common.io.CircleBufferOutputStream getHighSpeedVideoFpsRangesFor = new my.com.softspace.common.io.CircleBufferOutputStream(128);

    public void start(android.content.Context context) {
        try {
            sspog.SimpleLogger.i("SensorEntropy", "[SensorEntropy] start", new java.lang.Object[0]);
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
            this.Camera2StreamConfigurationMap = sensorManager;
            this.Camera2StreamConfigurationMap.registerListener(this, sensorManager.getDefaultSensor(1), 3);
            sspog.SimpleLogger.i("SensorEntropy", "[SensorEntropy] start ok", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e("SensorEntropy", e, "[SensorEntropy] start error", new java.lang.Object[0]);
        }
    }

    public void stop(android.content.Context context) {
        sspog.SimpleLogger.i("SensorEntropy", "[SensorEntropy] stop", new java.lang.Object[0]);
        try {
            this.getHighSpeedVideoFpsRangesFor.interrupt();
            this.Camera2StreamConfigurationMap.unregisterListener(this);
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e("SensorEntropy", e, "[SensorEntropy] stop fail", new java.lang.Object[0]);
        }
    }

    public byte[] generate(int i) {
        return this.getHighSpeedVideoFpsRangesFor.read(i);
    }

    public int capacity() {
        return this.getHighSpeedVideoFpsRangesFor.capacity();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.values == null || sensorEvent.values.length <= 0) {
            return;
        }
        for (float f : sensorEvent.values) {
            this.getHighSpeedVideoFpsRangesFor.write(java.lang.Float.floatToIntBits(f) & 255);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        sspog.SimpleLogger.d("SensorEntropy", "[SensorEntropy.onAccuracyChanged] %d", java.lang.Integer.valueOf(i));
    }
}
