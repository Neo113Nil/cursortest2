package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.analytics.C0345a0;
import androidx.media3.exoplayer.analytics.X;
import com.google.android.datatransport.runtime.b;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m {
    public final Context a;
    public final com.google.android.datatransport.runtime.backends.e b;
    public final com.google.android.datatransport.runtime.scheduling.persistence.d c;
    public final q d;
    public final Executor e;
    public final com.google.android.datatransport.runtime.synchronization.b f;
    public final com.google.android.datatransport.runtime.time.a g;
    public final com.google.android.datatransport.runtime.time.a h;
    public final com.google.android.datatransport.runtime.scheduling.persistence.c i;

    public m(Context context, com.google.android.datatransport.runtime.backends.e eVar, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, q qVar, Executor executor, com.google.android.datatransport.runtime.synchronization.b bVar, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.persistence.c cVar) {
        this.a = context;
        this.b = eVar;
        this.c = dVar;
        this.d = qVar;
        this.e = executor;
        this.f = bVar;
        this.g = aVar;
        this.h = aVar2;
        this.i = cVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(final com.google.android.datatransport.runtime.d dVar, int i) {
        com.google.android.datatransport.runtime.backends.b b;
        com.google.android.datatransport.runtime.backends.m mVar = this.b.get(dVar.a);
        g.a aVar = g.a.a;
        new com.google.android.datatransport.runtime.backends.b(aVar, 0L);
        final long j = 0;
        while (true) {
            b.a aVar2 = new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                @Override // com.google.android.datatransport.runtime.synchronization.b.a
                public final Object execute() {
                    return Boolean.valueOf(m.this.c.M(dVar));
                }
            };
            com.google.android.datatransport.runtime.synchronization.b bVar = this.f;
            if (!((Boolean) bVar.l(aVar2)).booleanValue()) {
                final com.google.android.datatransport.runtime.d dVar2 = dVar;
                bVar.l(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                    @Override // com.google.android.datatransport.runtime.synchronization.b.a
                    public final Object execute() {
                        m mVar2 = m.this;
                        mVar2.c.h(mVar2.g.a() + j, dVar2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) bVar.l(new X(2, this, dVar));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (mVar == null) {
                com.google.android.datatransport.runtime.logging.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", dVar);
                b = new com.google.android.datatransport.runtime.backends.b(g.a.c, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.g) it.next()).a());
                }
                if (dVar.b() != null) {
                    com.google.android.datatransport.runtime.scheduling.persistence.c cVar = this.i;
                    Objects.requireNonNull(cVar);
                    com.google.android.datatransport.runtime.firebase.transport.a aVar3 = (com.google.android.datatransport.runtime.firebase.transport.a) bVar.l(new androidx.credentials.playservices.p(cVar, 1));
                    b.a aVar4 = new b.a();
                    aVar4.f = new HashMap();
                    aVar4.d = Long.valueOf(this.g.a());
                    aVar4.e = Long.valueOf(this.h.a());
                    aVar4.a = "GDT_CLIENT_METRICS";
                    com.google.android.datatransport.c cVar2 = new com.google.android.datatransport.c("proto");
                    aVar3.getClass();
                    aVar4.c = new com.google.android.datatransport.runtime.h(cVar2, com.google.android.datatransport.runtime.k.a.encode(aVar3));
                    arrayList.add(mVar.a(aVar4.b()));
                }
                b = mVar.b(new com.google.android.datatransport.runtime.backends.a(arrayList, dVar.b));
            }
            g.a aVar5 = b.a;
            if (aVar5 == g.a.b) {
                final com.google.android.datatransport.runtime.d dVar3 = dVar;
                bVar.l(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                    @Override // com.google.android.datatransport.runtime.synchronization.b.a
                    public final Object execute() {
                        m mVar2 = m.this;
                        com.google.android.datatransport.runtime.scheduling.persistence.d dVar4 = mVar2.c;
                        dVar4.z(iterable);
                        dVar4.h(mVar2.g.a() + j, dVar3);
                        return null;
                    }
                });
                this.d.b(dVar3, i + 1, true);
                return;
            }
            com.google.android.datatransport.runtime.d dVar4 = dVar;
            bVar.l(new j(this, iterable));
            if (aVar5 == aVar) {
                long max = Math.max(j, b.b);
                if (dVar4.b() != null) {
                    bVar.l(new androidx.credentials.playservices.n(this, 1));
                }
                j = max;
            } else if (aVar5 == g.a.d) {
                HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String k = ((com.google.android.datatransport.runtime.scheduling.persistence.g) it2.next()).a().k();
                    if (hashMap.containsKey(k)) {
                        hashMap.put(k, Integer.valueOf(((Integer) hashMap.get(k)).intValue() + 1));
                    } else {
                        hashMap.put(k, 1);
                    }
                }
                bVar.l(new C0345a0(this, hashMap));
            }
            dVar = dVar4;
        }
    }
}
