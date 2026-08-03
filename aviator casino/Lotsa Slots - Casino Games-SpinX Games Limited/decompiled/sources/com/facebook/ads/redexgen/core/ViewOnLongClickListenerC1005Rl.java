package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC1005Rl implements android.view.View.OnLongClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1676hM A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1290b6 A01;

    public ViewOnLongClickListenerC1005Rl(com.facebook.ads.redexgen.core.C1676hM c1676hM, com.facebook.ads.redexgen.core.C1290b6 c1290b6) {
        this.A00 = c1676hM;
        this.A01 = c1290b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        view2 = this.A00.A00;
        if (view2 != null) {
            com.facebook.ads.redexgen.core.C1290b6 c1290b6 = this.A01;
            view3 = this.A00.A00;
            int width = view3.getWidth();
            view4 = this.A00.A00;
            c1290b6.setBounds(0, 0, width, view4.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
