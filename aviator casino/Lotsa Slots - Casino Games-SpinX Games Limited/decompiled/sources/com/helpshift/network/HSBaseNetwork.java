package com.helpshift.network;

/* loaded from: classes2.dex */
public abstract class HSBaseNetwork implements com.helpshift.network.HSNetwork {
    private final com.helpshift.network.HTTPTransport httpTransport;
    private final java.lang.String url;

    abstract com.helpshift.network.HSRequest getRequest(com.helpshift.network.HSRequestData hSRequestData);

    protected HSBaseNetwork(com.helpshift.network.HTTPTransport hTTPTransport, java.lang.String str) {
        this.httpTransport = hTTPTransport;
        this.url = str;
    }

    java.lang.String getURL() {
        return this.url;
    }

    @Override // com.helpshift.network.HSNetwork
    public com.helpshift.network.HSResponse makeRequest(com.helpshift.network.HSRequestData hSRequestData) {
        return this.httpTransport.makeRequest(getRequest(hSRequestData));
    }
}
