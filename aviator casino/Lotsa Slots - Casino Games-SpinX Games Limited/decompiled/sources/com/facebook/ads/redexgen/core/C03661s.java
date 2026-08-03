package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\r\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "<init>", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C03661s<E> extends com.facebook.ads.redexgen.core.AbstractC03651r<E>.IteratorImpl implements java.util.ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC03651r<E> A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.DC2, 45, 56, 47, 60, 41, 52, 50, 51, 125, 52, 46, 125, 51, 50, 41, 125, 46, 40, 45, 45, 50, 47, 41, 56, 57, 125, 59, 50, 47, 125, 47, 56, 60, 57, 112, 50, 51, 49, 36, 125, 62, 50, 49, 49, 56, 62, 41, 52, 50, 51};
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new java.lang.UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new java.lang.UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03661s(com.facebook.ads.redexgen.core.AbstractC03651r abstractC03651r, int i) {
        super(abstractC03651r);
        this.A00 = abstractC03651r;
        com.facebook.ads.redexgen.core.AbstractC03651r.A02.A04(i, this.A00.size());
        A05(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getA00() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getA00();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            com.facebook.ads.redexgen.core.AbstractC03651r<E> abstractC03651r = this.A00;
            A05(getA00() - 1);
            return abstractC03651r.get(getA00());
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
