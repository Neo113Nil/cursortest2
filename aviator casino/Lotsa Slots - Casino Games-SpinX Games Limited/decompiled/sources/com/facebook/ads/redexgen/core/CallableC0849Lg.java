package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC0849Lg implements java.util.concurrent.Callable<java.lang.Void> {
    public final java.io.File A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1875kr A01;

    public CallableC0849Lg(com.facebook.ads.redexgen.core.AbstractC1875kr abstractC1875kr, java.io.File file) {
        this.A01 = abstractC1875kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void call() throws java.lang.Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
