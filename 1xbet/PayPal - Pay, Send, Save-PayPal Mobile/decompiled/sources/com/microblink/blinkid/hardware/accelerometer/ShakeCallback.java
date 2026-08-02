package com.microblink.blinkid.hardware.accelerometer;

/* loaded from: classes10.dex */
public interface ShakeCallback {
    public static final com.microblink.blinkid.hardware.accelerometer.ShakeCallback EMPTY = new com.microblink.blinkid.secured.lIIIlIlIlI();

    void onShakingStarted();

    void onShakingStopped();
}
