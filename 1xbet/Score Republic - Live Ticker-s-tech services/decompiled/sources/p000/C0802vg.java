package p000;

/* JADX INFO: renamed from: vg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802vg extends s70 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_TOKEN_FIELD_NUMBER = 3;
    private static final C0802vg DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private String gmpAppId_ = "";
    private String appInstanceId_ = "";
    private String appInstanceIdToken_ = "";

    static {
        C0802vg c0802vg = new C0802vg();
        DEFAULT_INSTANCE = c0802vg;
        s70.m4493l(C0802vg.class, c0802vg);
    }

    /* JADX INFO: renamed from: n */
    public static void m5155n(C0802vg c0802vg, String str) {
        c0802vg.getClass();
        str.getClass();
        c0802vg.gmpAppId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m5156o(C0802vg c0802vg, String str) {
        c0802vg.getClass();
        str.getClass();
        c0802vg.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5157p(C0802vg c0802vg, String str) {
        c0802vg.getClass();
        str.getClass();
        c0802vg.appInstanceIdToken_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static C0728tg m5158q() {
        return (C0728tg) DEFAULT_INSTANCE.m4494d();
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"gmpAppId_", "appInstanceId_", "appInstanceIdToken_"});
            case 3:
                return new C0802vg();
            case 4:
                return new C0728tg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0802vg.class) {
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
}
