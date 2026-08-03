package com.ironsource;

/* loaded from: classes5.dex */
public class F9 extends com.ironsource.AbstractC3143l3 {
    private static com.ironsource.F9 R;
    private java.lang.String P;
    private final com.ironsource.L8 Q = com.ironsource.Jb.Y().s();

    private F9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized com.ironsource.F9 i() {
        com.ironsource.F9 f9;
        synchronized (com.ironsource.F9.class) {
            if (R == null) {
                com.ironsource.F9 f92 = new com.ironsource.F9();
                R = f92;
                f92.e();
            }
            f9 = R;
        }
        return f9;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected int c(com.ironsource.C3360x5 c3360x5) {
        int f = f(c3360x5.c());
        return f == com.ironsource.AbstractC3143l3.e.BANNER.b() ? this.Q.a(com.ironsource.mediationsdk.IronSource.a.BANNER) : f == com.ironsource.AbstractC3143l3.e.NATIVE_AD.b() ? this.Q.a(com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) : this.Q.a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean d(com.ironsource.C3360x5 c3360x5) {
        int c = c3360x5.c();
        return c == com.ironsource.EnumC3378y5.IS_CALLBACK_LOAD_SUCCESS.b() || c == com.ironsource.EnumC3378y5.IS_INSTANCE_OPENED.b() || c == com.ironsource.EnumC3378y5.IS_INSTANCE_CLOSED.b() || c == com.ironsource.EnumC3378y5.IS_AUCTION_SUCCESS.b() || c == com.ironsource.EnumC3378y5.IS_AUCTION_FAILED.b() || c == com.ironsource.EnumC3378y5.BN_INSTANCE_SHOW.b() || c == com.ironsource.EnumC3378y5.BN_AUCTION_SUCCESS.b() || c == com.ironsource.EnumC3378y5.BN_AUCTION_FAILED.b() || c == com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_SUCCESS.b() || c == com.ironsource.EnumC3378y5.NT_INSTANCE_SHOW.b() || c == com.ironsource.EnumC3378y5.NT_AUCTION_SUCCESS.b() || c == com.ironsource.EnumC3378y5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC3143l3
    protected java.lang.String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void f(com.ironsource.C3360x5 c3360x5) {
        this.P = c3360x5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC3143l3
    protected boolean j(com.ironsource.C3360x5 c3360x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC3143l3
    protected void d() {
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_LOAD_CALLED.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_RELOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.BN_INSTANCE_SHOW.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(java.lang.Integer.valueOf(com.ironsource.EnumC3378y5.NT_INSTANCE_SHOW.b()));
    }
}
