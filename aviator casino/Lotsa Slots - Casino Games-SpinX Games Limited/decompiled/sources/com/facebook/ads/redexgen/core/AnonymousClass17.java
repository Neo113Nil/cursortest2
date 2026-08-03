package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class AnonymousClass17<E> extends com.facebook.ads.redexgen.core.C2Q<E> {
    public final com.facebook.ads.redexgen.core.BP<E> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.17 != com.google.common.collect.ImmutableList$Itr<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnonymousClass17(com.facebook.ads.redexgen.core.BP<E> list, final int index) {
        new com.facebook.ads.redexgen.core.AbstractC0582Au<E>(r0, index) { // from class: com.facebook.ads.redexgen.X.2Q
            public static java.lang.String[] A02 = {"CGVvWGsuzzGHQgo9zzOKQIJUE", "KVb58jbZH1vlab4O5iE8zizSXMaJECXq", "VptaZc", "glKzXP3GfNyb6OMGvuDXfVC1yHy2PNCZ", "pmbHPYSyFX1GsR09gqUeaAeR0V5aRJK7", "qAEg6Zt1UGu8L4Bf8ygtzAiT", "mjI", "bmKWD7kDb3scBQ7vRqmkLSkTVZvrcW"};
            public int A00;
            public final int A01;

            @com.google.common.collect.ParametricNullness
            public abstract E A00(int index2);

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            {
                com.facebook.ads.redexgen.core.AbstractC1866ki.A01(index, r1);
                this.A01 = r1;
                this.A00 = index;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.Iterator, java.util.ListIterator
            public final boolean hasNext() {
                return this.A00 < this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.A00 > 0;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.Iterator, java.util.ListIterator
            @com.google.common.collect.ParametricNullness
            public final E next() {
                if (hasNext()) {
                    int i = this.A00;
                    this.A00 = i + 1;
                    if (A02[1].charAt(25) == 'X') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A02;
                    strArr[2] = "xP2Fxu";
                    strArr[0] = "lDEAidUPCXG34cALHoPwa9Bl5";
                    return A00(i);
                }
                throw new java.util.NoSuchElementException();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            @com.google.common.collect.ParametricNullness
            public final E previous() {
                if (hasPrevious()) {
                    int i = this.A00 - 1;
                    this.A00 = i;
                    return A00(i);
                }
                throw new java.util.NoSuchElementException();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2Q != com.google.common.collect.AbstractIndexedListIterator<E> */
            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.A00 - 1;
            }
        };
        final int size = list.size();
        this.A00 = list;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.17 != com.google.common.collect.ImmutableList$Itr<E> */
    @Override // com.facebook.ads.redexgen.core.C2Q
    public final E A00(int index) {
        return this.A00.get(index);
    }
}
