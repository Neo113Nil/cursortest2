package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Zg {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C0929Zg.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<LH> A03;
    public final WeakReference<InterfaceC0930Zh> A04;
    public final WeakReference<C1226eX> A05;
    public final WeakReference<C0549Ki> A06;

    public C0929Zg(C0549Ki c0549Ki, InterfaceC0930Zh interfaceC0930Zh, C1226eX c1226eX, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1153dL c1153dL) {
        this.A06 = new WeakReference<>(c0549Ki);
        this.A04 = new WeakReference<>(interfaceC0930Zh);
        this.A05 = new WeakReference<>(c1226eX);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1153dL.A0F());
    }

    private LH A00() {
        LH funnel = this.A03.get();
        if (funnel == null) {
            return new C1489j3();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC0862Wr.A01(T5.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AK6(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AK7();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AK8();
            if (this.A06.get().isShown()) {
                A00().AK9();
                new Handler(Looper.getMainLooper()).post(new C0555Ko(this.A05));
            }
            InterfaceC0930Zh interfaceC0930Zh = this.A04.get();
            if (interfaceC0930Zh != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0928Zf(this, interfaceC0930Zh));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C0549Ki webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKA(true);
            return;
        }
        InterfaceC0930Zh interfaceC0930Zh = this.A04.get();
        if (interfaceC0930Zh == null) {
            A00().AKA(true);
            return;
        }
        LH A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKA(false);
        interfaceC0930Zh.AET();
    }
}
