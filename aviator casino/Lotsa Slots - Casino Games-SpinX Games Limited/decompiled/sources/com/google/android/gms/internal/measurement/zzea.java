package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzea extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzco zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(com.google.android.gms.internal.measurement.zzfb zzfbVar, com.google.android.gms.internal.measurement.zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = zzcoVar;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).getCurrentScreenClass(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zza.zzb(null);
    }
}
