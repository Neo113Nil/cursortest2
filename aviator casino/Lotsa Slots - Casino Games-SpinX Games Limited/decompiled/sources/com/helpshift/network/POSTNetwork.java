package com.helpshift.network;

/* loaded from: classes2.dex */
public class POSTNetwork extends com.helpshift.network.HSBaseNetwork {
    public POSTNetwork(com.helpshift.network.HTTPTransport hTTPTransport, java.lang.String str) {
        super(hTTPTransport, str);
    }

    @Override // com.helpshift.network.HSBaseNetwork
    com.helpshift.network.HSRequest getRequest(com.helpshift.network.HSRequestData hSRequestData) {
        return new com.helpshift.network.HSRequest(com.helpshift.network.HSRequest.Method.POST, getURL(), hSRequestData.headers, com.helpshift.network.NetworkUtils.getBodyForPostMethod(com.helpshift.network.NetworkUtils.cleanDataForNetworkBody(hSRequestData.body)), 5000);
    }
}
