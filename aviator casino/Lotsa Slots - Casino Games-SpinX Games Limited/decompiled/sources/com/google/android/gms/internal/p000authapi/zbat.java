package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbat {
    private static final java.security.SecureRandom zba = new java.security.SecureRandom();

    public static java.lang.String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
