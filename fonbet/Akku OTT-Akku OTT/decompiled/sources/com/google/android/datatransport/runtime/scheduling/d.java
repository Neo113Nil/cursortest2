package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements com.google.android.datatransport.runtime.dagger.internal.b<c> {
    public final javax.inject.a<Executor> a;
    public final javax.inject.a<com.google.android.datatransport.runtime.backends.e> b;
    public final f c;
    public final javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.d> d;
    public final javax.inject.a<com.google.android.datatransport.runtime.synchronization.b> e;

    public d(javax.inject.a aVar, javax.inject.a aVar2, f fVar, javax.inject.a aVar3, javax.inject.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = fVar;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new c(this.a.get(), this.b.get(), (q) this.c.get(), this.d.get(), this.e.get());
    }
}
