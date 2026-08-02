package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ze */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948ze extends s70 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final C0948ze DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile lv0 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private ap0 content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private C0064bj priority_;
    private int payloadCase_ = 0;
    private zl0 dataBundle_ = zl0.f9859k;
    private de0 triggeringConditions_ = gy0.f2961m;

    static {
        C0948ze c0948ze = new C0948ze();
        DEFAULT_INSTANCE = c0948ze;
        s70.m4493l(C0948ze.class, c0948ze);
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
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", C0016af.class, C0874xe.class, "content_", "priority_", "triggeringConditions_", C0176ej.class, "isTestCampaign_", "dataBundle_", AbstractC0911ye.f9281a});
            case 3:
                return new C0948ze();
            case 4:
                return new C0837we(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0948ze.class) {
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
    public final ap0 m5880n() {
        ap0 ap0Var = this.content_;
        return ap0Var == null ? ap0.m450p() : ap0Var;
    }

    /* JADX INFO: renamed from: o */
    public final Map m5881o() {
        return Collections.unmodifiableMap(this.dataBundle_);
    }

    /* JADX INFO: renamed from: p */
    public final C0874xe m5882p() {
        return this.payloadCase_ == 2 ? (C0874xe) this.payload_ : C0874xe.m5624r();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5883q() {
        return this.isTestCampaign_;
    }

    /* JADX INFO: renamed from: r */
    public final int m5884r() {
        int i = this.payloadCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final C0064bj m5885s() {
        C0064bj c0064bj = this.priority_;
        return c0064bj == null ? C0064bj.m702n() : c0064bj;
    }

    /* JADX INFO: renamed from: t */
    public final de0 m5886t() {
        return this.triggeringConditions_;
    }

    /* JADX INFO: renamed from: u */
    public final C0016af m5887u() {
        return this.payloadCase_ == 1 ? (C0016af) this.payload_ : C0016af.m181r();
    }
}
