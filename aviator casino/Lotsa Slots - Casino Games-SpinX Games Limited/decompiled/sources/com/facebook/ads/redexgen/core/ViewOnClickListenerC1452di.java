package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1452di implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass55 A00;

    public ViewOnClickListenerC1452di(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
            abstractC0888Mt = this.A00.A0S;
            if (abstractC0888Mt instanceof com.facebook.ads.redexgen.core.AnonymousClass85) {
                z = this.A00.A0D;
                if (!z) {
                    interfaceC1456dm = this.A00.A0Z;
                    interfaceC1456dm.ACQ();
                    this.A00.A0E = true;
                    com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55 = this.A00;
                    abstractC0888Mt2 = this.A00.A0S;
                    anonymousClass55.A0p(((com.facebook.ads.redexgen.core.AnonymousClass85) abstractC0888Mt2).A0M().toString());
                    long A0q = ((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A06.A0q();
                    if (A01[1].length() != 7) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (A0q >= 0) {
                        handler = this.A00.A0P;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((com.facebook.ads.redexgen.core.AbstractC0775Ij) this.A00).A06.A0q());
                    }
                }
                com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass552 = this.A00;
                z2 = this.A00.A0D;
                anonymousClass552.A0u(z2 ? false : true);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
