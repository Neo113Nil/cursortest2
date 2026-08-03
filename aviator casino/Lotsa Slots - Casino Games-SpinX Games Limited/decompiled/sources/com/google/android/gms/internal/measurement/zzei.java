package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzei extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzco zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzei(com.google.android.gms.internal.measurement.zzfb zzfbVar, com.google.android.gms.internal.measurement.zzco zzcoVar, int i) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        this.zzb = i;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzQ())).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
