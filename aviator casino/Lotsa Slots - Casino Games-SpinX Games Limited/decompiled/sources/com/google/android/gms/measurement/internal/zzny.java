package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzny extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzny(com.google.android.gms.measurement.internal.zznz zznzVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zznzVar);
        this.zza = zznzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        com.google.android.gms.measurement.internal.zznz zznzVar = this.zza;
        com.google.android.gms.measurement.internal.zzob zzobVar = zznzVar.zzc;
        zzobVar.zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
        zznzVar.zzd(false, false, zzibVar.zzaZ().elapsedRealtime());
        zzobVar.zzu.zzw().zzc(zzibVar.zzaZ().elapsedRealtime());
    }
}
