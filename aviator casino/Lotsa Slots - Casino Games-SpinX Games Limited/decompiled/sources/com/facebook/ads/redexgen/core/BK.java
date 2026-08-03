package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network/classes2.dex */
public class BK<K, V> extends com.facebook.ads.redexgen.core.AbstractC03511d<java.util.Map.Entry<K, V>, V> {
    public BK(java.util.Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC03511d
    @com.google.common.collect.ParametricNullness
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V A01(java.util.Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
