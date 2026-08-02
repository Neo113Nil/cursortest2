package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class LivenessResult {
    public static final int ALERT_FACE_NOT_CENTERED = 2;
    public static final int ALERT_FACE_NOT_DETECTED = 1;
    public static final int ALERT_FACE_QUALITY = 14;
    public static final int ALERT_FACE_TOO_CLOSE_TO_EDGE = 6;
    public static final int ALERT_FACE_TOO_FAR = 8;
    public static final int ALERT_FACE_TOO_NEAR = 7;
    public static final int ALERT_FRAME_MISMATCH = 12;
    public static final int ALERT_INSUFFICIENT_FACE_DATA = 10;
    public static final int ALERT_INSUFFICIENT_FRAME_DATA = 11;
    public static final int ALERT_LIVENESS_SPOOF = 9;
    public static final int ALERT_MOTION_SWING_TOO_FAST = 4;
    public static final int ALERT_MOTION_TOO_FAR = 5;
    public static final int ALERT_MOTION_TOO_FAST = 3;
    public static final int ALERT_NONE = 0;
    public static final int ALERT_NO_MOVEMENT_DETECTED = 13;
    public static final int ALERT_PERFORMANCE = 16;
    public static final int ALERT_TIMEOUT = 15;
    public static final int EVENT_BLINK = 1;
    public static final int EVENT_NOD = 2;
    public static final int EVENT_PASSIVE = 5;
    public static final int EVENT_SHAKE = 3;
    public static final int EVENT_SPOOF = 4;

    @java.lang.Deprecated
    public static final int LIVENESS_STATE_ANALYZING = 4;

    @java.lang.Deprecated
    public static final int LIVENESS_STATE_DONE = 5;

    @java.lang.Deprecated
    public static final int LIVENESS_STATE_INIT = 1;

    @java.lang.Deprecated
    public static final int LIVENESS_STATE_START = 2;

    @java.lang.Deprecated
    public static final int LIVENESS_STATE_TRACKING = 3;
    public static final java.lang.String RESULT_ACTION_BLINK = "result.liveness.action.blink";
    public static final java.lang.String RESULT_ACTION_NOD = "result.liveness.action.nod";
    public static final java.lang.String RESULT_ACTION_SHAKE = "result.liveness.action.shake";
    public static final java.lang.String RESULT_ALERT = "result.liveness.alert";
    public static final java.lang.String RESULT_DEBUG = "result.liveness.debug";
    public static final java.lang.String RESULT_IMAGE = "result.liveness.image";
    public static final java.lang.String RESULT_LIVENESS = "result.liveness.passive";
    public static final java.lang.String RESULT_SCORE = "result.liveness.score";
    public static final java.lang.String RESULT_SPOOF = "result.liveness.spoof";
    public static final java.lang.String RESULT_STATE = "result.liveness.state";
    public static final java.lang.String RESULT_TARGET_POSITION = "result.liveness.target";
    public static final java.lang.String RESULT_TEMPLATE = "result.liveness.template";
    public static final java.lang.String RESULT_TIMEOUT = "result.liveness.timeout";
    public static final java.lang.String RESULT_TRACKER = "result.liveness.tracker.";
    public static final int STATE_ANALYZING = 4;
    public static final int STATE_DONE = 5;
    public static final int STATE_INIT = 1;
    public static final int STATE_START = 2;
    public static final int STATE_TRACKING = 3;
    public static final int TRACKER_FACE_FINDING = 0;
    public static final int TRACKER_FACE_REFINDING = 2;
    public static final int TRACKER_FACE_TRACKING = 1;
    private final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI;

    public LivenessResult(android.os.Bundle bundle) {
        this.getHighResolutionOutputSizeshNQ4ISI = bundle;
    }

    public int getAlert() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInt(RESULT_ALERT);
    }

    public int getNumberOfFrames() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInt("liveness.frames");
    }

    public float getScore() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFloat(RESULT_SCORE);
    }

    public int getState() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInt(RESULT_STATE);
    }

    public byte[] getTemplate() {
        try {
            return com.daon.sdk.face.FileTools.read(null, this.getHighResolutionOutputSizeshNQ4ISI.getString(RESULT_TEMPLATE));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public int getTimeout() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInt(RESULT_TIMEOUT);
    }

    public int getTrackerStatus() {
        int i = 0;
        for (java.lang.String str : this.getHighResolutionOutputSizeshNQ4ISI.keySet()) {
            if (str.startsWith(RESULT_TRACKER) && (i = this.getHighResolutionOutputSizeshNQ4ISI.getInt(str)) == 1) {
                break;
            }
        }
        return i;
    }

    public boolean isBlink() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(RESULT_ACTION_BLINK);
    }

    public boolean isNod() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(RESULT_ACTION_NOD);
    }

    public boolean isPassive() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(RESULT_LIVENESS);
    }

    public boolean isShake() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(RESULT_ACTION_SHAKE);
    }

    public boolean spoofDetected() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBoolean(RESULT_SPOOF);
    }
}
