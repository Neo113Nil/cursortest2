package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends t70 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ax0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile mv0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ax0 ax0Var = new ax0();
        DEFAULT_INSTANCE = ax0Var;
        t70.m4754j(ax0.class, ax0Var);
    }

    /* JADX INFO: renamed from: D */
    public static zw0 m494D() {
        return (zw0) ((p70) DEFAULT_INSTANCE.mo507c(5));
    }

    /* JADX INFO: renamed from: l */
    public static void m495l(ax0 ax0Var, long j) {
        ax0Var.valueCase_ = 4;
        ax0Var.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: m */
    public static void m496m(ax0 ax0Var, String str) {
        ax0Var.getClass();
        ax0Var.valueCase_ = 5;
        ax0Var.value_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m497n(ax0 ax0Var, yw0 yw0Var) {
        ax0Var.getClass();
        ax0Var.value_ = yw0Var;
        ax0Var.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: o */
    public static void m498o(ax0 ax0Var, double d) {
        ax0Var.valueCase_ = 7;
        ax0Var.value_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: p */
    public static void m499p(ax0 ax0Var, C0799vd c0799vd) {
        ax0Var.getClass();
        ax0Var.valueCase_ = 8;
        ax0Var.value_ = c0799vd;
    }

    /* JADX INFO: renamed from: q */
    public static void m500q(ax0 ax0Var, boolean z) {
        ax0Var.valueCase_ = 1;
        ax0Var.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: r */
    public static void m501r(ax0 ax0Var, float f) {
        ax0Var.valueCase_ = 2;
        ax0Var.value_ = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: s */
    public static void m502s(ax0 ax0Var, int i) {
        ax0Var.valueCase_ = 3;
        ax0Var.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: v */
    public static ax0 m503v() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m504A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: B */
    public final yw0 m505B() {
        return this.valueCase_ == 6 ? (yw0) this.value_ : yw0.m5848m();
    }

    /* JADX INFO: renamed from: C */
    public final int m506C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
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
                return new zz0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", yw0.class});
            case 3:
                return new ax0();
            case 4:
                return new zw0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mv0 mv0Var = PARSER;
                if (mv0Var != null) {
                    return mv0Var;
                }
                synchronized (ax0.class) {
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

    /* JADX INFO: renamed from: t */
    public final boolean m508t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final C0799vd m509u() {
        return this.valueCase_ == 8 ? (C0799vd) this.value_ : C0799vd.f8177l;
    }

    /* JADX INFO: renamed from: w */
    public final double m510w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x */
    public final float m511x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: y */
    public final int m512y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public final long m513z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
