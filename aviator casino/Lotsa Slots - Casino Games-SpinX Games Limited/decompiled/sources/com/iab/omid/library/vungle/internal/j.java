package com.iab.omid.library.vungle.internal;

/* loaded from: classes5.dex */
public final class j {
    private static java.util.Map<java.lang.String, java.lang.String> a(android.net.Uri uri) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static void a(java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            com.iab.omid.library.vungle.attestation.e.a(com.iab.omid.library.vungle.internal.g.b().a().getApplicationContext(), map.get("mechanism"), new com.iab.omid.library.vungle.attestation.a(map));
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(android.net.Uri uri) {
        try {
            java.lang.String queryParameter = uri.getQueryParameter("method");
            if (android.text.TextUtils.isEmpty(queryParameter)) {
                com.iab.omid.library.vungle.utils.d.b("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available");
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                a(a(uri));
                return;
            }
            com.iab.omid.library.vungle.utils.d.b("Unknown method in OmidNativeUrlHandler.handle :" + queryParameter);
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + com.ironsource.X3.j.e, e);
        }
    }
}
