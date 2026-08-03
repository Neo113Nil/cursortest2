package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbg {
    public final int zza;
    public final java.lang.String zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzv[] zzd;
    private int zze;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
    }

    public zzbg(java.lang.String str, com.google.android.gms.internal.ads.zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i = 1;
        com.google.android.gms.internal.ads.zzgtj.zza(length > 0);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        java.lang.String str2 = zzvVarArr[0].zzp;
        this.zzc = android.text.TextUtils.isEmpty(str2) ? com.google.android.gms.internal.ads.zzas.zzf(zzvVarArr[0].zzo) : com.google.android.gms.internal.ads.zzas.zzf(str2);
        com.google.android.gms.internal.ads.zzv zzvVar = zzvVarArr[0];
        java.lang.String zzc = zzc(zzvVar.zzd);
        int i2 = zzvVar.zzf | 16384;
        while (true) {
            com.google.android.gms.internal.ads.zzv[] zzvVarArr2 = this.zzd;
            if (i >= zzvVarArr2.length) {
                return;
            }
            com.google.android.gms.internal.ads.zzv zzvVar2 = zzvVarArr2[i];
            java.lang.String str3 = zzvVar2.zzd;
            if (!zzc.equals(zzc(str3))) {
                zzd("languages", zzvVarArr2[0].zzd, str3, i);
                return;
            } else {
                if (i2 != (zzvVar2.zzf | 16384)) {
                    zzd("role flags", java.lang.Integer.toBinaryString(zzvVarArr2[0].zzf), java.lang.Integer.toBinaryString(this.zzd[i].zzf), i);
                    return;
                }
                i++;
            }
        }
    }

    private static java.lang.String zzc(java.lang.String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        int length = java.lang.String.valueOf(str2).length();
        int length2 = java.lang.String.valueOf(str3).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + java.lang.String.valueOf(i).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        com.google.android.gms.internal.ads.zzeg.zzf("TrackGroup", "", new java.lang.IllegalStateException(sb.toString()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbg zzbgVar = (com.google.android.gms.internal.ads.zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && java.util.Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zzb.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.util.Arrays.hashCode(this.zzd);
        this.zze = hashCode;
        return hashCode;
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.zzd);
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2 + java.lang.String.valueOf(arrays).length());
        sb.append(str);
        sb.append(": ");
        sb.append(arrays);
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzv zza(int i) {
        return this.zzd[i];
    }

    public final int zzb(com.google.android.gms.internal.ads.zzv zzvVar) {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzv[] zzvVarArr = this.zzd;
            if (i >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
