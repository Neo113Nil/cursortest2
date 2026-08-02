package c2;

import A1.C0008a0;
import A1.C0012c0;
import A1.C0014d0;
import A1.C0016e0;
import A1.C0018f0;
import A1.C0022h0;
import A1.C0026j0;
import A1.R0;
import E3.AbstractC0167z;
import E3.C0165x;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import c5.RunnableC0821b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v2.AbstractC1664a;
import w1.F0;

/* renamed from: c2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811q extends AbstractC0804j {

    /* renamed from: v, reason: collision with root package name */
    public static final C0022h0 f10387v;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10388k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f10389l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f10390m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f10391n;

    /* renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f10392o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f10393p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f10394q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10395r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10396s;

    /* renamed from: t, reason: collision with root package name */
    public HashSet f10397t;

    /* renamed from: u, reason: collision with root package name */
    public Z f10398u;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        E3.L l7 = E3.L.f2000e;
        List emptyList = Collections.emptyList();
        E3.L l8 = E3.L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        f10387v = new C0022h0("", new C0012c0(c0008a0), uri != null ? new C0016e0(uri, null, null, emptyList, l8, null) : null, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f0);
    }

    public C0811q(boolean z4, Z z7, AbstractC0795a... abstractC0795aArr) {
        for (AbstractC0795a abstractC0795a : abstractC0795aArr) {
            abstractC0795a.getClass();
        }
        this.f10398u = z7.f10294b.length > 0 ? z7.a() : z7;
        this.f10392o = new IdentityHashMap();
        this.f10393p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f10388k = arrayList;
        this.f10391n = new ArrayList();
        this.f10397t = new HashSet();
        this.f10389l = new HashSet();
        this.f10394q = new HashSet();
        this.f10395r = z4;
        List asList = Arrays.asList(abstractC0795aArr);
        synchronized (this) {
            w(arrayList.size(), asList, null, null);
        }
    }

    public final synchronized void A(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C0808n c0808n = (C0808n) it.next();
                c0808n.f10376a.post(c0808n.f10377b);
            }
            this.f10389l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void B(C0809o c0809o) {
        if (c0809o.f10383f && c0809o.f10380c.isEmpty()) {
            this.f10394q.remove(c0809o);
            C0803i c0803i = (C0803i) this.f10365h.remove(c0809o);
            c0803i.getClass();
            C0802h c0802h = c0803i.f10363b;
            AbstractC0795a abstractC0795a = c0803i.f10362a;
            abstractC0795a.m(c0802h);
            F0 f02 = c0803i.f10364c;
            abstractC0795a.p(f02);
            abstractC0795a.o(f02);
        }
    }

    public final synchronized void C(int i7, int i8, Handler handler, RunnableC0821b runnableC0821b) {
        AbstractC1664a.f(handler != null);
        Handler handler2 = this.f10390m;
        ArrayList arrayList = this.f10388k;
        arrayList.add(i8, (C0809o) arrayList.remove(i7));
        if (handler2 != null) {
            handler2.obtainMessage(2, new C0810p(i7, Integer.valueOf(i8), y(handler, runnableC0821b))).sendToTarget();
        } else if (handler != null) {
            handler.post(runnableC0821b);
        }
    }

    public final synchronized void D(int i7, int i8, Handler handler, RunnableC0821b runnableC0821b) {
        AbstractC1664a.f(handler != null);
        Handler handler2 = this.f10390m;
        v2.t.J(this.f10388k, i7, i8);
        if (handler2 != null) {
            handler2.obtainMessage(1, new C0810p(i7, Integer.valueOf(i8), y(handler, runnableC0821b))).sendToTarget();
        } else if (handler != null) {
            handler.post(runnableC0821b);
        }
    }

    public final void E(C0808n c0808n) {
        if (!this.f10396s) {
            Handler handler = this.f10390m;
            handler.getClass();
            handler.obtainMessage(4).sendToTarget();
            this.f10396s = true;
        }
        if (c0808n != null) {
            this.f10397t.add(c0808n);
        }
    }

    public final void F(Z z4) {
        int size;
        Handler handler = this.f10390m;
        if (handler == null) {
            if (z4.f10294b.length > 0) {
                z4 = z4.a();
            }
            this.f10398u = z4;
        } else {
            synchronized (this) {
                size = this.f10388k.size();
            }
            if (z4.f10294b.length != size) {
                z4 = z4.a().b(0, size);
            }
            handler.obtainMessage(3, new C0810p(0, z4, null)).sendToTarget();
        }
    }

    public final synchronized void G(Z z4) {
        F(z4);
    }

    public final void H() {
        this.f10396s = false;
        HashSet hashSet = this.f10397t;
        this.f10397t = new HashSet();
        k(new C0806l(this.f10391n, this.f10398u));
        Handler handler = this.f10390m;
        handler.getClass();
        handler.obtainMessage(5, hashSet).sendToTarget();
    }

    @Override // c2.AbstractC0795a
    public final InterfaceC0794B a(D d7, u2.r rVar, long j) {
        Pair pair = (Pair) d7.f10161a;
        Object obj = pair.first;
        D b7 = d7.b(pair.second);
        C0809o c0809o = (C0809o) this.f10393p.get(obj);
        if (c0809o == null) {
            c0809o = new C0809o(new C0807m(), this.f10395r);
            c0809o.f10383f = true;
            t(c0809o, c0809o.f10378a);
        }
        this.f10394q.add(c0809o);
        C0803i c0803i = (C0803i) this.f10365h.get(c0809o);
        c0803i.getClass();
        c0803i.f10362a.d(c0803i.f10363b);
        c0809o.f10380c.add(b7);
        C0815v a2 = c0809o.f10378a.a(b7, rVar, j);
        this.f10392o.put(a2, c0809o);
        z();
        return a2;
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void c() {
        super.c();
        this.f10394q.clear();
    }

    @Override // c2.AbstractC0795a
    public final synchronized R0 f() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C0806l(this.f10388k, this.f10398u.f10294b.length != this.f10388k.size() ? this.f10398u.a().b(0, this.f10388k.size()) : this.f10398u);
    }

    @Override // c2.AbstractC0795a
    public final C0022h0 g() {
        return f10387v;
    }

    @Override // c2.AbstractC0795a
    public final synchronized void j(u2.U u4) {
        try {
            this.j = u4;
            this.f10366i = v2.t.m(null);
            this.f10390m = new Handler(new C0805k(this, 0));
            if (this.f10388k.isEmpty()) {
                H();
            } else {
                this.f10398u = this.f10398u.b(0, this.f10388k.size());
                v(0, this.f10388k);
                E(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // c2.AbstractC0795a
    public final void l(InterfaceC0794B interfaceC0794B) {
        IdentityHashMap identityHashMap = this.f10392o;
        C0809o c0809o = (C0809o) identityHashMap.remove(interfaceC0794B);
        c0809o.getClass();
        c0809o.f10378a.l(interfaceC0794B);
        c0809o.f10380c.remove(((C0815v) interfaceC0794B).f10406a);
        if (!identityHashMap.isEmpty()) {
            z();
        }
        B(c0809o);
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final synchronized void n() {
        try {
            super.n();
            this.f10391n.clear();
            this.f10394q.clear();
            this.f10393p.clear();
            this.f10398u = this.f10398u.a();
            Handler handler = this.f10390m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f10390m = null;
            }
            this.f10396s = false;
            this.f10397t.clear();
            A(this.f10389l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // c2.AbstractC0804j
    public final D q(C0809o c0809o, D d7) {
        for (int i7 = 0; i7 < c0809o.f10380c.size(); i7++) {
            if (((D) c0809o.f10380c.get(i7)).f10164d == d7.f10164d) {
                return d7.b(Pair.create(c0809o.f10379b, d7.f10161a));
            }
        }
        return null;
    }

    @Override // c2.AbstractC0804j
    public final int r(C0809o c0809o, int i7) {
        return i7 + c0809o.f10382e;
    }

    @Override // c2.AbstractC0804j
    public final void s(C0809o c0809o, R0 r02) {
        int i7 = c0809o.f10381d + 1;
        ArrayList arrayList = this.f10391n;
        if (i7 < arrayList.size()) {
            int o7 = r02.o() - (((C0809o) arrayList.get(c0809o.f10381d + 1)).f10382e - c0809o.f10382e);
            if (o7 != 0) {
                x(c0809o.f10381d + 1, 0, o7);
            }
        }
        E(null);
    }

    public final synchronized void u(int i7, ArrayList arrayList, Handler handler, RunnableC0821b runnableC0821b) {
        w(i7, arrayList, handler, runnableC0821b);
    }

    public final void v(int i7, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0809o c0809o = (C0809o) it.next();
            int i8 = i7 + 1;
            ArrayList arrayList = this.f10391n;
            if (i7 > 0) {
                C0809o c0809o2 = (C0809o) arrayList.get(i7 - 1);
                int o7 = c0809o2.f10378a.f10421o.f10399b.o() + c0809o2.f10382e;
                c0809o.f10381d = i7;
                c0809o.f10382e = o7;
                c0809o.f10383f = false;
                c0809o.f10380c.clear();
            } else {
                c0809o.f10381d = i7;
                c0809o.f10382e = 0;
                c0809o.f10383f = false;
                c0809o.f10380c.clear();
            }
            x(i7, 1, c0809o.f10378a.f10421o.f10399b.o());
            arrayList.add(i7, c0809o);
            this.f10393p.put(c0809o.f10379b, c0809o);
            t(c0809o, c0809o.f10378a);
            if (this.f10297b.isEmpty() || !this.f10392o.isEmpty()) {
                C0803i c0803i = (C0803i) this.f10365h.get(c0809o);
                c0803i.getClass();
                c0803i.f10362a.b(c0803i.f10363b);
            } else {
                this.f10394q.add(c0809o);
            }
            i7 = i8;
        }
    }

    public final void w(int i7, List list, Handler handler, RunnableC0821b runnableC0821b) {
        AbstractC1664a.f((handler == null) == (runnableC0821b == null));
        Handler handler2 = this.f10390m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0795a) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0809o((AbstractC0795a) it2.next(), this.f10395r));
        }
        this.f10388k.addAll(i7, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(0, new C0810p(i7, arrayList, y(handler, runnableC0821b))).sendToTarget();
        } else {
            if (runnableC0821b == null || handler == null) {
                return;
            }
            handler.post(runnableC0821b);
        }
    }

    public final void x(int i7, int i8, int i9) {
        while (true) {
            ArrayList arrayList = this.f10391n;
            if (i7 >= arrayList.size()) {
                return;
            }
            C0809o c0809o = (C0809o) arrayList.get(i7);
            c0809o.f10381d += i8;
            c0809o.f10382e += i9;
            i7++;
        }
    }

    public final C0808n y(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0808n c0808n = new C0808n(handler, runnable);
        this.f10389l.add(c0808n);
        return c0808n;
    }

    public final void z() {
        Iterator it = this.f10394q.iterator();
        while (it.hasNext()) {
            C0809o c0809o = (C0809o) it.next();
            if (c0809o.f10380c.isEmpty()) {
                C0803i c0803i = (C0803i) this.f10365h.get(c0809o);
                c0803i.getClass();
                c0803i.f10362a.b(c0803i.f10363b);
                it.remove();
            }
        }
    }

    @Override // c2.AbstractC0804j, c2.AbstractC0795a
    public final void e() {
    }
}
