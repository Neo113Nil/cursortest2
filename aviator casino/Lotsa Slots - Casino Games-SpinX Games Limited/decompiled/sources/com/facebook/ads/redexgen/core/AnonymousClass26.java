package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class AnonymousClass26<E> extends com.facebook.ads.redexgen.core.C0583Av<E> implements java.util.SortedSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super E> */
    public AnonymousClass26(java.util.SortedSet<E> unfiltered, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super E> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public final java.util.Comparator<? super E> comparator() {
        return ((java.util.SortedSet) this.A01).comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public final E first() {
        return (E) com.facebook.ads.redexgen.core.AbstractC2126p9.A05(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass26(((java.util.SortedSet) this.A01).headSet(toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public E last() {
        java.util.SortedSet sortedSet = (java.util.SortedSet) this.A01;
        while (true) {
            E e = (java.lang.Object) sortedSet.last();
            if (this.A00.A4C(e)) {
                return e;
            }
            sortedSet = sortedSet.headSet(e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass26(((java.util.SortedSet) this.A01).subSet(fromElement, toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.26 != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
        return new com.facebook.ads.redexgen.core.AnonymousClass26(((java.util.SortedSet) this.A01).tailSet(fromElement), this.A00);
    }
}
