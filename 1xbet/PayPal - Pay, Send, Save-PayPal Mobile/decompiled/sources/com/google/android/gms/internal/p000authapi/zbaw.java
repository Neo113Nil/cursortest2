package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbaw {
    private static final java.security.SecureRandom zba = new java.security.SecureRandom();

    public static java.lang.String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
