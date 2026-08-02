package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class p<T> implements com.google.android.datatransport.h<T> {
    public final d a;
    public final String b;
    public final com.google.android.datatransport.c c;
    public final com.google.android.datatransport.g<T, byte[]> d;
    public final q e;

    public p(d dVar, String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.g gVar, q qVar) {
        this.a = dVar;
        this.b = str;
        this.c = cVar;
        this.d = gVar;
        this.e = qVar;
    }

    public final void a(com.google.android.datatransport.a aVar, com.google.android.datatransport.j jVar) {
        com.google.android.datatransport.g<T, byte[]> gVar = this.d;
        if (gVar == null) {
            throw new NullPointerException("Null transformer");
        }
        c cVar = new c(this.a, this.b, aVar, gVar, this.c);
        q qVar = this.e;
        com.google.android.datatransport.runtime.scheduling.e eVar = qVar.c;
        d dVar = cVar.a;
        com.google.android.datatransport.a aVar2 = cVar.c;
        d d = dVar.d(aVar2.b);
        b.a aVar3 = new b.a();
        aVar3.f = new HashMap();
        aVar3.d = Long.valueOf(qVar.a.a());
        aVar3.e = Long.valueOf(qVar.b.a());
        String str = cVar.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar3.a = str;
        aVar3.c = new h(cVar.e, cVar.d.apply(aVar2.a));
        aVar2.getClass();
        aVar3.b = null;
        com.google.android.datatransport.f fVar = aVar2.c;
        if (fVar != null && fVar.a() != null) {
            aVar3.g = aVar2.c.a();
        }
        aVar2.getClass();
        eVar.a(d, aVar3.b(), jVar);
    }
}
