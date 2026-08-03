package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WU {
    public static final java.util.Set<java.lang.Object> A00 = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public static final java.util.concurrent.atomic.AtomicBoolean A01 = new java.util.concurrent.atomic.AtomicBoolean(true);
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.WS> A02 = new java.util.concurrent.atomic.AtomicReference<>();

    public static void A00(java.lang.Throwable th, java.lang.Object obj) throws java.lang.Throwable {
        if (A01.get()) {
            A00.add(obj);
            com.facebook.ads.redexgen.core.AbstractC1130Wj.A00().AAx(3306, th);
            com.facebook.ads.redexgen.core.WS contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AIZ(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, com.facebook.ads.redexgen.core.WS ws) {
        A01.set(z);
        A02.set(ws);
    }

    public static boolean A02(java.lang.Object obj) {
        return A00.contains(obj);
    }
}
