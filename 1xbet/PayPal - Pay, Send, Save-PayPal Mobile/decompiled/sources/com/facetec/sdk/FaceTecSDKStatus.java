package com.facetec.sdk;

/* loaded from: classes8.dex */
public enum FaceTecSDKStatus {
    NEVER_INITIALIZED("Initialize was never attempted."),
    INITIALIZED("Initialized successfully."),
    NETWORK_ISSUES("Initialize failed due to network issues."),
    INVALID_DEVICE_KEY_IDENTIFIER("The Device Key Identifier provided was invalid."),
    VERSION_DEPRECATED("Current version of SDK is deprecated."),
    DEVICE_NOT_SUPPORTED("The device is incompatible with the SDK."),
    DEVICE_IN_LANDSCAPE_MODE("The device is in landscape mode."),
    DEVICE_IN_REVERSE_PORTRAIT_MODE("Device is in reverse portrait display orientation. FaceTec SDK can only be used in portrait display orientation."),
    DEVICE_LOCKED_OUT("Device is locked out due to too many failures"),
    KEY_EXPIRED_OR_INVALID("Key was expired, contained invalid text, or you are attempting to initialize in an App that is not specified in your key."),
    ENCRYPTION_KEY_INVALID("Encryption key is invalid or missing.");


    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3369a;

    FaceTecSDKStatus(java.lang.String str) {
        this.f3369a = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f3369a;
    }
}
