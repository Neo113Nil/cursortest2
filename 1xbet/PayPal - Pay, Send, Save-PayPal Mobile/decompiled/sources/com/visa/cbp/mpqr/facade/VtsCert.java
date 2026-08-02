package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class VtsCert {
    private java.lang.String certUsage;
    private java.lang.String vCertificateID;

    public void init(java.lang.String str, java.lang.String str2) {
        this.vCertificateID = str;
        this.certUsage = str2;
    }

    public java.lang.String getVCertificateID() {
        return this.vCertificateID;
    }

    public void setVCertificateID(java.lang.String str) {
        this.vCertificateID = str;
    }

    public java.lang.String getCertUsage() {
        return this.certUsage;
    }

    public void setCertUsage(java.lang.String str) {
        this.certUsage = str;
    }
}
