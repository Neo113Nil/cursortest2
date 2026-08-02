package p000;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0839wg extends s70 {
    private static final C0839wg DEFAULT_INSTANCE;
    public static final int FIREBASE_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private int bitField0_;
    private String googleAppId_ = "";
    private String firebaseInstanceId_ = "";

    static {
        C0839wg c0839wg = new C0839wg();
        DEFAULT_INSTANCE = c0839wg;
        s70.m4493l(C0839wg.class, c0839wg);
    }

    /* JADX INFO: renamed from: n */
    public static void m5325n(C0839wg c0839wg, String str) {
        c0839wg.getClass();
        str.getClass();
        c0839wg.bitField0_ |= 1;
        c0839wg.googleAppId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m5326o(C0839wg c0839wg, String str) {
        c0839wg.getClass();
        str.getClass();
        c0839wg.bitField0_ |= 2;
        c0839wg.firebaseInstanceId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static C0765ug m5327p() {
        return (C0765ug) DEFAULT_INSTANCE.m4494d();
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
                return new yz0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "googleAppId_", "firebaseInstanceId_"});
            case 3:
                return new C0839wg();
            case 4:
                return new C0765ug(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0839wg.class) {
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
