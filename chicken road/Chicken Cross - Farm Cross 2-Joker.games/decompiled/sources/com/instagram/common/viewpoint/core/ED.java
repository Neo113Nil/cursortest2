package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC2818eu {
    public C1967Ek A00;

    public ED(C2930gi c2930gi) {
        super(c2930gi);
    }

    public ED(C2930gi c2930gi, AttributeSet attributeSet, int i) {
        super(c2930gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2818eu
    public final void AAv(C1967Ek c1967Ek) {
        this.A00 = c1967Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2818eu
    public final void AKV(C1967Ek c1967Ek) {
        A08();
        this.A00 = null;
    }

    public C1967Ek getVideoView() {
        return this.A00;
    }
}
