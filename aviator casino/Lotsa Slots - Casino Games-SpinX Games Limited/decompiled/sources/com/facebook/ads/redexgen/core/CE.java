package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CE implements com.facebook.ads.redexgen.core.InterfaceC1686hW {
    public int A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void A9t(java.lang.String str, java.lang.String str2) {
        android.util.Log.i(str, str2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void A9u(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.i(str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final boolean AAY(int i) {
        return this.A00 <= i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1686hW
    public final void AJY(int i) {
        this.A00 = i;
    }
}
