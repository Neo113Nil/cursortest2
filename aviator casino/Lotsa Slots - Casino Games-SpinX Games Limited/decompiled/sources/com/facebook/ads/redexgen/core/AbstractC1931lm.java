package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1931lm<T> implements java.util.Iterator<T> {
    public static java.lang.String[] A05 = {"yj7R8PNFUN0fUwX4ptDHVgb9mciI6y8S", "w28O54ZRsma9hL5SDt3wymltcx69iHvf", "YcrQeuLRolqkQfaDcqM9IKWqy1ikOF9U", "DKWy1m0QH6rgUafvBHDUPpGtl2BaSlV6", "o1aBNcvHQhMY4jdZXZXshBAdWZXBL6DV", "37Z8EQ1QZKWXRGLFu1IhCyfwxu1s5rVt", "AbJFenTKTViZI", "TvP3YStRcjl"};

    @javax.annotation.CheckForNull
    public K A00;

    @javax.annotation.CheckForNull
    public java.util.Collection<V> A01;
    public java.util.Iterator<V> A02;
    public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A04;

    public abstract T A00(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    public AbstractC1931lm(final com.facebook.ads.redexgen.core.C2L this$0) {
        java.util.Map map;
        this.A04 = this$0;
        map = this$0.A01;
        this.A03 = map.entrySet().iterator();
        this.A00 = null;
        this.A01 = null;
        this.A02 = com.facebook.ads.redexgen.core.AbstractC2126p9.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A03.hasNext()) {
            boolean hasNext = this.A02.hasNext();
            if (A05[6].length() == 21) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[5] = "pECQkiKXDW2sGX88ia3JmL5aCpMJahaX";
            strArr[4] = "40BbvxkWBVb1JaKod9nJScM88XX6buwm";
            if (!hasNext) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    /* JADX WARN: Type inference failed for: r0v7, types: [K, java.lang.Object] */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        if (!this.A02.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.A03.next();
            this.A00 = entry.getKey();
            this.A01 = (java.util.Collection) entry.getValue();
            java.util.Iterator<V> it = this.A01.iterator();
            if (A05[6].length() == 21) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[2] = "8KgPjQMUi9vsfEA6OvWHRw30OGi5ygpx";
            strArr[0] = "pWw8h70m8FKHbc1TiSoELMLej3it9wyW";
            this.A02 = it;
        }
        return A00(com.facebook.ads.redexgen.core.AbstractC2193qF.A01(this.A00), this.A02.next());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final void remove() {
        this.A02.remove();
        if (((java.util.Collection) java.util.Objects.requireNonNull(this.A01)).isEmpty()) {
            this.A03.remove();
        }
        com.facebook.ads.redexgen.core.C2L.A01(this.A04);
    }
}
