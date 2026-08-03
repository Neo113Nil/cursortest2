package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class LD {
    public final int A00;
    public final java.lang.String A01;
    public final java.util.List<com.facebook.ads.redexgen.core.LC> A02;
    public final byte[] A03;

    public LD(int i, java.lang.String str, java.util.List<com.facebook.ads.redexgen.core.LC> list, byte[] bArr) {
        java.util.List<com.facebook.ads.redexgen.core.LC> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = java.util.Collections.emptyList();
        } else {
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
