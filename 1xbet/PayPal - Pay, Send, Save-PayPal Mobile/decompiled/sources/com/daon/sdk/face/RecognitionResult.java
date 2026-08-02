package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class RecognitionResult {
    public static final java.lang.String RESULT_FACE_POSITION = "result.face.position";
    public static final java.lang.String RESULT_FACE_POSITION_PORTRAIT = "result.face.position.portrait";
    public static final java.lang.String RESULT_FACE_RECOGNITION_SCORE = "result.face.recognition.score";
    final android.os.Bundle getHighSpeedVideoFpsRanges;

    RecognitionResult(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRanges = bundle;
    }

    public int getCode() {
        return this.getHighSpeedVideoFpsRanges.getInt("code", 0);
    }

    @java.lang.Deprecated
    public android.graphics.Rect getFacePosition() {
        android.graphics.Rect rect = (android.graphics.Rect) this.getHighSpeedVideoFpsRanges.getParcelable(RESULT_FACE_POSITION);
        return rect != null ? rect : new android.graphics.Rect(0, 0, 0, 0);
    }

    public android.graphics.Rect getFaceRectangle() {
        android.graphics.Rect rect = (android.graphics.Rect) this.getHighSpeedVideoFpsRanges.getParcelable(RESULT_FACE_POSITION_PORTRAIT);
        if (rect != null) {
            return rect;
        }
        android.graphics.Rect rect2 = (android.graphics.Rect) this.getHighSpeedVideoFpsRanges.getParcelable(com.daon.sdk.face.QualityResult.RESULT_FACE_RECTANGLE);
        return rect2 != null ? rect2 : new android.graphics.Rect(0, 0, 0, 0);
    }

    public java.lang.String getMessage() {
        return this.getHighSpeedVideoFpsRanges.getString("message");
    }

    public float getScore() {
        return this.getHighSpeedVideoFpsRanges.getFloat(RESULT_FACE_RECOGNITION_SCORE);
    }
}
