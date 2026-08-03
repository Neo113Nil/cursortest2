package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2028nY<E> extends java.util.AbstractCollection<E> {
    public static java.lang.String[] A02 = {"psRx", "PaE", "QiZgSeBrDq6phMoyY15Rwd7xkYcWmlyn", "uVAvG1n4qY9Qm2x2Wwx", "SVY", "R4BVVGRseyt6VeG7R8", "WLKIpS44UKGOH0fPOaMwAxdsVmPqX8", "BDwHYCW9PjOYM7xnzaTutUE85f87LOy"};
    public final com.facebook.ads.redexgen.core.InterfaceC1867kj<? super E> A00;
    public final java.util.Collection<E> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    public C2028nY(java.util.Collection<E> unfiltered, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super E> predicate) {
        this.A01 = unfiltered;
        this.A00 = predicate;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(@com.google.common.collect.ParametricNullness E element) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0C(this.A00.A4C(element));
        return this.A01.add(element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        java.util.Iterator<? extends E> it = collection.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A02;
            if (strArr[3].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[4] = "Kot";
            strArr2[0] = "MSwZ";
            if (hasNext) {
                E element = it.next();
                com.facebook.ads.redexgen.core.AbstractC1866ki.A0C(this.A00.A4C(element));
            } else {
                return this.A01.addAll(collection);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        com.facebook.ads.redexgen.core.AbstractC2119p2.A03(this.A01, this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        if (com.facebook.ads.redexgen.core.AbstractC2032nc.A03(this.A01, element)) {
            return this.A00.A4C(element);
        }
        java.lang.String[] strArr = A02;
        if (strArr[6].length() == strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        A02[7] = "9iIPWTKMkBhlqzWY";
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        return com.facebook.ads.redexgen.core.AbstractC2032nc.A04(this, collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !com.facebook.ads.redexgen.core.AbstractC2119p2.A02(this.A01, this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return com.facebook.ads.redexgen.core.AbstractC2126p9.A01(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object element) {
        if (contains(element)) {
            java.util.Collection<E> collection = this.A01;
            if (A02[2].charAt(1) == 'w') {
                throw new java.lang.RuntimeException();
            }
            A02[2] = "9yXQ23WyWLgHpbgnupjKfVlvAqZ13eIO";
            if (collection.remove(element)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    @Override // java.util.AbstractCollection, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(final java.util.Collection<?> collection) {
        boolean z = false;
        java.util.Iterator<E> it = this.A01.iterator();
        while (changed) {
            E next = it.next();
            boolean changed = this.A00.A4C(next);
            if (changed) {
                boolean changed2 = collection.contains(next);
                if (changed2) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(final java.util.Collection<?> collection) {
        boolean z = false;
        java.util.Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A02;
            if (strArr[6].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "eduZnFsmDO9t4YELThQVy46ccpCSsmF";
            if (hasNext) {
                E next = it.next();
                boolean changed = this.A00.A4C(next);
                if (changed) {
                    boolean changed2 = collection.contains(next);
                    if (!changed2) {
                        it.remove();
                        z = true;
                    }
                }
            } else {
                return z;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        java.util.Iterator<E> it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[7].length() == 13) {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "AcviO2YMuORzBgOxIFInwgIFg";
            if (hasNext) {
                boolean A4C = this.A00.A4C(it.next());
                java.lang.String[] strArr = A02;
                java.lang.String str = strArr[3];
                java.lang.String str2 = strArr[1];
                int length = str.length();
                int size = str2.length();
                if (length != size) {
                    A02[7] = "u87jus";
                    if (A4C) {
                        i++;
                    }
                } else if (A4C) {
                    i++;
                }
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return com.facebook.ads.redexgen.core.AbstractC2147pU.A05(iterator()).toArray();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Collections2$FilteredCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) com.facebook.ads.redexgen.core.AbstractC2147pU.A05(iterator()).toArray(tArr);
    }
}
