package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: assets/audience_network/classes2.dex */
public final class P9<K> implements java.util.Set<K> {
    public static java.lang.String[] A01 = {"edFq1RSzVbogperxRnGO2mwS9T0C3jXY", "CE90aEI9KYNoN0DMFbwcn9PMt89CsnEy", "tPPb", "CijerYzHuYsgCporrbQrcy6DwpkaY1hX", "Nwp2N8bBhYR0nMsdl7Yct", "Yte1vUSgji4S3VNobeKxGdrgBkFaACT", "hyxYDNsU9Fu2EdzaavUXH", "kSbZdYOgqhrWj8RnTgPZsuZs4QqXHZoL"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.PC A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    public P9(com.facebook.ads.redexgen.core.PC pc) {
        this.A00 = pc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(@javax.annotation.Nullable K object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends K> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@javax.annotation.Nullable java.lang.Object obj) {
        return this.A00.A05(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        return com.facebook.ads.redexgen.core.PC.A00(this.A00.A07(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return com.facebook.ads.redexgen.core.PC.A03(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        int result = this.A00.A04();
        for (int i2 = result - 1; i2 >= 0; i2--) {
            int i3 = 0;
            java.lang.Object A0B = this.A00.A0B(i2, 0);
            if (A0B != null) {
                i3 = A0B.hashCode();
            }
            i += i3;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<K> iterator() {
        return new com.facebook.ads.redexgen.core.P7(this.A00, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int A05 = this.A00.A05(obj);
        if (A05 >= 0) {
            this.A00.A0E(A05);
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[2];
            int length = str.length();
            int index = str2.length();
            if (length == index) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "xtpBes5HGReh40nAQqVKY";
            strArr2[6] = "hpfnMqiRo4gFf5SPN0UOy";
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        return com.facebook.ads.redexgen.core.PC.A01(this.A00.A07(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        return com.facebook.ads.redexgen.core.PC.A02(this.A00.A07(), collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.A00.A0G(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P9 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$KeySet */
    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.A0H(tArr, 0);
    }
}
