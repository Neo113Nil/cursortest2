package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class GoogleSignInResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zba;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;

    public boolean isSuccess() {
        return this.zba.isSuccess();
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zba;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    public GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) {
        this.zbb = googleSignInAccount;
        this.zba = status;
    }
}
