package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzbd implements com.google.android.gms.internal.measurement.zzbe {
    private final com.google.android.gms.internal.measurement.zzg zza;
    private final java.lang.String zzb;

    public zzbd(com.google.android.gms.internal.measurement.zzg zzgVar, java.lang.String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final com.google.android.gms.internal.measurement.zzg zza(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzg zzc = this.zza.zzc();
        zzc.zzf(this.zzb, zzaoVar);
        return zzc;
    }
}
