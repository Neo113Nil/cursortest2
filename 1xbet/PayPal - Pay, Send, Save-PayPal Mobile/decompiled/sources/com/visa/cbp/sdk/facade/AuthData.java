package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class AuthData {
    private java.lang.String mac_tag;
    private java.lang.String nonce;
    private java.lang.String server_nonce;

    public java.lang.String getNonce() {
        return this.nonce;
    }

    public void setNonce(java.lang.String str) {
        this.nonce = str;
    }

    public java.lang.String getServerNonce() {
        return this.server_nonce;
    }

    public void setServerNonce(java.lang.String str) {
        this.server_nonce = str;
    }

    public java.lang.String getMacTag() {
        return this.mac_tag;
    }

    public void setMacTag(java.lang.String str) {
        this.mac_tag = str;
    }
}
