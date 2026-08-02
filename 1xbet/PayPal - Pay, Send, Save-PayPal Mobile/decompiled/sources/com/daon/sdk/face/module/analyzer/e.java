package com.daon.sdk.face.module.analyzer;

/* loaded from: classes7.dex */
public class e extends com.daon.sdk.face.module.Analyzer implements android.hardware.SensorEventListener {
    private static boolean Camera2StreamConfigurationMap = true;
    private android.hardware.SensorManager getHighResolutionOutputSizeshNQ4ISI;
    private float[] getHighSpeedVideoFpsRanges;
    private float[] getHighSpeedVideoFpsRangesFor;
    private float[] getHighSpeedVideoSizes;
    private final android.content.Context getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private android.hardware.Sensor getInputSizeshNQ4ISI;
    private final android.os.Bundle getOutputFormats = new android.os.Bundle();
    private int getOutputMinFrameDuration;

    public e(android.content.Context context, int i) {
        this.getHighSpeedVideoSizesFor = context;
        int deviceOrientation = com.daon.sdk.face.CameraTools.getDeviceOrientation(i);
        this.getInputFormats = deviceOrientation == 0 || deviceOrientation == 180;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        java.lang.String name2;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) this.getHighSpeedVideoSizesFor.getSystemService("sensor");
            this.getHighResolutionOutputSizeshNQ4ISI = sensorManager;
            if (sensorManager == null) {
                Camera2StreamConfigurationMap = false;
                return;
            }
            sensorManager.unregisterListener(this);
            android.hardware.Sensor defaultSensor = this.getHighResolutionOutputSizeshNQ4ISI.getDefaultSensor(1);
            android.hardware.Sensor defaultSensor2 = this.getHighResolutionOutputSizeshNQ4ISI.getDefaultSensor(2);
            if (defaultSensor == null || defaultSensor2 == null) {
                for (android.hardware.Sensor sensor : this.getHighResolutionOutputSizeshNQ4ISI.getSensorList(-1)) {
                    java.lang.String vendor = sensor.getVendor();
                    if (vendor != null && vendor.toLowerCase().contains(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG) && (name2 = sensor.getName()) != null && name2.toLowerCase().contains("orientation")) {
                        int type = sensor.getType();
                        this.getOutputMinFrameDuration = type;
                        android.hardware.Sensor defaultSensor3 = this.getHighResolutionOutputSizeshNQ4ISI.getDefaultSensor(type);
                        this.getInputSizeshNQ4ISI = defaultSensor3;
                        if (defaultSensor3 != null) {
                            break;
                        }
                    }
                }
                Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI != null;
            }
            if (defaultSensor != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.registerListener(this, defaultSensor, 3);
            }
            if (defaultSensor2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.registerListener(this, defaultSensor2, 3);
            }
            android.hardware.Sensor sensor2 = this.getInputSizeshNQ4ISI;
            if (sensor2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.registerListener(this, sensor2, 3);
            }
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle) {
        return null;
    }

    @Override // com.daon.sdk.face.module.Module
    public java.lang.String getName() {
        return com.daon.sdk.face.license.License.FEATURE_POSITION;
    }

    @Override // com.daon.sdk.face.module.Module
    public boolean isSupported(com.daon.sdk.face.license.License license) {
        return Camera2StreamConfigurationMap;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        float[] fArr2 = sensorEvent.values;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.getHighSpeedVideoFpsRangesFor = (float[]) fArr2.clone();
        } else if (type == 2) {
            this.getHighSpeedVideoSizes = (float[]) fArr2.clone();
        } else if (type != this.getOutputMinFrameDuration) {
            return;
        } else {
            this.getHighSpeedVideoFpsRanges = (float[]) fArr2.clone();
        }
        float[] fArr3 = this.getHighSpeedVideoFpsRangesFor;
        if (fArr3 == null || (fArr = this.getHighSpeedVideoSizes) == null) {
            float[] fArr4 = this.getHighSpeedVideoFpsRanges;
            if (fArr4 != null) {
                float f = fArr4[0] == 0.0f ? 75.0f : 0.0f;
                this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_AZIMUTH, 0.0f);
                this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_PITCH, f);
                this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ROLL, 0.0f);
                return;
            }
            return;
        }
        float[] fArr5 = new float[9];
        if (!android.hardware.SensorManager.getRotationMatrix(fArr5, new float[9], fArr3, fArr)) {
            this.getOutputFormats.clear();
            return;
        }
        android.hardware.SensorManager.getOrientation(fArr5, new float[3]);
        float f2 = (float) (r13[0] * 57.29577951308232d);
        float abs = java.lang.Math.abs((float) (r13[1] * 57.29577951308232d));
        float abs2 = java.lang.Math.abs((float) (r13[2] * 57.29577951308232d));
        this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_AZIMUTH, f2);
        if (this.getInputFormats) {
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_PITCH, abs2);
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ROLL, abs);
        } else {
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_PITCH, abs);
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ROLL, abs2);
        }
        float[] fArr6 = this.getHighSpeedVideoFpsRangesFor;
        if (fArr6.length > 2) {
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_X, fArr6[0]);
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_Y, this.getHighSpeedVideoFpsRangesFor[1]);
            this.getOutputFormats.putFloat(com.daon.sdk.face.Result.RESULT_SENSOR_ACC_Z, this.getHighSpeedVideoFpsRangesFor[2]);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer, com.daon.sdk.face.module.Module
    public void stop() {
        synchronized (this) {
            super.stop();
            android.hardware.SensorManager sensorManager = this.getHighResolutionOutputSizeshNQ4ISI;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public void analyze(com.daon.sdk.face.YUV yuv, android.os.Bundle bundle, com.daon.sdk.face.module.Analyzer.AnalyzerCallback analyzerCallback) {
        getHighSpeedVideoFpsRangesFor();
        if (analyzerCallback != null) {
            analyzerCallback.onAnalysisComplete(getName(), this.getOutputFormats, yuv);
        }
    }

    @Override // com.daon.sdk.face.module.Analyzer
    public android.os.Bundle analyze(android.graphics.Bitmap bitmap) {
        getHighSpeedVideoFpsRangesFor();
        return this.getOutputFormats;
    }
}
