package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1213Zr implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0930Ok A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1203Zh A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MD A02;

    public ViewOnClickListenerC1213Zr(com.facebook.ads.redexgen.core.MD md, com.facebook.ads.redexgen.core.C1203Zh c1203Zh, com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        this.A02 = md;
        this.A01 = c1203Zh;
        this.A00 = c0930Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
