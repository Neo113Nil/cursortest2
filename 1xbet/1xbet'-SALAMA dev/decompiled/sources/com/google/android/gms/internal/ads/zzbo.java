package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzz[] zzd;
    private int zze;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbo(String str, zzz... zzzVarArr) {
        int length = zzzVarArr.length;
        int i7 = 1;
        zzcv.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzzVarArr;
        this.zza = length;
        int iZzb = zzay.zzb(zzzVarArr[0].zzo);
        this.zzc = iZzb == -1 ? zzay.zzb(zzzVarArr[0].zzn) : iZzb;
        String strZzc = zzc(zzzVarArr[0].zzd);
        int i8 = zzzVarArr[0].zzf | 16384;
        while (true) {
            zzz[] zzzVarArr2 = this.zzd;
            if (i7 >= zzzVarArr2.length) {
                return;
            }
            if (!strZzc.equals(zzc(zzzVarArr2[i7].zzd))) {
                zzz[] zzzVarArr3 = this.zzd;
                zzd("languages", zzzVarArr3[0].zzd, zzzVarArr3[i7].zzd, i7);
                return;
            } else {
                zzz[] zzzVarArr4 = this.zzd;
                if (i8 != (zzzVarArr4[i7].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzzVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i7].zzf), i7);
                    return;
                }
                i7++;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i7) {
        StringBuilder sbL = k.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbL.append(str3);
        sbL.append("' (track ");
        sbL.append(i7);
        sbL.append(")");
        zzdq.zzd("TrackGroup", "", new IllegalStateException(sbL.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbo.class == obj.getClass()) {
            zzbo zzboVar = (zzbo) obj;
            if (this.zzb.equals(zzboVar.zzb) && Arrays.equals(this.zzd, zzboVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zze;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = this.zzb.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzd) + (iHashCode * 31);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    public final int zza(zzz zzzVar) {
        int i7 = 0;
        while (true) {
            zzz[] zzzVarArr = this.zzd;
            if (i7 >= zzzVarArr.length) {
                return -1;
            }
            if (zzzVar == zzzVarArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final zzz zzb(int i7) {
        return this.zzd[i7];
    }
}
