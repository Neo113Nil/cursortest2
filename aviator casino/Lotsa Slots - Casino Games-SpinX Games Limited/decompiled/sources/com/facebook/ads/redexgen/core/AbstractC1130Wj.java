package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1130Wj {
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC1129Wi> A00 = new java.util.concurrent.atomic.AtomicReference<>(null);

    public static com.facebook.ads.redexgen.core.InterfaceC1129Wi A00() {
        com.facebook.ads.redexgen.core.InterfaceC1129Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new com.facebook.ads.redexgen.core.R1();
        }
        return errorLogger;
    }

    public static void A01(com.facebook.ads.redexgen.core.InterfaceC1129Wi interfaceC1129Wi) {
        A00.set(interfaceC1129Wi);
    }
}
