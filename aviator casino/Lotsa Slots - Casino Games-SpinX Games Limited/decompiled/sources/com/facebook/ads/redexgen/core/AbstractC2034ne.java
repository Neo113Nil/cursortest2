package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2034ne<T> implements java.util.Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2037nh A03;

    @com.google.common.collect.ParametricNullness
    public abstract T A03(int entry);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public AbstractC2034ne(final com.facebook.ads.redexgen.core.C2037nh this$0) {
        int i;
        this.A03 = this$0;
        i = this.A03.A03;
        this.A01 = i;
        this.A00 = this.A03.A0a();
        this.A02 = -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public /* synthetic */ AbstractC2034ne(com.facebook.ads.redexgen.core.C2037nh c2037nh, com.facebook.ads.redexgen.core.C0600Bm c0600Bm) {
        this(c2037nh);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private void A01() {
        int i;
        i = this.A03.A03;
        if (i == this.A01) {
        } else {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private final void A02() {
        this.A01 += 32;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        A01();
        if (hasNext()) {
            this.A02 = this.A00;
            T A03 = A03(this.A00);
            this.A00 = this.A03.A0b(this.A00);
            return A03;
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ne != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final void remove() {
        java.lang.Object A0E;
        A01();
        com.facebook.ads.redexgen.core.AbstractC2013nJ.A04(this.A02 >= 0);
        A02();
        com.facebook.ads.redexgen.core.C2037nh c2037nh = this.A03;
        A0E = this.A03.A0E(this.A02);
        c2037nh.remove(A0E);
        this.A00 = this.A03.A0c(this.A00, this.A02);
        this.A02 = -1;
    }
}
