package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbeb {
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("UTF-8");
    public static final byte[] zzb;

    static {
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        com.google.android.libraries.places.internal.zzbco.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
