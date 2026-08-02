package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class w extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource f3859a;
    final /* synthetic */ com.google.android.play.integrity.internal.t b;
    final /* synthetic */ com.google.android.play.integrity.internal.ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(com.google.android.play.integrity.internal.ae aeVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.integrity.internal.t tVar) {
        super(taskCompletionSource);
        this.f3859a = taskCompletionSource2;
        this.b = tVar;
        this.c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.android.play.integrity.internal.s sVar;
        obj = this.c.g;
        synchronized (obj) {
            com.google.android.play.integrity.internal.ae.o(this.c, this.f3859a);
            atomicInteger = this.c.m;
            if (atomicInteger.getAndIncrement() > 0) {
                sVar = this.c.c;
                sVar.d("Already connected to the service.", new java.lang.Object[0]);
            }
            com.google.android.play.integrity.internal.ae.q(this.c, this.b);
        }
    }
}
