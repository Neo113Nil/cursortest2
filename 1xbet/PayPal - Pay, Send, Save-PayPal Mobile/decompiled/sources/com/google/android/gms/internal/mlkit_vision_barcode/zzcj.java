package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzcj {
    static int zza(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        zze(r12, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r13[r5] = (r13[r5] & r4) | (r7 & r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzb(@javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2, int i, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, @javax.annotation.CheckForNull java.lang.Object[] objArr2) {
        int zza = com.google.android.gms.internal.mlkit_vision_barcode.zzck.zza(obj);
        int i2 = zza & i;
        int zzc = zzc(obj3, i2);
        if (zzc != 0) {
            int i3 = ~i;
            int i4 = -1;
            while (true) {
                int i5 = zzc - 1;
                int i6 = iArr[i5];
                int i7 = i6 & i;
                if ((i6 & i3) != (zza & i3) || !com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(obj, objArr[i5]) || (objArr2 != null && !com.google.android.gms.internal.mlkit_vision_barcode.zzax.zza(obj2, objArr2[i5]))) {
                    if (i7 == 0) {
                        break;
                    }
                    i4 = i5;
                    zzc = i7;
                }
            }
        }
        return -1;
    }

    static int zzc(java.lang.Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    static java.lang.Object zzd(int i) {
        if (i >= 2 && i <= 1073741824 && java.lang.Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new java.lang.IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    static void zze(java.lang.Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
