package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0603Bp<F, T> extends com.facebook.ads.redexgen.core.AbstractC2198qK<F> implements java.io.Serializable {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"qP7uN3CTeBtugcvn4iscvs4NawNVw3hj", "uACvKKD4Xh814PQzJz7fno8Y0d2htzTr", "OaGwUL0wruZXrmXuBUYR8eOdlsWVX5jO", "JY9GX7tPgJ", "UJNVJd39Mn7RrVqRZr4HQjubetYZ2pJj", "tP9Bx5HW1SG5GbSCFf4kAQmgB2SyEv9b", "xcsG1NfXHnFrLoKWAotfCT6bqQ3ToZXO", "wDWfKnr2Hnyq67FaxNzVQD5A0FwwfXbW"};
    public static final long serialVersionUID = 0;
    public final com.facebook.ads.redexgen.core.InterfaceC1847kO<F, ? extends T> A00;
    public final com.facebook.ads.redexgen.core.AbstractC2198qK<T> A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[6].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "UOsr4mSSP3XVk2xA78tBNfMlPB0RSTkt";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{78, 122, 59, 58, 6, 49, 39, 33, 56, 32, com.google.common.base.Ascii.ESC, 50, 124};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Comparator
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof com.facebook.ads.redexgen.core.C0603Bp)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C0603Bp c0603Bp = (com.facebook.ads.redexgen.core.C0603Bp) object;
        return this.A00.equals(c0603Bp.A00) && this.A01.equals(c0603Bp.A01);
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public C0603Bp(com.facebook.ads.redexgen.core.InterfaceC1847kO<F, ? extends T> function, com.facebook.ads.redexgen.core.AbstractC2198qK<T> ordering) {
        this.A00 = (com.facebook.ads.redexgen.core.InterfaceC1847kO) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(function);
        this.A01 = (com.facebook.ads.redexgen.core.AbstractC2198qK) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(ordering);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK, java.util.Comparator
    public final int compare(@com.google.common.collect.ParametricNullness F f, @com.google.common.collect.ParametricNullness F f2) {
        return this.A01.compare(this.A00.A4B(f), this.A00.A4B(f2));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(this.A00, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bp != com.google.common.collect.ByFunctionOrdering<F, T> */
    public final java.lang.String toString() {
        return this.A01 + A00(1, 12, 81) + this.A00 + A00(0, 1, 98);
    }
}
