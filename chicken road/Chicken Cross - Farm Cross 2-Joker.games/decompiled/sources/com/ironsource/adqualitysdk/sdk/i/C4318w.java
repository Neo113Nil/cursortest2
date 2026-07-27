package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4318w extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C4319x f292;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f293;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f294;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f295;

    public C4318w(C4319x c4319x, WebView webView, String str, boolean z) {
        this.f292 = c4319x;
        this.f295 = webView;
        this.f294 = str;
        this.f293 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        AbstractC1145.m5895(new C4317v(this, this.f295.getOriginalUrl(), this.f292.f296.mo5312(this.f295)));
    }
}
