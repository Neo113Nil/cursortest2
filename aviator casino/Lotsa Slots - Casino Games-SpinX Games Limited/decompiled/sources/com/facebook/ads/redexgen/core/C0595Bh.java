package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0595Bh<T> extends com.facebook.ads.redexgen.core.AbstractC2198qK<T> implements java.io.Serializable {
    public static java.lang.String[] A01 = {"jVomwQRsen5vglXLuhXzBdwbPq6Ybrnn", "4aFITO9kz2LhtcD79HHzI", "vi18DojAtNgr3DJJSarcVnM7GKn6nndK", "ML5KuQXC", "N0lS1ni31cQ1TBeJZ0107lcHpyRIIPod", "312TaVRQAIGqwiXD4iywzyjTEypEIgK4", "JELmBa89yxiLk2CDuF87Yo0NIlkJ44v9", "QWcb8PBY5hKO"};
    public static final long serialVersionUID = 0;
    public final java.util.Comparator<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public C0595Bh(java.util.Comparator<T> comparator) {
        this.A00 = (java.util.Comparator) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2198qK, java.util.Comparator
    public final int compare(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b) {
        return this.A00.compare(a2, b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    @Override // java.util.Comparator
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.facebook.ads.redexgen.core.C0595Bh) {
            return this.A00.equals(((com.facebook.ads.redexgen.core.C0595Bh) object).A00);
        }
        java.lang.String[] strArr = A01;
        if (strArr[0].charAt(22) == strArr[5].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "MG7YcOvDvuMg";
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.google.common.collect.ComparatorOrdering<T> */
    public final java.lang.String toString() {
        return this.A00.toString();
    }
}
