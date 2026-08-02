package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 extends t70 {
    private static final yw0 DEFAULT_INSTANCE;
    private static volatile mv0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private ee0 strings_ = hy0.f3358m;

    static {
        yw0 yw0Var = new yw0();
        DEFAULT_INSTANCE = yw0Var;
        t70.m4754j(yw0.class, yw0Var);
    }

    /* JADX INFO: renamed from: l */
    public static void m5847l(yw0 yw0Var, Set set) {
        ee0 ee0Var = yw0Var.strings_;
        if (!((hy0) ee0Var).f3359j) {
            hy0 hy0Var = (hy0) ee0Var;
            int i = hy0Var.f3361l;
            yw0Var.strings_ = hy0Var.m2352d(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = yw0Var.strings_;
        Charset charset = ge0.f2710a;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((hy0) randomAccess).f3361l);
        }
        hy0 hy0Var2 = (hy0) randomAccess;
        int i2 = hy0Var2.f3361l;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (hy0Var2.f3361l - i2) + " is null.";
                for (int i3 = hy0Var2.f3361l - 1; i3 >= i2; i3--) {
                    hy0Var2.remove(i3);
                }
                C0270h1.m2192h(str);
                return;
            }
            hy0Var2.add(obj);
        }
    }

    /* JADX INFO: renamed from: m */
    public static yw0 m5848m() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static xw0 m5849o() {
        return (xw0) ((p70) DEFAULT_INSTANCE.mo507c(5));
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
                return new zz0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new yw0();
            case 4:
                return new xw0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mv0 mv0Var = PARSER;
                if (mv0Var != null) {
                    return mv0Var;
                }
                synchronized (yw0.class) {
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

    /* JADX INFO: renamed from: n */
    public final ee0 m5850n() {
        return this.strings_;
    }
}
