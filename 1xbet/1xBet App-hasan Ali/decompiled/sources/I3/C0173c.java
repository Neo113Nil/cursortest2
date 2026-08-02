package I3;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: I3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173c extends F3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2615a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2617c;

    public C0173c(F3.m mVar, Type type, F3.y yVar, H3.q qVar) {
        this.f2616b = new C0190u(mVar, yVar, type);
        this.f2617c = qVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        switch (this.f2615a) {
            case 0:
                if (aVar.K() == 9) {
                    aVar.G();
                    return null;
                }
                Collection collection = (Collection) ((H3.q) this.f2617c).k();
                aVar.b();
                while (aVar.n()) {
                    collection.add(((F3.y) ((C0190u) this.f2616b).f2686c).a(aVar));
                }
                aVar.i();
                return collection;
            default:
                Object a5 = ((S) this.f2617c).f2607m.a(aVar);
                if (a5 != null) {
                    Class cls = (Class) this.f2616b;
                    if (!cls.isInstance(a5)) {
                        throw new F3.p("Expected a " + cls.getName() + " but was " + a5.getClass().getName() + "; at path " + aVar.m(true));
                    }
                }
                return a5;
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        switch (this.f2615a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.d();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C0190u) this.f2616b).b(bVar, it.next());
                    }
                    bVar.i();
                    break;
                } else {
                    bVar.n();
                    break;
                }
            default:
                ((S) this.f2617c).f2607m.b(bVar, obj);
                break;
        }
    }

    public C0173c(S s2, Class cls) {
        this.f2617c = s2;
        this.f2616b = cls;
    }
}
