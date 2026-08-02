package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public final class r implements com.google.android.datatransport.runtime.dagger.internal.b<q> {
    public final com.google.android.datatransport.runtime.scheduling.d a;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.n b;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.p c;

    public r(com.google.android.datatransport.runtime.scheduling.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.n nVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.p pVar) {
        this.a = dVar;
        this.b = nVar;
        this.c = pVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new q(new com.baseflow.permissionhandler.a(), new com.google.android.datatransport.runtime.time.b(), (com.google.android.datatransport.runtime.scheduling.e) this.a.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.b.get(), (com.google.android.datatransport.runtime.scheduling.jobscheduling.o) this.c.get());
    }
}
