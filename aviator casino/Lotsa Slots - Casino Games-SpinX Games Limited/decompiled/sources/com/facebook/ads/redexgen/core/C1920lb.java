package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1920lb implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public static java.lang.String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final com.facebook.ads.redexgen.core.C1920lb A02 = new com.facebook.ads.redexgen.core.C1920lb();
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A00;

    public C1920lb() {
        this.A00 = java.util.Collections.emptyList();
    }

    public C1920lb(com.facebook.ads.redexgen.core.C2146pT c2146pT) {
        this.A00 = java.util.Collections.singletonList(c2146pT);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        return j >= 0 ? this.A00 : java.util.Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
