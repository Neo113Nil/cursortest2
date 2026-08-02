package com.visa.cbp.external.enp;

/* loaded from: classes16.dex */
public class RepersoTokenRequest {
    private java.lang.String clientAppID;
    private java.lang.String clientDeviceID;
    private java.lang.String clientWalletAccountID;
    private boolean fullReperso;
    private java.lang.String vNotificationID;

    public java.lang.String getClientAppID() {
        return this.clientAppID;
    }

    public void setClientAppID(java.lang.String str) {
        this.clientAppID = str;
    }

    public java.lang.String getClientDeviceID() {
        return this.clientDeviceID;
    }

    public void setClientDeviceID(java.lang.String str) {
        this.clientDeviceID = str;
    }

    public java.lang.String getClientWalletAccountID() {
        return this.clientWalletAccountID;
    }

    public void setClientWalletAccountID(java.lang.String str) {
        this.clientWalletAccountID = str;
    }

    public java.lang.String getvNotificationID() {
        return this.vNotificationID;
    }

    public void setvNotificationID(java.lang.String str) {
        this.vNotificationID = str;
    }

    public boolean getFullReperso() {
        return this.fullReperso;
    }

    public void setFullReperso(boolean z) {
        this.fullReperso = z;
    }
}
