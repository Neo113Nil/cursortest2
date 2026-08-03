package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05037d {
    public int A00;
    public int A01;
    public android.os.Looper A03;
    public java.lang.Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.androidx.media3.common.Timeline A0A;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC05017b A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC05027c A0D;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C05037d(com.facebook.ads.redexgen.core.InterfaceC05017b interfaceC05017b, com.facebook.ads.redexgen.core.InterfaceC05027c interfaceC05027c, com.facebook.ads.androidx.media3.common.Timeline timeline, int i, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45, android.os.Looper looper) {
        this.A0C = interfaceC05017b;
        this.A0D = interfaceC05027c;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = anonymousClass45;
        this.A00 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final android.os.Looper A03() {
        return this.A03;
    }

    public final com.facebook.ads.androidx.media3.common.Timeline A04() {
        return this.A0A;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05027c A05() {
        return this.A0D;
    }

    public final com.facebook.ads.redexgen.core.C05037d A06() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(this.A05);
        }
        this.A09 = true;
        this.A0C.AJC(this);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C05037d A07(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A09);
        this.A01 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C05037d A08(java.lang.Object obj) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final java.lang.Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws java.lang.InterruptedException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A09);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A03.getThread() != java.lang.Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
