package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class ED extends AbstractRunnableC0840Vt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ E1 A02;
    public final /* synthetic */ EnumC1223eU A03;

    public ED(E1 e1, EnumC1223eU enumC1223eU, int i, int i2) {
        this.A02 = e1;
        this.A03 = enumC1223eU;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1153dL c1153dL;
        Handler handler;
        C0775Te c0775Te;
        C1153dL c1153dL2;
        C0775Te c0775Te2;
        DI di;
        Handler handler2;
        C1153dL c1153dL3;
        C0775Te c0775Te3;
        Handler handler3;
        C1153dL c1153dL4;
        C1153dL c1153dL5;
        C0775Te c0775Te4;
        DQ dq;
        Handler handler4;
        C1153dL c1153dL6;
        C1153dL c1153dL7;
        Handler handler5;
        C0775Te c0775Te5;
        C0775Te c0775Te6;
        DW dw;
        C1153dL c1153dL8;
        C0775Te c0775Te7;
        DO r0;
        if (this.A03 == EnumC1223eU.A07) {
            this.A02.A0M(UZ.A0y);
            c1153dL8 = this.A02.A0B;
            c1153dL8.A0F().A3b();
            c0775Te7 = this.A02.A0C;
            r0 = E1.A0J;
            c0775Te7.A02(r0);
            return;
        }
        if (this.A03 == EnumC1223eU.A03) {
            this.A02.A0M(UZ.A0t);
            this.A02.A04 = true;
            c0775Te6 = this.A02.A0C;
            dw = E1.A0H;
            c0775Te6.A02(dw);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1223eU.A06) {
            this.A02.A0M(UZ.A0s);
            c1153dL7 = this.A02.A0B;
            c1153dL7.A0F().A3T();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            c0775Te5 = this.A02.A0C;
            c0775Te5.A02(new C01193d(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC1223eU.A0A) {
            c1153dL4 = this.A02.A0B;
            if (U7.A1u(c1153dL4)) {
                c1153dL6 = this.A02.A0B;
                c1153dL6.A0B().AFs();
            }
            this.A02.A0M(UZ.A0w);
            c1153dL5 = this.A02.A0B;
            c1153dL5.A0F().A3i();
            c0775Te4 = this.A02.A0C;
            dq = E1.A0I;
            c0775Te4.A02(dq);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC1223eU.A05) {
            this.A02.A0M(UZ.A0v);
            c1153dL3 = this.A02.A0B;
            c1153dL3.A0F().A3X();
            c0775Te3 = this.A02.A0C;
            final int i = this.A00;
            c0775Te3.A02(new DY(i) { // from class: com.facebook.ads.redexgen.X.3Y
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1223eU.A04) {
            this.A02.A0M(UZ.A0u);
            c1153dL2 = this.A02.A0B;
            c1153dL2.A0F().A3U();
            c0775Te2 = this.A02.A0C;
            di = E1.A0L;
            c0775Te2.A02(di);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC1223eU.A09) {
            this.A02.A0M(UZ.A0s);
            c1153dL = this.A02.A0B;
            c1153dL.A0F().A3d();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            c0775Te = this.A02.A0C;
            c0775Te.A02(new C01193d(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
