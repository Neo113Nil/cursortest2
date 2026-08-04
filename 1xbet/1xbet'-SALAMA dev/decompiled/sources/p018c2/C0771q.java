package p018c2;

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
import E3.L;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
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
import p019c5.b;
import p146u2.U;
import p146u2.r;
import p151v2.a;
import p151v2.t;
import p155w1.F0;

/* JADX INFO: renamed from: c2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771q extends AbstractC0764j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0022h0 f10387v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f10389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f10390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f10391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f10392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f10393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f10394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f10395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HashSet f10397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Z f10398u;

    static {
        C0008a0 c0008a0 = new C0008a0();
        C0165x c0165x = AbstractC0167z.f2083b;
        L l7 = L.f2000e;
        List listEmptyList = Collections.emptyList();
        L l8 = L.f2000e;
        C0018f0 c0018f0 = C0018f0.f352c;
        Uri uri = Uri.EMPTY;
        f10387v = new C0022h0("", new C0012c0(c0008a0), uri != null ? new C0016e0(uri, null, null, listEmptyList, l8, null) : null, new C0014d0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0026j0.f414X, c0018f0);
    }

    public C0771q(boolean z4, Z z7, AbstractC0755a... abstractC0755aArr) {
        for (AbstractC0755a abstractC0755a : abstractC0755aArr) {
            abstractC0755a.getClass();
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
        List listAsList = Arrays.asList(abstractC0755aArr);
        synchronized (this) {
            w(arrayList.size(), listAsList, null, null);
        }
    }

    public final synchronized void A(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C0768n c0768n = (C0768n) it.next();
                c0768n.f10376a.post(c0768n.f10377b);
            }
            this.f10389l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void B(C0769o c0769o) {
        if (c0769o.f10383f && c0769o.f10380c.isEmpty()) {
            this.f10394q.remove(c0769o);
            C0763i c0763i = (C0763i) this.f10365h.remove(c0769o);
            c0763i.getClass();
            C0762h c0762h = c0763i.f10363b;
            AbstractC0755a abstractC0755a = c0763i.f10362a;
            abstractC0755a.m(c0762h);
            F0 f7 = c0763i.f10364c;
            abstractC0755a.p(f7);
            abstractC0755a.o(f7);
        }
    }

    public final synchronized void C(int i7, int i8, Handler handler, b bVar) {
        a.f(handler != null);
        Handler handler2 = this.f10390m;
        ArrayList arrayList = this.f10388k;
        arrayList.add(i8, (C0769o) arrayList.remove(i7));
        if (handler2 != null) {
            handler2.obtainMessage(2, new C0770p(i7, Integer.valueOf(i8), y(handler, bVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(bVar);
        }
    }

    public final synchronized void D(int i7, int i8, Handler handler, b bVar) {
        a.f(handler != null);
        Handler handler2 = this.f10390m;
        t.J(this.f10388k, i7, i8);
        if (handler2 != null) {
            handler2.obtainMessage(1, new C0770p(i7, Integer.valueOf(i8), y(handler, bVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(bVar);
        }
    }

    public final void E(C0768n c0768n) {
        if (!this.f10396s) {
            Handler handler = this.f10390m;
            handler.getClass();
            handler.obtainMessage(4).sendToTarget();
            this.f10396s = true;
        }
        if (c0768n != null) {
            this.f10397t.add(c0768n);
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
            handler.obtainMessage(3, new C0770p(0, z4, null)).sendToTarget();
        }
    }

    public final synchronized void G(Z z4) {
        F(z4);
    }

    public final void H() {
        this.f10396s = false;
        HashSet hashSet = this.f10397t;
        this.f10397t = new HashSet();
        k(new C0766l(this.f10391n, this.f10398u));
        Handler handler = this.f10390m;
        handler.getClass();
        handler.obtainMessage(5, hashSet).sendToTarget();
    }

    @Override // p018c2.AbstractC0755a
    public final B a(D d7, r rVar, long j) {
        Pair pair = (Pair) d7.f10161a;
        Object obj = pair.first;
        D dB = d7.b(pair.second);
        C0769o c0769o = (C0769o) this.f10393p.get(obj);
        if (c0769o == null) {
            c0769o = new C0769o(new C0767m(), this.f10395r);
            c0769o.f10383f = true;
            t(c0769o, c0769o.f10378a);
        }
        this.f10394q.add(c0769o);
        C0763i c0763i = (C0763i) this.f10365h.get(c0769o);
        c0763i.getClass();
        c0763i.f10362a.d(c0763i.f10363b);
        c0769o.f10380c.add(dB);
        C0775v c0775vU = c0769o.f10378a.a(dB, rVar, j);
        this.f10392o.put(c0775vU, c0769o);
        z();
        return c0775vU;
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void c() {
        super.c();
        this.f10394q.clear();
    }

    @Override // p018c2.AbstractC0755a
    public final synchronized R0 f() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C0766l(this.f10388k, this.f10398u.f10294b.length != this.f10388k.size() ? this.f10398u.a().b(0, this.f10388k.size()) : this.f10398u);
    }

    @Override // p018c2.AbstractC0755a
    public final C0022h0 g() {
        return f10387v;
    }

    @Override // p018c2.AbstractC0755a
    public final synchronized void j(U u4) {
        try {
            this.j = u4;
            this.f10366i = t.m(null);
            this.f10390m = new Handler(new C0765k(this, 0));
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

    @Override // p018c2.AbstractC0755a
    public final void l(B b7) {
        IdentityHashMap identityHashMap = this.f10392o;
        C0769o c0769o = (C0769o) identityHashMap.remove(b7);
        c0769o.getClass();
        c0769o.f10378a.l(b7);
        c0769o.f10380c.remove(((C0775v) b7).f10406a);
        if (!identityHashMap.isEmpty()) {
            z();
        }
        B(c0769o);
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
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

    @Override // p018c2.AbstractC0764j
    public final D q(C0769o c0769o, D d7) {
        for (int i7 = 0; i7 < c0769o.f10380c.size(); i7++) {
            if (((D) c0769o.f10380c.get(i7)).f10164d == d7.f10164d) {
                return d7.b(Pair.create(c0769o.f10379b, d7.f10161a));
            }
        }
        return null;
    }

    @Override // p018c2.AbstractC0764j
    public final int r(C0769o c0769o, int i7) {
        return i7 + c0769o.f10382e;
    }

    @Override // p018c2.AbstractC0764j
    public final void s(C0769o c0769o, R0 r7) {
        int i7 = c0769o.f10381d + 1;
        ArrayList arrayList = this.f10391n;
        if (i7 < arrayList.size()) {
            int iO = r7.o() - (((C0769o) arrayList.get(c0769o.f10381d + 1)).f10382e - c0769o.f10382e);
            if (iO != 0) {
                x(c0769o.f10381d + 1, 0, iO);
            }
        }
        E(null);
    }

    public final synchronized void u(int i7, ArrayList arrayList, Handler handler, b bVar) {
        w(i7, arrayList, handler, bVar);
    }

    public final void v(int i7, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0769o c0769o = (C0769o) it.next();
            int i8 = i7 + 1;
            ArrayList arrayList = this.f10391n;
            if (i7 > 0) {
                C0769o c0769o2 = (C0769o) arrayList.get(i7 - 1);
                int iO = c0769o2.f10378a.f10421o.f10399b.o() + c0769o2.f10382e;
                c0769o.f10381d = i7;
                c0769o.f10382e = iO;
                c0769o.f10383f = false;
                c0769o.f10380c.clear();
            } else {
                c0769o.f10381d = i7;
                c0769o.f10382e = 0;
                c0769o.f10383f = false;
                c0769o.f10380c.clear();
            }
            x(i7, 1, c0769o.f10378a.f10421o.f10399b.o());
            arrayList.add(i7, c0769o);
            this.f10393p.put(c0769o.f10379b, c0769o);
            t(c0769o, c0769o.f10378a);
            if (this.f10297b.isEmpty() || !this.f10392o.isEmpty()) {
                C0763i c0763i = (C0763i) this.f10365h.get(c0769o);
                c0763i.getClass();
                c0763i.f10362a.b(c0763i.f10363b);
            } else {
                this.f10394q.add(c0769o);
            }
            i7 = i8;
        }
    }

    public final void w(int i7, List list, Handler handler, b bVar) {
        a.f((handler == null) == (bVar == null));
        Handler handler2 = this.f10390m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0755a) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C0769o((AbstractC0755a) it2.next(), this.f10395r));
        }
        this.f10388k.addAll(i7, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(0, new C0770p(i7, arrayList, y(handler, bVar))).sendToTarget();
        } else {
            if (bVar == null || handler == null) {
                return;
            }
            handler.post(bVar);
        }
    }

    public final void x(int i7, int i8, int i9) {
        while (true) {
            ArrayList arrayList = this.f10391n;
            if (i7 >= arrayList.size()) {
                return;
            }
            C0769o c0769o = (C0769o) arrayList.get(i7);
            c0769o.f10381d += i8;
            c0769o.f10382e += i9;
            i7++;
        }
    }

    public final C0768n y(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0768n c0768n = new C0768n(handler, runnable);
        this.f10389l.add(c0768n);
        return c0768n;
    }

    public final void z() {
        Iterator it = this.f10394q.iterator();
        while (it.hasNext()) {
            C0769o c0769o = (C0769o) it.next();
            if (c0769o.f10380c.isEmpty()) {
                C0763i c0763i = (C0763i) this.f10365h.get(c0769o);
                c0763i.getClass();
                c0763i.f10362a.b(c0763i.f10363b);
                it.remove();
            }
        }
    }

    @Override // p018c2.AbstractC0764j, p018c2.AbstractC0755a
    public final void e() {
    }
}
