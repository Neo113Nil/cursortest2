package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class ECDHKEKGenerator implements org.bouncycastle.crypto.DigestDerivationFunction {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.DigestDerivationFunction getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        org.bouncycastle.crypto.agreement.kdf.DHKDFParameters dHKDFParameters = (org.bouncycastle.crypto.agreement.kdf.DHKDFParameters) derivationParameters;
        this.Camera2StreamConfigurationMap = dHKDFParameters.getAlgorithm();
        this.getHighSpeedVideoFpsRanges = dHKDFParameters.getKeySize();
        this.getHighSpeedVideoFpsRangesFor = dHKDFParameters.getZ();
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoSizes.getDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("output buffer too small");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.Camera2StreamConfigurationMap, org.bouncycastle.asn1.DERNull.INSTANCE));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges))));
        try {
            this.getHighSpeedVideoSizes.init(new org.bouncycastle.crypto.params.KDFParameters(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
            return this.getHighSpeedVideoSizes.generateBytes(bArr, i, i2);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to initialise kdf: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public ECDHKEKGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.generators.KDF2BytesGenerator(digest);
    }
}
