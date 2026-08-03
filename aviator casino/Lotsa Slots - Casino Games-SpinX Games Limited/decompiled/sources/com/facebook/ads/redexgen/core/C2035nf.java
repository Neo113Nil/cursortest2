package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.nf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2035nf<K> extends java.util.AbstractSet<K> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2037nh A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    public C2035nf(final com.facebook.ads.redexgen.core.C2037nh this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
        return this.A00.containsKey(o);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<K> iterator() {
        return this.A00.A0e();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
        java.lang.Object A0K;
        java.lang.Object obj;
        java.util.Map A0h = this.A00.A0h();
        if (A0h != null) {
            return A0h.keySet().remove(o);
        }
        A0K = this.A00.A0K(o);
        obj = com.facebook.ads.redexgen.core.C2037nh.A0B;
        return A0K != obj;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nf != com.google.common.collect.CompactHashMap<K, V>$KeySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
