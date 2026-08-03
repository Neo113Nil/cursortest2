package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1682hS implements com.facebook.ads.redexgen.core.InterfaceC1177Yh {
    public static java.lang.String[] A01 = {"8tOzOPKLz5DDIwqC88XBXxH90bmVDotF", "YCktuRbEMhZaz9U821mncTHWO05lwCqY", "Eq7g3criU65KDBPK", "XEHycrxPk7FQv1FkL381pmPNBNbKujpl", "niYnM4G6gzmxtC7fq", "sRQOtQAi", "8G5qrnHnaOtx52JqPPi", "6arHmIfqlBfM2iqNpfy3RxuQJelIt1eI"};
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0998Re> A00;

    public C1682hS(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A00 = new java.lang.ref.WeakReference<>(c0998Re);
    }

    private void A00(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        com.facebook.ads.redexgen.core.C1484eF A07 = c0998Re.A07();
        if (A07 != null && c0998Re.A04() != null) {
            c0998Re.A04().bringChildToFront(A07);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void A44(android.view.View view, int i, android.widget.RelativeLayout.LayoutParams layoutParams) {
        com.facebook.ads.redexgen.core.C0998Re c0998Re = this.A00.get();
        if (c0998Re != null && c0998Re.A04() != null) {
            c0998Re.A04().addView(view, i, layoutParams);
            A00(c0998Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void A45(android.view.View view, android.widget.RelativeLayout.LayoutParams layoutParams) {
        com.facebook.ads.redexgen.core.C0998Re c0998Re = this.A00.get();
        if (c0998Re != null && c0998Re.A04() != null) {
            c0998Re.A04().addView(view, layoutParams);
            A00(c0998Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void A4j(java.lang.String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void A4k(java.lang.String str, com.facebook.ads.redexgen.core.UL ul) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, ul);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void AAo(java.lang.String str, com.facebook.ads.redexgen.core.C0906Nm c0906Nm) {
        if (this.A00.get() != null) {
            java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0998Re> weakReference = this.A00;
            if (A01[4].length() == 0) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "IO1gKUYJJG6YtU6JnI8y";
            weakReference.get().A0D(str, c0906Nm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
    public void ADJ(int i) {
        com.facebook.ads.redexgen.core.C0998Re activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
