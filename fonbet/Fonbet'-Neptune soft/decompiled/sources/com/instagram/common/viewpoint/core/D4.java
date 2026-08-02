package com.instagram.common.viewpoint.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class D4 implements InterfaceC1170dc {
    public View A00;
    public E1 A01;
    public EnumC1184dr A02;
    public boolean A03;
    public final Handler A04;
    public final DX A05;
    public final DR A06;
    public final DP A07;
    public final DG A08;
    public final boolean A09;
    public final boolean A0A;

    public D4(View view, EnumC1184dr enumC1184dr, boolean z) {
        this(view, enumC1184dr, z, false);
    }

    public D4(View view, EnumC1184dr enumC1184dr, boolean z, boolean z2) {
        this.A06 = new DR() { // from class: com.facebook.ads.redexgen.X.3B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                D4.this.A06(1, 0);
            }
        };
        this.A07 = new DP() { // from class: com.facebook.ads.redexgen.X.32
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                boolean z3;
                EnumC1184dr enumC1184dr2;
                boolean z4;
                z3 = D4.this.A03;
                if (!z3) {
                    return;
                }
                enumC1184dr2 = D4.this.A02;
                if (enumC1184dr2 != EnumC1184dr.A02) {
                    z4 = D4.this.A09;
                    if (!z4) {
                        D4.this.A06(0, 8);
                        return;
                    }
                }
                D4.this.A02 = null;
                D4.this.A05();
            }
        };
        this.A05 = new DX() { // from class: com.facebook.ads.redexgen.X.30
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C01193d c01193d) {
                EnumC1184dr enumC1184dr2;
                View view2;
                View view3;
                enumC1184dr2 = D4.this.A02;
                if (enumC1184dr2 == EnumC1184dr.A03) {
                    return;
                }
                view2 = D4.this.A00;
                view2.setAlpha(1.0f);
                view3 = D4.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C01142y(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC1184dr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C1183dq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC1184dr enumC1184dr) {
        this.A02 = enumC1184dr;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC1184dr == EnumC1184dr.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AAm(E1 e1) {
        this.A01 = e1;
        e1.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1170dc
    public final void AJk(E1 e1) {
        A06(1, 0);
        e1.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
