package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1826k2 implements com.facebook.ads.redexgen.core.InterfaceC1409d1 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass81 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AAn() {
        com.facebook.ads.redexgen.core.C05147o c05147o;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        c05147o = this.A00.A03;
        java.lang.String A00 = c05147o.A2C().A00();
        if (android.text.TextUtils.isEmpty(A00)) {
            return;
        }
        com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
        anonymousClass76 = this.A00.A04;
        com.facebook.ads.redexgen.core.X6.A0O(x6, anonymousClass76, com.facebook.ads.redexgen.core.XB.A00(A00), this.A00.A7O());
    }

    public C1826k2(com.facebook.ads.redexgen.core.AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void ADm(com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.C1827k3(this, anonymousClass62), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AE2() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AGC(android.view.View view, android.view.MotionEvent motionEvent) {
    }
}
