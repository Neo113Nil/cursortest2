package H2;

import a.AbstractC0086a;
import android.os.Build;
import d2.C0274d;
import d2.C0275e;
import e2.r;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final G2.d f546a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.e f547b;

    /* renamed from: c, reason: collision with root package name */
    public G2.a f548c;

    /* renamed from: d, reason: collision with root package name */
    public final a1.e f549d;

    /* renamed from: e, reason: collision with root package name */
    public h f550e;
    public I2.c f;

    /* renamed from: g, reason: collision with root package name */
    public float f551g;

    /* renamed from: h, reason: collision with root package name */
    public float f552h;

    /* renamed from: i, reason: collision with root package name */
    public float f553i;

    /* renamed from: j, reason: collision with root package name */
    public G2.f f554j;

    /* renamed from: k, reason: collision with root package name */
    public G2.e f555k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f556l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f557m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f558n;

    /* renamed from: o, reason: collision with root package name */
    public int f559o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0086a f560p;

    public p(G2.d ref, a1.e eVar, G2.a aVar, a1.e soundPoolManager) {
        kotlin.jvm.internal.j.e(ref, "ref");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f546a = ref;
        this.f547b = eVar;
        this.f548c = aVar;
        this.f549d = soundPoolManager;
        this.f551g = 1.0f;
        this.f553i = 1.0f;
        this.f554j = G2.f.f449a;
        this.f555k = G2.e.f447a;
        this.f556l = true;
        this.f559o = -1;
        n nVar = new n(0, this);
        o oVar = new o(0, this);
        this.f560p = Build.VERSION.SDK_INT >= 26 ? new b(this, nVar, oVar, 1) : new b(this, nVar, oVar, 0);
    }

    public static void j(h hVar, float f, float f3) {
        hVar.m(Math.min(1.0f, 1.0f - f3) * f, Math.min(1.0f, f3 + 1.0f) * f);
    }

    public final void a(h hVar) {
        j(hVar, this.f551g, this.f552h);
        hVar.b(this.f554j == G2.f.f450b);
        hVar.f();
    }

    public final h b() {
        int ordinal = this.f555k.ordinal();
        if (ordinal == 0) {
            return new a1.e(this);
        }
        if (ordinal == 1) {
            return new l(this, this.f549d);
        }
        throw new T0.b();
    }

    public final void c(String message) {
        kotlin.jvm.internal.j.e(message, "message");
        this.f546a.getClass();
        this.f547b.E("audio.onLog", r.l0(new C0274d("value", message)));
    }

    public final void d() {
        h hVar;
        if (this.f558n) {
            this.f558n = false;
            if (!this.f557m || (hVar = this.f550e) == null) {
                return;
            }
            hVar.a();
        }
    }

    public final void e() {
        h hVar;
        this.f560p.C();
        if (this.f556l) {
            return;
        }
        if (this.f558n && (hVar = this.f550e) != null) {
            hVar.c();
        }
        i(null);
        this.f550e = null;
    }

    public final void f() {
        AbstractC0086a abstractC0086a = this.f560p;
        if (!kotlin.jvm.internal.j.a(abstractC0086a.x(), abstractC0086a.A().f548c)) {
            abstractC0086a.W(abstractC0086a.A().f548c);
            abstractC0086a.d0();
        }
        if (abstractC0086a.D()) {
            abstractC0086a.T();
        } else {
            abstractC0086a.y().invoke();
        }
    }

    public final void g(G2.e eVar) {
        Object obj;
        if (this.f555k != eVar) {
            this.f555k = eVar;
            h hVar = this.f550e;
            if (hVar != null) {
                try {
                    Integer n3 = hVar.n();
                    if (n3 == null) {
                        obj = n3;
                    } else {
                        int intValue = n3.intValue();
                        obj = n3;
                        if (intValue == 0) {
                            obj = null;
                        }
                    }
                } catch (Throwable th) {
                    obj = X0.a.n(th);
                }
                Integer num = (Integer) (obj instanceof C0275e ? null : obj);
                this.f559o = num != null ? num.intValue() : -1;
                h(false);
                hVar.release();
            }
            h b3 = b();
            this.f550e = b3;
            I2.c cVar = this.f;
            if (cVar != null) {
                b3.p(cVar);
                a(b3);
            }
        }
    }

    public final void h(boolean z3) {
        if (this.f557m != z3) {
            this.f557m = z3;
            this.f546a.getClass();
            G2.d.c(this, z3);
        }
    }

    public final void i(I2.c cVar) {
        if (kotlin.jvm.internal.j.a(this.f, cVar)) {
            this.f546a.getClass();
            G2.d.c(this, true);
            return;
        }
        if (cVar != null) {
            h hVar = this.f550e;
            if (this.f556l || hVar == null) {
                hVar = b();
                this.f550e = hVar;
                this.f556l = false;
            } else if (this.f557m) {
                hVar.reset();
                h(false);
            }
            hVar.p(cVar);
            a(hVar);
        } else {
            this.f556l = true;
            h(false);
            this.f558n = false;
            h hVar2 = this.f550e;
            if (hVar2 != null) {
                hVar2.release();
            }
        }
        this.f = cVar;
    }

    public final void k() {
        h hVar;
        this.f560p.C();
        if (this.f556l) {
            return;
        }
        if (this.f554j == G2.f.f449a) {
            e();
            return;
        }
        d();
        if (this.f557m) {
            h hVar2 = this.f550e;
            int i3 = 0;
            if (hVar2 == null || !hVar2.h()) {
                if (this.f557m && ((hVar = this.f550e) == null || !hVar.h())) {
                    h hVar3 = this.f550e;
                    if (hVar3 != null) {
                        hVar3.j(0);
                    }
                    i3 = -1;
                }
                this.f559o = i3;
                return;
            }
            h hVar4 = this.f550e;
            if (hVar4 != null) {
                hVar4.c();
            }
            h(false);
            h hVar5 = this.f550e;
            if (hVar5 != null) {
                hVar5.f();
            }
        }
    }

    public final void l(G2.a aVar) {
        if (this.f548c.equals(aVar)) {
            return;
        }
        if (this.f548c.f438e != 0 && aVar.f438e == 0) {
            this.f560p.C();
        }
        this.f548c = G2.a.b(aVar);
        G2.d dVar = this.f546a;
        dVar.a().setMode(this.f548c.f);
        dVar.a().setSpeakerphoneOn(this.f548c.f434a);
        h hVar = this.f550e;
        if (hVar != null) {
            hVar.c();
            h(false);
            hVar.k(this.f548c);
            I2.c cVar = this.f;
            if (cVar != null) {
                hVar.p(cVar);
                a(hVar);
            }
        }
    }
}
