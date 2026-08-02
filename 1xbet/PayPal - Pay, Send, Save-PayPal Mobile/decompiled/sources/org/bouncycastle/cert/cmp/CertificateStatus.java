package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class CertificateStatus {
    private org.bouncycastle.asn1.cmp.CertStatus Camera2StreamConfigurationMap;
    private org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRangesFor;

    public boolean isVerified(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cert.cmp.CMPException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = this.getHighSpeedVideoFpsRangesFor.find(x509CertificateHolder.toASN1Structure().getSignatureAlgorithm());
        if (find == null) {
            throw new org.bouncycastle.cert.cmp.CMPException("cannot find algorithm for digest from signature");
        }
        try {
            org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(find);
            org.bouncycastle.cert.cmp.CMPUtil.getHighSpeedVideoSizes(x509CertificateHolder.toASN1Structure(), digestCalculator.getOutputStream());
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap.getCertHash().getOctets(), digestCalculator.getDigest());
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digester: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getStatusInfo() {
        return this.Camera2StreamConfigurationMap.getStatusInfo();
    }

    public java.math.BigInteger getCertRequestID() {
        return this.Camera2StreamConfigurationMap.getCertReqId().getValue();
    }

    CertificateStatus(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder, org.bouncycastle.asn1.cmp.CertStatus certStatus) {
        this.getHighSpeedVideoFpsRangesFor = digestAlgorithmIdentifierFinder;
        this.Camera2StreamConfigurationMap = certStatus;
    }
}
