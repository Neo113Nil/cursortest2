package p000;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: renamed from: yf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912yf extends AbstractC0875xf {

    /* JADX INFO: renamed from: i */
    public final C0137dg f9286i;

    /* JADX INFO: renamed from: j */
    public final nc1 f9287j;

    public C0912yf(C0137dg c0137dg, nc1 nc1Var) {
        this.f9286i = c0137dg;
        a90.m127k(nc1Var, "time");
        this.f9287j = nc1Var;
    }

    /* JADX INFO: renamed from: t */
    public static Level m5796t(int i) {
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o != 1) {
            return (iM292o == 2 || iM292o == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: h */
    public final void mo5320h(int i, String str, Object... objArr) {
        mo5321i((m5797s(i) || C0137dg.f1641c.isLoggable(m5796t(i))) ? MessageFormat.format(str, objArr) : null, i);
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: i */
    public final void mo5321i(String str, int i) {
        he0 he0Var;
        C0137dg c0137dg = this.f9286i;
        me0 me0Var = c0137dg.f1643b;
        Level levelM5796t = m5796t(i);
        if (C0137dg.f1641c.isLoggable(levelM5796t)) {
            C0137dg.m1201a(me0Var, levelM5796t, str);
        }
        if (!m5797s(i) || i == 1) {
            return;
        }
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o != 2) {
            he0Var = iM292o != 3 ? he0.f3184j : he0.f3186l;
        } else {
            he0Var = he0.f3185k;
        }
        he0 he0Var2 = he0Var;
        long jM3517H = this.f9287j.m3517H();
        a90.m127k(str, "description");
        new ie0(str, he0Var2, jM3517H, null);
        synchronized (c0137dg.f1642a) {
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5797s(int i) {
        if (i == 1) {
            return false;
        }
        synchronized (this.f9286i.f1642a) {
        }
        return false;
    }
}
