package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2036ng<V> extends java.util.AbstractCollection<V> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2037nh A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ng != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    public C2036ng(final com.facebook.ads.redexgen.core.C2037nh this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ng != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ng != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return this.A00.A0f();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ng != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
