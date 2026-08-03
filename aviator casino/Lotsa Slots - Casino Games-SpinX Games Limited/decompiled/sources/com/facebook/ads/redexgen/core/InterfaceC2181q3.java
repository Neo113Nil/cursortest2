package com.facebook.ads.redexgen.core;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.q3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2181q3<K, V> {
    java.util.Map<K, java.util.Collection<V>> A4H();

    boolean AHE(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    void clear();

    int size();

    java.util.Collection<V> values();
}
