package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public class BQ<K, V> extends com.facebook.ads.redexgen.core.AbstractC1936lr<K, V> implements java.io.Serializable {
    public static final long serialVersionUID = 0;

    @com.google.common.collect.ParametricNullness
    public final K A00;

    @com.google.common.collect.ParametricNullness
    public final V A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BQ != com.google.common.collect.ImmutableEntry<K, V> */
    public BQ(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        this.A00 = key;
        this.A01 = value;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BQ != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final K getKey() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BQ != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V getValue() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BQ != com.google.common.collect.ImmutableEntry<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V setValue(@com.google.common.collect.ParametricNullness V value) {
        throw new java.lang.UnsupportedOperationException();
    }
}
