package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K0] */
/* loaded from: assets/audience_network/classes2.dex */
public class BF<K0> extends com.facebook.ads.redexgen.core.AbstractC2182q4<K0> {
    public final /* synthetic */ java.util.Comparator A00;

    public BF(final java.util.Comparator val$comparator) {
        this.A00 = val$comparator;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2182q4
    public final <K extends K0, V> java.util.Map<K, java.util.Collection<V>> A04() {
        return new java.util.TreeMap(this.A00);
    }
}
