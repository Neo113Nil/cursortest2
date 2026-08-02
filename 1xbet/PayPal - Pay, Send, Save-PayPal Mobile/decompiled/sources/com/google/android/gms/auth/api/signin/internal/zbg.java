package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
final class zbg extends com.google.android.gms.auth.api.signin.internal.zbl {
    final /* synthetic */ android.content.Context zba;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbg(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.zba = context;
        this.zbb = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.auth.api.signin.internal.zbs zbsVar = (com.google.android.gms.auth.api.signin.internal.zbs) ((com.google.android.gms.auth.api.signin.internal.zbe) anyClient).getService();
        android.content.Context context = this.zba;
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = this.zbb;
        zbsVar.zbc(new com.google.android.gms.auth.api.signin.internal.zbf(this, context, googleSignInOptions), googleSignInOptions);
    }
}
