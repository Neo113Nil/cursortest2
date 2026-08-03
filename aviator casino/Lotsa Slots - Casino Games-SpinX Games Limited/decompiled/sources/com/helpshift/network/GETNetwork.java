package com.helpshift.network;

/* loaded from: classes2.dex */
public class GETNetwork extends com.helpshift.network.HSBaseNetwork implements com.helpshift.network.HSNetwork {
    public GETNetwork(com.helpshift.network.HTTPTransport hTTPTransport, java.lang.String str) {
        super(hTTPTransport, str);
    }

    @Override // com.helpshift.network.HSBaseNetwork
    com.helpshift.network.HSRequest getRequest(com.helpshift.network.HSRequestData hSRequestData) {
        return new com.helpshift.network.HSRequest(com.helpshift.network.HSRequest.Method.GET, getURL() + "?" + getQuery(hSRequestData.body), hSRequestData.headers, "", 5000);
    }

    private java.lang.String getQuery(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            try {
                arrayList.add(entry.getKey() + com.ironsource.X3.j.b + java.net.URLEncoder.encode(entry.getValue(), "UTF-8"));
            } catch (java.io.UnsupportedEncodingException e) {
                throw com.helpshift.network.exception.HSRootApiException.wrap(e, com.helpshift.network.exception.NetworkException.UNSUPPORTED_ENCODING_EXCEPTION);
            }
        }
        return com.helpshift.util.Utils.join(com.ironsource.X3.j.c, arrayList);
    }
}
