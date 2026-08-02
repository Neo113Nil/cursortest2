package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    SendException(String str) {
        super(str);
        int i = 4;
        if (str != null) {
            switch (str.toLowerCase(Locale.US)) {
                case "invalid_parameters":
                case "missing_to":
                    i = 1;
                    break;
                case "messagetoobig":
                    i = 2;
                    break;
                case "service_not_available":
                    i = 3;
                    break;
            }
            this.errorCode = i;
        }
        i = 0;
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
