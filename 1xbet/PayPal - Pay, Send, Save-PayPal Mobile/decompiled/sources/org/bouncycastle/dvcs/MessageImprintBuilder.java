package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class MessageImprintBuilder {
    private final org.bouncycastle.operator.DigestCalculator Camera2StreamConfigurationMap;

    public org.bouncycastle.dvcs.MessageImprint build(byte[] bArr) throws org.bouncycastle.dvcs.DVCSException {
        try {
            java.io.OutputStream outputStream = this.Camera2StreamConfigurationMap.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return new org.bouncycastle.dvcs.MessageImprint(new org.bouncycastle.asn1.x509.DigestInfo(this.Camera2StreamConfigurationMap.getAlgorithmIdentifier(), this.Camera2StreamConfigurationMap.getDigest()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to build MessageImprint: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.dvcs.DVCSException(sb.toString(), e);
        }
    }

    public MessageImprintBuilder(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.Camera2StreamConfigurationMap = digestCalculator;
    }
}
