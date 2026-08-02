package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzgxt {
    static final Charset zza;
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        zzgwe.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zzb(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
