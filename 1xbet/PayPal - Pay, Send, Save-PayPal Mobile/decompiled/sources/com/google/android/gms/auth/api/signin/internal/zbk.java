package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
final class zbk extends com.google.android.gms.auth.api.signin.internal.zbl {
    zbk(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.auth.api.signin.internal.zbe zbeVar = (com.google.android.gms.auth.api.signin.internal.zbe) anyClient;
        ((com.google.android.gms.auth.api.signin.internal.zbs) zbeVar.getService()).zbe(new com.google.android.gms.auth.api.signin.internal.zbj(this), zbeVar.zba());
    }
}
