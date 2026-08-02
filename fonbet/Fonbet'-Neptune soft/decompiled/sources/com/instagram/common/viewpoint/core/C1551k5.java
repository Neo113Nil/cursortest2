package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1551k5 implements J7 {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C1551k5 A02 = new C1551k5();
    public final List<C1781o2> A00;

    public C1551k5() {
        this.A00 = Collections.emptyList();
    }

    public C1551k5(C1781o2 c1781o2) {
        this.A00 = Collections.singletonList(c1781o2);
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final List<C1781o2> A7P(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final long A7v(int i) {
        C3M.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A8S(long j) {
        return j < 0 ? 0 : -1;
    }
}
