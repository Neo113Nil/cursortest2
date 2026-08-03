package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzh extends com.google.android.gms.auth.api.accounttransfer.zzn {
    final /* synthetic */ com.google.android.gms.internal.auth.zzbb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, int i, com.google.android.gms.internal.auth.zzbb zzbbVar) {
        super(1609);
        this.zza = zzbbVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    protected final void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException {
        zzauVar.zze(this.zzc, this.zza);
    }
}
