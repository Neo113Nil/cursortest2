package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0360Da extends RelativeLayout implements InterfaceC1170dc {
    public E1 A00;

    public AbstractC0360Da(C1153dL c1153dL) {
        super(c1153dL);
    }

    public AbstractC0360Da(C1153dL c1153dL, AttributeSet attributeSet, int i) {
        super(c1153dL, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AAm(E1 e1) {
        this.A00 = e1;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AJk(E1 e1) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
