package p000;

/* JADX INFO: renamed from: ve */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800ve extends s70 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final C0800ve DEFAULT_INSTANCE;
    private static volatile lv0 PARSER;
    private de0 alreadySeenCampaigns_ = gy0.f2961m;

    static {
        C0800ve c0800ve = new C0800ve();
        DEFAULT_INSTANCE = c0800ve;
        s70.m4493l(C0800ve.class, c0800ve);
    }

    /* JADX INFO: renamed from: n */
    public static void m5149n(C0800ve c0800ve, C0726te c0726te) {
        c0800ve.getClass();
        de0 de0Var = c0800ve.alreadySeenCampaigns_;
        if (!((AbstractC0490n0) de0Var).f5220j) {
            int size = de0Var.size();
            c0800ve.alreadySeenCampaigns_ = de0Var.mo1171i(size == 0 ? 10 : size * 2);
        }
        c0800ve.alreadySeenCampaigns_.add(c0726te);
    }

    /* JADX INFO: renamed from: p */
    public static C0800ve m5150p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static C0763ue m5151q() {
        return (C0763ue) DEFAULT_INSTANCE.m4494d();
    }

    /* JADX INFO: renamed from: r */
    public static C0763ue m5152r(C0800ve c0800ve) {
        o70 o70VarM4494d = DEFAULT_INSTANCE.m4494d();
        if (!o70VarM4494d.f5644j.equals(c0800ve)) {
            o70VarM4494d.m3637c();
            o70.m3634d(o70VarM4494d.f5645k, c0800ve);
        }
        return (C0763ue) o70VarM4494d;
    }

    /* JADX INFO: renamed from: s */
    public static lv0 m5153s() {
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", C0726te.class});
            case 3:
                return new C0800ve();
            case 4:
                return new C0763ue(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0800ve.class) {
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
    public final de0 m5154o() {
        return this.alreadySeenCampaigns_;
    }
}
