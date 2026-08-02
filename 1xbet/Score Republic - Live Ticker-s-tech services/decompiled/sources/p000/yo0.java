package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 extends s70 {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final yo0 DEFAULT_INSTANCE;
    private static volatile lv0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonHexColor_ = "";
    private dp0 text_;

    static {
        yo0 yo0Var = new yo0();
        DEFAULT_INSTANCE = yo0Var;
        s70.m4493l(yo0.class, yo0Var);
    }

    /* JADX INFO: renamed from: o */
    public static yo0 m5817o() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
            case 3:
                return new yo0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (yo0.class) {
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
    public final String m5818n() {
        return this.buttonHexColor_;
    }

    /* JADX INFO: renamed from: p */
    public final dp0 m5819p() {
        dp0 dp0Var = this.text_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5820q() {
        return (this.bitField0_ & 1) != 0;
    }
}
