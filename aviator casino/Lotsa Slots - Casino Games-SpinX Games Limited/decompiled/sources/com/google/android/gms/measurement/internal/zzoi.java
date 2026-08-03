package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzoi extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzoj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzoi(com.google.android.gms.measurement.internal.zzoj zzojVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zzojVar);
        this.zza = zzojVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        com.google.android.gms.measurement.internal.zzoj zzojVar = this.zza;
        zzojVar.zzd();
        zzojVar.zzu.zzaV().zzk().zza("Starting upload from DelayedRunnable");
        zzojVar.zzg.zzM();
    }
}
