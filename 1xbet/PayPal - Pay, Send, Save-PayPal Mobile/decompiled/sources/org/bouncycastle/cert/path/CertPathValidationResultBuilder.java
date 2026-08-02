package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
class CertPathValidationResultBuilder {
    final org.bouncycastle.cert.path.CertPathValidationContext getHighSpeedVideoSizes;
    final java.util.List<java.lang.Integer> Camera2StreamConfigurationMap = new java.util.ArrayList();
    final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    final java.util.List<org.bouncycastle.cert.path.CertPathValidationException> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    static int[] getHighSpeedVideoSizes(java.util.List<java.lang.Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i != size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    CertPathValidationResultBuilder(org.bouncycastle.cert.path.CertPathValidationContext certPathValidationContext) {
        this.getHighSpeedVideoSizes = certPathValidationContext;
    }
}
