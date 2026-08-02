package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bh extends com.google.android.play.core.integrity.bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f3813a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.os.Bundle bundle, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.f3813a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.s sVar;
        com.google.android.play.core.integrity.at atVar;
        if (com.google.android.play.core.integrity.bn.l(this.e)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f3816a;
            com.google.android.play.integrity.internal.i iVar = (com.google.android.play.integrity.internal.i) aeVar.e();
            android.os.Bundle bundle = this.f3813a;
            atVar = bnVar.e;
            iVar.c(bundle, atVar.a(this.b, this.c, aeVar));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.integrity.bn bnVar2 = this.e;
            int i = this.d;
            sVar = bnVar2.b;
            sVar.c(e, "requestAndShowDialog(%s)", java.lang.Integer.valueOf(i));
            this.c.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
