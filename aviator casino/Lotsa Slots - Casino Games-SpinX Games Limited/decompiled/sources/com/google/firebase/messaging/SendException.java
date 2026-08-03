package com.google.firebase.messaging;

/* loaded from: classes3.dex */
public final class SendException extends java.lang.Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    SendException(java.lang.String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    private int parseErrorCode(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
