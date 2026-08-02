package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
final class zbj extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbk zba;

    zbj(com.google.android.gms.auth.api.signin.internal.zbk zbkVar) {
        java.util.Objects.requireNonNull(zbkVar);
        this.zba = zbkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zba.setResult((com.google.android.gms.auth.api.signin.internal.zbk) status);
    }
}
