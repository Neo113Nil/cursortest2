package A4;

import C0.c;
import C4.i;
import D4.f;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import v3.g;
import y4.B;
import y4.m;
import y4.p;
import y4.v;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class b implements p {
    @Override // y4.p
    public final z a(f fVar) {
        Throwable th;
        int i;
        System.currentTimeMillis();
        c cVar = fVar.f980e;
        l.f("request", cVar);
        Throwable th2 = null;
        g gVar = new g(2, cVar, th2);
        if (cVar.d().f21312j) {
            gVar = new g(2, th2, th2);
        }
        i iVar = fVar.f976a;
        c cVar2 = (c) gVar.f20439l;
        z zVar = (z) gVar.f20440m;
        if (cVar2 == null && zVar == null) {
            z zVar2 = new z(cVar, v.f21428m, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) new ArrayList(20).toArray(new String[0])), z4.b.f21981c, null, null, null, -1L, System.currentTimeMillis(), null);
            l.f("call", iVar);
            return zVar2;
        }
        if (cVar2 == null) {
            l.c(zVar);
            y f = zVar.f();
            z a5 = a.a(zVar);
            y.b("cacheResponse", a5);
            f.i = a5;
            z a6 = f.a();
            l.f("call", iVar);
            return a6;
        }
        if (zVar != null) {
            l.f("call", iVar);
        }
        z b3 = fVar.b(cVar2);
        if (zVar != null) {
            if (b3.f21451n == 304) {
                y f5 = zVar.f();
                m mVar = b3.f21453p;
                ArrayList arrayList = new ArrayList(20);
                m mVar2 = zVar.f21453p;
                int size = mVar2.size();
                int i5 = 0;
                while (true) {
                    th = th2;
                    if (i5 >= size) {
                        break;
                    }
                    String e3 = mVar2.e(i5);
                    int i6 = size;
                    String g5 = mVar2.g(i5);
                    m mVar3 = mVar2;
                    if ("Warning".equalsIgnoreCase(e3)) {
                        i = i5;
                        if (AbstractC2234l.x0(g5, "1", false)) {
                            i5 = i + 1;
                            size = i6;
                            th2 = th;
                            mVar2 = mVar3;
                        }
                    } else {
                        i = i5;
                    }
                    if ("Content-Length".equalsIgnoreCase(e3) || "Content-Encoding".equalsIgnoreCase(e3) || "Content-Type".equalsIgnoreCase(e3) || !a.b(e3) || mVar.c(e3) == null) {
                        l.f("name", e3);
                        l.f("value", g5);
                        arrayList.add(e3);
                        arrayList.add(AbstractC2227e.Q0(g5).toString());
                    }
                    i5 = i + 1;
                    size = i6;
                    th2 = th;
                    mVar2 = mVar3;
                }
                int size2 = mVar.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    String e5 = mVar.e(i7);
                    if (!"Content-Length".equalsIgnoreCase(e5) && !"Content-Encoding".equalsIgnoreCase(e5) && !"Content-Type".equalsIgnoreCase(e5) && a.b(e5)) {
                        String g6 = mVar.g(i7);
                        l.f("name", e5);
                        l.f("value", g6);
                        arrayList.add(e5);
                        arrayList.add(AbstractC2227e.Q0(g6).toString());
                    }
                }
                f5.f = new m((String[]) arrayList.toArray(new String[0])).f();
                f5.f21445k = b3.f21458u;
                f5.f21446l = b3.f21459v;
                z a7 = a.a(zVar);
                y.b("cacheResponse", a7);
                f5.i = a7;
                z a8 = a.a(b3);
                y.b("networkResponse", a8);
                f5.f21443h = a8;
                f5.a();
                B b5 = b3.f21454q;
                l.c(b5);
                b5.close();
                l.c(th);
                throw th;
            }
            B b6 = zVar.f21454q;
            if (b6 != null) {
                z4.b.c(b6);
            }
        }
        y f6 = b3.f();
        z a9 = a.a(zVar);
        y.b("cacheResponse", a9);
        f6.i = a9;
        z a10 = a.a(b3);
        y.b("networkResponse", a10);
        f6.f21443h = a10;
        return f6.a();
    }
}
