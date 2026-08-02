package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
public class CertPathValidationResult {
    private org.bouncycastle.cert.path.CertPathValidationException[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.cert.path.CertPathValidationException getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final int getInputFormats;
    private int[] getInputSizeshNQ4ISI;
    private final java.util.Set getOutputFormats;

    public boolean isValid() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isDetailed() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public java.util.Set getUnhandledCriticalExtensionOIDs() {
        return this.getOutputFormats;
    }

    public int[] getFailingRuleIndexes() {
        return org.bouncycastle.util.Arrays.clone(this.getInputSizeshNQ4ISI);
    }

    public int getFailingRuleIndex() {
        return this.getInputFormats;
    }

    public int[] getFailingCertIndexes() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getFailingCertIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.cert.path.CertPathValidationException[] getCauses() {
        org.bouncycastle.cert.path.CertPathValidationException[] certPathValidationExceptionArr = this.Camera2StreamConfigurationMap;
        if (certPathValidationExceptionArr != null) {
            org.bouncycastle.cert.path.CertPathValidationException[] certPathValidationExceptionArr2 = new org.bouncycastle.cert.path.CertPathValidationException[certPathValidationExceptionArr.length];
            java.lang.System.arraycopy(certPathValidationExceptionArr, 0, certPathValidationExceptionArr2, 0, certPathValidationExceptionArr.length);
            return certPathValidationExceptionArr2;
        }
        if (this.getOutputFormats.isEmpty()) {
            return null;
        }
        return new org.bouncycastle.cert.path.CertPathValidationException[]{new org.bouncycastle.cert.path.CertPathValidationException("Unhandled Critical Extensions")};
    }

    public org.bouncycastle.cert.path.CertPathValidationException getCause() {
        org.bouncycastle.cert.path.CertPathValidationException certPathValidationException = this.getHighResolutionOutputSizeshNQ4ISI;
        if (certPathValidationException != null) {
            return certPathValidationException;
        }
        if (this.getOutputFormats.isEmpty()) {
            return null;
        }
        return new org.bouncycastle.cert.path.CertPathValidationException("Unhandled Critical Extensions");
    }

    public CertPathValidationResult(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, int[] iArr, int[] iArr2, org.bouncycastle.cert.path.CertPathValidationException[] certPathValidationExceptionArr) {
        this.getOutputFormats = java.util.Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.getHighSpeedVideoSizes = false;
        this.getHighResolutionOutputSizeshNQ4ISI = certPathValidationExceptionArr[0];
        this.getHighSpeedVideoFpsRangesFor = iArr[0];
        this.getInputFormats = iArr2[0];
        this.Camera2StreamConfigurationMap = certPathValidationExceptionArr;
        this.getHighSpeedVideoFpsRanges = iArr;
        this.getInputSizeshNQ4ISI = iArr2;
    }

    public CertPathValidationResult(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext, int i, int i2, org.bouncycastle.cert.path.CertPathValidationException certPathValidationException) {
        this.getOutputFormats = java.util.Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputFormats = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = certPathValidationException;
    }

    public CertPathValidationResult(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext) {
        java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.getOutputFormats = unmodifiableSet;
        this.getHighSpeedVideoSizes = unmodifiableSet.isEmpty();
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getInputFormats = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
