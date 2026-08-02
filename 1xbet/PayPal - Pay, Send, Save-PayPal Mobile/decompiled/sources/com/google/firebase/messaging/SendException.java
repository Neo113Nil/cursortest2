package com.google.firebase.messaging;

/* loaded from: classes4.dex */
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

    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseErrorCode(java.lang.String str) {
        char c;
        if (str == null) {
            return 0;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 3;
        }
        if (c == 1) {
            return 4;
        }
        if (c != 2) {
            if (c == 3) {
                return 2;
            }
            if (c != 4) {
                return 0;
            }
        }
        return 1;
    }
}
