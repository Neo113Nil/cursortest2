package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bg extends com.google.android.play.core.integrity.bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest f3812a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource d;
    final /* synthetic */ com.google.android.play.core.integrity.bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f3812a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.s sVar;
        if (com.google.android.play.core.integrity.bn.l(this.e)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        if (com.google.android.play.core.integrity.bn.k(this.e, 0)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-14, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.e;
            ((com.google.android.play.integrity.internal.i) bnVar.f3816a.e()).d(com.google.android.play.core.integrity.bn.a(bnVar, this.f3812a, this.b, this.c, 0), new com.google.android.play.core.integrity.bk(this.e, this.d, this.b));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.integrity.bn bnVar2 = this.e;
            com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.f3812a;
            sVar = bnVar2.b;
            sVar.c(e, "requestExpressIntegrityToken(%s, %s, %s)", standardIntegrityTokenRequest.requestHash(), this.f3812a.verdictOptOut(), java.lang.Long.valueOf(this.b));
            this.d.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
