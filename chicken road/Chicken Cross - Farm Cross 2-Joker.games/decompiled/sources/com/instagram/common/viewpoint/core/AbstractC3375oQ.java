package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3375oQ implements InterfaceC17003k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC17003k.A00;
    public ByteBuffer A03 = InterfaceC17003k.A00;
    public C16983i A00 = C16983i.A05;
    public C16983i A01 = C16983i.A05;
    public C16983i A05 = C16983i.A05;
    public C16983i A06 = C16983i.A05;

    public abstract C16983i A09(C16983i c16983i) throws C16993j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
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

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public final C16983i A57(C16983i c16983i) throws C16993j {
        this.A00 = c16983i;
        this.A01 = A09(c16983i);
        return AAL() ? this.A01 : C16983i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC17003k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public boolean AAL() {
        return this.A01 != C16983i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC17003k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public final void flush() {
        this.A03 = InterfaceC17003k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
