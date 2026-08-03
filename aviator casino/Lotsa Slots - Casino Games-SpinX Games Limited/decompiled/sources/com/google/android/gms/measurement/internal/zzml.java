package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzml extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzml(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zza;
        zznkVar.zzg();
        if (zznkVar.zzh()) {
            zznkVar.zzu.zzaV().zzk().zza("Inactivity, disconnecting from the service");
            zznkVar.zzM();
        }
    }
}
