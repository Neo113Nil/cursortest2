package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class EM extends com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4A> {
    public static java.lang.String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4L A00;

    public EM(com.facebook.ads.redexgen.core.C4L c4l) {
        this.A00 = c4l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        int A00 = c4a.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            c0673Ek = this.A00.A0C;
            int currentPositionMS2 = c0673Ek.getDuration();
            if (A00 == currentPositionMS2) {
                c0673Ek2 = this.A00.A0C;
                int duration = c0673Ek2.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        com.facebook.ads.redexgen.core.C4L c4l = this.A00;
        if (A01[5].length() == 7) {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c4l.A0k(A00);
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final java.lang.Class<com.facebook.ads.redexgen.core.C4A> A01() {
        return com.facebook.ads.redexgen.core.C4A.class;
    }
}
