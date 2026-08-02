package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends s70 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final ap0 DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile lv0 PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    static {
        ap0 ap0Var = new ap0();
        DEFAULT_INSTANCE = ap0Var;
        s70.m4493l(ap0.class, ap0Var);
    }

    /* JADX INFO: renamed from: p */
    public static ap0 m450p() {
        return DEFAULT_INSTANCE;
    }

    @Override // p000.s70
    /* JADX INFO: renamed from: e */
    public final Object mo182e(int i) {
        lv0 q70Var;
        switch (AbstractC0024an.m292o(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", xo0.class, cp0.class, bp0.class, zo0.class});
            case 3:
                return new ap0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (ap0.class) {
                    try {
                        q70Var = PARSER;
                        if (q70Var == null) {
                            q70Var = new q70(DEFAULT_INSTANCE);
                            PARSER = q70Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return q70Var;
            default:
                dd0.m1164i();
                return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final xo0 m451n() {
        return this.messageDetailsCase_ == 1 ? (xo0) this.messageDetails_ : xo0.m5671q();
    }

    /* JADX INFO: renamed from: o */
    public final zo0 m452o() {
        return this.messageDetailsCase_ == 4 ? (zo0) this.messageDetails_ : zo0.m5942p();
    }

    /* JADX INFO: renamed from: q */
    public final bp0 m453q() {
        return this.messageDetailsCase_ == 3 ? (bp0) this.messageDetails_ : bp0.m735o();
    }

    /* JADX INFO: renamed from: r */
    public final int m454r() {
        int i = this.messageDetailsCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final cp0 m455s() {
        return this.messageDetailsCase_ == 2 ? (cp0) this.messageDetails_ : cp0.m1020r();
    }
}
