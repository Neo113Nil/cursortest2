package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class GB extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static java.lang.String[] A0F = {"", "W4Q5rze9OaCj8zYeEqMqJDKHVn1jlwCj", "tfMK6ikBUwqELtuMuu5Kubqydzlt1dTF", "vHKgDETdn9HfwlFLESHxJfcBT5o8ovHI", "7Mubz7OjQQHbSYG", "T8sk6PPloyPWHv5iczs8jf8QHRZ1ZSou", "3ZCO1Nznw11DnI4nXgj4IK6CNfFIYy0N", "YX"};
    public static final android.widget.RelativeLayout.LayoutParams A0G = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public com.facebook.ads.redexgen.core.C0998Re A00;
    public com.facebook.ads.redexgen.core.InterfaceC1178Yi A01;
    public android.content.Intent A02;
    public android.os.Bundle A03;
    public com.facebook.ads.redexgen.core.InterfaceC1178Yi A04;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A05;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A06;
    public final com.facebook.ads.redexgen.core.C0908No A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.VA A09;
    public final com.facebook.ads.redexgen.core.WK A0A;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0C;
    public final com.facebook.ads.redexgen.core.ZU A0D;
    public final boolean A0E;

    public GB(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C0998Re c0998Re, com.facebook.ads.redexgen.core.WK wk) {
        super(c1636gi);
        this.A08 = c1636gi;
        this.A09 = va;
        this.A06 = abstractC1801jd;
        this.A05 = abstractC1801jd2;
        this.A07 = this.A05.A29().A0H().A07();
        this.A0C = interfaceC1177Yh;
        this.A0B = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0B.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        this.A0A = wk;
        if (this.A0A == com.facebook.ads.redexgen.core.WK.A0J) {
            this.A0D = new com.facebook.ads.redexgen.core.MG();
        } else {
            this.A0D = new com.facebook.ads.redexgen.core.MH();
        }
        boolean z = false;
        if (this.A07 != null) {
            if (this.A07.A0b() && this.A05.A1n()) {
                z = true;
            }
            this.A0E = z;
            return;
        }
        this.A0E = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.InterfaceC1178Yi A05(com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.C0908No c0908No, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return new com.facebook.ads.redexgen.core.MW(this.A08, this.A09, this.A0C, this.A05, c0908No, this.A05.A1G(), zu);
        }
        return new com.facebook.ads.redexgen.core.NO(this.A08, this.A09, this.A0C, this.A05, this.A05.A1G(), zu, true);
    }

    private com.facebook.ads.redexgen.core.C4V A0A() {
        if (this.A07 != null) {
            this.A06.A1R(this.A07.A0X());
            this.A06.A1S(this.A07.A0c());
        }
        com.facebook.ads.redexgen.core.C4V c4v = new com.facebook.ads.redexgen.core.C4V(this.A08, this.A0D, this.A09, this.A06, new com.facebook.ads.redexgen.core.C1042Sx(this.A08), this.A0C);
        c4v.setVideoLeadingPlayableAdListener(new com.facebook.ads.redexgen.core.GD(this));
        return c4v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A04 != null) {
            this.A04.onDestroy();
            if (this.A04 instanceof android.view.View) {
                ((android.view.View) this.A04).setVisibility(8);
                removeView((android.view.View) this.A04);
            }
        }
    }

    private final void A0C(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A04 = A0A();
        this.A04.AAu(intent, bundle, c0998Re);
        if (this.A0E && this.A07 != null) {
            this.A01 = A05(this.A0D, this.A07, java.lang.Boolean.valueOf(this.A05.A1n()));
            this.A01.AAu(intent, bundle, c0998Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A02 = intent;
        this.A03 = bundle;
        this.A00 = c0998Re;
        this.A0C.A45(this, A0G);
        A0C(intent, bundle, c0998Re);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        if (this.A04 instanceof com.facebook.ads.redexgen.core.MW) {
            com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi = this.A04;
            java.lang.String[] strArr = A0F;
            if (strArr[0].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[0] = "";
            strArr2[4] = "sBQPYruyJOWbMZu";
            interfaceC1178Yi.AFi(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    public com.facebook.ads.redexgen.core.InterfaceC1178Yi getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A06.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.A04 != null) {
            this.A04.onActivityResult(i, i2, intent);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A04 instanceof com.facebook.ads.redexgen.core.MW) {
            ((com.facebook.ads.redexgen.core.MW) this.A04).onConfigurationChanged(configuration);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }
}
