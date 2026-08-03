package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public abstract class BS<K, V> extends com.facebook.ads.redexgen.core.AbstractC2068oD implements java.util.Map<K, V> {
    public abstract java.util.Map<K, V> A05();

    public abstract boolean containsValue(@javax.annotation.CheckForNull java.lang.Object value);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public final int A04() {
        return com.facebook.ads.redexgen.core.AbstractC2219qj.A00(entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public final boolean A06(@javax.annotation.CheckForNull java.lang.Object value) {
        return com.facebook.ads.redexgen.core.AbstractC2166po.A0A(this, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public final boolean A07(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.facebook.ads.redexgen.core.AbstractC2166po.A0B(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @Override // java.util.Map
    public void clear() {
        A05().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public boolean containsKey(@javax.annotation.CheckForNull java.lang.Object key) {
        return A05().containsKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return A05().entrySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @javax.annotation.CheckForNull
    public V get(@javax.annotation.CheckForNull java.lang.Object key) {
        return A05().get(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public boolean isEmpty() {
        return A05().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public java.util.Set<K> keySet() {
        return A05().keySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public V put(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return A05().put(key, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        A05().putAll(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @Override // java.util.Map
    @javax.annotation.CheckForNull
    public V remove(@javax.annotation.CheckForNull java.lang.Object key) {
        return A05().remove(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    public int size() {
        return A05().size();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BS != com.google.common.collect.ForwardingMap<K, V> */
    @Override // java.util.Map
    public java.util.Collection<V> values() {
        return A05().values();
    }
}
