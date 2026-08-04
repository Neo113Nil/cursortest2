package p018c2;

import A1.R0;
import B1.m;
import B1.p;
import E1.d;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p146u2.U;
import p151v2.a;
import p155w1.F0;

/* JADX INFO: renamed from: c2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0764j extends AbstractC0755a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f10365h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f10366i;
    public U j;

    @Override // p018c2.AbstractC0755a
    public void c() {
        for (C0763i c0763i : this.f10365h.values()) {
            c0763i.f10362a.b(c0763i.f10363b);
        }
    }

    @Override // p018c2.AbstractC0755a
    public void e() {
        for (C0763i c0763i : this.f10365h.values()) {
            c0763i.f10362a.d(c0763i.f10363b);
        }
    }

    @Override // p018c2.AbstractC0755a
    public void h() {
        Iterator it = this.f10365h.values().iterator();
        while (it.hasNext()) {
            ((C0763i) it.next()).f10362a.h();
        }
    }

    @Override // p018c2.AbstractC0755a
    public void n() {
        HashMap map = this.f10365h;
        for (C0763i c0763i : map.values()) {
            c0763i.f10362a.m(c0763i.f10363b);
            F0 f7 = c0763i.f10364c;
            AbstractC0755a abstractC0755a = c0763i.f10362a;
            abstractC0755a.p(f7);
            abstractC0755a.o(f7);
        }
        map.clear();
    }

    public abstract void s(C0769o c0769o, R0 r7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [c2.E, c2.h] */
    public final void t(final C0769o c0769o, AbstractC0755a abstractC0755a) {
        HashMap map = this.f10365h;
        a.f(!map.containsKey(c0769o));
        ?? r7 = new E() { // from class: c2.h
            @Override // p018c2.E
            public final void a(AbstractC0755a abstractC0755a2, R0 r8) {
                this.f10360a.s(c0769o, r8);
            }
        };
        F0 f7 = new F0(this, c0769o);
        map.put(c0769o, new C0763i(abstractC0755a, r7, f7));
        Handler handler = this.f10366i;
        handler.getClass();
        abstractC0755a.getClass();
        I i7 = abstractC0755a.f10298c;
        i7.getClass();
        H h6 = new H();
        h6.f10177a = handler;
        h6.f10178b = f7;
        i7.f10181c.add(h6);
        this.f10366i.getClass();
        m mVar = abstractC0755a.f10299d;
        mVar.getClass();
        d dVar = new d();
        dVar.f1902a = f7;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
        U u4 = this.j;
        p pVar = this.f10302g;
        a.i(pVar);
        abstractC0755a.i(r7, u4, pVar);
        if (this.f10297b.isEmpty()) {
            abstractC0755a.b(r7);
        }
    }

    public D q(C0769o c0769o, D d7) {
        return d7;
    }

    public int r(C0769o c0769o, int i7) {
        return i7;
    }
}
