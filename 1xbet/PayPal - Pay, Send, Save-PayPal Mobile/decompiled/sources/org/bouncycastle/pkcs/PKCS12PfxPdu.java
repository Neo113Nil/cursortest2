package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS12PfxPdu {
    private org.bouncycastle.asn1.pkcs.Pfx getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.pkcs.Pfx toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isMacValid(org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider pKCS12MacCalculatorBuilderProvider, char[] cArr) throws org.bouncycastle.pkcs.PKCSException {
        if (!hasMac()) {
            throw new java.lang.IllegalStateException("no MAC present on PFX");
        }
        org.bouncycastle.asn1.pkcs.MacData macData = this.getHighResolutionOutputSizeshNQ4ISI.getMacData();
        try {
            return org.bouncycastle.util.Arrays.constantTimeAreEqual(new org.bouncycastle.pkcs.MacDataGenerator(pKCS12MacCalculatorBuilderProvider.get(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(macData.getSalt(), macData.getIterationCount().intValue())))).getHighSpeedVideoSizes(cArr, org.bouncycastle.asn1.ASN1OctetString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getAuthSafe().getContent()).getOctets()).getEncoded(), this.getHighResolutionOutputSizeshNQ4ISI.getMacData().getEncoded());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process AuthSafe: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString());
        }
    }

    public boolean hasMac() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMacData() != null;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithmID() {
        org.bouncycastle.asn1.pkcs.MacData macData = this.getHighResolutionOutputSizeshNQ4ISI.getMacData();
        if (macData != null) {
            return macData.getMac().getAlgorithmId();
        }
        return null;
    }

    public byte[] getEncoded(java.lang.String str) throws java.io.IOException {
        return toASN1Structure().getEncoded(str);
    }

    public byte[] getEncoded() throws java.io.IOException {
        return toASN1Structure().getEncoded();
    }

    public org.bouncycastle.asn1.pkcs.ContentInfo[] getContentInfos() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getAuthSafe().getContent()).getOctets());
        org.bouncycastle.asn1.pkcs.ContentInfo[] contentInfoArr = new org.bouncycastle.asn1.pkcs.ContentInfo[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            contentInfoArr[i] = org.bouncycastle.asn1.pkcs.ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return contentInfoArr;
    }

    private static org.bouncycastle.asn1.pkcs.Pfx getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.pkcs.Pfx.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb2.toString(), e2);
        }
    }

    public PKCS12PfxPdu(byte[] bArr) throws java.io.IOException {
        this(getHighResolutionOutputSizeshNQ4ISI(bArr));
    }

    public PKCS12PfxPdu(org.bouncycastle.asn1.pkcs.Pfx pfx) {
        this.getHighResolutionOutputSizeshNQ4ISI = pfx;
    }
}
