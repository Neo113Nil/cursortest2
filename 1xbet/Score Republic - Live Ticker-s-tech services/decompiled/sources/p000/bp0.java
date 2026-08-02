package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bp0 extends s70 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final bp0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private wo0 action_;
    private int bitField0_;
    private String imageUrl_ = "";

    static {
        bp0 bp0Var = new bp0();
        DEFAULT_INSTANCE = bp0Var;
        s70.m4493l(bp0.class, bp0Var);
    }

    /* JADX INFO: renamed from: o */
    public static bp0 m735o() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
            case 3:
                return new bp0();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (bp0.class) {
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
    public final wo0 m736n() {
        wo0 wo0Var = this.action_;
        return wo0Var == null ? wo0.m5368o() : wo0Var;
    }

    /* JADX INFO: renamed from: p */
    public final String m737p() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m738q() {
        return (this.bitField0_ & 1) != 0;
    }
}
