package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzee extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzco zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(com.google.android.gms.internal.measurement.zzfb zzfbVar, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = bundle;
        this.zzb = zzcoVar;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).performAction(this.zza, this.zzb, this.zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zzb.zzb(null);
    }
}
