package I1;

import java.util.LinkedHashSet;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC2346c f2570a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2571b;

    /* renamed from: c, reason: collision with root package name */
    public m2.g f2572c;

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        m2.g gVar = this.f2572c;
        if (gVar == null || !((LinkedHashSet) gVar.f17996n).remove(this)) {
            return;
        }
        g gVar2 = (g) gVar.f17995m;
        gVar2.getClass();
        if (equals(gVar2.f)) {
            if (gVar2.f2582g == -1) {
                a();
            }
            gVar2.f = null;
            gVar2.f2582g = 0;
            gVar2.f2583h = null;
        }
        gVar2.f2580d.remove(this);
        gVar2.f2581e.remove(this);
        this.f2572c = null;
        gVar2.b();
    }

    public final void f(boolean z3) {
        g gVar;
        if (this.f2571b == z3) {
            return;
        }
        this.f2571b = z3;
        m2.g gVar2 = this.f2572c;
        if (gVar2 == null || (gVar = (g) gVar2.f17995m) == null) {
            return;
        }
        gVar.b();
    }
}
