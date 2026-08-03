package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdh extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(com.google.android.gms.internal.measurement.zzfb zzfbVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzQ())).setUserProperty(this.zza, this.zzb, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd, this.zzh);
    }
}
