package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzag extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    final /* synthetic */ android.accounts.Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(com.google.android.gms.internal.auth.zzal zzalVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.account.zze) ((com.google.android.gms.internal.auth.zzam) anyClient).getService()).zze(new com.google.android.gms.internal.auth.zzaf(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.auth.zzag) obj);
    }
}
