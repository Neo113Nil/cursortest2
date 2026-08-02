package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfzk extends zzfzl {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i7, int i8, int i9) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int zzb(long j) {
        int i7 = (int) j;
        zzfth.zzh(((long) i7) == j, "Out of range: %s", j);
        return i7;
    }

    public static int zzc(int i7, int i8, int i9) {
        zzfth.zzj(true, "min (%s) must be less than or equal to max (%s)", i8, 1073741823);
        return Math.min(Math.max(i7, i8), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfth.zzj(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j) {
        if (j > 2147483647L) {
            return f.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static Integer zzf(String str, int i7) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i8 = charAt == '-' ? 1 : 0;
            if (i8 != str.length()) {
                int i9 = i8 + 1;
                int zza = zzfzm.zza(str.charAt(i8));
                if (zza >= 0 && zza < 10) {
                    long j = -zza;
                    while (true) {
                        if (i9 < str.length()) {
                            int i10 = i9 + 1;
                            int zza2 = zzfzm.zza(str.charAt(i9));
                            if (zza2 < 0 || zza2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j3 = j * 10;
                            long j7 = zza2;
                            if (j3 < Long.MIN_VALUE + j7) {
                                break;
                            }
                            j = j3 - j7;
                            i9 = i10;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new zzfzj(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
