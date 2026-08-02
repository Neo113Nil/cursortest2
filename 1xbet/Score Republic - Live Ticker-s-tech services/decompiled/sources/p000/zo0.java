package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 extends s70 {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final zo0 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile lv0 PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private dp0 body_;
    private yo0 primaryActionButton_;
    private wo0 primaryAction_;
    private yo0 secondaryActionButton_;
    private wo0 secondaryAction_;
    private dp0 title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        zo0 zo0Var = new zo0();
        DEFAULT_INSTANCE = zo0Var;
        s70.m4493l(zo0.class, zo0Var);
    }

    /* JADX INFO: renamed from: p */
    public static zo0 m5942p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m5943A() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m5944B() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m5945C() {
        return (this.bitField0_ & 1) != 0;
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 3:
                return new zo0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (zo0.class) {
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
    public final String m5946n() {
        return this.backgroundHexColor_;
    }

    /* JADX INFO: renamed from: o */
    public final dp0 m5947o() {
        dp0 dp0Var = this.body_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: q */
    public final String m5948q() {
        return this.landscapeImageUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m5949r() {
        return this.portraitImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final wo0 m5950s() {
        wo0 wo0Var = this.primaryAction_;
        return wo0Var == null ? wo0.m5368o() : wo0Var;
    }

    /* JADX INFO: renamed from: t */
    public final yo0 m5951t() {
        yo0 yo0Var = this.primaryActionButton_;
        return yo0Var == null ? yo0.m5817o() : yo0Var;
    }

    /* JADX INFO: renamed from: u */
    public final wo0 m5952u() {
        wo0 wo0Var = this.secondaryAction_;
        return wo0Var == null ? wo0.m5368o() : wo0Var;
    }

    /* JADX INFO: renamed from: v */
    public final yo0 m5953v() {
        yo0 yo0Var = this.secondaryActionButton_;
        return yo0Var == null ? yo0.m5817o() : yo0Var;
    }

    /* JADX INFO: renamed from: w */
    public final dp0 m5954w() {
        dp0 dp0Var = this.title_;
        return dp0Var == null ? dp0.m1277n() : dp0Var;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5955x() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5956y() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5957z() {
        return (this.bitField0_ & 4) != 0;
    }
}
