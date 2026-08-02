package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class Config {
    public static final java.lang.String BLINK_THRESHOLD = "blink.settings.threshold";
    public static final java.lang.String CLR_PITCH_DELTA = "clr.settings.pitch.delta";
    public static final java.lang.String CLR_SEQUENCE_COLORS = "clr.settings.sequence.colors";
    public static final java.lang.String CLR_SEQUENCE_DURATION = "clr.settings.sequence.duration";
    public static final java.lang.String CLR_SEQUENCE_LENGTH = "clr.settings.sequence.length";
    public static final float DEFAULT_BLINK_THRESHOLD = 0.4f;
    public static final int DEFAULT_HMD_DISTANCE_CUTOFF = -1;
    public static final float DEFAULT_HMD_MOTION_THRESHOLD = 0.4f;
    public static final int DEFAULT_HMD_TIME_LIMIT_NOD = 500;
    public static final int DEFAULT_HMD_TIME_LIMIT_SHAKE = 500;
    public static final java.lang.String HMD_DISTANCE_CUTOFF = "hmd.settings.distance.cutoff";
    public static final java.lang.String HMD_MOTION_THRESHOLD = "hmd.settings.threshold";
    public static final java.lang.String HMD_TIME_LIMIT_NOD = "hmd.settings.time.limit.nods";
    public static final java.lang.String HMD_TIME_LIMIT_SHAKE = "hmd.settings.time.limit.shakes";
    public static final java.lang.String LIVENESS_ANALYSIS_FRAME_COUNT = "liveness.settings.frames";
    public static final java.lang.String LIVENESS_DEBUG = "liveness.settings.debug";
    public static final java.lang.String LIVENESS_EYES_OPEN = "liveness.settings.eyes.open";
    public static final java.lang.String LIVENESS_EYES_OPEN_SECURITY = "liveness.settings.eyes.security";
    public static final java.lang.String LIVENESS_FRAME_RATE = "liveness.settings.framerate";
    public static final java.lang.String LIVENESS_SECURITY = "liveness.settings.security";
    public static final java.lang.String LIVENESS_START_DELAY = "liveness.settings.start.delay";
    public static final java.lang.String LIVENESS_TEMPLATE = "liveness.settings.template";
    public static final java.lang.String LIVENESS_TEMPLATE_QUALITY = "liveness.settings.template.quality";
    public static final java.lang.String LIVENESS_THRESHOLD = "liveness.settings.threshold";
    public static final java.lang.String LIVENESS_TIMEOUT = "liveness.settings.timeout";
    public static final java.lang.String MASK_FRAME_RATE = "mask.framerate";
    public static final java.lang.String MASK_THRESHOLD = "mask.threshold";
    public static final java.lang.String QUALITY_FRAME_RATE = "quality.settings.framerate";
    public static final java.lang.String QUALITY_THRESHOLD_CENTERED = "quality.threshold.centered";
    public static final java.lang.String QUALITY_THRESHOLD_EXPOSURE = "quality.threshold.exposure";
    public static final java.lang.String QUALITY_THRESHOLD_EYES = "quality.threshold.eyes.found";
    public static final java.lang.String QUALITY_THRESHOLD_EYES_OPEN = "quality.threshold.eyes.open";
    public static final java.lang.String QUALITY_THRESHOLD_EYE_DISTANCE = "quality.threshold.eye.distance";
    public static final java.lang.String QUALITY_THRESHOLD_FACE = "quality.threshold.face.found";
    public static final java.lang.String QUALITY_THRESHOLD_FACE_ANGLE = "quality.threshold.face.angle";
    public static final java.lang.String QUALITY_THRESHOLD_FACE_FRONTAL = "quality.threshold.face.frontal";
    public static final java.lang.String QUALITY_THRESHOLD_FACE_ONE_ONLY = "quality.threshold.face.one";
    public static final java.lang.String QUALITY_THRESHOLD_GRAYSCALE_DENSITY = "quality.threshold.grayscale.density";
    public static final java.lang.String QUALITY_THRESHOLD_LIGHTING = "quality.threshold.lighting";
    public static final java.lang.String QUALITY_THRESHOLD_MIN_FACE_SIZE = "quality.threshold.face.size";
    public static final java.lang.String QUALITY_THRESHOLD_RANGE = "quality.settings.threshold";
    public static final java.lang.String QUALITY_THRESHOLD_SCORE = "quality.threshold.score";
    public static final java.lang.String QUALITY_THRESHOLD_SHARPNESS = "quality.threshold.sharpness";
    public static final java.lang.String QUALITY_TRACKING = "quality.settings.tracking";

    public static final class Builder {
        private final android.os.Bundle Camera2StreamConfigurationMap = new android.os.Bundle();

        public final android.os.Bundle getBundle() {
            return this.Camera2StreamConfigurationMap;
        }

        public final com.daon.sdk.face.Config.Builder setExposureThreshold(int i) {
            this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EXPOSURE, i);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setEyeDistanceThreshold(int i) {
            this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYE_DISTANCE, i);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setEyesOpenThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYES_OPEN, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setFaceAngleThreshold(int i) {
            this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_ANGLE, i);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setFrontalPoseThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_FRONTAL, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setGrayscaleDensityThreshold(int i) {
            this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_GRAYSCALE_DENSITY, i);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setHasEyesThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_EYES, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setHasFaceThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setMaskDetectionThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.MASK_THRESHOLD, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setMinimumFaceSize(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_MIN_FACE_SIZE, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setOneFaceOnlyThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_FACE_ONE_ONLY, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setQualityThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_SCORE, f);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setSharpnessThreshold(int i) {
            this.Camera2StreamConfigurationMap.putInt(com.daon.sdk.face.Config.QUALITY_THRESHOLD_SHARPNESS, i);
            return this;
        }

        public final com.daon.sdk.face.Config.Builder setUniformLightingThreshold(float f) {
            this.Camera2StreamConfigurationMap.putFloat(com.daon.sdk.face.Config.QUALITY_THRESHOLD_LIGHTING, f);
            return this;
        }
    }
}
