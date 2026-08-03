package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjr {
    final android.content.Context zza;
    java.lang.Boolean zzb;
    long zzc;
    com.google.android.gms.internal.measurement.zzdd zzd;
    boolean zze;
    final java.lang.Long zzf;
    java.lang.String zzg;

    public zzjr(android.content.Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, java.lang.Long l) {
        this.zze = true;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzf = l;
        if (zzddVar != null) {
            this.zzd = zzddVar;
            this.zze = zzddVar.zzc;
            this.zzc = zzddVar.zzb;
            this.zzg = zzddVar.zze;
            android.os.Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.zzb = java.lang.Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
