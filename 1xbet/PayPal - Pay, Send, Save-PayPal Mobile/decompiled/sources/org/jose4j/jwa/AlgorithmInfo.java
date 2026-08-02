package org.jose4j.jwa;

/* loaded from: classes18.dex */
public abstract class AlgorithmInfo implements org.jose4j.jwa.Algorithm {
    private java.lang.String Camera2StreamConfigurationMap;
    private org.jose4j.keys.KeyPersuasion getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    protected final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());

    public void setAlgorithmIdentifier(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public void setJavaAlgorithm(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getJavaAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.jose4j.jwa.Algorithm
    public org.jose4j.keys.KeyPersuasion getKeyPersuasion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setKeyPersuasion(org.jose4j.keys.KeyPersuasion keyPersuasion) {
        this.getHighSpeedVideoFpsRanges = keyPersuasion;
    }

    @Override // org.jose4j.jwa.Algorithm
    public java.lang.String getKeyType() {
        return this.getHighSpeedVideoSizes;
    }

    public void setKeyType(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append("(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(")");
        return sb.toString();
    }
}
