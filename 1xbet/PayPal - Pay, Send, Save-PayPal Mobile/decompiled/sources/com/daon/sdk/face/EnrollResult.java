package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class EnrollResult {
    final android.os.Bundle getHighSpeedVideoSizes;

    EnrollResult(android.os.Bundle bundle) {
        this.getHighSpeedVideoSizes = bundle;
    }

    public int getCode() {
        return this.getHighSpeedVideoSizes.getInt(com.daon.sdk.face.Result.RESULT_ERROR_CODE, 0);
    }

    public java.lang.String getMessage() {
        return this.getHighSpeedVideoSizes.getString(com.daon.sdk.face.Result.RESULT_ERROR_MESSAGE);
    }

    public boolean isEnrolled() {
        return this.getHighSpeedVideoSizes.getBoolean(com.daon.sdk.face.Result.RESULT_ENROLLED, false);
    }
}
