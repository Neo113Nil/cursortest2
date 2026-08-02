package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uz0 extends s70 {
    private static final uz0 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private zl0 limits_ = zl0.f9859k;

    static {
        uz0 uz0Var = new uz0();
        DEFAULT_INSTANCE = uz0Var;
        s70.m4493l(uz0.class, uz0Var);
    }

    /* JADX INFO: renamed from: n */
    public static zl0 m5004n(uz0 uz0Var) {
        zl0 zl0Var = uz0Var.limits_;
        if (!zl0Var.f9860j) {
            uz0Var.limits_ = zl0Var.m5938c();
        }
        return uz0Var.limits_;
    }

    /* JADX INFO: renamed from: o */
    public static uz0 m5005o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static sz0 m5006q(uz0 uz0Var) {
        o70 o70VarM4494d = DEFAULT_INSTANCE.m4494d();
        if (!o70VarM4494d.f5644j.equals(uz0Var)) {
            o70VarM4494d.m3637c();
            o70.m3634d(o70VarM4494d.f5645k, uz0Var);
        }
        return (sz0) o70VarM4494d;
    }

    /* JADX INFO: renamed from: r */
    public static lv0 m5007r() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", tz0.f7629a});
            case 3:
                return new uz0();
            case 4:
                return new sz0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (uz0.class) {
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
    public final rz0 m5008p(rz0 rz0Var) {
        zl0 zl0Var = this.limits_;
        return zl0Var.containsKey("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") ? (rz0) zl0Var.get("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") : rz0Var;
    }
}
