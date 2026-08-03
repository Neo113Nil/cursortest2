package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzqs {
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("UTF-8");
    public static final byte[] zzb;

    static {
        java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.consent_sdk.zzpp.zza;
        try {
            new com.google.android.gms.internal.consent_sdk.zzpn(bArr, 0, 0, false, null).zza(0);
        } catch (com.google.android.gms.internal.consent_sdk.zzqu e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
