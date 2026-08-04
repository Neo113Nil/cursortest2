package androidx.lifecycle;

import W5.AbstractC0486a1;
import android.os.Looper;
import androidx.appcompat.widget.b1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f9560k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9561a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101o.f f9562b = new p101o.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9563c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f9565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f9566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
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
        p094n.b.Y().f15287c.getClass();
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
                p101o.f fVar = this.f9562b;
                fVar.getClass();
                p101o.d dVar = new p101o.d(fVar);
                fVar.f15534c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((A) ((Map.Entry) dVar.next()).getValue());
                    if (this.f9569i) {
                        break;
                    }
                }
            }
        } while (this.f9569i);
        this.f9568h = false;
    }

    public final void d(InterfaceC0724t interfaceC0724t, C c3) {
        Object obj;
        a("observe");
        if (((C0726v) interfaceC0724t.getLifecycle()).f9637c == EnumC0719n.f9626a) {
            return;
        }
        z zVar = new z(this, interfaceC0724t, c3);
        p101o.f fVar = this.f9562b;
        p101o.c cVarL = fVar.l(c3);
        if (cVarL != null) {
            obj = cVarL.f15526b;
        } else {
            p101o.c cVar = new p101o.c(c3, zVar);
            fVar.f15535d++;
            p101o.c cVar2 = fVar.f15533b;
            if (cVar2 == null) {
                fVar.f15532a = cVar;
                fVar.f15533b = cVar;
            } else {
                cVar2.f15527c = cVar;
                cVar.f15528d = cVar2;
                fVar.f15533b = cVar;
            }
            obj = null;
        }
        A a2 = (A) obj;
        if (a2 != null && !a2.d(interfaceC0724t)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        interfaceC0724t.getLifecycle().a(zVar);
    }

    public final void g(Object obj) {
        boolean z4;
        synchronized (this.f9561a) {
            z4 = this.f9566f == f9560k;
            this.f9566f = obj;
        }
        if (z4) {
            p094n.b bVarY = p094n.b.Y();
            b1 b1Var = this.j;
            p094n.d dVar = bVarY.f15287c;
            if (dVar.f15292e == null) {
                synchronized (dVar.f15290c) {
                    try {
                        if (dVar.f15292e == null) {
                            dVar.f15292e = p094n.d.Y(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            dVar.f15292e.post(b1Var);
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
