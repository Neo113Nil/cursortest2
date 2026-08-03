package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdq extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdq(com.google.android.gms.internal.measurement.zzfb zzfbVar, long j) {
        super(zzfbVar, true);
        this.zza = j;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzQ())).setSessionTimeoutDuration(this.zza);
    }
}
