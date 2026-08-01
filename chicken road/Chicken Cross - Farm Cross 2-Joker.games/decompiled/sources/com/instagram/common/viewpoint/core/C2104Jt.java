package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2104Jt implements InterfaceC2608bU {
    public final /* synthetic */ C2093Ji A00;

    public C2104Jt(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2608bU
    public final void ADY() {
        VI vi;
        AbstractC2182Mt abstractC2182Mt;
        C2647c7 c2647c7;
        C2607bT c2607bT;
        C2607bT c2607bT2;
        C2647c7 c2647c72;
        AbstractC2182Mt abstractC2182Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC2182Mt = this.A00.A0W;
        if (abstractC2182Mt != null) {
            C2093Ji c2093Ji = this.A00;
            abstractC2182Mt2 = this.A00.A0W;
            c2093Ji.A0m(((AnonymousClass85) abstractC2182Mt2).A0M().toString());
        }
        c2647c7 = this.A00.A0b;
        if (c2647c7.A0D() != null) {
            c2647c72 = this.A00.A0b;
            c2647c72.A0D().ACQ();
        }
        c2607bT = this.A00.A09;
        if (c2607bT != null) {
            c2607bT2 = this.A00.A09;
            c2607bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
