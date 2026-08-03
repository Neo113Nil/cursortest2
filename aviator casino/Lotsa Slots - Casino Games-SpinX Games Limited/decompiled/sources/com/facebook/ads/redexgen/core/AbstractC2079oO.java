package com.facebook.ads.redexgen.core;

@com.google.errorprone.annotations.DoNotMock("Use ImmutableList.of or another implementation")
@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2079oO<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    public static byte[] A00 = null;
    public static final java.lang.Object[] A01;
    public static final long serialVersionUID = 912559;

    public static java.lang.String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{-7, com.google.common.base.Ascii.ETB, 9, -60, -9, 9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 9, 8, -22, 19, com.google.common.base.Ascii.SYN, 17};
    }

    public abstract int A0I(java.lang.Object[] dst, int offset);

    public abstract com.facebook.ads.redexgen.core.BP<E> A0J();

    public abstract boolean A0K();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@javax.annotation.CheckForNull java.lang.Object object);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(tArr);
        int size = size();
        if (tArr.length < size) {
            java.lang.Object[] A0L = A0L();
            if (A0L != null) {
                return (T[]) com.facebook.ads.redexgen.core.AbstractC2199qN.A02(A0L, A0H(), A0G(), tArr);
            }
            tArr = (T[]) com.facebook.ads.redexgen.core.AbstractC2194qG.A05(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        A0I(tArr, 0);
        return tArr;
    }

    static {
        A0F();
        A01 = new java.lang.Object[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    public int A0G() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    public int A0H() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @javax.annotation.CheckForNull
    public java.lang.Object[] A0L() {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> newElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException(A0E(0, 18, 75));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(@javax.annotation.CheckForNull java.lang.Object object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> oldElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> elementsToKeep) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator<E> spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oO != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(A01);
    }
}
