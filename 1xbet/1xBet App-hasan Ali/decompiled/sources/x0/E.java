package x0;

import java.util.List;
import java.util.Map;
import r.C2321G;
import w0.AbstractC2540a;
import z0.C2731G;
import z0.EnumC2727C;

/* loaded from: classes.dex */
public final class E implements j0 {

    /* renamed from: k, reason: collision with root package name */
    public W0.m f20925k = W0.m.f6017l;

    /* renamed from: l, reason: collision with root package name */
    public float f20926l;

    /* renamed from: m, reason: collision with root package name */
    public float f20927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f20928n;

    public E(K k5) {
        this.f20928n = k5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // x0.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List C(i4.e eVar, Object obj) {
        Object obj2;
        K k5 = this.f20928n;
        k5.b();
        C2731G c2731g = k5.f20941k;
        EnumC2727C enumC2727C = c2731g.f21613P.f21653d;
        EnumC2727C enumC2727C2 = EnumC2727C.f21585k;
        EnumC2727C enumC2727C3 = EnumC2727C.f21587m;
        if (enumC2727C != enumC2727C2 && enumC2727C != enumC2727C3 && enumC2727C != EnumC2727C.f21586l && enumC2727C != EnumC2727C.f21588n) {
            AbstractC2540a.b("subcompose can only be used inside the measure or layout blocks");
        }
        C2321G c2321g = k5.f20947q;
        Object g5 = c2321g.g(obj);
        if (g5 == null) {
            g5 = (C2731G) k5.f20950t.k(obj);
            if (g5 != null) {
                if (k5.f20955y <= 0) {
                    AbstractC2540a.b("Check failed.");
                }
                k5.f20955y--;
            } else {
                g5 = k5.i(obj);
                if (g5 == null) {
                    int i = k5.f20944n;
                    C2731G c2731g2 = new C2731G(2);
                    c2731g.f21639z = true;
                    c2731g.B(i, c2731g2);
                    c2731g.f21639z = false;
                    g5 = c2731g2;
                }
            }
            c2321g.m(obj, g5);
        }
        C2731G c2731g3 = (C2731G) g5;
        List o5 = c2731g.o();
        int i5 = k5.f20944n;
        if (i5 >= 0) {
            R.b bVar = (R.b) o5;
            if (i5 < bVar.f5100k.f5108m) {
                obj2 = bVar.get(i5);
                if (obj2 != c2731g3) {
                    int j5 = ((R.b) c2731g.o()).f5100k.j(c2731g3);
                    if (j5 < k5.f20944n) {
                        AbstractC2540a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i6 = k5.f20944n;
                    if (i6 != j5) {
                        c2731g.f21639z = true;
                        c2731g.M(j5, i6, 1);
                        c2731g.f21639z = false;
                    }
                }
                k5.f20944n++;
                k5.f(c2731g3, obj, eVar);
                return (enumC2727C != enumC2727C2 || enumC2727C == enumC2727C3) ? c2731g3.m() : c2731g3.l();
            }
        }
        obj2 = null;
        if (obj2 != c2731g3) {
        }
        k5.f20944n++;
        k5.f(c2731g3, obj, eVar);
        if (enumC2727C != enumC2727C2) {
        }
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f20926l;
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f20925k;
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // x0.Q
    public final P i(int i, int i5, Map map, i4.c cVar) {
        return p(i, i5, map, null, cVar);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f20927m;
    }

    @Override // x0.Q
    public final P p(int i, int i5, Map map, i0.K k5, i4.c cVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2540a.b("Size(" + i + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new D(i, i5, map, k5, this, this.f20928n, cVar);
    }

    @Override // x0.InterfaceC2632s
    public final boolean t() {
        EnumC2727C enumC2727C = this.f20928n.f20941k.f21613P.f21653d;
        return enumC2727C == EnumC2727C.f21588n || enumC2727C == EnumC2727C.f21586l;
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
