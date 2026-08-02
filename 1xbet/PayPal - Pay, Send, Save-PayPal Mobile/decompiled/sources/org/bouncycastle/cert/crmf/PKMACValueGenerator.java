package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
class PKMACValueGenerator {
    private org.bouncycastle.cert.crmf.PKMACBuilder Camera2StreamConfigurationMap;

    public final org.bouncycastle.asn1.crmf.PKMACValue getHighSpeedVideoFpsRangesFor(char[] cArr, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.operator.MacCalculator build = this.Camera2StreamConfigurationMap.build(cArr);
        java.io.OutputStream outputStream = build.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return new org.bouncycastle.asn1.crmf.PKMACValue(build.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DERBitString(build.getMac()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding mac input: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public PKMACValueGenerator(org.bouncycastle.cert.crmf.PKMACBuilder pKMACBuilder) {
        this.Camera2StreamConfigurationMap = pKMACBuilder;
    }
}
