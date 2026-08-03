package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzbf implements com.google.android.gms.internal.measurement.zzbe {
    private final com.google.android.gms.internal.measurement.zzg zza;
    private final java.lang.String zzb;

    public zzbf(com.google.android.gms.internal.measurement.zzg zzgVar, java.lang.String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final com.google.android.gms.internal.measurement.zzg zza(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        zzgVar.zzf(this.zzb, zzaoVar);
        return zzgVar;
    }
}
