package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
final class zbj extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbk zba;

    zbj(com.google.android.gms.auth.api.signin.internal.zbk zbkVar) {
        this.zba = zbkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zba.setResult((com.google.android.gms.auth.api.signin.internal.zbk) status);
    }
}
