package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 extends s70 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final xo0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile lv0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private wo0 action_;
    private int bitField0_;
    private dp0 body_;
    private dp0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        xo0 xo0Var = new xo0();
        DEFAULT_INSTANCE = xo0Var;
        s70.m4493l(xo0.class, xo0Var);
    }

    /* JADX INFO: renamed from: q */
    public static xo0 m5671q() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 3:
                return new xo0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (xo0.class) {
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
    public final wo0 m5672n() {
        wo0 wo0Var = this.action_;
        return wo0Var == null ? wo0.m5368o() : wo0Var;
    }

    /* JADX INFO: renamed from: o */
    public final String m5673o() {
        return this.backgroundHexColor_;
    }

    /* JADX INFO: renamed from: p */
    public final dp0 m5674p() {
        dp0 dp0Var = this.body_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: r */
    public final String m5675r() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final dp0 m5676s() {
        dp0 dp0Var = this.title_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5677t() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5678u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5679v() {
        return (this.bitField0_ & 1) != 0;
    }
}
