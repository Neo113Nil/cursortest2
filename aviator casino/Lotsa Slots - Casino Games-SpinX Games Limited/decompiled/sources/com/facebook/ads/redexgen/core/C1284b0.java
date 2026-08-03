package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1284b0 {
    public static java.lang.String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final java.lang.String A00 = com.facebook.ads.redexgen.core.C1284b0.class.getSimpleName();
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A01;
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0862Lt> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1> A04;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1581fp> A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.LV> A06;

    public C1284b0(com.facebook.ads.redexgen.core.LV lv, com.facebook.ads.redexgen.core.InterfaceC1285b1 interfaceC1285b1, com.facebook.ads.redexgen.core.C1581fp c1581fp, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A06 = new java.lang.ref.WeakReference<>(lv);
        this.A04 = new java.lang.ref.WeakReference<>(interfaceC1285b1);
        this.A05 = new java.lang.ref.WeakReference<>(c1581fp);
        this.A01 = new java.lang.ref.WeakReference<>(atomicBoolean);
        this.A02 = new java.lang.ref.WeakReference<>(atomicBoolean2);
        this.A03 = new java.lang.ref.WeakReference<>(c1636gi.A0F());
    }

    private com.facebook.ads.redexgen.core.InterfaceC0862Lt A00() {
        com.facebook.ads.redexgen.core.InterfaceC0862Lt funnel = this.A03.get();
        if (funnel == null) {
            return new com.facebook.ads.redexgen.core.C1856kX();
        }
        return funnel;
    }

    @android.webkit.JavascriptInterface
    public void alert(java.lang.String str) {
        android.util.Log.e(this.A00, str);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getAnalogInfo() {
        return com.facebook.ads.redexgen.core.AbstractC1147Xd.A01(com.facebook.ads.redexgen.core.C1058Tn.A02());
    }

    @android.webkit.JavascriptInterface
    public void logFunnel(int i, java.lang.String str) {
        A00().AKr(i, str);
    }

    @android.webkit.JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C0850Lh(this.A05));
            }
            com.facebook.ads.redexgen.core.InterfaceC1285b1 interfaceC1285b1 = this.A04.get();
            if (interfaceC1285b1 != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.RunnableC1283az(this, interfaceC1285b1));
            }
        }
    }

    @android.webkit.JavascriptInterface
    public void onPageInitialized() {
        com.facebook.ads.redexgen.core.LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        com.facebook.ads.redexgen.core.InterfaceC1285b1 interfaceC1285b1 = this.A04.get();
        if (interfaceC1285b1 == null) {
            A00().AKv(true);
            return;
        }
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A00 = A00();
        java.lang.String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKv(false);
        interfaceC1285b1.AF8();
    }
}
