package lib.android.paypal.com.magnessdk;

/* loaded from: classes5.dex */
class o extends lib.android.paypal.com.magnessdk.network.base.c implements android.hardware.SensorEventListener {
    private static java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(0);
    private android.hardware.Sensor Camera2StreamConfigurationMap;
    private org.json.JSONObject getHighSpeedVideoFpsRanges;
    private android.hardware.SensorManager getHighSpeedVideoSizes;
    private org.json.JSONArray getHighSpeedVideoSizesFor;
    private android.os.Handler getInputFormats;
    private org.json.JSONArray getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private long getOutputMinFrameDurationlomOqCM = 0;
    private int getOutputStallDuration;

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void c() {
        this.getHighSpeedVideoFpsRanges = new org.json.JSONObject();
        this.getInputSizeshNQ4ISI = new org.json.JSONArray();
        this.getHighSpeedVideoSizesFor = new org.json.JSONArray();
        b();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.hardware.SensorManager sensorManager) {
        sensorManager.unregisterListener(this, this.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap = null;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = getHighSpeedVideoFpsRangesFor;
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        getHighSpeedVideoFpsRangesFor.getAndDecrement();
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.c
    public void d() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        android.hardware.SensorManager sensorManager = this.getHighSpeedVideoSizes;
        try {
            if (this.Camera2StreamConfigurationMap == null || sensorManager == null || (atomicInteger = getHighSpeedVideoFpsRangesFor) == null || atomicInteger.get() >= 120) {
                return;
            }
            sensorManager.registerListener(this, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getInputFormats);
            getHighSpeedVideoFpsRangesFor.getAndIncrement();
            org.json.JSONObject highSpeedVideoSizes = lib.android.paypal.com.magnessdk.f.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, lib.android.paypal.com.magnessdk.f.a(this.Camera2StreamConfigurationMap));
            this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
            if (this.getOutputMinFrameDuration == 1) {
                highSpeedVideoSizes.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.AC.toString());
            }
            if (this.getOutputMinFrameDuration == 4) {
                this.getHighSpeedVideoFpsRanges.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.GY.toString());
            }
            if (this.getOutputMinFrameDuration == 2) {
                this.getHighSpeedVideoFpsRanges.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_TYPE.toString(), lib.android.paypal.com.magnessdk.c.l.MG.toString());
            }
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.getInputFormats == null) {
            return;
        }
        d();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.getOutputMinFrameDurationlomOqCM <= this.getOutputStallDuration || this.getInputSizeshNQ4ISI.length() >= 150) {
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(java.lang.String.valueOf(sensorEvent.values[0]));
        jSONArray.put(java.lang.String.valueOf(sensorEvent.values[1]));
        jSONArray.put(java.lang.String.valueOf(sensorEvent.values[2]));
        jSONArray.put(java.lang.String.valueOf(currentTimeMillis));
        this.getInputSizeshNQ4ISI.put(jSONArray);
        this.getOutputMinFrameDurationlomOqCM = currentTimeMillis;
    }

    public final org.json.JSONObject getHighSpeedVideoSizes() {
        if (this.Camera2StreamConfigurationMap == null) {
            return new org.json.JSONObject();
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        Camera2StreamConfigurationMap();
        return this.getHighSpeedVideoFpsRanges;
    }

    private void Camera2StreamConfigurationMap() {
        try {
            this.getHighSpeedVideoFpsRanges.put(lib.android.paypal.com.magnessdk.c.a.SENSOR_PAYLOAD.toString(), this.getInputSizeshNQ4ISI);
            this.getHighSpeedVideoSizesFor.put(this.getHighSpeedVideoFpsRanges);
        } catch (org.json.JSONException e) {
            lib.android.paypal.com.magnessdk.log.a.a(getClass(), 3, e);
        }
    }

    o(android.content.Context context, android.os.Handler handler, int i, int i2) {
        this.getInputFormats = handler;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.getHighSpeedVideoSizes = sensorManager;
        this.getOutputMinFrameDuration = i;
        this.Camera2StreamConfigurationMap = sensorManager.getDefaultSensor(i);
        int i3 = 1000000 / i2;
        this.getOutputFormats = i3;
        this.getOutputStallDuration = i3 / 2000;
    }
}
