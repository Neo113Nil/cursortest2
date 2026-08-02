package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class MultiCertStoreParameters implements java.security.cert.CertStoreParameters {
    private java.util.Collection getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;

    @Override // java.security.cert.CertStoreParameters
    public java.lang.Object clone() {
        return this;
    }

    public boolean getSearchAllStores() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.Collection getCertStores() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public MultiCertStoreParameters(java.util.Collection collection, boolean z) {
        this.getHighSpeedVideoFpsRanges = collection;
        this.getHighSpeedVideoSizes = z;
    }

    public MultiCertStoreParameters(java.util.Collection collection) {
        this(collection, true);
    }
}
