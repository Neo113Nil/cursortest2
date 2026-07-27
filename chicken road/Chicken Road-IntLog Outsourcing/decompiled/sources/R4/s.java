package R4;

import G0.F;
import G0.P;
import P4.L;
import Q4.AbstractC0149c;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final P f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0149c f2712b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2713c;

    /* renamed from: d, reason: collision with root package name */
    public final s[] f2714d;

    /* renamed from: e, reason: collision with root package name */
    public final Q4.j f2715e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2716f;

    /* renamed from: g, reason: collision with root package name */
    public String f2717g;

    public s(P composer, AbstractC0149c json, w wVar, s[] sVarArr) {
        kotlin.jvm.internal.i.e(composer, "composer");
        kotlin.jvm.internal.i.e(json, "json");
        this.f2711a = composer;
        this.f2712b = json;
        this.f2713c = wVar;
        this.f2714d = sVarArr;
        this.f2715e = json.f2501a;
        int ordinal = wVar.ordinal();
        if (sVarArr != null) {
            s sVar = sVarArr[ordinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[ordinal] = this;
        }
    }

    public final s a(N4.e descriptor) {
        s sVar;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC0149c abstractC0149c = this.f2712b;
        w k3 = m.k(descriptor, abstractC0149c);
        char c2 = k3.f2733a;
        P p5 = this.f2711a;
        p5.f(c2);
        p5.a();
        if (this.f2717g != null) {
            p5.b();
            String str = this.f2717g;
            kotlin.jvm.internal.i.b(str);
            o(str);
            p5.f(':');
            p5.l();
            o(descriptor.b());
            this.f2717g = null;
        }
        if (this.f2713c == k3) {
            return this;
        }
        s[] sVarArr = this.f2714d;
        return (sVarArr == null || (sVar = sVarArr[k3.ordinal()]) == null) ? new s(p5, abstractC0149c, k3, sVarArr) : sVar;
    }

    public final void b(boolean z) {
        if (this.f2716f) {
            o(String.valueOf(z));
        } else {
            ((F) this.f2711a.f797b).e(String.valueOf(z));
        }
    }

    public final void c(byte b6) {
        if (this.f2716f) {
            o(String.valueOf((int) b6));
        } else {
            this.f2711a.e(b6);
        }
    }

    public final void d(char c2) {
        o(String.valueOf(c2));
    }

    public final void e(double d6) {
        boolean z = this.f2716f;
        P p5 = this.f2711a;
        if (z) {
            o(String.valueOf(d6));
        } else {
            ((F) p5.f797b).e(String.valueOf(d6));
        }
        if (this.f2715e.f2536k) {
            return;
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6)) {
            throw m.a(Double.valueOf(d6), ((F) p5.f797b).toString());
        }
    }

    public final void f(N4.e descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        int ordinal = this.f2713c.ordinal();
        boolean z = true;
        P p5 = this.f2711a;
        if (ordinal == 1) {
            if (!p5.f796a) {
                p5.f(',');
            }
            p5.b();
            return;
        }
        if (ordinal == 2) {
            if (p5.f796a) {
                this.f2716f = true;
                p5.b();
                return;
            }
            if (i2 % 2 == 0) {
                p5.f(',');
                p5.b();
            } else {
                p5.f(':');
                p5.l();
                z = false;
            }
            this.f2716f = z;
            return;
        }
        if (ordinal == 3) {
            if (i2 == 0) {
                this.f2716f = true;
            }
            if (i2 == 1) {
                p5.f(',');
                p5.l();
                this.f2716f = false;
                return;
            }
            return;
        }
        if (!p5.f796a) {
            p5.f(',');
        }
        p5.b();
        AbstractC0149c json = this.f2712b;
        kotlin.jvm.internal.i.e(json, "json");
        m.j(descriptor, json);
        o(descriptor.e(i2));
        p5.f(':');
        p5.l();
    }

    public final void g(float f3) {
        boolean z = this.f2716f;
        P p5 = this.f2711a;
        if (z) {
            o(String.valueOf(f3));
        } else {
            ((F) p5.f797b).e(String.valueOf(f3));
        }
        if (this.f2715e.f2536k) {
            return;
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw m.a(Float.valueOf(f3), ((F) p5.f797b).toString());
        }
    }

    public final s h(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        boolean a6 = t.a(descriptor);
        w wVar = this.f2713c;
        AbstractC0149c abstractC0149c = this.f2712b;
        P p5 = this.f2711a;
        if (a6) {
            if (!(p5 instanceof f)) {
                p5 = new f((F) p5.f797b, this.f2716f);
            }
            return new s(p5, abstractC0149c, wVar, null);
        }
        if (!descriptor.isInline() || !descriptor.equals(Q4.m.f2541a)) {
            return this;
        }
        if (!(p5 instanceof e)) {
            p5 = new e((F) p5.f797b, this.f2716f);
        }
        return new s(p5, abstractC0149c, wVar, null);
    }

    public final s i(L descriptor, int i2) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        f(descriptor, i2);
        return h(descriptor.h(i2));
    }

    public final void j(int i2) {
        if (this.f2716f) {
            o(String.valueOf(i2));
        } else {
            this.f2711a.g(i2);
        }
    }

    public final void k(long j2) {
        if (this.f2716f) {
            o(String.valueOf(j2));
        } else {
            this.f2711a.h(j2);
        }
    }

    public final void l(N4.e descriptor, int i2, M4.a serializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(serializer, "serializer");
        f(descriptor, i2);
        m(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(M4.a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.i.e(serializer, "serializer");
        AbstractC0149c abstractC0149c = this.f2712b;
        Q4.j jVar = abstractC0149c.f2501a;
        if (jVar.f2534i) {
            serializer.b(this, obj);
            return;
        }
        int ordinal = jVar.f2540o.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AbstractC1341c c2 = serializer.c().c();
                if (kotlin.jvm.internal.i.a(c2, N4.j.f2190b) || kotlin.jvm.internal.i.a(c2, N4.j.f2193e)) {
                    N4.e c6 = serializer.c();
                    kotlin.jvm.internal.i.e(c6, "<this>");
                    Iterator it = c6.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = abstractC0149c.f2501a.f2535j;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof Q4.i) {
                            str = ((Q4.i) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        this.f2717g = str;
                    }
                    serializer.b(this, obj);
                }
            } else if (ordinal != 2) {
                throw new C1.b();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.b(this, obj);
    }

    public final void n(short s2) {
        if (this.f2716f) {
            o(String.valueOf((int) s2));
        } else {
            this.f2711a.j(s2);
        }
    }

    public final void o(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f2711a.k(value);
    }

    public final void p(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        w wVar = this.f2713c;
        P p5 = this.f2711a;
        p5.m();
        p5.c();
        p5.f(wVar.f2734b);
    }
}
