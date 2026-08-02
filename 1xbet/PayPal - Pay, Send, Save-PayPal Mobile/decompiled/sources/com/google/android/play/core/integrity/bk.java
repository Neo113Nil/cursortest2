package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bk extends com.google.android.play.core.integrity.bi {
    final /* synthetic */ com.google.android.play.core.integrity.bn c;
    private final com.google.android.play.integrity.internal.s d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.integrity.k kVar;
        java.lang.String str;
        super.c(bundle);
        this.d.d("onRequestExpressIntegrityToken", new java.lang.Object[0]);
        kVar = this.c.f;
        com.google.android.gms.common.api.ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.f3814a.trySetException(a2);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.c.c;
        com.google.android.play.core.integrity.bj bjVar = new com.google.android.play.core.integrity.bj(this, str, j);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.f3814a;
        com.google.android.play.core.integrity.b bVar = new com.google.android.play.core.integrity.b();
        bVar.b(bundle.getString(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
