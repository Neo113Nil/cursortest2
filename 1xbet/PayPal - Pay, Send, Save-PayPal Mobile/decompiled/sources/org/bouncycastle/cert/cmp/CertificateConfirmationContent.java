package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class CertificateConfirmationContent {
    private org.bouncycastle.asn1.cmp.CertConfirmContent getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.CertConfirmContent toASN1Structure() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.cert.cmp.CertificateStatus[] getStatusMessages() {
        org.bouncycastle.asn1.cmp.CertStatus[] certStatusArray = this.getHighSpeedVideoFpsRangesFor.toCertStatusArray();
        int length = certStatusArray.length;
        org.bouncycastle.cert.cmp.CertificateStatus[] certificateStatusArr = new org.bouncycastle.cert.cmp.CertificateStatus[length];
        for (int i = 0; i != length; i++) {
            certificateStatusArr[i] = new org.bouncycastle.cert.cmp.CertificateStatus(this.getHighSpeedVideoSizes, certStatusArray[i]);
        }
        return certificateStatusArr;
    }

    public CertificateConfirmationContent(org.bouncycastle.asn1.cmp.CertConfirmContent certConfirmContent, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.getHighSpeedVideoSizes = digestAlgorithmIdentifierFinder;
        this.getHighSpeedVideoFpsRangesFor = certConfirmContent;
    }

    public CertificateConfirmationContent(org.bouncycastle.asn1.cmp.CertConfirmContent certConfirmContent) {
        this(certConfirmContent, new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder());
    }
}
