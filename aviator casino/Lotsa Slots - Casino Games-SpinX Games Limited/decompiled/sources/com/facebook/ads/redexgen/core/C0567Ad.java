package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0019\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0010H\u0096\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0096\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "serialVersionUID", "", "equals", "", "other", "", "hashCode", "", "toString", "", "size", "getSize", "()I", "isEmpty", "contains", "element", "containsAll", "elements", "", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "indexOf", "lastIndexOf", "iterator", "", "listIterator", "", "subList", "fromIndex", "toIndex", "readResolve", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0567Ad implements java.util.List, java.io.Serializable, java.util.RandomAccess {
    public static byte[] A00 = null;
    public static final com.facebook.ads.redexgen.core.C0567Ad A01;
    public static final long serialVersionUID = -7390468764508069838L;

    static {
        A05();
        A01 = new com.facebook.ads.redexgen.core.C0567Ad();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{65, 53, -119, -124, 94, -125, 121, 122, -115, 79, 53, -109, -69, -66, -62, -57, 110, -70, -73, -63, -62, 110, -78, -67, -77, -63, -68, 117, -62, 110, -79, -67, -68, -62, -81, -73, -68, 110, -77, -70, -77, -69, -77, -68, -62, 110, -81, -62, 110, -73, -68, -78, -77, -58, 110, 96, -123, 123, 124, -113, 81, 55, 120, -103, -114, -101, -118, -99, -110, -104, -105, 73, -110, -100, 73, -105, -104, -99, 73, -100, -98, -103, -103, -104, -101, -99, -114, -115, 73, -113, -104, -101, 73, -101, -114, -118, -115, 86, -104, -105, -107, -94, 73, -116, -104, -107, -107, -114, -116, -99, -110, -104, -105, -50, -48, 106, 123, 123, 106, -126, -84, -77, -84, -76, -84, -75, -69, -25, -18, -25, -17, -25, -16, -10, -11, -48, -36, -39, -41, -77, -40, -50, -49, -30, -92, -118};
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return com.facebook.ads.redexgen.core.AbstractC2212qa.A02(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.facebook.ads.redexgen.core.C2210qY.A09(tArr, A03(115, 5, 5));
        return (T[]) com.facebook.ads.redexgen.core.AbstractC2212qa.A03(this, tArr);
    }

    private final int A00() {
        return 0;
    }

    private final int A01(java.lang.Void r4) {
        com.facebook.ads.redexgen.core.C2210qY.A09(r4, A03(120, 7, 67));
        return -1;
    }

    private final int A02(java.lang.Void r4) {
        com.facebook.ads.redexgen.core.C2210qY.A09(r4, A03(120, 7, 67));
        return -1;
    }

    private final java.lang.Void A04(int i) {
        throw new java.lang.IndexOutOfBoundsException(A03(11, 44, 74) + i + '.');
    }

    private final boolean A06(java.lang.Void r4) {
        com.facebook.ads.redexgen.core.C2210qY.A09(r4, A03(120, 7, 67));
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (0 == 0) {
            return false;
        }
        return A06(null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        com.facebook.ads.redexgen.core.C2210qY.A09(elements, A03(127, 8, 126));
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return (other instanceof java.util.List) && ((java.util.List) other).isEmpty();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        A04(i);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (0 == 0) {
            return -1;
        }
        return A01(null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return com.facebook.ads.redexgen.core.C0568Ae.A01;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (0 == 0) {
            return -1;
        }
        return A02(null);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return com.facebook.ads.redexgen.core.C0568Ae.A01;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int index) {
        if (index == 0) {
            return com.facebook.ads.redexgen.core.C0568Ae.A01;
        }
        throw new java.lang.IndexOutOfBoundsException(A03(55, 7, 19) + index);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return A00();
    }

    @Override // java.util.List
    public final java.util.List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        throw new java.lang.IndexOutOfBoundsException(A03(135, 11, 102) + fromIndex + A03(0, 11, 17) + toIndex);
    }

    public final java.lang.String toString() {
        return A03(113, 2, 111);
    }
}
