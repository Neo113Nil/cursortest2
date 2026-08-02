package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
public class CertPath {
    private final org.bouncycastle.cert.X509CertificateHolder[] getHighResolutionOutputSizeshNQ4ISI;

    public CertPath(org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr) {
        int length = x509CertificateHolderArr.length;
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr2 = new org.bouncycastle.cert.X509CertificateHolder[length];
        java.lang.System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        this.getHighResolutionOutputSizeshNQ4ISI = x509CertificateHolderArr2;
    }

    public org.bouncycastle.cert.path.CertPathValidationResult evaluate(org.bouncycastle.cert.path.CertPathValidation[] certPathValidationArr) {
        org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext = new org.bouncycastle.cert.path.CertPathValidationContext(org.bouncycastle.cert.path.CertPathUtils.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI));
        org.bouncycastle.cert.path.CertPathValidationResultBuilder certPathValidationResultBuilder = new org.bouncycastle.cert.path.CertPathValidationResultBuilder(certPathValidationContext);
        for (int i = 0; i != certPathValidationArr.length; i++) {
            int length = this.getHighResolutionOutputSizeshNQ4ISI.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i].validate(certPathValidationContext, this.getHighResolutionOutputSizeshNQ4ISI[length]);
                } catch (org.bouncycastle.cert.path.CertPathValidationException e) {
                    certPathValidationResultBuilder.Camera2StreamConfigurationMap.add(org.bouncycastle.util.Integers.valueOf(length));
                    certPathValidationResultBuilder.getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.util.Integers.valueOf(i));
                    certPathValidationResultBuilder.getHighSpeedVideoFpsRanges.add(e);
                }
                length--;
            }
        }
        if (certPathValidationResultBuilder.getHighSpeedVideoFpsRanges.isEmpty()) {
            return new org.bouncycastle.cert.path.CertPathValidationResult(certPathValidationResultBuilder.getHighSpeedVideoSizes);
        }
        org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext2 = certPathValidationResultBuilder.getHighSpeedVideoSizes;
        int[] highSpeedVideoSizes = org.bouncycastle.cert.path.CertPathValidationResultBuilder.getHighSpeedVideoSizes(certPathValidationResultBuilder.Camera2StreamConfigurationMap);
        int[] highSpeedVideoSizes2 = org.bouncycastle.cert.path.CertPathValidationResultBuilder.getHighSpeedVideoSizes(certPathValidationResultBuilder.getHighSpeedVideoFpsRangesFor);
        java.util.List<org.bouncycastle.cert.path.CertPathValidationException> list = certPathValidationResultBuilder.getHighSpeedVideoFpsRanges;
        return new org.bouncycastle.cert.path.CertPathValidationResult(certPathValidationContext2, highSpeedVideoSizes, highSpeedVideoSizes2, (org.bouncycastle.cert.path.CertPathValidationException[]) list.toArray(new org.bouncycastle.cert.path.CertPathValidationException[list.size()]));
    }

    public org.bouncycastle.cert.X509CertificateHolder[] getCertificates() {
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = x509CertificateHolderArr.length;
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr2 = new org.bouncycastle.cert.X509CertificateHolder[length];
        java.lang.System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public org.bouncycastle.cert.path.CertPathValidationResult validate(org.bouncycastle.cert.path.CertPathValidation[] certPathValidationArr) {
        org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext = new org.bouncycastle.cert.path.CertPathValidationContext(org.bouncycastle.cert.path.CertPathUtils.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI));
        for (int i = 0; i != certPathValidationArr.length; i++) {
            int length = this.getHighResolutionOutputSizeshNQ4ISI.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i].validate(certPathValidationContext, this.getHighResolutionOutputSizeshNQ4ISI[length]);
                    length--;
                } catch (org.bouncycastle.cert.path.CertPathValidationException e) {
                    return new org.bouncycastle.cert.path.CertPathValidationResult(certPathValidationContext, length, i, e);
                }
            }
        }
        return new org.bouncycastle.cert.path.CertPathValidationResult(certPathValidationContext);
    }

    public int length() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length;
    }
}
