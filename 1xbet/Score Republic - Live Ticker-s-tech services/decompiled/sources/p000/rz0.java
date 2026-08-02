package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 extends s70 {
    private static final rz0 DEFAULT_INSTANCE;
    private static volatile lv0 PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    static {
        rz0 rz0Var = new rz0();
        DEFAULT_INSTANCE = rz0Var;
        s70.m4493l(rz0.class, rz0Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m4431n(rz0 rz0Var, long j) {
        rz0Var.value_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m4432o(rz0 rz0Var) {
        rz0Var.value_ = 0L;
    }

    /* JADX INFO: renamed from: p */
    public static void m4433p(rz0 rz0Var, long j) {
        rz0Var.startTimeEpoch_ = j;
    }

    /* JADX INFO: renamed from: q */
    public static rz0 m4434q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static qz0 m4435t() {
        return (qz0) DEFAULT_INSTANCE.m4494d();
    }

    /* JADX INFO: renamed from: u */
    public static qz0 m4436u(rz0 rz0Var) {
        o70 o70VarM4494d = DEFAULT_INSTANCE.m4494d();
        if (!o70VarM4494d.f5644j.equals(rz0Var)) {
            o70VarM4494d.m3637c();
            o70.m3634d(o70VarM4494d.f5645k, rz0Var);
        }
        return (qz0) o70VarM4494d;
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 3:
                return new rz0();
            case 4:
                return new qz0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (rz0.class) {
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

    /* JADX INFO: renamed from: r */
    public final long m4437r() {
        return this.startTimeEpoch_;
    }

    /* JADX INFO: renamed from: s */
    public final long m4438s() {
        return this.value_;
    }
}
