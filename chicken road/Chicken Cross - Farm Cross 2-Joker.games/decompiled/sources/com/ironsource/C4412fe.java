package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4412fe extends AbstractC4455i3 {
    private static C4412fe R;
    private String P;
    private final J8 Q = Ib.a0().s();

    private C4412fe() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized C4412fe i() {
        C4412fe c4412fe;
        synchronized (C4412fe.class) {
            if (R == null) {
                C4412fe c4412fe2 = new C4412fe();
                R = c4412fe2;
                c4412fe2.e();
            }
            c4412fe = R;
        }
        return c4412fe;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected int c(C4689v5 c4689v5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean d(C4689v5 c4689v5) {
        int c = c4689v5.c();
        return c == EnumC4707w5.FIRST_INSTANCE.b() || c == EnumC4707w5.INIT_COMPLETE.b() || c == EnumC4707w5.SDK_INIT_FAILED.b() || c == EnumC4707w5.SDK_INIT_SUCCESS.b() || c == EnumC4707w5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == EnumC4707w5.RV_BUSINESS_INSTANCE_OPENED.b() || c == EnumC4707w5.RV_INSTANCE_CLOSED.b() || c == EnumC4707w5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == EnumC4707w5.RV_AUCTION_FAILED.b() || c == EnumC4707w5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4455i3
    protected String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void f(C4689v5 c4689v5) {
        if (c4689v5.c() == 15 || (c4689v5.c() >= 300 && c4689v5.c() < 400)) {
            this.P = c4689v5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean j(C4689v5 c4689v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC4707w5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
