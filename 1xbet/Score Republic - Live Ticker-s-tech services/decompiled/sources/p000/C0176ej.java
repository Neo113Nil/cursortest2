package p000;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0176ej extends s70 {
    private static final C0176ej DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile lv0 PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    static {
        C0176ej c0176ej = new C0176ej();
        DEFAULT_INSTANCE = c0176ej;
        s70.m4493l(C0176ej.class, c0176ej);
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", C0020aj.class});
            case 3:
                return new C0176ej();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0176ej.class) {
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

    /* JADX INFO: renamed from: n */
    public final C0020aj m1428n() {
        return this.conditionCase_ == 2 ? (C0020aj) this.condition_ : C0020aj.m254n();
    }

    /* JADX INFO: renamed from: o */
    public final EnumC0100cj m1429o() {
        int i = this.conditionCase_;
        EnumC0100cj enumC0100cj = EnumC0100cj.f1265k;
        if (i == 1) {
            int iIntValue = ((Integer) this.condition_).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    enumC0100cj = iIntValue != 2 ? null : EnumC0100cj.f1267m;
                } else {
                    enumC0100cj = EnumC0100cj.f1266l;
                }
            }
            if (enumC0100cj == null) {
                return EnumC0100cj.f1268n;
            }
        }
        return enumC0100cj;
    }
}
