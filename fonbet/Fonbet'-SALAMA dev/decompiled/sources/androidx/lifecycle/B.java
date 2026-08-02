package androidx.lifecycle;

import W5.AbstractC0486a1;
import android.os.Looper;
import androidx.appcompat.widget.b1;
import java.util.Map;
import n.C1442b;
import n.C1444d;
import o.C1485c;
import o.C1486d;

/* loaded from: classes.dex */
public class B {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9560k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9561a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o.f f9562b = new o.f();

    /* renamed from: c, reason: collision with root package name */
    public int f9563c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9564d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9565e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f9566f;

    /* renamed from: g, reason: collision with root package name */
    public int f9567g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9568h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9569i;
    public final b1 j;

    public B() {
        Object obj = f9560k;
        this.f9566f = obj;
        this.j = new b1(this, 1);
        this.f9565e = obj;
        this.f9567g = -1;
    }

    public static void a(String str) {
        C1442b.Y().f15281c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0486a1.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(A a2) {
        if (a2.f9557b) {
            if (!a2.e()) {
                a2.b(false);
                return;
            }
            int i7 = a2.f9558c;
            int i8 = this.f9567g;
            if (i7 >= i8) {
                return;
            }
            a2.f9558c = i8;
            a2.f9556a.b(this.f9565e);
        }
    }

    public final void c(A a2) {
        if (this.f9568h) {
            this.f9569i = true;
            return;
        }
        this.f9568h = true;
        do {
            this.f9569i = false;
            if (a2 != null) {
                b(a2);
                a2 = null;
            } else {
                o.f fVar = this.f9562b;
                fVar.getClass();
                C1486d c1486d = new C1486d(fVar);
                fVar.f15528c.put(c1486d, Boolean.FALSE);
                while (c1486d.hasNext()) {
                    b((A) ((Map.Entry) c1486d.next()).getValue());
                    if (this.f9569i) {
                        break;
                    }
                }
            }
        } while (this.f9569i);
        this.f9568h = false;
    }

    public final void d(InterfaceC0745t interfaceC0745t, C c3) {
        Object obj;
        a("observe");
        if (((C0747v) interfaceC0745t.getLifecycle()).f9637c == EnumC0740n.f9626a) {
            return;
        }
        z zVar = new z(this, interfaceC0745t, c3);
        o.f fVar = this.f9562b;
        C1485c l7 = fVar.l(c3);
        if (l7 != null) {
            obj = l7.f15520b;
        } else {
            C1485c c1485c = new C1485c(c3, zVar);
            fVar.f15529d++;
            C1485c c1485c2 = fVar.f15527b;
            if (c1485c2 == null) {
                fVar.f15526a = c1485c;
                fVar.f15527b = c1485c;
            } else {
                c1485c2.f15521c = c1485c;
                c1485c.f15522d = c1485c2;
                fVar.f15527b = c1485c;
            }
            obj = null;
        }
        A a2 = (A) obj;
        if (a2 != null && !a2.d(interfaceC0745t)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        interfaceC0745t.getLifecycle().a(zVar);
    }

    public final void g(Object obj) {
        boolean z4;
        synchronized (this.f9561a) {
            z4 = this.f9566f == f9560k;
            this.f9566f = obj;
        }
        if (z4) {
            C1442b Y6 = C1442b.Y();
            b1 b1Var = this.j;
            C1444d c1444d = Y6.f15281c;
            if (c1444d.f15286e == null) {
                synchronized (c1444d.f15284c) {
                    try {
                        if (c1444d.f15286e == null) {
                            c1444d.f15286e = C1444d.Y(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c1444d.f15286e.post(b1Var);
        }
    }

    public void h(C c3) {
        a("removeObserver");
        A a2 = (A) this.f9562b.m(c3);
        if (a2 == null) {
            return;
        }
        a2.c();
        a2.b(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.f9567g++;
        this.f9565e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }
}
