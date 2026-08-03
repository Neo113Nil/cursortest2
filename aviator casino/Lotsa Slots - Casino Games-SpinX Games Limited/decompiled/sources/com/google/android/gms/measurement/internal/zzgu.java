package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgu {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final android.os.Bundle zzd;

    public zzgu(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static com.google.android.gms.measurement.internal.zzgu zza(com.google.android.gms.measurement.internal.zzbg zzbgVar) {
        return new com.google.android.gms.measurement.internal.zzgu(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        java.lang.String obj = this.zzd.toString();
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 13 + java.lang.String.valueOf(str2).length() + 8 + obj.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(obj);
        return sb.toString();
    }

    public final com.google.android.gms.measurement.internal.zzbg zzb() {
        return new com.google.android.gms.measurement.internal.zzbg(this.zza, new com.google.android.gms.measurement.internal.zzbe(new android.os.Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
