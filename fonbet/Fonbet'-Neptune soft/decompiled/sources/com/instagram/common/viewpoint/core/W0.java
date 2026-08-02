package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class W0 {
    public static final AtomicReference<InterfaceC0846Vz> A00 = new AtomicReference<>(null);

    public static InterfaceC0846Vz A00() {
        InterfaceC0846Vz errorLogger = A00.get();
        if (errorLogger == null) {
            return new PR();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC0846Vz interfaceC0846Vz) {
        A00.set(interfaceC0846Vz);
    }
}
