package k4;

import java.util.Comparator;

/* renamed from: k4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1348j implements InterfaceC1346h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14778a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14779b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1346h f14780c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1346h f14781d;

    public AbstractC1348j(Object obj, Object obj2, InterfaceC1346h interfaceC1346h, InterfaceC1346h interfaceC1346h2) {
        this.f14778a = obj;
        this.f14779b = obj2;
        C1345g c1345g = C1345g.f14777a;
        this.f14780c = interfaceC1346h == null ? c1345g : interfaceC1346h;
        this.f14781d = interfaceC1346h2 == null ? c1345g : interfaceC1346h2;
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h a() {
        return this.f14780c;
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h b(Object obj, Object obj2, Comparator comparator) {
        int compare = comparator.compare(obj, this.f14778a);
        return (compare < 0 ? l(null, null, this.f14780c.b(obj, obj2, comparator), null) : compare == 0 ? l(obj, obj2, null, null) : l(null, null, null, this.f14781d.b(obj, obj2, comparator))).m();
    }

    @Override // k4.InterfaceC1346h
    public final void c(Q0.a aVar) {
        this.f14780c.c(aVar);
        aVar.c0(this.f14778a, this.f14779b);
        this.f14781d.c(aVar);
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h d(Object obj, Comparator comparator) {
        AbstractC1348j l7;
        if (comparator.compare(obj, this.f14778a) < 0) {
            AbstractC1348j o7 = (this.f14780c.isEmpty() || this.f14780c.e() || ((AbstractC1348j) this.f14780c).f14780c.e()) ? this : o();
            l7 = o7.l(null, null, o7.f14780c.d(obj, comparator), null);
        } else {
            AbstractC1348j q7 = this.f14780c.e() ? q() : this;
            InterfaceC1346h interfaceC1346h = q7.f14781d;
            if (!interfaceC1346h.isEmpty() && !interfaceC1346h.e() && !((AbstractC1348j) interfaceC1346h).f14780c.e()) {
                q7 = q7.j();
                if (q7.f14780c.a().e()) {
                    q7 = q7.q().j();
                }
            }
            if (comparator.compare(obj, q7.f14778a) == 0) {
                InterfaceC1346h interfaceC1346h2 = q7.f14781d;
                if (interfaceC1346h2.isEmpty()) {
                    return C1345g.f14777a;
                }
                InterfaceC1346h h6 = interfaceC1346h2.h();
                q7 = q7.l(h6.getKey(), h6.getValue(), null, ((AbstractC1348j) interfaceC1346h2).p());
            }
            l7 = q7.l(null, null, null, q7.f14781d.d(obj, comparator));
        }
        return l7.m();
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h g() {
        return this.f14781d;
    }

    @Override // k4.InterfaceC1346h
    public final Object getKey() {
        return this.f14778a;
    }

    @Override // k4.InterfaceC1346h
    public final Object getValue() {
        return this.f14779b;
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h h() {
        return this.f14780c.isEmpty() ? this : this.f14780c.h();
    }

    @Override // k4.InterfaceC1346h
    public final InterfaceC1346h i() {
        InterfaceC1346h interfaceC1346h = this.f14781d;
        return interfaceC1346h.isEmpty() ? this : interfaceC1346h.i();
    }

    @Override // k4.InterfaceC1346h
    public final boolean isEmpty() {
        return false;
    }

    public final AbstractC1348j j() {
        InterfaceC1346h interfaceC1346h = this.f14780c;
        InterfaceC1346h f7 = interfaceC1346h.f(interfaceC1346h.e() ? 2 : 1, null, null);
        InterfaceC1346h interfaceC1346h2 = this.f14781d;
        return f(e() ? 2 : 1, f7, interfaceC1346h2.f(interfaceC1346h2.e() ? 2 : 1, null, null));
    }

    @Override // k4.InterfaceC1346h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractC1348j f(int i7, InterfaceC1346h interfaceC1346h, InterfaceC1346h interfaceC1346h2) {
        if (interfaceC1346h == null) {
            interfaceC1346h = this.f14780c;
        }
        if (interfaceC1346h2 == null) {
            interfaceC1346h2 = this.f14781d;
        }
        Object obj = this.f14778a;
        Object obj2 = this.f14779b;
        return i7 == 1 ? new C1347i(obj, obj2, interfaceC1346h, interfaceC1346h2) : new C1344f(obj, obj2, interfaceC1346h, interfaceC1346h2);
    }

    public abstract AbstractC1348j l(Object obj, Object obj2, InterfaceC1346h interfaceC1346h, InterfaceC1346h interfaceC1346h2);

    public final AbstractC1348j m() {
        InterfaceC1346h interfaceC1346h = this.f14781d;
        AbstractC1348j abstractC1348j = (!interfaceC1346h.e() || this.f14780c.e()) ? this : (AbstractC1348j) interfaceC1346h.f(n(), f(1, null, ((AbstractC1348j) interfaceC1346h).f14780c), null);
        if (abstractC1348j.f14780c.e() && ((AbstractC1348j) abstractC1348j.f14780c).f14780c.e()) {
            abstractC1348j = abstractC1348j.q();
        }
        return (abstractC1348j.f14780c.e() && abstractC1348j.f14781d.e()) ? abstractC1348j.j() : abstractC1348j;
    }

    public abstract int n();

    public final AbstractC1348j o() {
        AbstractC1348j j = j();
        InterfaceC1346h interfaceC1346h = j.f14781d;
        if (!interfaceC1346h.a().e()) {
            return j;
        }
        AbstractC1348j l7 = j.l(null, null, null, ((AbstractC1348j) interfaceC1346h).q());
        InterfaceC1346h interfaceC1346h2 = l7.f14781d;
        return ((AbstractC1348j) interfaceC1346h2.f(l7.n(), l7.f(1, null, ((AbstractC1348j) interfaceC1346h2).f14780c), null)).j();
    }

    public final InterfaceC1346h p() {
        if (this.f14780c.isEmpty()) {
            return C1345g.f14777a;
        }
        AbstractC1348j o7 = (this.f14780c.e() || this.f14780c.a().e()) ? this : o();
        return o7.l(null, null, ((AbstractC1348j) o7.f14780c).p(), null).m();
    }

    public final AbstractC1348j q() {
        return (AbstractC1348j) this.f14780c.f(n(), null, f(1, ((AbstractC1348j) this.f14780c).f14781d, null));
    }

    public void r(AbstractC1348j abstractC1348j) {
        this.f14780c = abstractC1348j;
    }
}
