package com.google.android.datatransport.runtime;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class q {
    public static volatile f e;
    public final com.google.android.datatransport.runtime.time.a a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.scheduling.e c;
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.m d;

    public q(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.o oVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.d = mVar;
        oVar.a.execute(new androidx.fragment.app.j(oVar, 2));
    }

    public static q a() {
        f fVar = e;
        if (fVar != null) {
            return fVar.i.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (q.class) {
                try {
                    if (e == null) {
                        e eVar = new e();
                        context.getClass();
                        eVar.a = context;
                        e = eVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(g gVar) {
        Set unmodifiableSet = gVar != null ? Collections.unmodifiableSet(gVar.a()) : Collections.singleton(new com.google.android.datatransport.c("proto"));
        gVar.getClass();
        return new o(unmodifiableSet, new d("cct", gVar.getExtras(), com.google.android.datatransport.e.a), this);
    }
}
