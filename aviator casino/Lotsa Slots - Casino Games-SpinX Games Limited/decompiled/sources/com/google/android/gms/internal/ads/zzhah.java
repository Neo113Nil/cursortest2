package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhah extends com.google.android.gms.internal.ads.zzhai {
    public static int zza(long j) {
        int i = (int) j;
        com.google.android.gms.internal.ads.zzgtj.zze(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int zzb(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int zzc(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzgtj.zzg(true, "min (%s) must be less than or equal to max (%s)", i2, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return java.lang.Math.min(java.lang.Math.max(i, i2), kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        com.google.android.gms.internal.ads.zzgtj.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b, byte b2, byte b3, byte b4) {
        return (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int[] zzf(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.ads.zzhag) {
            com.google.android.gms.internal.ads.zzhag zzhagVar = (com.google.android.gms.internal.ads.zzhag) collection;
            return java.util.Arrays.copyOfRange(zzhagVar.zza, zzhagVar.zzb, zzhagVar.zzc);
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            obj.getClass();
            iArr[i] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    public static java.util.List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? java.util.Collections.emptyList() : new com.google.android.gms.internal.ads.zzhag(iArr, 0, length);
    }

    static /* synthetic */ int zzi(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static java.lang.Integer zzh(java.lang.String str, int i) {
        java.lang.Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i2 = charAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int zza = com.google.android.gms.internal.ads.zzhaj.zza(str.charAt(i2));
                if (zza >= 0 && zza < 10) {
                    long j = -zza;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int zza2 = com.google.android.gms.internal.ads.zzhaj.zza(str.charAt(i3));
                            if (zza2 < 0 || zza2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = zza2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i3 = i4;
                        } else if (charAt == '-') {
                            valueOf = java.lang.Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = java.lang.Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(valueOf.intValue());
    }
}
