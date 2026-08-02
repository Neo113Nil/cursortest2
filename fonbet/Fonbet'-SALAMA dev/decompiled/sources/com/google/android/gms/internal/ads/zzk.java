package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
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
        return i7 != -1 ? i7 != 1 ? i7 != 2 ? k.d(i7, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzi(int i7) {
        return i7 != -1 ? i7 != 6 ? i7 != 1 ? i7 != 2 ? k.d(i7, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzj(int i7) {
        return i7 != -1 ? i7 != 10 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 6 ? i7 != 7 ? k.d(i7, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
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
        int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i7 = this.zzf;
        int i8 = this.zzd;
        int i9 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh = zzh(i9);
        String zzj = zzj(i8);
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
        StringBuilder l7 = k.l("ColorInfo(", zzi, ", ", zzh, ", ");
        l7.append(zzj);
        l7.append(", ");
        l7.append(z4);
        l7.append(", ");
        l7.append(str);
        l7.append(", ");
        l7.append(str2);
        l7.append(")");
        return l7.toString();
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String zzi = zzi(this.zzb);
            String zzh = zzh(this.zzc);
            String zzj = zzj(this.zzd);
            int i7 = zzen.zza;
            Locale locale = Locale.US;
            str = zzi + "/" + zzh + "/" + zzj;
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
