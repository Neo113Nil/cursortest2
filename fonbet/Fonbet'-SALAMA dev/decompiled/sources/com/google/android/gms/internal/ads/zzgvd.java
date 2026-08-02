package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgvd {
    private final byte[] zza;

    private zzgvd(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public static zzgvd zzb(byte[] bArr) {
        if (bArr != null) {
            return zzc(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzgvd zzc(byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i8 > length) {
            i8 = length;
        }
        return new zzgvd(bArr, 0, i8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgvd) {
            return Arrays.equals(((zzgvd) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b7 : bArr) {
            sb.append("0123456789abcdef".charAt((b7 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b7 & 15));
        }
        return AbstractC0486a1.h("Bytes(", sb.toString(), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
