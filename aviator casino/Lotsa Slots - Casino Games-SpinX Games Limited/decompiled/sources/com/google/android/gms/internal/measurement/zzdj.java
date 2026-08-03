package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdj extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.os.Bundle zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(com.google.android.gms.internal.measurement.zzfb zzfbVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzQ())).clearConditionalUserProperty(this.zza, this.zzb, this.zzc);
    }
}
