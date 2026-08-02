package p000;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0504ne extends s70 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final C0504ne DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile lv0 PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private C0839wg clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    static {
        C0504ne c0504ne = new C0504ne();
        DEFAULT_INSTANCE = c0504ne;
        s70.m4493l(C0504ne.class, c0504ne);
    }

    /* JADX INFO: renamed from: n */
    public static void m3522n(C0504ne c0504ne, long j) {
        c0504ne.bitField0_ |= 8;
        c0504ne.clientTimestampMillis_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m3523o(C0504ne c0504ne, EnumC0560ox enumC0560ox) {
        c0504ne.getClass();
        c0504ne.event_ = Integer.valueOf(enumC0560ox.f5934j);
        c0504ne.eventCase_ = 5;
    }

    /* JADX INFO: renamed from: p */
    public static void m3524p(C0504ne c0504ne, EnumC0667rt enumC0667rt) {
        c0504ne.getClass();
        c0504ne.event_ = Integer.valueOf(enumC0667rt.f6957j);
        c0504ne.eventCase_ = 6;
    }

    /* JADX INFO: renamed from: q */
    public static void m3525q(C0504ne c0504ne, b11 b11Var) {
        c0504ne.getClass();
        c0504ne.event_ = Integer.valueOf(b11Var.f680j);
        c0504ne.eventCase_ = 7;
    }

    /* JADX INFO: renamed from: r */
    public static void m3526r(C0504ne c0504ne, String str) {
        c0504ne.getClass();
        str.getClass();
        c0504ne.bitField0_ |= 1;
        c0504ne.projectNumber_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m3527s(C0504ne c0504ne) {
        c0504ne.getClass();
        c0504ne.bitField0_ |= 16;
        c0504ne.fiamSdkVersion_ = "22.0.3";
    }

    /* JADX INFO: renamed from: t */
    public static void m3528t(C0504ne c0504ne, String str) {
        c0504ne.getClass();
        c0504ne.bitField0_ |= 2;
        c0504ne.campaignId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m3529u(C0504ne c0504ne, C0839wg c0839wg) {
        c0504ne.getClass();
        c0504ne.clientApp_ = c0839wg;
        c0504ne.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: v */
    public static C0467me m3530v() {
        return (C0467me) DEFAULT_INSTANCE.m4494d();
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
                return new yz0(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", C0630qt.f6587c, C0630qt.f6586b, C0630qt.f6589e, C0630qt.f6588d, "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 3:
                return new C0504ne();
            case 4:
                return new C0467me(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0504ne.class) {
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
