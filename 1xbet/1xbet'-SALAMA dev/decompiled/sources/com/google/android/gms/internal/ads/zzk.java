package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zziVar = new zzi();
        zziVar.zzc(1);
        zziVar.zzb(2);
        zziVar.zzd(3);
        zza = zziVar.zzg();
        zzi zziVar2 = new zzi();
        zziVar2.zzc(1);
        zziVar2.zzb(1);
        zziVar2.zzd(2);
        zziVar2.zzg();
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzk(int i7, int i8, int i9, byte[] bArr, int i10, int i11, zzj zzjVar) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = bArr;
        this.zzf = i10;
        this.zzg = i11;
    }

    public static int zza(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(zzk zzkVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (zzkVar == null) {
            return true;
        }
        int i11 = zzkVar.zzb;
        return (i11 == -1 || i11 == 1 || i11 == 2) && ((i7 = zzkVar.zzc) == -1 || i7 == 2) && (((i8 = zzkVar.zzd) == -1 || i8 == 3) && zzkVar.zze == null && (((i9 = zzkVar.zzg) == -1 || i9 == 8) && ((i10 = zzkVar.zzf) == -1 || i10 == 8)));
    }

    private static String zzh(int i7) {
        if (i7 == -1) {
            return "Unset color range";
        }
        if (i7 != 1) {
            return i7 != 2 ? k.d(i7, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    private static String zzi(int i7) {
        if (i7 == -1) {
            return "Unset color space";
        }
        if (i7 == 6) {
            return "BT2020";
        }
        if (i7 != 1) {
            return i7 != 2 ? k.d(i7, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    private static String zzj(int i7) {
        if (i7 == -1) {
            return "Unset color transfer";
        }
        if (i7 == 10) {
            return "Gamma 2.2";
        }
        if (i7 == 1) {
            return "Linear";
        }
        if (i7 == 2) {
            return "sRGB";
        }
        if (i7 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i7 != 6) {
            return i7 != 7 ? k.d(i7, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            zzk zzkVar = (zzk) obj;
            if (this.zzb == zzkVar.zzb && this.zzc == zzkVar.zzc && this.zzd == zzkVar.zzd && Arrays.equals(this.zze, zzkVar.zze) && this.zzf == zzkVar.zzf && this.zzg == zzkVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzh;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i7 = this.zzf;
        int i8 = this.zzd;
        int i9 = this.zzc;
        String strZzi = zzi(this.zzb);
        String strZzh = zzh(i9);
        String strZzj = zzj(i8);
        String str2 = "NA";
        if (i7 != -1) {
            str = i7 + "bit Luma";
        } else {
            str = "NA";
        }
        int i10 = this.zzg;
        if (i10 != -1) {
            str2 = i10 + "bit Chroma";
        }
        boolean z4 = this.zze != null;
        StringBuilder sbL = k.l("ColorInfo(", strZzi, ", ", strZzh, ", ");
        sbL.append(strZzj);
        sbL.append(", ");
        sbL.append(z4);
        sbL.append(", ");
        sbL.append(str);
        sbL.append(", ");
        sbL.append(str2);
        sbL.append(")");
        return sbL.toString();
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String strZzi = zzi(this.zzb);
            String strZzh = zzh(this.zzc);
            String strZzj = zzj(this.zzd);
            int i7 = zzen.zza;
            Locale locale = Locale.US;
            str = strZzi + "/" + strZzh + "/" + strZzj;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return k.f(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
