package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfb {
    public static final void zza(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 13 + java.lang.String.valueOf(j2).length() + 11 + java.lang.String.valueOf(j3).length());
            sb.append("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean zzb(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.String zzc(int i) {
        int i2 = 0;
        char[] cArr = {com.google.android.libraries.places.internal.zzcga.zza()[i >> 28], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 24) & 15], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 20) & 15], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 16) & 15], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 12) & 15], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 8) & 15], com.google.android.libraries.places.internal.zzcga.zza()[(i >> 4) & 15], com.google.android.libraries.places.internal.zzcga.zza()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i2, 8);
    }
}
