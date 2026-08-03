package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.ll, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1930ll<K, V> implements java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> {
    public static byte[] A03;

    @javax.annotation.CheckForNull
    public java.util.Collection<V> A00;
    public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0607Bt A02;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, -65, 2, 0, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DC2, -65, 19, com.google.common.base.Ascii.SO, -65, com.google.common.base.Ascii.CR, 4, com.google.common.base.Ascii.ETB, 19, -57, -56, -65, com.google.common.base.Ascii.DC2, 8, com.google.common.base.Ascii.CR, 2, 4, -65, 19, 7, 4, -65, com.google.common.base.Ascii.VT, 0, com.google.common.base.Ascii.DC2, 19, -65, 2, 0, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, -65, 19, com.google.common.base.Ascii.SO, -65, 17, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 4, -57, -56};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    public C1930ll(final com.facebook.ads.redexgen.core.C0607Bt this$1) {
        this.A02 = this$1;
        this.A01 = this.A02.A00.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final java.util.Map.Entry<K, java.util.Collection<V>> next() {
        java.util.Map.Entry<K, java.util.Collection<V>> next = this.A01.next();
        this.A00 = next.getValue();
        java.util.Map.Entry<K, java.util.Collection<V>> entry = this.A02.A0A(next);
        return entry;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ll != com.google.common.collect.AbstractMapBasedMultimap<K, V>$AsMap$AsMapIterator */
    @Override // java.util.Iterator
    public final void remove() {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0F(this.A00 != null, A00(0, 50, 112));
        this.A01.remove();
        com.facebook.ads.redexgen.core.C2L.A03(this.A02.A01, this.A00.size());
        this.A00.clear();
        this.A00 = null;
    }
}
