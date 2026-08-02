package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f3791a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.os.Bundle bundle, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f3791a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.s sVar;
        com.google.android.play.core.integrity.at atVar;
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.e.f3794a.e();
            android.os.Bundle bundle = this.f3791a;
            com.google.android.play.core.integrity.aj ajVar = this.e;
            atVar = ajVar.e;
            nVar.c(bundle, atVar.a(this.b, this.c, ajVar.f3794a));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.integrity.aj ajVar2 = this.e;
            int i = this.d;
            sVar = ajVar2.b;
            sVar.c(e, "requestAndShowDialog(%s)", java.lang.Integer.valueOf(i));
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, e));
        }
    }
}
