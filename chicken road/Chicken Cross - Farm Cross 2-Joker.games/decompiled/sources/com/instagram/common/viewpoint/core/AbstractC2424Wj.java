package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2424Wj {
    public static final AtomicReference<InterfaceC2423Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC2423Wi A00() {
        InterfaceC2423Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC2423Wi interfaceC2423Wi) {
        A00.set(interfaceC2423Wi);
    }
}
