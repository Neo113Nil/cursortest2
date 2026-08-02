package u;

import P.AbstractC0329z;
import P.C0305m0;
import a.AbstractC0444a;
import b4.EnumC0510a;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2451c {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f19760a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19761b;

    /* renamed from: c, reason: collision with root package name */
    public final C2465l f19762c;

    /* renamed from: d, reason: collision with root package name */
    public final C0305m0 f19763d;

    /* renamed from: e, reason: collision with root package name */
    public final C0305m0 f19764e;
    public final C2444O f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2470q f19765g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2470q f19766h;
    public final AbstractC2470q i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC2470q f19767j;

    public C2451c(Object obj, A0 a02, Object obj2) {
        this.f19760a = a02;
        this.f19761b = obj2;
        C2465l c2465l = new C2465l(a02, obj, null, 60);
        this.f19762c = c2465l;
        this.f19763d = AbstractC0329z.t(Boolean.FALSE);
        this.f19764e = AbstractC0329z.t(obj);
        this.f = new C2444O();
        new C2456e0(obj2);
        AbstractC2470q abstractC2470q = c2465l.f19847m;
        boolean z3 = abstractC2470q instanceof C2466m;
        AbstractC2470q abstractC2470q2 = z3 ? AbstractC2453d.f19788e : abstractC2470q instanceof C2467n ? AbstractC2453d.f : abstractC2470q instanceof C2468o ? AbstractC2453d.f19789g : AbstractC2453d.f19790h;
        this.f19765g = abstractC2470q2;
        AbstractC2470q abstractC2470q3 = z3 ? AbstractC2453d.f19784a : abstractC2470q instanceof C2467n ? AbstractC2453d.f19785b : abstractC2470q instanceof C2468o ? AbstractC2453d.f19786c : AbstractC2453d.f19787d;
        this.f19766h = abstractC2470q3;
        this.i = abstractC2470q2;
        this.f19767j = abstractC2470q3;
    }

    public static final Object a(C2451c c2451c, Object obj) {
        AbstractC2470q abstractC2470q = c2451c.f19765g;
        AbstractC2470q abstractC2470q2 = c2451c.i;
        boolean a5 = kotlin.jvm.internal.l.a(abstractC2470q2, abstractC2470q);
        AbstractC2470q abstractC2470q3 = c2451c.f19767j;
        if (!a5 || !kotlin.jvm.internal.l.a(abstractC2470q3, c2451c.f19766h)) {
            A0 a02 = c2451c.f19760a;
            AbstractC2470q abstractC2470q4 = (AbstractC2470q) a02.f19643a.c(obj);
            int b3 = abstractC2470q4.b();
            boolean z3 = false;
            for (int i = 0; i < b3; i++) {
                if (abstractC2470q4.a(i) < abstractC2470q2.a(i) || abstractC2470q4.a(i) > abstractC2470q3.a(i)) {
                    abstractC2470q4.e(i, AbstractC0444a.s(abstractC2470q4.a(i), abstractC2470q2.a(i), abstractC2470q3.a(i)));
                    z3 = true;
                }
            }
            if (z3) {
                return a02.f19644b.c(abstractC2470q4);
            }
        }
        return obj;
    }

    public static final void b(C2451c c2451c) {
        C2465l c2465l = c2451c.f19762c;
        c2465l.f19847m.d();
        c2465l.f19848n = Long.MIN_VALUE;
        c2451c.f19763d.setValue(Boolean.FALSE);
    }

    public static Object c(C2451c c2451c, Object obj, InterfaceC2464k interfaceC2464k, i4.c cVar, a4.c cVar2, int i) {
        Object c5 = c2451c.f19760a.f19644b.c(c2451c.f19762c.f19847m);
        i4.c cVar3 = (i & 8) != 0 ? null : cVar;
        Object d5 = c2451c.d();
        A0 a02 = c2451c.f19760a;
        return C2444O.a(c2451c.f, new C2447a(c2451c, c5, new m0(interfaceC2464k, a02, d5, obj, (AbstractC2470q) a02.f19643a.c(c5)), c2451c.f19762c.f19848n, cVar3, null), cVar2);
    }

    public final Object d() {
        return this.f19762c.f19846l.getValue();
    }

    public final Object e(a4.c cVar, Object obj) {
        Object a5 = C2444O.a(this.f, new C2449b(this, obj, null), cVar);
        return a5 == EnumC0510a.f7289k ? a5 : W3.o.f6046a;
    }

    public /* synthetic */ C2451c(Object obj, A0 a02, Object obj2, int i) {
        this(obj, a02, (i & 4) != 0 ? null : obj2);
    }
}
