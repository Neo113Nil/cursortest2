package com.ironsource;

import com.ironsource.AbstractC4455i3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes6.dex */
public class F9 extends AbstractC4455i3 {
    private static F9 R;
    private String P;
    private final J8 Q = Ib.a0().s();

    private F9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized F9 i() {
        F9 f9;
        synchronized (F9.class) {
            if (R == null) {
                F9 f92 = new F9();
                R = f92;
                f92.e();
            }
            f9 = R;
        }
        return f9;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected int c(C4689v5 c4689v5) {
        int f = f(c4689v5.c());
        return f == AbstractC4455i3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : f == AbstractC4455i3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean d(C4689v5 c4689v5) {
        int c = c4689v5.c();
        return c == EnumC4707w5.IS_CALLBACK_LOAD_SUCCESS.b() || c == EnumC4707w5.IS_INSTANCE_OPENED.b() || c == EnumC4707w5.IS_INSTANCE_CLOSED.b() || c == EnumC4707w5.IS_AUCTION_SUCCESS.b() || c == EnumC4707w5.IS_AUCTION_FAILED.b() || c == EnumC4707w5.BN_INSTANCE_SHOW.b() || c == EnumC4707w5.BN_AUCTION_SUCCESS.b() || c == EnumC4707w5.BN_AUCTION_FAILED.b() || c == EnumC4707w5.NT_INSTANCE_LOAD_SUCCESS.b() || c == EnumC4707w5.NT_INSTANCE_SHOW.b() || c == EnumC4707w5.NT_AUCTION_SUCCESS.b() || c == EnumC4707w5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC4455i3
    protected String e(int i) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void f(C4689v5 c4689v5) {
        this.P = c4689v5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4455i3
    protected boolean j(C4689v5 c4689v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4455i3
    protected void d() {
        this.J.add(Integer.valueOf(EnumC4707w5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(EnumC4707w5.NT_INSTANCE_SHOW.b()));
    }
}
