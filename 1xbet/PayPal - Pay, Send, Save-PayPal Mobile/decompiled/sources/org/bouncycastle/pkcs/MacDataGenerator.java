package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
class MacDataGenerator {
    private org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder Camera2StreamConfigurationMap;

    public final org.bouncycastle.asn1.pkcs.MacData getHighSpeedVideoSizes(char[] cArr, byte[] bArr) throws org.bouncycastle.pkcs.PKCSException {
        try {
            org.bouncycastle.operator.MacCalculator build = this.Camera2StreamConfigurationMap.build(cArr);
            java.io.OutputStream outputStream = build.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = build.getAlgorithmIdentifier();
            org.bouncycastle.asn1.x509.DigestInfo digestInfo = new org.bouncycastle.asn1.x509.DigestInfo(this.Camera2StreamConfigurationMap.getDigestAlgorithmIdentifier(), build.getMac());
            org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            return new org.bouncycastle.asn1.pkcs.MacData(digestInfo, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    MacDataGenerator(org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder pKCS12MacCalculatorBuilder) {
        this.Camera2StreamConfigurationMap = pKCS12MacCalculatorBuilder;
    }
}
