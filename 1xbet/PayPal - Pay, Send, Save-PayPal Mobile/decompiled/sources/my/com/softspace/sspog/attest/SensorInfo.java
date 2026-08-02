package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
class SensorInfo extends android.hardware.TriggerEventListener implements android.hardware.SensorEventListener {
    static java.util.Map<java.lang.String, my.com.softspace.sspog.attest.SensorValues> getHighResolutionOutputSizeshNQ4ISI;
    long Camera2StreamConfigurationMap;
    final java.lang.ref.WeakReference<android.content.Context> getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    android.hardware.SensorManager getOutputFormats;
    private final java.lang.String getHighSpeedVideoSizesFor = "SensorInfo";
    private final int getOutputMinFrameDuration = 500;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public SensorInfo(android.content.Context context) {
        java.lang.ref.WeakReference<android.content.Context> weakReference = new java.lang.ref.WeakReference<>(context);
        this.getHighSpeedVideoFpsRanges = weakReference;
        if (weakReference.get() != null) {
            this.getOutputFormats = (android.hardware.SensorManager) weakReference.get().getSystemService("sensor");
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        getHighSpeedVideoFpsRangesFor(sensorEvent.sensor, sensorEvent.values, sensorEvent.accuracy);
        this.getOutputFormats.unregisterListener(this, sensorEvent.sensor);
    }

    @Override // android.hardware.TriggerEventListener
    public void onTrigger(android.hardware.TriggerEvent triggerEvent) {
        getHighSpeedVideoFpsRangesFor(triggerEvent.sensor, triggerEvent.values, 0);
    }

    private void getHighSpeedVideoFpsRangesFor(android.hardware.Sensor sensor, float[] fArr, int i) {
        java.util.concurrent.CountDownLatch andSet;
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(fArr);
        this.getHighSpeedVideoFpsRangesFor += sensor.getType();
        my.com.softspace.sspog.attest.SensorValues sensorValues = new my.com.softspace.sspog.attest.SensorValues(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), highSpeedVideoFpsRanges);
        switch (sensor.getType()) {
            case 1:
                getHighResolutionOutputSizeshNQ4ISI.put("accelerometer", sensorValues);
                break;
            case 2:
                getHighResolutionOutputSizeshNQ4ISI.put("magneticField", sensorValues);
                break;
            case 4:
                getHighResolutionOutputSizeshNQ4ISI.put("gyroscope", sensorValues);
                break;
            case 5:
                getHighResolutionOutputSizeshNQ4ISI.put("lightSensor", sensorValues);
                break;
            case 6:
                getHighResolutionOutputSizeshNQ4ISI.put("pressure", sensorValues);
                break;
            case 8:
                getHighResolutionOutputSizeshNQ4ISI.put("proximity", sensorValues);
                break;
            case 9:
                getHighResolutionOutputSizeshNQ4ISI.put("gravity", sensorValues);
                break;
            case 10:
                getHighResolutionOutputSizeshNQ4ISI.put("linearAcceleration", sensorValues);
                break;
            case 11:
                getHighResolutionOutputSizeshNQ4ISI.put("rotationVector", sensorValues);
                break;
            case 12:
                getHighResolutionOutputSizeshNQ4ISI.put("humidity", sensorValues);
                break;
            case 13:
                getHighResolutionOutputSizeshNQ4ISI.put("ambientTemperature", sensorValues);
                break;
        }
        long j = this.getHighSpeedVideoFpsRangesFor;
        long j2 = this.Camera2StreamConfigurationMap;
        if ((j & j2) != j2 || (andSet = this.getHighSpeedVideoSizes.getAndSet(null)) == null) {
            return;
        }
        andSet.countDown();
    }

    static float[] Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String[] split = str.split(",");
        if (split.length == 0) {
            return null;
        }
        float[] fArr = new float[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                fArr[i] = java.lang.Float.parseFloat(split[i]);
            } catch (java.lang.NumberFormatException e) {
                sspog.SimpleLogger.e("SensorInfo", e.getLocalizedMessage(), new java.lang.Object[0]);
                fArr[i] = 0.0f;
            }
        }
        return fArr;
    }

    static java.lang.String getHighSpeedVideoFpsRanges(float[] fArr) {
        if (fArr == null || fArr.length <= 0) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            sb.append(fArr[i]);
            if (i != fArr.length - 1) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ void getHighSpeedVideoSizes(org.json.JSONObject jSONObject, java.lang.String str, my.com.softspace.sspog.attest.SensorValues sensorValues) {
        try {
            jSONObject.putOpt(str, sensorValues.getHighSpeedVideoFpsRanges());
        } catch (org.json.JSONException e) {
            sspog.SimpleLogger.e("SensorInfo", e.getLocalizedMessage(), new java.lang.Object[0]);
        }
    }
}
