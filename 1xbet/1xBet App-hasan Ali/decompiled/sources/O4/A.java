package O4;

import L4.C0226i;
import L4.C0229l;
import Q2.C0375o;
import com.google.android.gms.internal.ads.C1234l6;
import java.io.IOException;
import java.util.ArrayList;
import n.AbstractC2107A;
import o0.C2202f;
import y4.InterfaceC2676d;

/* loaded from: classes.dex */
public final class A implements InterfaceC0259e {

    /* renamed from: k, reason: collision with root package name */
    public final Q f4106k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4107l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f4108m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2676d f4109n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0267m f4110o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f4111p;

    /* renamed from: q, reason: collision with root package name */
    public C4.i f4112q;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f4113r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4114s;

    public A(Q q5, Object obj, Object[] objArr, InterfaceC2676d interfaceC2676d, InterfaceC0267m interfaceC0267m) {
        this.f4106k = q5;
        this.f4107l = obj;
        this.f4108m = objArr;
        this.f4109n = interfaceC2676d;
        this.f4110o = interfaceC0267m;
    }

    public final C4.i a() {
        y4.n a5;
        Q q5 = this.f4106k;
        Object[] objArr = this.f4108m;
        int length = objArr.length;
        Z[] zArr = q5.f4186j;
        if (length != zArr.length) {
            throw new IllegalArgumentException(L1.a.o(AbstractC2107A.v(length, "Argument count (", ") doesn't match expected count ("), zArr.length, ")"));
        }
        O o5 = new O(q5.f4181c, q5.f4180b, q5.f4182d, q5.f4183e, q5.f, q5.f4184g, q5.f4185h, q5.i);
        if (q5.f4187k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            zArr[i].a(o5, objArr[i]);
        }
        C1234l6 c1234l6 = o5.f4150d;
        if (c1234l6 != null) {
            a5 = c1234l6.a();
        } else {
            String str = o5.f4149c;
            y4.n nVar = o5.f4148b;
            nVar.getClass();
            kotlin.jvm.internal.l.f("link", str);
            C1234l6 f = nVar.f(str);
            a5 = f != null ? f.a() : null;
            if (a5 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + nVar + ", Relative: " + o5.f4149c);
            }
        }
        y4.x xVar = o5.f4155k;
        if (xVar == null) {
            G.v vVar = o5.f4154j;
            if (vVar != null) {
                xVar = new y4.k((ArrayList) vVar.f1749l, (ArrayList) vVar.f1750m);
            } else {
                v3.e eVar = o5.i;
                if (eVar != null) {
                    ArrayList arrayList2 = (ArrayList) eVar.f20434n;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    xVar = new y4.s((C0229l) eVar.f20432l, (y4.q) eVar.f20433m, z4.b.v(arrayList2));
                } else if (o5.f4153h) {
                    long j5 = 0;
                    z4.b.b(j5, j5, j5);
                    xVar = new y4.w(0, new byte[0]);
                }
            }
        }
        y4.q qVar = o5.f4152g;
        C2202f c2202f = o5.f;
        if (qVar != null) {
            if (xVar != null) {
                xVar = new N(xVar, qVar);
            } else {
                c2202f.a("Content-Type", qVar.f21372a);
            }
        }
        C0375o c0375o = o5.f4151e;
        c0375o.getClass();
        c0375o.f5042l = a5;
        c0375o.f5044n = c2202f.d().f();
        c0375o.x(o5.f4147a, xVar);
        c0375o.D(C0273t.class, new C0273t(this.f4107l, q5.f4179a, arrayList));
        C0.c m5 = c0375o.m();
        y4.u uVar = (y4.u) this.f4109n;
        uVar.getClass();
        return new C4.i(uVar, m5);
    }

    public final C4.i b() {
        C4.i iVar = this.f4112q;
        if (iVar != null) {
            return iVar;
        }
        Throwable th = this.f4113r;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C4.i a5 = a();
            this.f4112q = a5;
            return a5;
        } catch (IOException | Error | RuntimeException e3) {
            Z.s(e3);
            this.f4113r = e3;
            throw e3;
        }
    }

    public final S c(y4.z zVar) {
        y4.y f = zVar.f();
        y4.B b3 = zVar.f21454q;
        f.f21442g = new C0279z(b3.d(), b3.b());
        y4.z a5 = f.a();
        int i = a5.f21451n;
        if (i < 200 || i >= 300) {
            try {
                b3.f().u(new C0226i());
                b3.d();
                b3.b();
                if (a5.d()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new S(a5, null);
            } finally {
                b3.close();
            }
        }
        if (i == 204 || i == 205) {
            b3.close();
            if (a5.d()) {
                return new S(a5, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C0278y c0278y = new C0278y(b3);
        try {
            Object g5 = this.f4110o.g(c0278y);
            if (a5.d()) {
                return new S(a5, g5);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e3) {
            IOException iOException = c0278y.f4242n;
            if (iOException == null) {
                throw e3;
            }
            throw iOException;
        }
    }

    @Override // O4.InterfaceC0259e
    public final void cancel() {
        C4.i iVar;
        this.f4111p = true;
        synchronized (this) {
            iVar = this.f4112q;
        }
        if (iVar != null) {
            iVar.cancel();
        }
    }

    @Override // O4.InterfaceC0259e
    /* renamed from: clone */
    public final InterfaceC0259e m7clone() {
        return new A(this.f4106k, this.f4107l, this.f4108m, this.f4109n, this.f4110o);
    }

    @Override // O4.InterfaceC0259e
    public final void d(InterfaceC0262h interfaceC0262h) {
        C4.i iVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f4114s) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f4114s = true;
                iVar = this.f4112q;
                th = this.f4113r;
                if (iVar == null && th == null) {
                    try {
                        C4.i a5 = a();
                        this.f4112q = a5;
                        iVar = a5;
                    } catch (Throwable th2) {
                        th = th2;
                        Z.s(th);
                        this.f4113r = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0262h.h(this, th);
            return;
        }
        if (this.f4111p) {
            iVar.cancel();
        }
        iVar.e(new v3.g(this, interfaceC0262h));
    }

    @Override // O4.InterfaceC0259e
    public final synchronized C0.c f() {
        try {
        } catch (IOException e3) {
            throw new RuntimeException("Unable to create request.", e3);
        }
        return b().f877l;
    }

    @Override // O4.InterfaceC0259e
    public final boolean h() {
        boolean z3 = true;
        if (this.f4111p) {
            return true;
        }
        synchronized (this) {
            C4.i iVar = this.f4112q;
            if (iVar == null || !iVar.f888w) {
                z3 = false;
            }
        }
        return z3;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m6clone() {
        return new A(this.f4106k, this.f4107l, this.f4108m, this.f4109n, this.f4110o);
    }
}
