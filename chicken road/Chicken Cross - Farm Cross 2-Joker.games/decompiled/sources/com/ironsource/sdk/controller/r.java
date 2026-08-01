package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* loaded from: classes6.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private s f8606a;
    private boolean b = false;

    r(s sVar) {
        this.f8606a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.f8606a.b();
    }
}
