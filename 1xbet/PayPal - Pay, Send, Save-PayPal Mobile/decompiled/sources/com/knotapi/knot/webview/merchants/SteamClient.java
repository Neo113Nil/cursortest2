package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class SteamClient extends com.knotapi.knot.webview.KnotViewClient {
    public SteamClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.Cookie buildCookie = super.buildCookie(str, str2);
        java.lang.String str3 = str2.contains("checkout") ? ".checkout.steampowered.com" : str2.contains(com.google.android.libraries.places.api.model.PlaceTypes.STORE) ? ".store.steampowered.com" : ".help.steampowered.com";
        if (buildCookie.getName().equals("steamLoginSecure")) {
            buildCookie.setDomain(str3);
            buildCookie.setSecure(true);
        }
        return buildCookie;
    }
}
