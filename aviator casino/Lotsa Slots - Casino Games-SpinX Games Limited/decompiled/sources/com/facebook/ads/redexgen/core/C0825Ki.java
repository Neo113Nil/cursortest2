package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ki, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0825Ki {
    public static java.lang.String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", "5", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final java.util.Comparator<com.facebook.ads.redexgen.core.C0825Ki> A03 = new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int compare;
            compare = java.lang.Integer.compare(((com.facebook.ads.redexgen.core.C0825Ki) obj).A01.A00, ((com.facebook.ads.redexgen.core.C0825Ki) obj2).A01.A00);
            return compare;
        }
    };
    public final int A00;
    public final com.facebook.ads.redexgen.core.C0826Kj A01;

    public C0825Ki(com.facebook.ads.redexgen.core.C0826Kj c0826Kj, int i) {
        this.A01 = c0826Kj;
        this.A00 = i;
    }

    public static /* synthetic */ java.util.Comparator A03() {
        java.util.Comparator<com.facebook.ads.redexgen.core.C0825Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[4] = androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS;
        strArr[5] = "u";
        return comparator;
    }
}
