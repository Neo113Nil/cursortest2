package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WZ extends android.widget.FrameLayout {
    public static final java.util.concurrent.atomic.AtomicBoolean A00 = new java.util.concurrent.atomic.AtomicBoolean();
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.WS> A01 = new java.util.concurrent.atomic.AtomicReference<>();

    public static void A00(boolean z, com.facebook.ads.redexgen.core.WS ws) {
        A00.set(z);
        A01.set(ws);
    }
}
