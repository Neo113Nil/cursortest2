package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanView f3294a;

    public c1(com.dyneti.android.dyscan.DyScanView dyScanView) {
        this.f3294a = dyScanView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.dyneti.android.dyscan.DyScanView dyScanView = this.f3294a;
        if (dyScanView.M) {
            dyScanView.f3285o.setVisibility(0);
        }
        this.f3294a.p.setVisibility(0);
    }
}
