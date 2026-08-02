package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class EW extends C0968aL {
    public final ImageView A00;
    public final C1153dL A01;

    public EW(C1153dL c1153dL) {
        super(c1153dL);
        this.A01 = c1153dL;
        setRadius(30);
        this.A00 = new ImageView(c1153dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C0936Zn c0936Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC0937Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
            public final void ADT(C0936Zn c0936Zn) {
                EW.this.A00(c0936Zn);
            }
        });
    }
}
