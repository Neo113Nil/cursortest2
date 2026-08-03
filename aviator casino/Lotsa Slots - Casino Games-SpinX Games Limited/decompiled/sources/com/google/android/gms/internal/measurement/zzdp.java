package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdp extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdp(com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        super(zzfbVar, true);
        java.util.Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.zzQ())).resetAnalyticsData(this.zzh);
    }
}
