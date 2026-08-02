package p000;

/* JADX INFO: renamed from: pz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599pz extends s70 {
    private static final C0599pz DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private long expirationEpochTimestampMillis_;
    private de0 messages_ = gy0.f2961m;

    static {
        C0599pz c0599pz = new C0599pz();
        DEFAULT_INSTANCE = c0599pz;
        s70.m4493l(C0599pz.class, c0599pz);
    }

    /* JADX INFO: renamed from: n */
    public static void m4008n(C0599pz c0599pz, long j) {
        c0599pz.expirationEpochTimestampMillis_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static C0599pz m4009o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static C0562oz m4010r() {
        return (C0562oz) DEFAULT_INSTANCE.m4494d();
    }

    /* JADX INFO: renamed from: s */
    public static lv0 m4011s() {
        return (lv0) DEFAULT_INSTANCE.mo182e(7);
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", C0948ze.class, "expirationEpochTimestampMillis_"});
            case 3:
                return new C0599pz();
            case 4:
                return new C0562oz(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0599pz.class) {
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
    public final long m4012p() {
        return this.expirationEpochTimestampMillis_;
    }

    /* JADX INFO: renamed from: q */
    public final de0 m4013q() {
        return this.messages_;
    }
}
