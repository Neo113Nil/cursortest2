package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KQ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static java.lang.String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;
    public final /* synthetic */ boolean A01;

    public KQ(com.facebook.ads.redexgen.core.KE ke, boolean z) {
        this.A00 = ke;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1353c7 c1353c7;
        boolean z;
        c1353c7 = this.A00.A0J;
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = c1353c7.A0B();
        if (A0B != null) {
            if (!this.A01) {
                boolean A0E = A0B.A0E();
                if (A02[4].length() != 25) {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (!A0E) {
                    z = true;
                    A0B.setPageDetailsVisible(z);
                    A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
                }
            }
            z = false;
            A0B.setPageDetailsVisible(z);
            A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
