package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC17615t A02;
    public InterfaceC3161kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C17565o A07 = new C17565o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC17615t interfaceC17615t) {
        this.A02 = interfaceC17615t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C16521k A5I() {
        C16521k c16521k = new C16521k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c16521k.A43(this.A02);
        }
        return c16521k;
    }
}
