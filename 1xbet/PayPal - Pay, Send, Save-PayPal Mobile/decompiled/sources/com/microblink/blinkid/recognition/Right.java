package com.microblink.blinkid.recognition;

/* loaded from: classes.dex */
public enum Right {
    /* JADX INFO: Fake field, exist only in values array */
    TIMESTAMP_USED(0, "licence key is time restricted"),
    PING_USED(1, "licence key requires regular network ping"),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MULTIPLE_APPS(3, "allow using license key in multiple applications"),
    IS_TRIAL(4, "license key is trial"),
    IS_ONLINE(6, "license key is online checked"),
    ALLOW_CUSTOM_UI(10, "allow custom camera overlay when using library"),
    ALLOW_REMOVE_DEMO_OVERLAY(11, "allow removing demo overlay from RecognizerRunnerView"),
    ALLOW_REMOVE_PRODUCTION_OVERLAY(12, "allow removing production overlay from camera"),
    ALLOW_IMAGE_UPLOAD(13, "allow image upload after successful scanning"),
    ALLOW_PING_PROXY(14, "allow custom ping proxy url"),
    /* JADX INFO: Fake field, exist only in values array */
    RECOGNIZER_ALLOW_PING_PAYLOAD(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, "allow ping payload"),
    ALLOW_BALTAZAR_PROXY(com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart, "allow custom baltazar proxy url");

    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    Right(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = str;
    }

    public static com.microblink.blinkid.recognition.Right fromIntValue(int i) {
        for (com.microblink.blinkid.recognition.Right right : values()) {
            if (right.getHighSpeedVideoFpsRangesFor == i) {
                return right;
            }
        }
        return null;
    }

    public final int llIIlIlIIl() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
