package p000;

/* JADX INFO: renamed from: aj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020aj extends s70 {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final C0020aj DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile lv0 PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private de0 triggerParams_ = gy0.f2961m;
    private String name_ = "";

    static {
        C0020aj c0020aj = new C0020aj();
        DEFAULT_INSTANCE = c0020aj;
        s70.m4493l(C0020aj.class, c0020aj);
    }

    /* JADX INFO: renamed from: n */
    public static C0020aj m254n() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", C0140dj.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 3:
                return new C0020aj();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0020aj.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m255o() {
        return this.name_;
    }
}
