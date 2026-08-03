package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.i8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1721i8<K, V> extends com.facebook.ads.redexgen.core.PC<K, V> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1720i7 A00;

    public C1721i8(com.facebook.ads.redexgen.core.C1720i7 c1720i7) {
        this.A00 = c1720i7;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A04() {
        return ((com.facebook.ads.redexgen.core.PF) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A05(java.lang.Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final int A06(java.lang.Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final java.util.Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final java.lang.Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
