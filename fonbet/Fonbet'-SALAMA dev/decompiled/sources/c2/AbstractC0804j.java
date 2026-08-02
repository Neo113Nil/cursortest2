package c2;

import A1.R0;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v2.AbstractC1664a;
import w1.F0;

/* renamed from: c2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0804j extends AbstractC0795a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f10365h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f10366i;
    public u2.U j;

    @Override // c2.AbstractC0795a
    public void c() {
        for (C0803i c0803i : this.f10365h.values()) {
            c0803i.f10362a.b(c0803i.f10363b);
        }
    }

    @Override // c2.AbstractC0795a
    public void e() {
        for (C0803i c0803i : this.f10365h.values()) {
            c0803i.f10362a.d(c0803i.f10363b);
        }
    }

    @Override // c2.AbstractC0795a
    public void h() {
        Iterator it = this.f10365h.values().iterator();
        while (it.hasNext()) {
            ((C0803i) it.next()).f10362a.h();
        }
    }

    @Override // c2.AbstractC0795a
    public void n() {
        HashMap hashMap = this.f10365h;
        for (C0803i c0803i : hashMap.values()) {
            c0803i.f10362a.m(c0803i.f10363b);
            F0 f02 = c0803i.f10364c;
            AbstractC0795a abstractC0795a = c0803i.f10362a;
            abstractC0795a.p(f02);
            abstractC0795a.o(f02);
        }
        hashMap.clear();
    }

    public abstract void s(C0809o c0809o, R0 r02);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [c2.E, c2.h] */
    public final void t(final C0809o c0809o, AbstractC0795a abstractC0795a) {
        HashMap hashMap = this.f10365h;
        AbstractC1664a.f(!hashMap.containsKey(c0809o));
        ?? r12 = new E() { // from class: c2.h
            @Override // c2.E
            public final void a(AbstractC0795a abstractC0795a2, R0 r02) {
                AbstractC0804j.this.s(c0809o, r02);
            }
        };
        F0 f02 = new F0(this, c0809o);
        hashMap.put(c0809o, new C0803i(abstractC0795a, r12, f02));
        Handler handler = this.f10366i;
        handler.getClass();
        abstractC0795a.getClass();
        I i7 = abstractC0795a.f10298c;
        i7.getClass();
        H h6 = new H();
        h6.f10177a = handler;
        h6.f10178b = f02;
        i7.f10181c.add(h6);
        this.f10366i.getClass();
        B1.m mVar = abstractC0795a.f10299d;
        mVar.getClass();
        E1.d dVar = new E1.d();
        dVar.f1902a = f02;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
        u2.U u4 = this.j;
        B1.p pVar = this.f10302g;
        AbstractC1664a.i(pVar);
        abstractC0795a.i(r12, u4, pVar);
        if (this.f10297b.isEmpty()) {
            abstractC0795a.b(r12);
        }
    }

    public D q(C0809o c0809o, D d7) {
        return d7;
    }

    public int r(C0809o c0809o, int i7) {
        return i7;
    }
}
