package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
abstract class zzbi extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zzbi(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.AuthProxy.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzbu(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.auth.zzbe zzbeVar = (com.google.android.gms.internal.auth.zzbe) anyClient;
        zza(zzbeVar.getContext(), (com.google.android.gms.internal.auth.zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.auth.zzbi) obj);
    }

    protected abstract void zza(android.content.Context context, com.google.android.gms.internal.auth.zzbh zzbhVar) throws android.os.RemoteException;
}
