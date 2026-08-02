package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0584Lr implements InterfaceC0964aH {
    public final /* synthetic */ C0569Lc A00;

    public C0584Lr(C0569Lc c0569Lc) {
        this.A00 = c0569Lc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0964aH
    public final void ACI() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0964aH
    public final void AE7() {
        C0850Wd c0850Wd;
        this.A00.A0F = false;
        c0850Wd = this.A00.A0O;
        c0850Wd.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0964aH
    public final void AE8() {
        C0850Wd c0850Wd;
        this.A00.A0F = true;
        c0850Wd = this.A00.A0O;
        c0850Wd.A06();
    }
}
