package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2000n6 implements com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass49 A00;
    public final /* synthetic */ java.util.concurrent.Executor A01;

    public C2000n6(java.util.concurrent.Executor executor, com.facebook.ads.redexgen.core.AnonymousClass49 anonymousClass49) {
        this.A01 = executor;
        this.A00 = anonymousClass49;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceExecutorC0690Fb
    public final void AHb() {
        this.A00.A39(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.A01.execute(runnable);
    }
}
