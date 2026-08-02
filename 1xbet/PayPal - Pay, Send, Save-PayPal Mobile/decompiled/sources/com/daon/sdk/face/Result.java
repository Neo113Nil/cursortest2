package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class Result {
    public static final java.lang.String RESULT_ENROLLED = "result.enrolled";
    public static final java.lang.String RESULT_ERROR = "result.error";
    public static final java.lang.String RESULT_ERROR_CODE = "result.code";
    public static final java.lang.String RESULT_ERROR_MESSAGE = "result.message";
    public static final java.lang.String RESULT_SENSOR_ACC_X = "result.sensor.acc.x";
    public static final java.lang.String RESULT_SENSOR_ACC_Y = "result.sensor.acc.y";
    public static final java.lang.String RESULT_SENSOR_ACC_Z = "result.sensor.acc.z";
    public static final java.lang.String RESULT_SENSOR_AZIMUTH = "result.sensor.azimuth";
    public static final java.lang.String RESULT_SENSOR_PITCH = "result.sensor.pitch";
    public static final java.lang.String RESULT_SENSOR_ROLL = "result.sensor.roll";
    public static final int SENSOR_PITCH_MAX = 90;
    public static final int SENSOR_PITCH_MIN = 60;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final android.os.Bundle getHighSpeedVideoFpsRanges;
    final android.os.Bundle getHighSpeedVideoFpsRangesFor;

    public Result(android.os.Bundle bundle) {
        this(bundle, null, 0);
    }

    public boolean eyesClosed() throws java.lang.NoSuchFieldException {
        if (!hasQualityData()) {
            throw new java.lang.NoSuchFieldException();
        }
        com.daon.sdk.face.QualityResult qualityResult = getQualityResult();
        return qualityResult.hasEyes() && !qualityResult.hasEyesOpen() && ((double) getLivenessResult().getScore()) == 0.0d;
    }

    public android.os.Bundle getBundle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.os.Bundle getConfiguration() {
        android.os.Bundle bundle = this.getHighSpeedVideoFpsRanges;
        return bundle == null ? new android.os.Bundle() : bundle;
    }

    public com.daon.sdk.face.LivenessResult getLivenessResult() {
        return new com.daon.sdk.face.LivenessResult(this.getHighSpeedVideoFpsRangesFor);
    }

    public int getOptions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.daon.sdk.face.QualityResult getQualityResult() {
        return new com.daon.sdk.face.QualityResult(this.getHighSpeedVideoFpsRangesFor);
    }

    public com.daon.sdk.face.RecognitionResult getRecognitionResult() {
        return new com.daon.sdk.face.RecognitionResult(this.getHighSpeedVideoFpsRangesFor);
    }

    public boolean hasLightReflectionData() {
        return this.getHighSpeedVideoFpsRangesFor.get(com.daon.sdk.face.LivenessResult.RESULT_STATE) != null;
    }

    public boolean hasLivenessData() {
        return this.getHighSpeedVideoFpsRangesFor.get(com.daon.sdk.face.LivenessResult.RESULT_LIVENESS) != null;
    }

    public boolean hasMask() {
        return getQualityResult().hasMask();
    }

    public boolean hasPositionData() {
        return this.getHighSpeedVideoFpsRangesFor.get(RESULT_SENSOR_PITCH) != null;
    }

    public boolean hasQualityData() {
        return this.getHighSpeedVideoFpsRangesFor.get(com.daon.sdk.face.QualityResult.RESULT_GLOBAL_QUALITY_SCORE) != null;
    }

    public boolean isDeviceUpright() {
        return isDeviceUpright(true);
    }

    public boolean isTrackingFace() {
        return getLivenessResult().getTrackerStatus() == 1 || this.getHighSpeedVideoFpsRangesFor.getBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY);
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor.toString();
    }

    public void update(com.daon.sdk.face.QualityResult qualityResult) {
        android.os.Bundle bundle = qualityResult.getBundle();
        bundle.putFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY_SCORE, this.getHighSpeedVideoFpsRangesFor.getFloat(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY_SCORE));
        bundle.putBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY, this.getHighSpeedVideoFpsRangesFor.getBoolean(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY));
        this.getHighSpeedVideoFpsRangesFor.putAll(bundle);
    }

    Result(android.os.Bundle bundle, android.os.Bundle bundle2, int i) {
        this.getHighSpeedVideoFpsRangesFor = bundle;
        this.getHighSpeedVideoFpsRanges = bundle2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public com.daon.sdk.face.Result deepCopy() {
        return new com.daon.sdk.face.Result(this.getHighSpeedVideoFpsRangesFor.deepCopy(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean isDeviceUpright(boolean z) {
        return isDeviceUpright(60.0f, 90.0f, z);
    }

    public boolean isDeviceUpright(float f, float f2, boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor.get(RESULT_SENSOR_PITCH) == null) {
            return z;
        }
        float f3 = this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_SENSOR_PITCH, 90.0f);
        return f3 < f2 && f3 > f;
    }

    public boolean hasTrackingData() {
        java.util.Iterator<java.lang.String> it = this.getHighSpeedVideoFpsRangesFor.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().startsWith(com.daon.sdk.face.LivenessResult.RESULT_TRACKER)) {
                return true;
            }
        }
        return this.getHighSpeedVideoFpsRangesFor.get(com.daon.sdk.face.QualityResult.RESULT_FACE_CONTINUITY) != null;
    }
}
