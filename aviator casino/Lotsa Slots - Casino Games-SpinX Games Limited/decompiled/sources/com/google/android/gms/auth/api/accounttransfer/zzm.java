package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzm extends com.google.android.gms.internal.auth.zzan {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzn zza;

    zzm(com.google.android.gms.auth.api.accounttransfer.zzn zznVar) {
        this.zza = zznVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status status) {
        this.zza.zzb.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zze() {
        this.zza.zzb.setResult(null);
    }
}
