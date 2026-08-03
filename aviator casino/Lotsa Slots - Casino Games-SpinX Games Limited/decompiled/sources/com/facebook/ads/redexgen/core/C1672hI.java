package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1672hI implements com.facebook.ads.redexgen.core.InterfaceC1409d1 {
    public static java.lang.String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ com.facebook.ads.NativeAd A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1666hC A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UK A02;

    public C1672hI(com.facebook.ads.redexgen.core.C1666hC c1666hC, com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.NativeAd nativeAd) {
        this.A01 = c1666hC;
        this.A02 = uk;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AAn() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void ADm(com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62) {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.C1673hJ(this, anonymousClass62), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AE2() {
        com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62;
        com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass622;
        anonymousClass62 = this.A01.A0H;
        if (anonymousClass62 != null) {
            anonymousClass622 = this.A01.A0H;
            java.lang.String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            anonymousClass622.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1409d1
    public final void AGC(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        boolean A0U;
        com.facebook.ads.redexgen.core.Y2 A1E = this.A02.A1E();
        c1636gi = this.A01.A0C;
        A1E.A06(c1636gi, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0U = this.A01.A0U(this.A00);
            if (!A0U && this.A02.A17() != null) {
                this.A02.A17().onClick(view);
            }
        }
    }
}
