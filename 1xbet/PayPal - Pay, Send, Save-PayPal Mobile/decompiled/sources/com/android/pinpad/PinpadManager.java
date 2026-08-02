package com.android.pinpad;

/* loaded from: classes7.dex */
public class PinpadManager {
    public static final int ACCESSIBILITY_HIGH_CONTRAST = 1;
    public static final java.lang.String ACCESSIBILITY_MANAGER_NAME = null;
    public static final int ACCESSIBILITY_NONE = -1;
    public static final int ACCESSIBILITY_SPEECH = 2;
    public static final java.lang.String ACTION_HARDWARE_MODE_SET = "android.intent.action.PINPAD_HARDWARE_MODE_SET";
    public static final java.lang.String ACTION_LED_STATE_CHANGED = "android.intent.action.LED_STATE_CHANGED";
    public static final java.lang.String ACTION_PINPAD_STATUS_CHANGED = "android.intent.action.PINPAD_STATUS_CHANGED";
    public static final java.lang.String EXTRA_STATE = "state";
    public static final java.lang.String EXTRA_STATUS = "status";
    public static final java.lang.String FEATURE_PINPAD = "vendor.datecs.pinpad";
    public static final int HIGH_CONTRAST_BLACK_ON_WHITE = 3;
    public static final int HIGH_CONTRAST_BLACK_ON_YELLOW = 2;
    public static final int HIGH_CONTRAST_WHITE_ON_BLACK = 1;
    public static final int HIGH_CONTRAST_WHITE_ON_BLUE = 4;

    @java.lang.Deprecated
    public static final int LOCK_UI_NAVIGATION_GESTURES = 2;

    @java.lang.Deprecated
    public static final int LOCK_UI_NOTIFICATION_AREA = 1;

    @java.lang.Deprecated
    public static final int LOCK_UI_PIN = 8;

    @java.lang.Deprecated
    public static final int LOCK_UI_POWER_BUTTON = 4;
    public static final java.lang.String PINPAD_SERVICE_NAME = null;
    public static final int STATUS_OFF = 0;
    public static final int STATUS_ON = 1;
    public static final int STATUS_UNKNOWN = -1;

    PinpadManager() {
        throw new java.lang.RuntimeException("Stub!");
    }

    public static com.android.pinpad.PinpadManager getInstance(android.content.Context context) {
        throw new java.lang.RuntimeException("Stub!");
    }

    public void turnOn() {
        throw new java.lang.RuntimeException("Stub!");
    }

    public int getStatus() {
        throw new java.lang.RuntimeException("Stub!");
    }

    public com.android.pinpad.Information getInformation() {
        throw new java.lang.RuntimeException("Stub!");
    }

    public com.android.pinpad.PinpadSocket openPinpad() {
        throw new java.lang.RuntimeException("Stub!");
    }

    @java.lang.Deprecated
    public void lockUiInTransaction(int i) {
        throw new java.lang.RuntimeException("Stub!");
    }

    @java.lang.Deprecated
    public void lockUiInTransaction(com.android.pinpad.UiLock uiLock) {
        throw new java.lang.RuntimeException("Stub!");
    }

    @java.lang.Deprecated
    public void setLedLightsVisibility(boolean z) {
        throw new java.lang.RuntimeException("Stub!");
    }

    public com.android.pinpad.PaymentFlowManager getPaymentFlowManager() {
        throw new java.lang.RuntimeException("Stub!");
    }
}
