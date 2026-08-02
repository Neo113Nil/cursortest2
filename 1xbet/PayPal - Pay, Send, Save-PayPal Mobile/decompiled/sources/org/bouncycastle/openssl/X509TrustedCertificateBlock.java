package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class X509TrustedCertificateBlock {
    private final org.bouncycastle.cert.X509CertificateHolder Camera2StreamConfigurationMap;
    private final org.bouncycastle.openssl.CertificateTrustBlock getHighSpeedVideoSizes;

    public byte[] getEncoded() throws java.io.IOException {
        byte[] encoded = this.Camera2StreamConfigurationMap.getEncoded();
        org.bouncycastle.openssl.CertificateTrustBlock certificateTrustBlock = this.getHighSpeedVideoSizes;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = certificateTrustBlock.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        if (certificateTrustBlock.getHighSpeedVideoSizes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) certificateTrustBlock.getHighSpeedVideoSizes));
        }
        if (certificateTrustBlock.getHighSpeedVideoFpsRangesFor != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(certificateTrustBlock.getHighSpeedVideoFpsRangesFor));
        }
        return org.bouncycastle.util.Arrays.concatenate(encoded, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded());
    }

    public org.bouncycastle.openssl.CertificateTrustBlock getTrustBlock() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.cert.X509CertificateHolder getCertificateHolder() {
        return this.Camera2StreamConfigurationMap;
    }

    public X509TrustedCertificateBlock(byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(bArr);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.X509CertificateHolder(aSN1InputStream.readObject().getEncoded());
        org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
        if (readObject != null) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.openssl.CertificateTrustBlock(readObject.getEncoded());
        } else {
            this.getHighSpeedVideoSizes = null;
        }
    }

    public X509TrustedCertificateBlock(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, org.bouncycastle.openssl.CertificateTrustBlock certificateTrustBlock) {
        this.Camera2StreamConfigurationMap = x509CertificateHolder;
        this.getHighSpeedVideoSizes = certificateTrustBlock;
    }
}
