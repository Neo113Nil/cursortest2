package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\b\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/EmptyIterator;", "", "", "<init>", "()V", "hasNext", "", "hasPrevious", "nextIndex", "", "previousIndex", io.ktor.http.LinkHeader.Rel.Next, "previous", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0568Ae implements java.util.ListIterator {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.C0568Ae A01;

    static {
        A03();
        A01 = new com.facebook.ads.redexgen.core.C0568Ae();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-95, -62, -73, -60, -77, -58, -69, -63, -64, 114, -69, -59, 114, -64, -63, -58, 114, -59, -57, -62, -62, -63, -60, -58, -73, -74, 114, -72, -63, -60, 114, -60, -73, -77, -74, Byte.MAX_VALUE, -63, -64, -66, -53, 114, -75, -63, -66, -66, -73, -75, -58, -69, -63, -64};
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A00(0, 51, 55));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException(A00(0, 51, 55));
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A00(0, 51, 55));
    }

    private final java.lang.Void A01() {
        throw new java.util.NoSuchElementException();
    }

    private final java.lang.Void A02() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        A01();
        throw null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
        A02();
        throw null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }
}
