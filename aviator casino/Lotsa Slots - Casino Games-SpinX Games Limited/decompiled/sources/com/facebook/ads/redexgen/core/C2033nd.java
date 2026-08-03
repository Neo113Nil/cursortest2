package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2033nd<K, V> extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
    public static java.lang.String[] A01 = {"ttZbCw840LiCmMMagoH7x1ccnhXQbEM1", "MpxecthRuEJqGUuoNQ5A37YBhHZeOVcm", "F5DHcgT", "zg8RxjbDPuahNU47bDpYXJZcrKLRzeUW", "lK8l2vp", "Hs2vTdzQZwjFS6KGav0LYTLDhx5JGetB", "dmVTdLfQWkJOIA8zEGmBV6szkdy3co89", "IVYzXJf67D23TQo71K1DHnZqVzwcGU9Z"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2037nh A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    public C2033nd(final com.facebook.ads.redexgen.core.C2037nh this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object o) {
        int A07;
        java.lang.Object A0F;
        java.util.Map<K, V> delegate = this.A00.A0h();
        if (delegate != null) {
            return delegate.entrySet().contains(o);
        }
        boolean z = o instanceof java.util.Map.Entry;
        if (A01[5].charAt(2) != '2') {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "ECwcYxYjSLCNiUqu2ExsZmnTntzmdq50";
        if (!z) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) o;
        A07 = this.A00.A07(entry.getKey());
        if (A07 == -1) {
            return false;
        }
        A0F = this.A00.A0F(A07);
        return com.facebook.ads.redexgen.core.CB.A01(A0F, entry.getValue());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return this.A00.A0d();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object o) {
        int A00;
        java.lang.Object A0C;
        int[] A0T;
        java.lang.Object[] A0V;
        java.lang.Object[] A0W;
        java.util.Map<K, V> delegate = this.A00.A0h();
        if (delegate != null) {
            return delegate.entrySet().remove(o);
        }
        if (!(o instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) o;
        if (this.A00.A0p()) {
            return false;
        }
        A00 = this.A00.A00();
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        A0C = this.A00.A0C();
        A0T = this.A00.A0T();
        A0V = this.A00.A0V();
        A0W = this.A00.A0W();
        int A06 = com.facebook.ads.redexgen.core.AbstractC2040nk.A06(key, value, A00, A0C, A0T, A0V, A0W);
        if (A06 == -1) {
            return false;
        }
        this.A00.A0n(A06, A00);
        if (A01[7].charAt(30) == 'S') {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "padFRdr7QgkeMqaUt5IwgmGjkWqeexUC";
        com.facebook.ads.redexgen.core.C2037nh.A04(this.A00);
        this.A00.A0j();
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nd != com.google.common.collect.CompactHashMap<K, V>$EntrySetView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
