package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class FD extends C2625bl {
    public final ImageView A00;
    public final C2930gi A01;

    public FD(C2930gi c2930gi) {
        super(c2930gi);
        this.A01 = c2930gi;
        this.A00 = new ImageView(c2930gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        LM downloadImageTask = new LM(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
