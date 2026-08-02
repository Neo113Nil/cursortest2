package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 extends t70 {
    private static final ww0 DEFAULT_INSTANCE;
    private static volatile mv0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private am0 preferences_ = am0.f247k;

    static {
        ww0 ww0Var = new ww0();
        DEFAULT_INSTANCE = ww0Var;
        t70.m4754j(ww0.class, ww0Var);
    }

    /* JADX INFO: renamed from: l */
    public static am0 m5419l(ww0 ww0Var) {
        am0 am0Var = ww0Var.preferences_;
        if (!am0Var.f248j) {
            ww0Var.preferences_ = am0Var.m277b();
        }
        return ww0Var.preferences_;
    }

    /* JADX INFO: renamed from: n */
    public static uw0 m5420n() {
        return (uw0) ((p70) DEFAULT_INSTANCE.mo507c(5));
    }

    /* JADX INFO: renamed from: o */
    public static ww0 m5421o(FileInputStream fileInputStream) {
        ww0 ww0Var = DEFAULT_INSTANCE;
        C0139di c0139di = new C0139di(fileInputStream);
        C0746ty c0746tyM4866a = C0746ty.m4866a();
        t70 t70VarM4757i = ww0Var.m4757i();
        try {
            fy0 fy0Var = fy0.f2536c;
            fy0Var.getClass();
            s51 s51VarM1907a = fy0Var.m1907a(t70VarM4757i.getClass());
            C0212fi c0212fi = (C0212fi) c0139di.f2095b;
            if (c0212fi == null) {
                c0212fi = new C0212fi(c0139di);
            }
            s51VarM1907a.mo4480f(t70VarM4757i, c0212fi, c0746tyM4866a);
            s51VarM1907a.mo4476b(t70VarM4757i);
            if (t70.m4753f(t70VarM4757i, true)) {
                return (ww0) t70VarM4757i;
            }
            throw new if0(new jf1().getMessage());
        } catch (if0 e) {
            if (e.f3561j) {
                throw new if0(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof if0) {
                throw ((if0) e2.getCause());
            }
            throw new if0(e2.getMessage(), e2);
        } catch (jf1 e3) {
            throw new if0(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof if0) {
                throw ((if0) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // p000.t70
    /* JADX INFO: renamed from: c */
    public final Object mo507c(int i) {
        mv0 r70Var;
        switch (AbstractC0024an.m292o(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new zz0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", vw0.f8277a});
            case 3:
                return new ww0();
            case 4:
                return new uw0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mv0 mv0Var = PARSER;
                if (mv0Var != null) {
                    return mv0Var;
                }
                synchronized (ww0.class) {
                    try {
                        r70Var = PARSER;
                        if (r70Var == null) {
                            r70Var = new r70();
                            PARSER = r70Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return r70Var;
            default:
                dd0.m1164i();
                return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final Map m5422m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
