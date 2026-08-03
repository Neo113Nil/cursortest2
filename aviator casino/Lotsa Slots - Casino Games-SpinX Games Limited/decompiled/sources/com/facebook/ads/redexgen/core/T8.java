package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class T8 extends android.content.ContextWrapper {
    public final com.facebook.ads.redexgen.core.TA A00;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A01;

    public T8(android.content.Context context, com.facebook.ads.redexgen.core.TA ta) {
        super(context.getApplicationContext());
        this.A01 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A00 = ta;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0866Lx A00(com.facebook.ads.redexgen.core.T8 t8) {
        return this.A00.A8C(t8);
    }

    public final com.facebook.ads.redexgen.core.T1 A01() {
        return this.A00.A7G();
    }

    public final com.facebook.ads.redexgen.core.C1632ge A02() {
        return this.A00.A8z(this);
    }

    public final com.facebook.ads.redexgen.core.T9 A03() {
        return this.A00.A74(this);
    }

    public final com.facebook.ads.redexgen.core.TB A04() {
        return this.A00.A7x(this);
    }

    public final com.facebook.ads.redexgen.core.TD A05() {
        return this.A00.A8y(this);
    }

    public final com.facebook.ads.redexgen.core.TE A06() {
        return this.A00.A9F();
    }

    public final com.facebook.ads.redexgen.core.TP A07() {
        return this.A00.A7l(this);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC1047Tc A08() {
        return this.A00.A7n(this);
    }

    public final com.facebook.ads.redexgen.core.U7 A09() {
        return this.A00.A96();
    }

    public final com.facebook.ads.redexgen.core.VA A0A() {
        return this.A00.A6n(A02());
    }

    public final com.facebook.ads.redexgen.core.VM A0B() {
        return this.A00.A90(A02());
    }

    public final java.lang.String A0C() {
        return this.A01.get();
    }

    public final void A0D(java.lang.String str) {
        this.A01.set(str);
    }
}
