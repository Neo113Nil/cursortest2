package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1895lC extends com.facebook.ads.redexgen.core.H2 {
    public C1895lC(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, long j, long j2) {
        super(new com.facebook.ads.redexgen.core.C1993mz(), new com.facebook.ads.redexgen.core.C1896lD(anonymousClass53), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }
}
