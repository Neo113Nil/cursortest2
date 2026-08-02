package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements com.google.android.datatransport.runtime.dagger.internal.b<m> {
    public final javax.inject.a<Context> a;
    public final javax.inject.a<com.google.android.datatransport.runtime.backends.e> b;
    public final javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.d> c;
    public final com.google.android.datatransport.runtime.scheduling.f d;
    public final javax.inject.a<Executor> e;
    public final javax.inject.a<com.google.android.datatransport.runtime.synchronization.b> f;
    public final javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.c> g;

    public n(javax.inject.a aVar, javax.inject.a aVar2, javax.inject.a aVar3, com.google.android.datatransport.runtime.scheduling.f fVar, javax.inject.a aVar4, javax.inject.a aVar5, javax.inject.a aVar6) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = fVar;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar6;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), (q) this.d.get(), this.e.get(), this.f.get(), new com.baseflow.permissionhandler.a(), new com.google.android.datatransport.runtime.time.b(), this.g.get());
    }
}
