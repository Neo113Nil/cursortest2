package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum Outcome {
    UNKNOWN((byte) 0),
    AUTHORIZE_ONLINE((byte) 1),
    AUTHENTICATE_OFFLINE((byte) 2),
    WALLET_ACTION_REQUIRED((byte) 3),
    DECLINE_BY_TERMINAL((byte) 4),
    DECLINE_BY_CARD((byte) 5);

    private int getHighSpeedVideoFpsRangesFor;

    Outcome(byte b) {
        this.getHighSpeedVideoFpsRangesFor = b;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
