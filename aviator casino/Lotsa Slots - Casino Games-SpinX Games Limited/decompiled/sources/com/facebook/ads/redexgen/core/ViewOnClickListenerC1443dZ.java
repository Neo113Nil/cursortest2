package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1443dZ implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"iIV4C6PCamFbOwLs9osqMP65CW35qHVZ", "vu8ePLRZods6FhLp1sOjcscbCnKQtV0u", "aj5bYqq1P6NsPozz4AKHPhJxq4tExiSQ", "sREORf6VoPUSDy", "tYmkAFK6aojaVt6XrGIUitMYwL", "t5b15Ic4Fw72vyTqFljisKwND31PO9vi", "k2wG1EEpilyBuA", "DdpD6jZ5PRtvRqlim5b1myDycB"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;

    public ViewOnClickListenerC1443dZ(com.facebook.ads.redexgen.core.C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt;
        boolean z;
        boolean z2;
        com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt2;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            abstractC0888Mt = this.A00.A0V;
            if (abstractC0888Mt instanceof com.facebook.ads.redexgen.core.AnonymousClass85) {
                z = this.A00.A0K;
                if (A01[5].charAt(19) != 'i') {
                    throw new java.lang.RuntimeException();
                }
                A01[5] = "JfKhMnDlcffILoVNGoui3HCKoOWuag6G";
                if (!z) {
                    this.A00.A0L = true;
                    interfaceC1456dm = this.A00.A0Z;
                    interfaceC1456dm.ACQ();
                    com.facebook.ads.redexgen.core.C5F c5f = this.A00;
                    abstractC0888Mt2 = this.A00.A0V;
                    c5f.A0g(((com.facebook.ads.redexgen.core.AnonymousClass85) abstractC0888Mt2).A0M().toString());
                    if (((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A06.A0q() >= 0) {
                        handler = this.A00.A08;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A06.A0q());
                    }
                }
                com.facebook.ads.redexgen.core.C5F c5f2 = this.A00;
                z2 = this.A00.A0K;
                c5f2.A0j(z2 ? false : true);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
