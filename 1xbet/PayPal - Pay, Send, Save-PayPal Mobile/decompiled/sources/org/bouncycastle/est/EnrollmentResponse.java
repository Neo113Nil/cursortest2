package org.bouncycastle.est;

/* loaded from: classes17.dex */
public class EnrollmentResponse {
    private final org.bouncycastle.est.Source Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.est.ESTRequest getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getHighSpeedVideoSizes;

    public boolean isCompleted() {
        return this.getHighSpeedVideoFpsRangesFor == null;
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getStore() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.est.Source getSource() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.Object getSession() {
        return this.Camera2StreamConfigurationMap.getSession();
    }

    public org.bouncycastle.est.ESTRequest getRequestToRetry() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public long getNotBefore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean canRetry() {
        return this.getHighResolutionOutputSizeshNQ4ISI < java.lang.System.currentTimeMillis();
    }

    public EnrollmentResponse(org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> store, long j, org.bouncycastle.est.ESTRequest eSTRequest, org.bouncycastle.est.Source source) {
        this.getHighSpeedVideoSizes = store;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = eSTRequest;
        this.Camera2StreamConfigurationMap = source;
    }
}
