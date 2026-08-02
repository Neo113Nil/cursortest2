package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Co, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0348Co implements InterfaceC1195e2 {
    public int A00;
    public ValueAnimator A01;
    public EnumC1194e1 A02 = EnumC1194e1.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C0348Co(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C1198e5(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC1194e1.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C1197e4(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        XP.A0F(this.A05);
        this.A02 = EnumC1194e1.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        XP.A0J(this.A05);
        if (z) {
            this.A02 = EnumC1194e1.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C1196e3(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1194e1.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1195e2
    public final void A42(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1195e2
    public final EnumC1194e1 A93() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1195e2
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
