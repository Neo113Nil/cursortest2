package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class GithubClient extends com.knotapi.knot.webview.KnotViewClient {
    public GithubClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setSecure(true);
        return buildCookie;
    }
}
