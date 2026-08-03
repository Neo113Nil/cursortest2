package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzda {
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    static final java.nio.charset.Charset zzb = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset zzc = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
    public static final byte[] zzd;
    public static final java.nio.ByteBuffer zze;
    public static final com.google.android.gms.internal.play_billing.zzbu zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.play_billing.zzbu.zza;
        com.google.android.gms.internal.play_billing.zzbs zzbsVar = new com.google.android.gms.internal.play_billing.zzbs(bArr, 0, 0, false, null);
        try {
            zzbsVar.zza(0);
            zzf = zzbsVar;
        } catch (com.google.android.gms.internal.play_billing.zzdc e) {
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

    static java.lang.Object zzc(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("messageType");
    }

    public static java.lang.String zzd(byte[] bArr) {
        return new java.lang.String(bArr, zzb);
    }
}
