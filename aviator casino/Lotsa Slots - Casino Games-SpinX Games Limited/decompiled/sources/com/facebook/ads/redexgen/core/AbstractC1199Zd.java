package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1199Zd extends android.widget.FrameLayout {
    public static java.lang.String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public com.facebook.ads.AdClosedListener A01;
    public com.facebook.ads.redexgen.core.EnumC0928Oi A02;
    public com.facebook.ads.redexgen.core.C0929Oj A03;
    public com.facebook.ads.redexgen.core.C0930Ok A04;
    public com.facebook.ads.redexgen.core.InterfaceC1198Zc A05;
    public final com.facebook.ads.redexgen.core.C0926Og A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.VA A08;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A09;
    public final com.facebook.ads.redexgen.core.InterfaceC1178Yi A0A;
    public final java.lang.String A0B;
    public final com.facebook.ads.redexgen.core.C0906Nm A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC1201Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi);

    public abstract boolean A0S();

    public AbstractC1199Zd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str) {
        this(c1636gi, va, str, null, null, null);
    }

    public AbstractC1199Zd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, com.facebook.ads.redexgen.core.C0906Nm c0906Nm, com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi);
        this.A00 = 0;
        this.A02 = com.facebook.ads.redexgen.core.EnumC0928Oi.A05;
        this.A04 = null;
        this.A0D = new com.facebook.ads.redexgen.core.MF(this);
        this.A07 = c1636gi;
        this.A08 = va;
        this.A0A = interfaceC1178Yi;
        this.A09 = interfaceC1177Yh;
        this.A0B = str;
        this.A0C = c0906Nm;
        this.A06 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd) {
        int i = abstractC1199Zd.A00;
        abstractC1199Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.AbstractC1199Zd abstractC1199Zd) {
        int i = abstractC1199Zd.A00;
        abstractC1199Zd.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        this.A03.A08(this.A02);
        A0Q(c0930Ok, this.A02);
        com.facebook.ads.redexgen.core.N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        this.A04 = c0930Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c0930Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new com.facebook.ads.redexgen.core.C0929Oj(new com.facebook.ads.redexgen.core.VI(this.A0B, this.A08));
        if (this.A0A != null) {
            com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new java.lang.RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1178Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(com.facebook.ads.redexgen.core.C0930Ok c0930Ok, com.facebook.ads.redexgen.core.EnumC0928Oi enumC0928Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(com.facebook.ads.redexgen.core.InterfaceC1198Zc interfaceC1198Zc) {
        this.A05 = interfaceC1198Zc;
    }

    public void setOnAdClosedListener(com.facebook.ads.AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
