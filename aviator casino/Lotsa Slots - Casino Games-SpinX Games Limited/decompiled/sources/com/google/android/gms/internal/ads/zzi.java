package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzi {
    public static final com.google.android.gms.internal.ads.zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.ads.zzh zzhVar = new com.google.android.gms.internal.ads.zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        com.google.android.gms.internal.ads.zzh zzhVar2 = new com.google.android.gms.internal.ads.zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
    }

    /* synthetic */ zzi(int i, int i2, int i3, byte[] bArr, int i4, int i5, byte[] bArr2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zza(com.google.android.gms.internal.ads.zzi zziVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (zziVar == null) {
            return true;
        }
        int i5 = zziVar.zzb;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = zziVar.zzc) == -1 || i == 2) && (((i2 = zziVar.zzd) == -1 || i2 == 3) && zziVar.zze == null && (((i3 = zziVar.zzg) == -1 || i3 == 8) && ((i4 = zziVar.zzf) == -1 || i4 == 8)));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int zzc(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static java.lang.String zzh(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i);
        return sb.toString();
    }

    private static java.lang.String zzi(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q;
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i);
        return sb.toString();
    }

    private static java.lang.String zzj(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzi zziVar = (com.google.android.gms.internal.ads.zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && java.util.Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((this.zzb + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31) + java.util.Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        java.lang.String zzh = zzh(this.zzb);
        java.lang.String zzj = zzj(i3);
        java.lang.String zzi = zzi(i2);
        java.lang.String str2 = "NA";
        if (i != -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 8);
            sb.append(i);
            sb.append("bit Luma");
            str = sb.toString();
        } else {
            str = "NA";
        }
        int i4 = this.zzg;
        if (i4 != -1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 10);
            sb2.append(i4);
            sb2.append("bit Chroma");
            str2 = sb2.toString();
        }
        boolean z = this.zze != null;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(zzh.length() + 12 + zzj.length() + 2 + zzi.length() + 2 + java.lang.String.valueOf(z).length() + 2 + str.length() + 2 + str2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(zzh);
        sb3.append(", ");
        sb3.append(zzj);
        sb3.append(", ");
        sb3.append(zzi);
        sb3.append(", ");
        sb3.append(z);
        sb3.append(", ");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public final com.google.android.gms.internal.ads.zzh zzd() {
        return new com.google.android.gms.internal.ads.zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final java.lang.String zzg() {
        java.lang.String str;
        java.lang.String str2;
        if (zzf()) {
            java.lang.Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
            str = java.lang.String.format(java.util.Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i = this.zzf;
            int i2 = this.zzg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(i2).length());
            sb.append(i);
            sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
            sb.append(i2);
            str2 = sb.toString();
        } else {
            str2 = "NA/NA";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + str2.length());
        sb2.append(str);
        sb2.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
        sb2.append(str2);
        return sb2.toString();
    }
}
