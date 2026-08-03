package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2081oQ implements com.facebook.ads.redexgen.core.InterfaceC04063k {
    public boolean A04;
    public java.nio.ByteBuffer A02 = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
    public java.nio.ByteBuffer A03 = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
    public com.facebook.ads.redexgen.core.C04043i A00 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A01 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A05 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A06 = com.facebook.ads.redexgen.core.C04043i.A05;

    public abstract com.facebook.ads.redexgen.core.C04043i A09(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j;

    public final java.nio.ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final com.facebook.ads.redexgen.core.C04043i A57(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
        this.A00 = c04043i;
        this.A01 = A09(c04043i);
        return AAL() ? this.A01 : com.facebook.ads.redexgen.core.C04043i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public java.nio.ByteBuffer A8d() {
        java.nio.ByteBuffer byteBuffer = this.A03;
        java.nio.ByteBuffer outputBuffer = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public boolean AAL() {
        return this.A01 != com.facebook.ads.redexgen.core.C04043i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public boolean AAP() {
        return this.A04 && this.A03 == com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void flush() {
        this.A03 = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
