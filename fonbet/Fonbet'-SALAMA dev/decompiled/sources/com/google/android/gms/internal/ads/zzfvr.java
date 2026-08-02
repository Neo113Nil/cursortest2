package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzfvr {
    public static int zza(int i7) {
        return (i7 + 1) * (i7 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zze(r11, r1, r7);
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
    public static int zzb(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zzb = zzfvz.zzb(obj);
        int i8 = zzb & i7;
        int zzc = zzc(obj3, i8);
        if (zzc != 0) {
            int i9 = ~i7;
            int i10 = zzb & i9;
            int i11 = -1;
            while (true) {
                int i12 = zzc - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i7;
                if ((i13 & i9) != i10 || !zzfte.zza(obj, objArr[i12]) || (objArr2 != null && !zzfte.zza(obj2, objArr2[i12]))) {
                    if (i14 == 0) {
                        break;
                    }
                    i11 = i12;
                    zzc = i14;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i7) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    public static Object zzd(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(k.d(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static void zze(Object obj, int i7, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }
}
