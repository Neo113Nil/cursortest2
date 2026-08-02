package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.TaskCompletionSource f3814a;
    final /* synthetic */ com.google.android.play.core.integrity.bn b;

    bi(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.f3814a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f3816a.v(this.f3814a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f3816a.v(this.f3814a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f3816a.v(this.f3814a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f3816a.v(this.f3814a);
    }
}
