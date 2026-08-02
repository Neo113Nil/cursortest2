package H2;

import a.AbstractC0444a;
import android.os.SystemClock;
import w2.C2551i;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final k f2301k = new k();

    /* renamed from: l, reason: collision with root package name */
    public static C2551i f2302l;

    @Override // H2.h
    public boolean a(F2.h hVar) {
        AbstractC0444a abstractC0444a = hVar.f1536a;
        if ((abstractC0444a instanceof F2.a ? ((F2.a) abstractC0444a).f : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC0444a abstractC0444a2 = hVar.f1537b;
        return (abstractC0444a2 instanceof F2.a ? ((F2.a) abstractC0444a2).f : Integer.MAX_VALUE) > 100;
    }

    @Override // H2.h
    public boolean b() {
        boolean z3;
        synchronized (g.f2289a) {
            try {
                int i = g.f2291c;
                g.f2291c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > g.f2292d + 30000) {
                    g.f2291c = 0;
                    g.f2292d = SystemClock.uptimeMillis();
                    String[] list = g.f2290b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    g.f2293e = list.length < 800;
                }
                z3 = g.f2293e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
