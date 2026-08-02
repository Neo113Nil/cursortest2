package p000;

/* JADX INFO: renamed from: te */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0726te extends s70 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final C0726te DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile lv0 PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    static {
        C0726te c0726te = new C0726te();
        DEFAULT_INSTANCE = c0726te;
        s70.m4493l(C0726te.class, c0726te);
    }

    /* JADX INFO: renamed from: n */
    public static void m4785n(C0726te c0726te, String str) {
        c0726te.getClass();
        c0726te.campaignId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m4786o(C0726te c0726te, long j) {
        c0726te.impressionTimestampMillis_ = j;
    }

    /* JADX INFO: renamed from: q */
    public static C0689se m4787q() {
        return (C0689se) DEFAULT_INSTANCE.m4494d();
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 3:
                return new C0726te();
            case 4:
                return new C0689se(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0726te.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m4788p() {
        return this.campaignId_;
    }
}
