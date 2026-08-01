package com.ironsource;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4406f8 {

    /* renamed from: a, reason: collision with root package name */
    private C4460i8 f8193a;

    C4406f8(C4460i8 c4460i8) {
        this.f8193a = c4460i8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f8193a.handleMessageFromAd(str);
    }
}
