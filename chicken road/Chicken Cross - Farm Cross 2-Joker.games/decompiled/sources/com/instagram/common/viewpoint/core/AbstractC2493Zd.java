package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2493Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC2222Oi A02;
    public C2223Oj A03;
    public C2224Ok A04;
    public InterfaceC2492Zc A05;
    public final C2220Og A06;
    public final C2930gi A07;
    public final VA A08;
    public final InterfaceC2471Yh A09;
    public final InterfaceC2472Yi A0A;
    public final String A0B;
    public final C2200Nm A0C;
    public final InterfaceC2495Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C2224Ok c2224Ok, EnumC2222Oi enumC2222Oi);

    public abstract boolean A0S();

    public AbstractC2493Zd(C2930gi c2930gi, VA va, String str) {
        this(c2930gi, va, str, null, null, null);
    }

    public AbstractC2493Zd(C2930gi c2930gi, VA va, String str, C2200Nm c2200Nm, InterfaceC2472Yi interfaceC2472Yi, InterfaceC2471Yh interfaceC2471Yh) {
        super(c2930gi);
        this.A00 = 0;
        this.A02 = EnumC2222Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c2930gi;
        this.A08 = va;
        this.A0A = interfaceC2472Yi;
        this.A09 = interfaceC2471Yh;
        this.A0B = str;
        this.A0C = c2200Nm;
        this.A06 = AbstractC2221Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC2493Zd abstractC2493Zd) {
        int i = abstractC2493Zd.A00;
        abstractC2493Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC2493Zd abstractC2493Zd) {
        int i = abstractC2493Zd.A00;
        abstractC2493Zd.A00 = i - 1;
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
    public void A0G(C2224Ok c2224Ok) {
        this.A03.A08(this.A02);
        A0Q(c2224Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C2224Ok c2224Ok) {
        this.A04 = c2224Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c2224Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C2223Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC2472Yi interfaceC2472Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC2472Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C2224Ok c2224Ok, EnumC2222Oi enumC2222Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC2492Zc interfaceC2492Zc) {
        this.A05 = interfaceC2492Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
