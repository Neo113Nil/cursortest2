package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {
    public final Executor a;
    public final com.google.android.datatransport.runtime.scheduling.persistence.d b;
    public final q c;
    public final com.google.android.datatransport.runtime.synchronization.b d;

    public o(Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, q qVar, com.google.android.datatransport.runtime.synchronization.b bVar) {
        this.a = executor;
        this.b = dVar;
        this.c = qVar;
        this.d = bVar;
    }
}
