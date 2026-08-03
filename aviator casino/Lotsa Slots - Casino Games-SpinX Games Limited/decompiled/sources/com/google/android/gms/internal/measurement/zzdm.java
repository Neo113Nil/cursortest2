package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdm extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzdf zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdm(com.google.android.gms.internal.measurement.zzfb zzfbVar, com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2) {
        super(zzfbVar, true);
        this.zza = zzdfVar;
        this.zzb = str;
        this.zzc = str2;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzQ())).setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
