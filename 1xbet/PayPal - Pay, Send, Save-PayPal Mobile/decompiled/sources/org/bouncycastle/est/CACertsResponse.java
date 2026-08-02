package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class CACertsResponse {
    private final boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.est.ESTRequest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.est.Source getHighSpeedVideoSizes;

    public boolean isTrusted() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean hasCertificates() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public boolean hasCRLs() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public java.lang.Object getSession() {
        return this.getHighSpeedVideoSizes.getSession();
    }

    public org.bouncycastle.est.ESTRequest getRequestToRetry() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> getCrlStore() {
        org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> store = this.getHighSpeedVideoFpsRangesFor;
        if (store != null) {
            return store;
        }
        throw new java.lang.IllegalStateException("Response has no CRLs.");
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getCertificateStore() {
        org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store = this.getHighResolutionOutputSizeshNQ4ISI;
        if (store != null) {
            return store;
        }
        throw new java.lang.IllegalStateException("Response has no certificates.");
    }

    public CACertsResponse(org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store, org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> store2, org.bouncycastle.est.ESTRequest eSTRequest, org.bouncycastle.est.Source source, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = store;
        this.getHighSpeedVideoFpsRanges = eSTRequest;
        this.getHighSpeedVideoSizes = source;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = store2;
    }
}
