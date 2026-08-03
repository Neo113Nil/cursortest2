package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzmo {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static {
        java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
        zza = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        zzb = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.measurement.zzli.zza;
        try {
            new com.google.android.gms.internal.measurement.zzlh(bArr, 0, 0, false, null).zza(0);
        } catch (com.google.android.gms.internal.measurement.zzmq e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    static java.lang.Object zza(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("messageType");
    }

    public static int zzb(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzc(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean zzd(com.google.android.gms.internal.measurement.zznl zznlVar) {
        if (!(zznlVar instanceof com.google.android.gms.internal.measurement.zzks)) {
            return false;
        }
        throw null;
    }
}
