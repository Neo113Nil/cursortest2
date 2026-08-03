package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzep extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ java.lang.Long zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzep(com.google.android.gms.internal.measurement.zzfb zzfbVar, java.lang.Long l, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2) {
        super(zzfbVar, true);
        this.zza = l;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z2;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        java.lang.Long l = this.zza;
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l == null ? this.zzh : l.longValue());
    }
}
