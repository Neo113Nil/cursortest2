package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzkm {
    public static final byte[] zzsn;
    private static final java.nio.ByteBuffer zzso;
    private static final com.google.android.gms.internal.drive.zzjo zzsp;
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);

    public static int zze(boolean z) {
        return z ? 1231 : 1237;
    }

    static boolean zzf(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        return false;
    }

    public static int zzu(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    static <T> T zza(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static boolean zzd(byte[] bArr) {
        return com.google.android.gms.internal.drive.zznf.zzd(bArr);
    }

    public static java.lang.String zze(byte[] bArr) {
        return new java.lang.String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static java.lang.Object zza(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.drive.zzlq) obj).zzcy().zza((com.google.android.gms.internal.drive.zzlq) obj2).zzde();
    }

    static {
        byte[] bArr = new byte[0];
        zzsn = bArr;
        zzso = java.nio.ByteBuffer.wrap(bArr);
        zzsp = com.google.android.gms.internal.drive.zzjo.zza(bArr, 0, bArr.length, false);
    }
}
