package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzeb extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzco zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(com.google.android.gms.internal.measurement.zzfb zzfbVar, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zzcoVar;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzQ())).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zzd.zzb(null);
    }
}
