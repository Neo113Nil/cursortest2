package com.ironsource;

/* renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3077h8 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C3130k8 f6285a;

    C3077h8(com.ironsource.C3130k8 c3130k8) {
        this.f6285a = c3130k8;
    }

    @android.webkit.JavascriptInterface
    public void receiveMessageFromExternal(java.lang.String str) {
        this.f6285a.handleMessageFromAd(str);
    }
}
