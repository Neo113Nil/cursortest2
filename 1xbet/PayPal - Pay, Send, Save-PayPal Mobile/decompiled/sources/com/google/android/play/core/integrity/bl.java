package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bl extends com.google.android.play.core.integrity.bi {
    final /* synthetic */ com.google.android.play.core.integrity.bn c;
    private final com.google.android.play.integrity.internal.s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.integrity.k kVar;
        super.e(bundle);
        this.d.d("onWarmUpExpressIntegrityToken", new java.lang.Object[0]);
        kVar = this.c.f;
        com.google.android.gms.common.api.ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.f3814a.trySetException(a2);
        } else {
            this.f3814a.trySetResult(java.lang.Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
