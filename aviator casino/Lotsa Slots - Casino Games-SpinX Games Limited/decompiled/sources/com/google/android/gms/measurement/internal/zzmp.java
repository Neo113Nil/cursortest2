package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmp extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmp(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zznkVar);
        this.zza = zznkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        this.zza.zzu.zzaV().zze().zza("Tasks have been queued for a long time");
    }
}
