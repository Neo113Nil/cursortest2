package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkv {
    public int zza;
    public long zzb;
    public java.lang.Object zzc;
    public final com.google.android.gms.internal.measurement.zzlq zzd;
    public int zze;

    zzkv() {
        int i = com.google.android.gms.internal.measurement.zzlq.zzb;
        int i2 = com.google.android.gms.internal.measurement.zznt.zza;
        this.zzd = com.google.android.gms.internal.measurement.zzlq.zza;
    }

    static /* synthetic */ java.lang.String zza(int i, int i2, byte b, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + b + java.lang.String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    zzkv(com.google.android.gms.internal.measurement.zzlq zzlqVar) {
        zzlqVar.getClass();
        this.zzd = zzlqVar;
    }
}
