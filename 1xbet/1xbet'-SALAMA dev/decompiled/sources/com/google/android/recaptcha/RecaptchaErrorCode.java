package com.google.android.recaptcha;

import p085l6.a;

/* JADX INFO: loaded from: classes.dex */
public enum RecaptchaErrorCode {
    UNKNOWN_ERROR(0, "Unknown Error"),
    NETWORK_ERROR(1, "Network Error"),
    INVALID_SITEKEY(2, "Site key invalid"),
    INVALID_KEYTYPE(3, "Key type invalid"),
    INVALID_PACKAGE_NAME(4, "Package name not allowed"),
    INVALID_ACTION(5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information"),
    INVALID_TIMEOUT(6, "Invalid timeout, minimum value is 5_000L milliseconds"),
    NO_NETWORK_FOUND(7, "No network found on device"),
    INTERNAL_ERROR(100, "Internal Error");

    private static final /* synthetic */ a $ENTRIES = p003a.a.T(values());
    private final int errorCode;
    private final String errorMessage;

    RecaptchaErrorCode(int i7, String str) {
        this.errorCode = i7;
        this.errorMessage = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
