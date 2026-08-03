package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1932ln<K> implements java.util.Iterator<K> {
    public static byte[] A03;

    @javax.annotation.CheckForNull
    public java.util.Map.Entry<K, java.util.Collection<V>> A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2O A01;
    public final /* synthetic */ java.util.Iterator A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-39, -38, -117, -50, -52, -41, -41, -34, -117, -33, -38, -117, -39, -48, -29, -33, -109, -108, -117, -34, -44, -39, -50, -48, -117, -33, -45, -48, -117, -41, -52, -34, -33, -117, -50, -52, -41, -41, -117, -33, -38, -117, -35, -48, -40, -38, -31, -48, -109, -108};
    }

    public C1932ln(final com.facebook.ads.redexgen.core.C2O this$1, final java.util.Iterator val$entryIterator) {
        this.A02 = val$entryIterator;
        this.A01 = this$1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final K next() {
        this.A00 = (java.util.Map.Entry) this.A02.next();
        return this.A00.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0F(this.A00 != null, A00(0, 50, 26));
        java.util.Collection collection = (java.util.Collection) this.A00.getValue();
        this.A02.remove();
        com.facebook.ads.redexgen.core.C2L.A03(this.A01.A00, collection.size());
        collection.clear();
        this.A00 = null;
    }
}
