package W5;

import U5.AbstractC0438e;
import java.text.MessageFormat;
import java.util.logging.Level;

/* renamed from: W5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0517l extends AbstractC0438e {

    /* renamed from: d, reason: collision with root package name */
    public final C0523n f7268d;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f7269e;

    public C0517l(C0523n c0523n, f2 f2Var) {
        this.f7268d = c0523n;
        p3.f.k(f2Var, "time");
        this.f7269e = f2Var;
    }

    public static Level t(int i7) {
        int e7 = t.e.e(i7);
        return e7 != 1 ? (e7 == 2 || e7 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // U5.AbstractC0438e
    public final void l(int i7, String str) {
        C0523n c0523n = this.f7268d;
        U5.F f7 = c0523n.f7292b;
        Level t7 = t(i7);
        if (C0523n.f7290c.isLoggable(t7)) {
            C0523n.a(f7, t7, str);
        }
        if (!s(i7) || i7 == 1) {
            return;
        }
        int e7 = t.e.e(i7);
        U5.A a2 = e7 != 2 ? e7 != 3 ? U5.A.f6403a : U5.A.f6405c : U5.A.f6404b;
        long d7 = this.f7269e.d();
        p3.f.k(str, "description");
        new U5.B(str, a2, d7, null);
        synchronized (c0523n.f7291a) {
        }
    }

    @Override // U5.AbstractC0438e
    public final void m(int i7, String str, Object... objArr) {
        l(i7, (s(i7) || C0523n.f7290c.isLoggable(t(i7))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean s(int i7) {
        if (i7 != 1) {
            synchronized (this.f7268d.f7291a) {
            }
        }
        return false;
    }
}
