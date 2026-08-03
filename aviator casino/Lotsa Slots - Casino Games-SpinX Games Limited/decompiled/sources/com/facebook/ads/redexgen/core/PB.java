package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: assets/audience_network/classes2.dex */
public final class PB<V> implements java.util.Collection<V> {
    public static java.lang.String[] A01 = {"B65p9FaUvzrFNvwuG6LjFu3dW8", "xEYdbkQkXJmqNi6lUscBQUgiZa7D0Dxz", "kpPcM5P9PMrcR9maJ", "lIn8lLeU70LUHRqRy8hC6rghr0456Bk3", "xAyovFCLcJcKz6S3I", "BHkXiShRs9wapcYGvvb8XQo", "e883n5N2Jnnmw9lqw", "xzZfUck7bISpz3H6ivOii"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.PC A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    public PB(com.facebook.ads.redexgen.core.PC pc) {
        this.A00 = pc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean add(V object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends V> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.A00.A06(obj) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return new com.facebook.ads.redexgen.core.P7(this.A00, 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int A06 = this.A00.A06(obj);
        if (A06 >= 0) {
            this.A00.A0E(A06);
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        int A04 = this.A00.A04();
        boolean z = false;
        int i = 0;
        while (i < A04) {
            com.facebook.ads.redexgen.core.PC pc = this.A00;
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[6];
            int length = str.length();
            int N = str2.length();
            if (length != N) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[7] = "8TyfarL1WEatJJNOns6yk";
            strArr2[2] = "ZFPu54ieTgZ9QJdC5";
            if (collection.contains(pc.A0B(i, 1))) {
                this.A00.A0E(i);
                i--;
                A04--;
                z = true;
            }
            i++;
        }
        return z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        int A04 = this.A00.A04();
        boolean changed = false;
        int i = 0;
        while (i < A04) {
            if (!collection.contains(this.A00.A0B(i, 1))) {
                this.A00.A0E(i);
                i--;
                A04--;
                java.lang.String[] strArr = A01;
                java.lang.String str = strArr[4];
                java.lang.String str2 = strArr[6];
                int length = str.length();
                int N = str2.length();
                if (length != N) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[7] = "W6fJV23d83VeGu0xKkUvg";
                strArr2[2] = "sGDul30tjAcSIzuwi";
                changed = true;
            }
            i++;
        }
        return changed;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.A00.A0G(1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.PB != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ValuesCollection */
    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.A0H(tArr, 1);
    }
}
