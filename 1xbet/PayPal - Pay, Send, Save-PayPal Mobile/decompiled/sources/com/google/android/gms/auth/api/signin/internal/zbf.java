package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
final class zbf extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ android.content.Context zba;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbg zbc;

    zbf(com.google.android.gms.auth.api.signin.internal.zbg zbgVar, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        this.zba = context;
        this.zbb = googleSignInOptions;
        java.util.Objects.requireNonNull(zbgVar);
        this.zbc = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        if (googleSignInAccount != null) {
            android.content.Context context = this.zba;
            com.google.android.gms.auth.api.signin.internal.zbn.zba(context).zbc(this.zbb, googleSignInAccount);
        }
        this.zbc.setResult((com.google.android.gms.auth.api.signin.internal.zbg) new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status));
    }
}
