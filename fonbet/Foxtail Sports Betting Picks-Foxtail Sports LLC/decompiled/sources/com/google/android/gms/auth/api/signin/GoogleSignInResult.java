package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public class GoogleSignInResult implements Result {
    private Status mStatus;
    private GoogleSignInAccount zzbs;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.zzbs = googleSignInAccount;
        this.mStatus = status;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.zzbs;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}
