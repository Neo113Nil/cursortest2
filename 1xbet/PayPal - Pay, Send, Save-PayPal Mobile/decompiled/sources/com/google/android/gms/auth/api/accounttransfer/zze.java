package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
final class zze extends com.google.android.gms.auth.api.accounttransfer.zzl {
    final /* synthetic */ com.google.android.gms.internal.auth.zzax zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, int i, com.google.android.gms.internal.auth.zzax zzaxVar) {
        super(1607, null);
        this.zza = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException {
        zzauVar.zzg(new com.google.android.gms.auth.api.accounttransfer.zzd(this, this), this.zza);
    }
}
