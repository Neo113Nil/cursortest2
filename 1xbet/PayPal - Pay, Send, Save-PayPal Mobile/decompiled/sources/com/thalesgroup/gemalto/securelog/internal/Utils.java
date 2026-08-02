package com.thalesgroup.gemalto.securelog.internal;

/* loaded from: classes16.dex */
public final class Utils {
    public static void verifyParam(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Param can not be null or empty!");
        }
    }

    public static void verifyParam(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Param can not be null or empty!");
        }
    }

    public static void verifyParam(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Param can not be null or empty!");
        }
    }
}
