package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p implements com.google.android.datatransport.runtime.dagger.internal.b<o> {
    public final javax.inject.a<Executor> a;
    public final javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.d> b;
    public final com.google.android.datatransport.runtime.scheduling.f c;
    public final javax.inject.a<com.google.android.datatransport.runtime.synchronization.b> d;

    public p(javax.inject.a aVar, javax.inject.a aVar2, com.google.android.datatransport.runtime.scheduling.f fVar, javax.inject.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = fVar;
        this.d = aVar3;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new o(this.a.get(), this.b.get(), (q) this.c.get(), this.d.get());
    }
}
