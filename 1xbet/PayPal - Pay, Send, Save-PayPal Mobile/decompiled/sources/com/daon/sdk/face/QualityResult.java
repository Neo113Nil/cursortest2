package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class QualityResult {
    public static final java.lang.String RESULT_EXPOSURE = "result.exposure";
    public static final java.lang.String RESULT_EXPOSURE_SCORE = "result.exposure.score";
    public static final java.lang.String RESULT_EYES_DISTANCE = "result.face.eyes.distance";
    public static final java.lang.String RESULT_EYES_DISTANCE_SCORE = "result.face.eyes.distance.score";
    public static final java.lang.String RESULT_EYES_FOUND = "result.face.eyes.found";
    public static final java.lang.String RESULT_EYES_FOUND_SCORE = "result.face.eyes.found.score";
    public static final java.lang.String RESULT_EYES_LEFT_POSITION = "result.face.eyes.left.position";
    public static final java.lang.String RESULT_EYES_OPEN = "result.face.eyes.open";
    public static final java.lang.String RESULT_EYES_OPEN_SCORE = "result.face.eyes.open.score";
    public static final java.lang.String RESULT_EYES_RIGHT_POSITION = "result.face.eyes.right.position";
    public static final java.lang.String RESULT_FACE_CENTERED = "result.face.centered";
    public static final java.lang.String RESULT_FACE_CONTINUITY = "result.face.continuity";
    public static final java.lang.String RESULT_FACE_CONTINUITY_SCORE = "result.face.continuity.score";
    public static final java.lang.String RESULT_FACE_FOUND = "result.face.found";
    public static final java.lang.String RESULT_FACE_FOUND_SCORE = "result.face.found.score";
    public static final java.lang.String RESULT_FACE_FRONTAL = "result.face.frontal";
    public static final java.lang.String RESULT_FACE_FRONTAL_SCORE = "result.face.frontal.score";
    public static final java.lang.String RESULT_FACE_MASK = "result.face.mask";
    public static final java.lang.String RESULT_FACE_MASK_SCORE = "result.face.mask.score";
    public static final java.lang.String RESULT_FACE_ONE_ONLY = "result.face.found.one";
    public static final java.lang.String RESULT_FACE_ONE_ONLY_SCORE = "result.face.found.one.score";
    public static final java.lang.String RESULT_FACE_RECTANGLE = "result.face.rectangle";
    public static final java.lang.String RESULT_GLOBAL_QUALITY = "result.global.quality";
    public static final java.lang.String RESULT_GLOBAL_QUALITY_SCORE = "result.global.quality.score";
    public static final java.lang.String RESULT_GRAYSCALE_DENSITY = "result.grayscale.density";
    public static final java.lang.String RESULT_GRAYSCALE_DENSITY_SCORE = "result.grayscale.density.score";
    public static final java.lang.String RESULT_IMAGE_BEST_SCORE = "result.image.best.score";
    public static final java.lang.String RESULT_IMAGE_QUALITY_SCORE = "result.image.quality.score";
    public static final java.lang.String RESULT_LIGHTING = "result.lighting";
    public static final java.lang.String RESULT_LIGHTING_SCORE = "result.lighting.score";
    public static final java.lang.String RESULT_POSE_ANGLE = "result.pose.angle";
    public static final java.lang.String RESULT_POSE_ANGLE_SCORE = "result.pose.angle.score";
    public static final java.lang.String RESULT_SHARPNESS = "result.sharpness";
    public static final java.lang.String RESULT_SHARPNESS_SCORE = "result.sharpness.score";
    final android.os.Bundle getHighSpeedVideoFpsRangesFor;

    QualityResult(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor = bundle;
    }

    public android.os.Bundle getBundle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getEyeDistance() {
        return this.getHighSpeedVideoFpsRangesFor.getInt(RESULT_EYES_DISTANCE_SCORE);
    }

    public float getFaceFoundScore() {
        return this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_FACE_FOUND_SCORE);
    }

    public float getFaceImageScore() {
        return this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_IMAGE_QUALITY_SCORE);
    }

    public android.graphics.Rect getFaceRectangle() {
        android.graphics.Rect rect = (android.graphics.Rect) this.getHighSpeedVideoFpsRangesFor.getParcelable(RESULT_FACE_RECTANGLE);
        return rect != null ? rect : new android.graphics.Rect(0, 0, 0, 0);
    }

    public android.graphics.Point getLeftEyePosition() {
        android.graphics.Point point = (android.graphics.Point) this.getHighSpeedVideoFpsRangesFor.getParcelable(RESULT_EYES_LEFT_POSITION);
        return point != null ? point : new android.graphics.Point(0, 0);
    }

    public android.graphics.Point getRightEyePosition() {
        android.graphics.Point point = (android.graphics.Point) this.getHighSpeedVideoFpsRangesFor.getParcelable(RESULT_EYES_RIGHT_POSITION);
        return point != null ? point : new android.graphics.Point(0, 0);
    }

    public float getScore() {
        return this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_GLOBAL_QUALITY_SCORE);
    }

    public boolean hasAcceptableExposure() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_EXPOSURE);
    }

    public boolean hasAcceptableEyeDistance() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_EYES_DISTANCE);
    }

    public boolean hasAcceptableFaceAngle() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_POSE_ANGLE);
    }

    public boolean hasAcceptableFrontalPose() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_FRONTAL);
    }

    public boolean hasAcceptableGrayscaleDensity() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_GRAYSCALE_DENSITY);
    }

    public boolean hasAcceptableQuality() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_GLOBAL_QUALITY);
    }

    public boolean hasAcceptableSharpness() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_SHARPNESS);
    }

    public boolean hasData() {
        return ((double) ((((((this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_FACE_FOUND_SCORE) + this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_LIGHTING_SCORE)) + ((float) this.getHighSpeedVideoFpsRangesFor.getInt(RESULT_EYES_DISTANCE_SCORE))) + ((float) this.getHighSpeedVideoFpsRangesFor.getInt(RESULT_SHARPNESS_SCORE))) + ((float) this.getHighSpeedVideoFpsRangesFor.getInt(RESULT_EXPOSURE_SCORE))) + ((float) this.getHighSpeedVideoFpsRangesFor.getInt(RESULT_GRAYSCALE_DENSITY_SCORE))) + this.getHighSpeedVideoFpsRangesFor.getFloat(RESULT_GLOBAL_QUALITY_SCORE))) > 0.0d;
    }

    public boolean hasEyes() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_EYES_FOUND);
    }

    public boolean hasEyesOpen() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_EYES_OPEN);
    }

    public boolean hasFace() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_FOUND);
    }

    public boolean hasFaceContinuity() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_CONTINUITY);
    }

    public boolean hasMask() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_MASK);
    }

    public boolean hasOneFaceOnly() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_ONE_ONLY);
    }

    public boolean hasUniformLighting() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_LIGHTING);
    }

    public boolean isFaceCentered() {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(RESULT_FACE_CENTERED);
    }
}
