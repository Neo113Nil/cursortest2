package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bf extends com.google.android.play.core.integrity.bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f3811a;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource b;
    final /* synthetic */ com.google.android.play.core.integrity.bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, long j, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f3811a = j;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.s sVar;
        if (com.google.android.play.core.integrity.bn.l(this.c)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        if (com.google.android.play.core.integrity.bn.k(this.c, 0)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-14, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.c;
            ((com.google.android.play.integrity.internal.i) bnVar.f3816a.e()).e(com.google.android.play.core.integrity.bn.b(bnVar, this.f3811a, 0), new com.google.android.play.core.integrity.bl(this.c, this.b));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.integrity.bn bnVar2 = this.c;
            long j = this.f3811a;
            sVar = bnVar2.b;
            sVar.c(e, "warmUpIntegrityToken(%s)", java.lang.Long.valueOf(j));
            this.b.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
