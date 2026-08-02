package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class GoogleSignInStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 12501;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 12502;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        switch (i) {
            case SIGN_IN_FAILED /* 12500 */:
                return "A non-recoverable sign in failure occurred";
            case SIGN_IN_CANCELLED /* 12501 */:
                return "Sign in action cancelled";
            case SIGN_IN_CURRENTLY_IN_PROGRESS /* 12502 */:
                return "Sign-in in progress";
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
