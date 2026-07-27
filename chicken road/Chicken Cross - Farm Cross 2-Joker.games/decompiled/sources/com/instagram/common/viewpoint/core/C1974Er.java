package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1974Er extends AbstractRunnableC2417Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1967Ek A02;
    public final /* synthetic */ EnumC2872fm A03;

    public C1974Er(C1967Ek c1967Ek, EnumC2872fm enumC2872fm, int i, int i2) {
        this.A02 = c1967Ek;
        this.A03 = enumC2872fm;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        C2930gi c2930gi;
        Handler handler;
        UM um;
        C2930gi c2930gi2;
        UM um2;
        C1952Dv c1952Dv;
        Handler handler2;
        C2930gi c2930gi3;
        UM um3;
        Handler handler3;
        C2930gi c2930gi4;
        C2930gi c2930gi5;
        UM um4;
        E3 e3;
        Handler handler4;
        C2930gi c2930gi6;
        C2930gi c2930gi7;
        Handler handler5;
        UM um5;
        UM um6;
        E9 e9;
        C2930gi c2930gi8;
        UM um7;
        E1 e1;
        if (this.A03 == EnumC2872fm.A07) {
            this.A02.A0M(VH.A0y);
            c2930gi8 = this.A02.A0B;
            c2930gi8.A0F().A3j();
            um7 = this.A02.A0C;
            e1 = C1967Ek.A0J;
            um7.A02(e1);
            return;
        }
        if (this.A03 == EnumC2872fm.A03) {
            this.A02.A0M(VH.A0t);
            this.A02.A04 = true;
            um6 = this.A02.A0C;
            e9 = C1967Ek.A0H;
            um6.A02(e9);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC2872fm.A06) {
            this.A02.A0M(VH.A0s);
            c2930gi7 = this.A02.A0B;
            c2930gi7.A0F().A3b();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            um5 = this.A02.A0C;
            um5.A02(new C4K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC2872fm.A0A) {
            c2930gi4 = this.A02.A0B;
            if (C2380Up.A1z(c2930gi4)) {
                c2930gi6 = this.A02.A0B;
                c2930gi6.A0B().AGc();
            }
            this.A02.A0M(VH.A0w);
            c2930gi5 = this.A02.A0B;
            c2930gi5.A0F().A3q();
            um4 = this.A02.A0C;
            e3 = C1967Ek.A0I;
            um4.A02(e3);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC2872fm.A05) {
            this.A02.A0M(VH.A0v);
            c2930gi3 = this.A02.A0B;
            c2930gi3.A0F().A3f();
            um3 = this.A02.A0C;
            final int i = this.A00;
            um3.A02(new EB(i) { // from class: com.facebook.ads.redexgen.X.4B
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC2872fm.A04) {
            this.A02.A0M(VH.A0u);
            c2930gi2 = this.A02.A0B;
            c2930gi2.A0F().A3c();
            um2 = this.A02.A0C;
            c1952Dv = C1967Ek.A0L;
            um2.A02(c1952Dv);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC2872fm.A09) {
            this.A02.A0M(VH.A0s);
            c2930gi = this.A02.A0B;
            c2930gi.A0F().A3l();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            um = this.A02.A0C;
            um.A02(new C4K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
