package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzgq implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ java.lang.Object zzd;
    final /* synthetic */ java.lang.Object zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgt zzf;

    zzgq(com.google.android.gms.measurement.internal.zzgt zzgtVar, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        java.util.Objects.requireNonNull(zzgtVar);
        this.zzf = zzgtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzf;
        com.google.android.gms.measurement.internal.zzhg zzd = zzgtVar.zzu.zzd();
        if (!zzd.zzv()) {
            android.util.Log.println(6, zzgtVar.zzn(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzgtVar.zzr() == 0) {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzgtVar.zzu;
            if (zzibVar.zzc().zzj()) {
                zzibVar.zzaU();
                zzgtVar.zzs('C');
            } else {
                zzibVar.zzaU();
                zzgtVar.zzs('c');
            }
        }
        if (zzgtVar.zzt() < 0) {
            zzgtVar.zzu.zzc().zzi();
            zzgtVar.zzu(130000L);
        }
        int i = this.zza;
        char zzr = zzgtVar.zzr();
        long zzt = zzgtVar.zzt();
        java.lang.String str = this.zzb;
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = this.zzd;
        java.lang.Object obj3 = this.zze;
        char charAt = "01VDIWEA?".charAt(i);
        java.lang.String zzo = com.google.android.gms.measurement.internal.zzgt.zzo(true, str, obj, obj2, obj3);
        int length = java.lang.String.valueOf(charAt).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 1 + java.lang.String.valueOf(zzr).length() + java.lang.String.valueOf(zzt).length() + 1 + zzo.length());
        sb.append("2");
        sb.append(charAt);
        sb.append(zzr);
        sb.append(zzt);
        sb.append(":");
        sb.append(zzo);
        java.lang.String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = str.substring(0, 1024);
        }
        com.google.android.gms.measurement.internal.zzhe zzheVar = zzd.zzb;
        if (zzheVar != null) {
            zzheVar.zza(sb2, 1L);
        }
    }
}
