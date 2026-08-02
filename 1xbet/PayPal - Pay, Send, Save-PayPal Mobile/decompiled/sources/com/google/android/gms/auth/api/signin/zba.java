package com.google.android.gms.auth.api.signin;

/* loaded from: classes8.dex */
final class zba implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.auth.api.signin.GoogleSignInResult) result).getSignInAccount();
    }

    /* synthetic */ zba(byte[] bArr) {
    }

    private zba() {
        throw null;
    }
}
