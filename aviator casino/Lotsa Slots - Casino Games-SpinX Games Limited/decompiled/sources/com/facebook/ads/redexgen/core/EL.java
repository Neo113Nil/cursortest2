package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class EL extends com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4K> {
    public static java.lang.String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4L A00;

    public EL(com.facebook.ads.redexgen.core.C4L c4l) {
        this.A00 = c4l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
        int A00 = c4k.A00();
        int duration = c4k.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                com.facebook.ads.redexgen.core.C4L c4l = this.A00;
                int currentPosition4 = this.A00.A00;
                c4l.A0j(currentPosition4);
                return;
            }
            this.A00.A0j(duration);
            return;
        }
        com.facebook.ads.redexgen.core.C4L c4l2 = this.A00;
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[7];
        java.lang.String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c4l2.A0j(A00);
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final java.lang.Class<com.facebook.ads.redexgen.core.C4K> A01() {
        return com.facebook.ads.redexgen.core.C4K.class;
    }
}
