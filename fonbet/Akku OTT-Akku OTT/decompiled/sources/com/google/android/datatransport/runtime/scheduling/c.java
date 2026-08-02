package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.j;
import com.google.android.datatransport.runtime.q;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c implements e {
    public static final Logger f = Logger.getLogger(q.class.getName());
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.q a;
    public final Executor b;
    public final com.google.android.datatransport.runtime.backends.e c;
    public final com.google.android.datatransport.runtime.scheduling.persistence.d d;
    public final com.google.android.datatransport.runtime.synchronization.b e;

    public c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.synchronization.b bVar) {
        this.b = executor;
        this.c = eVar;
        this.a = qVar;
        this.d = dVar;
        this.e = bVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.e
    public final void a(com.google.android.datatransport.runtime.d dVar, com.google.android.datatransport.runtime.b bVar, j jVar) {
        this.b.execute(new a(0, this, dVar, jVar, bVar));
    }
}
