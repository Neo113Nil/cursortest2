package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
class PKMACValueVerifier {
    private final org.bouncycastle.cert.crmf.PKMACBuilder getHighSpeedVideoSizes;

    public final boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.crmf.PKMACValue pKMACValue, char[] cArr, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.cert.crmf.CRMFException {
        this.getHighSpeedVideoSizes.setParameters(org.bouncycastle.asn1.cmp.PBMParameter.getInstance(pKMACValue.getAlgId().getParameters()));
        org.bouncycastle.operator.MacCalculator build = this.getHighSpeedVideoSizes.build(cArr);
        java.io.OutputStream outputStream = build.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return org.bouncycastle.util.Arrays.constantTimeAreEqual(build.getMac(), pKMACValue.getValue().getBytes());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding mac input: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public PKMACValueVerifier(org.bouncycastle.cert.crmf.PKMACBuilder pKMACBuilder) {
        this.getHighSpeedVideoSizes = pKMACBuilder;
    }
}
