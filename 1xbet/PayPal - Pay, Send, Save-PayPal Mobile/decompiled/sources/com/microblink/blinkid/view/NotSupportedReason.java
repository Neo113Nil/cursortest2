package com.microblink.blinkid.view;

/* loaded from: classes.dex */
public enum NotSupportedReason {
    UNSUPPORTED_ANDROID_VERSION("Current Android version is not supported. SDK requires newer version of Android."),
    NO_CAMERA("Device does not have camera."),
    BLACKLISTED_DEVICE("Device is blacklisted."),
    INVALID_OR_MISSING_LICENSE("Entered license is invalid."),
    CUSTOM_UI_FORBIDDEN("Entered license does not allow using SDK outside of default provided activities."),
    UNSUPPORTED_PROCESSOR_ARCHITECTURE("Device CPU has incompatible architecture.");

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    NotSupportedReason(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final java.lang.String getDescription() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
