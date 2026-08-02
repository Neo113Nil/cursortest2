package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends s70 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final cp0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile lv0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private yo0 actionButton_;
    private wo0 action_;
    private int bitField0_;
    private dp0 body_;
    private dp0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        cp0 cp0Var = new cp0();
        DEFAULT_INSTANCE = cp0Var;
        s70.m4493l(cp0.class, cp0Var);
    }

    /* JADX INFO: renamed from: r */
    public static cp0 m1020r() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 3:
                return new cp0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (cp0.class) {
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
    public final wo0 m1021n() {
        wo0 wo0Var = this.action_;
        return wo0Var == null ? wo0.m5368o() : wo0Var;
    }

    /* JADX INFO: renamed from: o */
    public final yo0 m1022o() {
        yo0 yo0Var = this.actionButton_;
        return yo0Var == null ? yo0.m5817o() : yo0Var;
    }

    /* JADX INFO: renamed from: p */
    public final String m1023p() {
        return this.backgroundHexColor_;
    }

    /* JADX INFO: renamed from: q */
    public final dp0 m1024q() {
        dp0 dp0Var = this.body_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: s */
    public final String m1025s() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final dp0 m1026t() {
        dp0 dp0Var = this.title_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1027u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1028v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1029w() {
        return (this.bitField0_ & 1) != 0;
    }
}
