package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.s f6667a;
    private boolean b = false;

    r(com.ironsource.sdk.controller.s sVar) {
        this.f6667a = sVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.f6667a.b();
    }
}
