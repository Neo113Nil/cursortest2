package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerInfoGenerator {
    private final org.bouncycastle.cms.CMSAttributeTableGenerator Camera2StreamConfigurationMap;
    org.bouncycastle.cert.X509CertificateHolder getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.operator.DigestCalculator getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private final org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder getHighSpeedVideoSizesFor;
    private final org.bouncycastle.operator.ContentSigner getInputFormats;
    private final org.bouncycastle.cms.CMSAttributeTableGenerator getInputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cms.SignerIdentifier getOutputFormats;

    public org.bouncycastle.asn1.cms.SignerInfo generate(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        org.bouncycastle.asn1.DERSet dERSet;
        try {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier findEncryptionAlgorithm = this.getHighSpeedVideoSizesFor.findEncryptionAlgorithm(this.getInputFormats.getAlgorithmIdentifier());
            org.bouncycastle.asn1.DERSet dERSet2 = null;
            if (this.Camera2StreamConfigurationMap != null) {
                algorithmIdentifier = this.getHighSpeedVideoFpsRanges.getAlgorithmIdentifier();
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getDigest();
                org.bouncycastle.asn1.cms.AttributeTable attributes = this.Camera2StreamConfigurationMap.getAttributes(java.util.Collections.unmodifiableMap(getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, this.getHighSpeedVideoFpsRanges.getAlgorithmIdentifier(), findEncryptionAlgorithm, this.getHighSpeedVideoFpsRangesFor)));
                org.bouncycastle.asn1.DERSet dERSet3 = attributes != null ? new org.bouncycastle.asn1.DERSet(attributes.toASN1EncodableVector()) : null;
                java.io.OutputStream outputStream = this.getInputFormats.getOutputStream();
                outputStream.write(dERSet3.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                outputStream.close();
                dERSet = dERSet3;
            } else {
                algorithmIdentifier = this.getHighSpeedVideoSizes;
                org.bouncycastle.operator.DigestCalculator digestCalculator = this.getHighSpeedVideoFpsRanges;
                if (digestCalculator != null) {
                    this.getHighSpeedVideoFpsRangesFor = digestCalculator.getDigest();
                } else {
                    this.getHighSpeedVideoFpsRangesFor = null;
                }
                dERSet = null;
            }
            byte[] signature = this.getInputFormats.getSignature();
            if (this.getInputSizeshNQ4ISI != null) {
                java.util.Map highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, algorithmIdentifier, findEncryptionAlgorithm, this.getHighSpeedVideoFpsRangesFor);
                highSpeedVideoFpsRangesFor.put(org.bouncycastle.cms.CMSAttributeTableGenerator.SIGNATURE, org.bouncycastle.util.Arrays.clone(signature));
                org.bouncycastle.asn1.cms.AttributeTable attributes2 = this.getInputSizeshNQ4ISI.getAttributes(java.util.Collections.unmodifiableMap(highSpeedVideoFpsRangesFor));
                if (attributes2 != null) {
                    dERSet2 = new org.bouncycastle.asn1.DERSet(attributes2.toASN1EncodableVector());
                }
            }
            return new org.bouncycastle.asn1.cms.SignerInfo(this.getOutputFormats, (this.Camera2StreamConfigurationMap == null && org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.equals((org.bouncycastle.asn1.ASN1Primitive) findEncryptionAlgorithm.getAlgorithm())) ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256) : algorithmIdentifier, dERSet, findEncryptionAlgorithm, new org.bouncycastle.asn1.DEROctetString(signature), dERSet2);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("encoding error.", e);
        }
    }

    public boolean hasAssociatedCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public org.bouncycastle.cms.CMSAttributeTableGenerator getUnsignedAttributeTableGenerator() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.cms.CMSAttributeTableGenerator getSignedAttributeTableGenerator() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cms.SignerIdentifier getSID() {
        return this.getOutputFormats;
    }

    public int getGeneratedVersion() {
        return this.getOutputFormats.isTagged() ? 3 : 1;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public java.io.OutputStream getCalculatingOutputStream() {
        org.bouncycastle.operator.DigestCalculator digestCalculator = this.getHighSpeedVideoFpsRanges;
        return digestCalculator != null ? this.Camera2StreamConfigurationMap == null ? new org.bouncycastle.util.io.TeeOutputStream(this.getHighSpeedVideoFpsRanges.getOutputStream(), this.getInputFormats.getOutputStream()) : digestCalculator.getOutputStream() : this.getInputFormats.getOutputStream();
    }

    public byte[] getCalculatedDigest() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            return org.bouncycastle.util.Arrays.clone(bArr);
        }
        return null;
    }

    public org.bouncycastle.cert.X509CertificateHolder getAssociatedCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private static java.util.Map getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (aSN1ObjectIdentifier != null) {
            hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, aSN1ObjectIdentifier);
        }
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, algorithmIdentifier);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.SIGNATURE_ALGORITHM_IDENTIFIER, algorithmIdentifier2);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, org.bouncycastle.util.Arrays.clone(bArr));
        return hashMap;
    }

    public SignerInfoGenerator(org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator, org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator, org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputFormats = signerInfoGenerator.getOutputFormats;
        this.getInputFormats = signerInfoGenerator.getInputFormats;
        this.getHighSpeedVideoSizes = signerInfoGenerator.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = signerInfoGenerator.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = signerInfoGenerator.getHighSpeedVideoSizesFor;
        this.Camera2StreamConfigurationMap = cMSAttributeTableGenerator;
        this.getInputSizeshNQ4ISI = cMSAttributeTableGenerator2;
    }

    SignerInfoGenerator(org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier, org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder, org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator, org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputFormats = signerIdentifier;
        this.getInputFormats = contentSigner;
        this.getHighSpeedVideoSizes = digestCalculator.getAlgorithmIdentifier();
        this.getHighSpeedVideoFpsRanges = digestCalculator;
        this.Camera2StreamConfigurationMap = cMSAttributeTableGenerator;
        this.getInputSizeshNQ4ISI = cMSAttributeTableGenerator2;
        this.getHighSpeedVideoSizesFor = cMSSignatureEncryptionAlgorithmFinder;
    }

    SignerInfoGenerator(org.bouncycastle.asn1.cms.SignerIdentifier signerIdentifier, org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputFormats = signerIdentifier;
        this.getInputFormats = contentSigner;
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = null;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = cMSSignatureEncryptionAlgorithmFinder;
    }
}
