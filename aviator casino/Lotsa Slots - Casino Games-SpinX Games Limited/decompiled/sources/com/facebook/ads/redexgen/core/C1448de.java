package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.de, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1448de extends android.animation.AnimatorListenerAdapter {
    public static java.lang.String[] A02 = {"BCZIhVNDQDCh76DtmyNtHAlhFMDATvVt", "BpxJG5PSy8RrC8gDj9F3m7wY3N24XhJv", "ijlTTH3qZVfV3k2EcDrdjmOyjm2IhbRx", "nG1o2sYesXs6M57Sh7jiiyWqAFcBt7Ov", "7oLodlqz52tT27TMmX1w5sX", "BpgZ9fjSEMvqLyG8EKapvQvzg2h53TAK", "RGI6AKM997BtZD7KRZnSFDXmKos5ru", "RnEGi"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass55 A00;
    public final /* synthetic */ boolean A01;

    public C1448de(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55, boolean z) {
        this.A00 = anonymousClass55;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        boolean z;
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.M3 m32;
        super.onAnimationEnd(animator);
        com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55 = this.A00;
        z = this.A00.A0D;
        anonymousClass55.A0w(z, true);
        if (!this.A01) {
            m3 = this.A00.A06;
            if (m3 != null) {
                m32 = this.A00.A06;
                java.lang.String[] strArr = A02;
                if (strArr[7].length() == strArr[6].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[0] = "ljAGPopRVKGa2tZDYlD1hZgNr97DsQwm";
                strArr2[5] = "7Tfn34ptiafVbRMsYTiCD1YlzW67R4Al";
                m32.destroy();
            }
        }
    }
}
