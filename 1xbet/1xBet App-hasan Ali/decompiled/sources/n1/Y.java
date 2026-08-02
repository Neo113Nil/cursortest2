package n1;

import android.graphics.Rect;
import g1.C1968b;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f18393a;

    /* renamed from: b, reason: collision with root package name */
    public C1968b[] f18394b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[][] f18395c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect[][] f18396d;

    public Y() {
        this(new k0((k0) null));
    }

    public final void a() {
        C1968b[] c1968bArr = this.f18394b;
        if (c1968bArr != null) {
            C1968b c1968b = c1968bArr[0];
            C1968b c1968b2 = c1968bArr[1];
            k0 k0Var = this.f18393a;
            if (c1968b2 == null) {
                c1968b2 = k0Var.f18442a.i(2);
            }
            if (c1968b == null) {
                c1968b = k0Var.f18442a.i(1);
            }
            h(C1968b.a(c1968b, c1968b2));
            C1968b c1968b3 = this.f18394b[G4.l.E(16)];
            if (c1968b3 != null) {
                g(c1968b3);
            }
            C1968b c1968b4 = this.f18394b[G4.l.E(32)];
            if (c1968b4 != null) {
                e(c1968b4);
            }
            C1968b c1968b5 = this.f18394b[G4.l.E(64)];
            if (c1968b5 != null) {
                i(c1968b5);
            }
        }
    }

    public abstract k0 b();

    public void c(k0 k0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> f = k0Var.f18442a.f(i);
            int E5 = G4.l.E(i);
            this.f18395c[E5] = (Rect[]) f.toArray(new Rect[f.size()]);
            if (i != 8) {
                List<Rect> g5 = k0Var.f18442a.g(i);
                this.f18396d[E5] = (Rect[]) g5.toArray(new Rect[g5.size()]);
            }
        }
    }

    public void d(int i, C1968b c1968b) {
        if (this.f18394b == null) {
            this.f18394b = new C1968b[10];
        }
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i & i5) != 0) {
                this.f18394b[G4.l.E(i5)] = c1968b;
            }
        }
    }

    public abstract void f(C1968b c1968b);

    public abstract void h(C1968b c1968b);

    public Y(k0 k0Var) {
        this.f18395c = new Rect[10][];
        this.f18396d = new Rect[10][];
        this.f18393a = k0Var;
        c(k0Var);
    }

    public void e(C1968b c1968b) {
    }

    public void g(C1968b c1968b) {
    }

    public void i(C1968b c1968b) {
    }
}
