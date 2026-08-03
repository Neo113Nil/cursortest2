package com.ironsource;

/* renamed from: com.ironsource.ge, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3065ge extends com.ironsource.AbstractC3143l3 {
    private static com.ironsource.C3065ge R;
    private java.lang.String P;
    private final com.ironsource.L8 Q = com.ironsource.Jb.Y().s();

    private C3065ge() {
        this.H = "outcome";
        this.G = 3;
        this.I = com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized com.ironsource.C3065ge i() {
        com.ironsource.C3065ge c3065ge;
        synchronized (com.ironsource.C3065ge.class) {
            if (R == null) {
                com.ironsource.C3065ge c3065ge2 = new com.ironsource.C3065ge();
                R = c3065ge2;
                c3065ge2.e();
            }
            c3065ge = R;
        }
        return c3065ge;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected int c(com.ironsource.C3360x5 c3360x5) {
        return this.Q.a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean d(com.ironsource.C3360x5 c3360x5) {
        int c = c3360x5.c();
        return c == com.ironsource.EnumC3378y5.FIRST_INSTANCE.b() || c == com.ironsource.EnumC3378y5.INIT_COMPLETE.b() || c == com.ironsource.EnumC3378y5.SDK_INIT_FAILED.b() || c == com.ironsource.EnumC3378y5.SDK_INIT_SUCCESS.b() || c == com.ironsource.EnumC3378y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || c == com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_OPENED.b() || c == com.ironsource.EnumC3378y5.RV_INSTANCE_CLOSED.b() || c == com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_REWARDED.b() || c == com.ironsource.EnumC3378y5.RV_AUCTION_FAILED.b() || c == com.ironsource.EnumC3378y5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC3143l3
    protected java.lang.String e(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void f(com.ironsource.C3360x5 c3360x5) {
        if (c3360x5.c() == 15 || (c3360x5.c() >= 300 && c3360x5.c() < 400)) {
            this.P = c3360x5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean j(com.ironsource.C3360x5 c3360x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void d() {
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
