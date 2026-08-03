package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2257rf extends java.util.AbstractList<java.lang.Integer> implements java.util.RandomAccess, java.io.Serializable {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-87, -99};
    }

    static {
        A04();
    }

    public C2257rf(int[] array) {
        this(array, 0, array.length);
    }

    public C2257rf(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer get(int index) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A00(index, size());
        return java.lang.Integer.valueOf(this.A02[this.A01 + index]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer set(int index, java.lang.Integer element) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A00(index, size());
        int i = this.A02[this.A01 + index];
        int[] iArr = this.A02;
        int i2 = this.A01 + index;
        int oldValue = ((java.lang.Integer) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(element)).intValue();
        iArr[i2] = oldValue;
        return java.lang.Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final java.util.Spliterator.OfInt spliterator() {
        return java.util.Spliterators.spliterator(this.A02, this.A01, this.A00, 0);
    }

    public final int[] A05() {
        return java.util.Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object target) {
        int A042;
        if (target instanceof java.lang.Integer) {
            A042 = com.facebook.ads.redexgen.core.AbstractC0580As.A04(this.A02, ((java.lang.Integer) target).intValue(), this.A01, this.A00);
            if (A042 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        boolean z = object instanceof com.facebook.ads.redexgen.core.C2257rf;
        if (A04[2].length() != 24) {
            throw new java.lang.RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (z) {
            com.facebook.ads.redexgen.core.C2257rf c2257rf = (com.facebook.ads.redexgen.core.C2257rf) object;
            int size = size();
            if (c2257rf.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int size2 = this.A02[this.A01 + i];
                if (size2 != c2257rf.A02[c2257rf.A01 + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 < result; i2++) {
            int result = this.A02[i2];
            i = (i * 31) + com.facebook.ads.redexgen.core.AbstractC0580As.A00(result);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        int i;
        if (target instanceof java.lang.Integer) {
            int[] iArr = this.A02;
            java.lang.String[] strArr = A04;
            if (strArr[6].charAt(15) == strArr[5].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
            strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
            i = com.facebook.ads.redexgen.core.AbstractC0580As.A04(iArr, ((java.lang.Integer) target).intValue(), this.A01, this.A00);
            if (i >= 0) {
                return i - this.A01;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r1 = com.facebook.ads.redexgen.core.AbstractC0580As.A05(r4.A02, ((java.lang.Integer) r5).intValue(), r4.A01, r4.A00);
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object target) {
        int A05;
        if ((target instanceof java.lang.Integer) && A05 >= 0) {
            int i = this.A01;
            return A05 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List<java.lang.Integer> subList(int fromIndex, int toIndex) {
        int size = size();
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0B(fromIndex, toIndex, size);
        if (fromIndex == toIndex) {
            return java.util.Collections.emptyList();
        }
        return new com.facebook.ads.redexgen.core.C2257rf(this.A02, this.A01 + fromIndex, this.A01 + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(size() * 5);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST).append(this.A02[this.A01]);
        for (int i = this.A01 + 1; i < this.A00; i++) {
            sb.append(A02(0, 2, 23)).append(this.A02[i]);
        }
        java.lang.StringBuilder builder = sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return builder.toString();
    }
}
