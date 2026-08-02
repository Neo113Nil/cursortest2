package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
final class zzg extends com.google.android.gms.auth.api.accounttransfer.zzl {
    final /* synthetic */ com.google.android.gms.internal.auth.zzaq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzg(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, int i, com.google.android.gms.internal.auth.zzaq zzaqVar) {
        super(1608, null);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException {
        zzauVar.zzd(new com.google.android.gms.auth.api.accounttransfer.zzf(this, this), this.zza);
    }
}
