package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class DHKEKGenerator implements org.bouncycastle.crypto.DerivationFunction {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        org.bouncycastle.crypto.agreement.kdf.DHKDFParameters dHKDFParameters = (org.bouncycastle.crypto.agreement.kdf.DHKDFParameters) derivationParameters;
        this.getHighSpeedVideoFpsRangesFor = dHKDFParameters.getAlgorithm();
        this.Camera2StreamConfigurationMap = dHKDFParameters.getKeySize();
        this.getHighSpeedVideoFpsRanges = dHKDFParameters.getZ();
        this.getHighResolutionOutputSizeshNQ4ISI = dHKDFParameters.getExtraInfo();
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        boolean z;
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 < i4) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
        }
        long j = i3;
        int digestSize = this.getHighSpeedVideoSizes.getDigestSize();
        if (j > 8589934591L) {
            throw new java.lang.IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i5 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        while (i7 < i5) {
            org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoSizes;
            byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
            digest.update(bArr3, i6, bArr3.length);
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector2.add(this.getHighSpeedVideoFpsRangesFor);
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Pack.intToBigEndian(i8)));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                z = true;
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, i6, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI)));
            } else {
                z = true;
            }
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(z, 2, new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap))));
            try {
                byte[] encoded = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                this.getHighSpeedVideoSizes.update(encoded, 0, encoded.length);
                this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
                if (i3 > digestSize) {
                    java.lang.System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                    i4 += digestSize;
                    i3 -= digestSize;
                } else {
                    java.lang.System.arraycopy(bArr2, 0, bArr, i4, i3);
                }
                i8++;
                i7++;
                i6 = 0;
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode parameter info: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        this.getHighSpeedVideoSizes.reset();
        return (int) j;
    }

    public DHKEKGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = digest;
    }
}
