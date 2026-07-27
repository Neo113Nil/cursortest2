package B3;

import A3.o;
import K4.i;
import a4.AbstractC0197c;
import a4.C0195a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import y3.C1568b;
import y3.g;
import y3.h;
import y3.m;
import y3.n;
import y3.q;
import y3.r;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final f f284a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final i f285b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f286c;

    static {
        AtomicInteger atomicInteger = g.f12395n;
        f285b = new i(2, false);
        f286c = new i(2, false);
    }

    @Override // y3.n
    public final void b(m mVar, Object obj, Object obj2, g gVar) {
        Map map = (Map) obj2;
        mVar.a(G3.b.f1013a, (o) gVar.c(o.class));
        mVar.q(G3.b.f1014b, map, a.f259a, gVar, f285b);
        mVar.A(G3.b.f1015c, ((C0195a) ((AbstractC0197c) obj)).f3884b, gVar);
    }

    @Override // y3.n
    public final int d(Object obj, Object obj2, g gVar) {
        AbstractC0197c abstractC0197c = (AbstractC0197c) obj;
        Map map = (Map) obj2;
        o d6 = o.d(abstractC0197c);
        gVar.a(d6);
        int d7 = h.d(G3.b.f1013a, d6);
        C1568b c1568b = G3.b.f1014b;
        a aVar = a.f259a;
        i iVar = r.f12431a;
        int i2 = 0;
        if (!map.isEmpty()) {
            q qVar = (q) gVar.d(f286c, new D3.h(10));
            qVar.f12427a = 0;
            qVar.f12428b = c1568b.f12384c;
            qVar.f12429c = aVar;
            qVar.f12430d = gVar;
            map.forEach(qVar);
            i2 = qVar.f12427a;
        }
        return r.d(G3.b.f1015c, ((C0195a) abstractC0197c).f3884b, gVar) + i2 + d7;
    }
}
