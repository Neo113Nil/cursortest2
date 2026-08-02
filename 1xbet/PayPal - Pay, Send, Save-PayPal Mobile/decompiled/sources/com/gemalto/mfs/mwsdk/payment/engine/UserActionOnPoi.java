package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum UserActionOnPoi {
    NONE((byte) 1),
    ONLINE_PIN((byte) 2),
    SIGNATURE((byte) 3),
    ONLINE_PIN_OR_SIGNATURE((byte) 4),
    UNKNOWN((byte) 5);

    private int getHighSpeedVideoFpsRangesFor;

    UserActionOnPoi(byte b) {
        this.getHighSpeedVideoFpsRangesFor = b;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
