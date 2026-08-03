package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzey extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzco zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfa zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(com.google.android.gms.internal.measurement.zzfa zzfaVar, android.app.Activity activity, com.google.android.gms.internal.measurement.zzco zzcoVar) {
        super(zzfaVar.zza, true);
        this.zza = activity;
        this.zzb = zzcoVar;
        java.util.Objects.requireNonNull(zzfaVar);
        this.zzc = zzfaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzQ())).onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(this.zza), this.zzb, this.zzi);
    }
}
