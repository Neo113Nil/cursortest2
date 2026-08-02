package I3;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: I3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180j extends F3.y {

    /* renamed from: a, reason: collision with root package name */
    public final C0190u f2653a;

    /* renamed from: b, reason: collision with root package name */
    public final C0190u f2654b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.q f2655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0174d f2656d;

    public C0180j(C0174d c0174d, F3.m mVar, Type type, F3.y yVar, Type type2, F3.y yVar2, H3.q qVar) {
        this.f2656d = c0174d;
        this.f2653a = new C0190u(mVar, yVar, type);
        this.f2654b = new C0190u(mVar, yVar2, type2);
        this.f2655c = qVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        int K = aVar.K();
        if (K == 9) {
            aVar.G();
            return null;
        }
        Map map = (Map) this.f2655c.k();
        if (K == 1) {
            aVar.b();
            while (aVar.n()) {
                aVar.b();
                Object a5 = ((F3.y) this.f2653a.f2686c).a(aVar);
                if (map.put(a5, ((F3.y) this.f2654b.f2686c).a(aVar)) != null) {
                    throw new F3.p("duplicate key: " + a5);
                }
                aVar.i();
            }
            aVar.i();
            return map;
        }
        aVar.d();
        while (aVar.n()) {
            j3.i.f17519m.getClass();
            int i = aVar.f3769q;
            if (i == 0) {
                i = aVar.h();
            }
            if (i == 13) {
                aVar.f3769q = 9;
            } else if (i == 12) {
                aVar.f3769q = 8;
            } else {
                if (i != 14) {
                    throw aVar.S("a name");
                }
                aVar.f3769q = 10;
            }
            Object a6 = ((F3.y) this.f2653a.f2686c).a(aVar);
            if (map.put(a6, ((F3.y) this.f2654b.f2686c).a(aVar)) != null) {
                throw new F3.p("duplicate key: " + a6);
            }
        }
        aVar.k();
        return map;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            bVar.n();
            return;
        }
        this.f2656d.getClass();
        C0190u c0190u = this.f2654b;
        bVar.f();
        for (Map.Entry entry : map.entrySet()) {
            bVar.l(String.valueOf(entry.getKey()));
            c0190u.b(bVar, entry.getValue());
        }
        bVar.k();
    }
}
