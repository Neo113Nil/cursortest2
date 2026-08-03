package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1879kw implements com.facebook.ads.redexgen.core.LU<java.io.File> {
    @Override // com.facebook.ads.redexgen.core.LU
    public final com.facebook.ads.redexgen.core.LT<java.io.File> A3x(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC0855Lm interfaceC0855Lm) {
        if (file.exists()) {
            return new com.facebook.ads.redexgen.core.LT<>(true, file);
        }
        return new com.facebook.ads.redexgen.core.LT<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.LU
    public final void A5D(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC0855Lm interfaceC0855Lm) {
    }
}
