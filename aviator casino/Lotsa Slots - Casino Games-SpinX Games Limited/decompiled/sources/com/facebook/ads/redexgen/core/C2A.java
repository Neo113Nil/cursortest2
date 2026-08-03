package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2A extends com.facebook.ads.redexgen.core.BP<java.lang.Object> {
    public final transient int A00;
    public final transient int A01;
    public final transient java.lang.Object[] A02;

    public C2A(java.lang.Object[] alternatingKeysAndValues, int offset, int size) {
        this.A02 = alternatingKeysAndValues;
        this.A00 = offset;
        this.A01 = size;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final boolean A0K() {
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int index) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A00(index, this.A01);
        return java.util.Objects.requireNonNull(this.A02[(index * 2) + this.A00]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
