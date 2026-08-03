package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Q9<T> extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final java.lang.ref.WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Q9 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public Q9(T reference) {
        this.A00 = new java.lang.ref.WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Q9 != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A08() {
        return this.A00.get();
    }
}
