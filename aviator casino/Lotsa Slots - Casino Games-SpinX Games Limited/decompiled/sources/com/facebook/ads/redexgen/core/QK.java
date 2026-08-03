package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QK implements com.facebook.ads.redexgen.core.InterfaceC1161Xr {
    public final java.util.Collection<java.lang.String> A00;

    public QK() {
        this.A00 = new java.util.ArrayList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void AH8(java.lang.String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1161Xr
    public final void flush() {
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
