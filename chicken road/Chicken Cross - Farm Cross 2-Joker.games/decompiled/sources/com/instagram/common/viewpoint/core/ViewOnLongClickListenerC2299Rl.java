package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC2299Rl implements View.OnLongClickListener {
    public final /* synthetic */ C2970hM A00;
    public final /* synthetic */ C2584b6 A01;

    public ViewOnLongClickListenerC2299Rl(C2970hM c2970hM, C2584b6 c2584b6) {
        this.A00 = c2970hM;
        this.A01 = c2584b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        View view3;
        View view4;
        view2 = this.A00.A00;
        if (view2 != null) {
            C2584b6 c2584b6 = this.A01;
            view3 = this.A00.A00;
            int width = view3.getWidth();
            view4 = this.A00.A00;
            c2584b6.setBounds(0, 0, width, view4.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
