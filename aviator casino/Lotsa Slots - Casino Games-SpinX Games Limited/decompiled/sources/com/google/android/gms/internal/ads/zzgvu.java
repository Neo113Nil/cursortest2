package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvu {
    static java.lang.Object zza(int i) {
        if (i >= 2 && i <= 1073741824 && java.lang.Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 41);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static int zzb(java.lang.Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    static void zzc(java.lang.Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    static int zzd(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zzc(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zze(java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int zzb = com.google.android.gms.internal.ads.zzgwf.zzb(obj);
        int i2 = zzb & i;
        int zzb2 = zzb(obj3, i2);
        if (zzb2 != 0) {
            int i3 = ~i;
            int i4 = zzb & i3;
            int i5 = -1;
            while (true) {
                int i6 = zzb2 - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !java.util.Objects.equals(obj, objArr[i6]) || (objArr2 != null && !java.util.Objects.equals(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    zzb2 = i8;
                }
            }
        }
        return -1;
    }
}
