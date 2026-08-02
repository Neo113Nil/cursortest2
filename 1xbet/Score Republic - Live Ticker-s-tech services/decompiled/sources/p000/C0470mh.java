package p000;

/* JADX INFO: renamed from: mh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470mh extends s70 {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final C0470mh DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile lv0 PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    static {
        C0470mh c0470mh = new C0470mh();
        DEFAULT_INSTANCE = c0470mh;
        s70.m4493l(C0470mh.class, c0470mh);
    }

    /* JADX INFO: renamed from: n */
    public static void m3380n(C0470mh c0470mh, String str) {
        c0470mh.getClass();
        str.getClass();
        c0470mh.appVersion_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3381o(C0470mh c0470mh, String str) {
        c0470mh.getClass();
        str.getClass();
        c0470mh.timeZone_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3382p(C0470mh c0470mh, String str) {
        c0470mh.getClass();
        str.getClass();
        c0470mh.platformVersion_ = str;
    }

    /* JADX INFO: renamed from: q */
    public static void m3383q(C0470mh c0470mh, String str) {
        c0470mh.getClass();
        str.getClass();
        c0470mh.languageCode_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static C0433lh m3384r() {
        return (C0433lh) DEFAULT_INSTANCE.m4494d();
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 3:
                return new C0470mh();
            case 4:
                return new C0433lh(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0470mh.class) {
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
