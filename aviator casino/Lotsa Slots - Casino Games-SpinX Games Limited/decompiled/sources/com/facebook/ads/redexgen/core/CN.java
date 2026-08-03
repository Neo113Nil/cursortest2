package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class CN implements com.facebook.ads.redexgen.core.InterfaceC1588fw {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2U A00;
    public final /* synthetic */ java.util.concurrent.CountDownLatch A01;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference A02;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference A03;

    public CN(com.facebook.ads.redexgen.core.C2U c2u, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.util.concurrent.CountDownLatch countDownLatch) {
        this.A00 = c2u;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1588fw
    public final void ADR(com.facebook.ads.redexgen.core.InterfaceC1586fu interfaceC1586fu) {
        com.facebook.ads.redexgen.core.C2U.A06(interfaceC1586fu.A73(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1588fw
    public final void ADq(java.lang.Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
