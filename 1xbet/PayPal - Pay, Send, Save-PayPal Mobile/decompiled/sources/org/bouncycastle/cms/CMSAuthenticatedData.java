package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthenticatedData implements org.bouncycastle.util.Encodable {
    org.bouncycastle.cms.RecipientInformationStore Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Set getInputFormats;
    private org.bouncycastle.cms.OriginatorInformation getOutputMinFrameDuration;

    public byte[] getMacAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.getHighSpeedVideoFpsRanges.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnauthAttrs() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getInputFormats;
        if (aSN1Set == null) {
            return null;
        }
        return new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
    }

    public org.bouncycastle.cms.RecipientInformationStore getRecipientInfos() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.cms.OriginatorInformation getOriginatorInfo() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getMacAlgOID() {
        return this.getHighSpeedVideoFpsRanges.getAlgorithm().getId();
    }

    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public org.bouncycastle.asn1.cms.ContentInfo getContentInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getContentDigest() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return org.bouncycastle.asn1.ASN1OctetString.getInstance(getAuthAttrs().get(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getAuthAttrs() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set == null) {
            return null;
        }
        return new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
    }

    public CMSAuthenticatedData(byte[] bArr, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr), digestCalculatorProvider);
    }

    public CMSAuthenticatedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSAuthenticatedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException {
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo;
        org.bouncycastle.asn1.cms.AuthenticatedData authenticatedData = org.bouncycastle.asn1.cms.AuthenticatedData.getInstance(contentInfo.getContent());
        if (authenticatedData.getOriginatorInfo() != null) {
            this.getOutputMinFrameDuration = new org.bouncycastle.cms.OriginatorInformation(authenticatedData.getOriginatorInfo());
        }
        org.bouncycastle.asn1.ASN1Set recipientInfos = authenticatedData.getRecipientInfos();
        this.getHighSpeedVideoFpsRanges = authenticatedData.getMacAlgorithm();
        this.getHighSpeedVideoFpsRangesFor = authenticatedData.getAuthAttrs();
        this.getHighSpeedVideoSizes = authenticatedData.getMac().getOctets();
        this.getInputFormats = authenticatedData.getUnauthAttrs();
        org.bouncycastle.asn1.cms.ContentInfo encapsulatedContentInfo = authenticatedData.getEncapsulatedContentInfo();
        org.bouncycastle.cms.CMSProcessableByteArray cMSProcessableByteArray = new org.bouncycastle.cms.CMSProcessableByteArray(encapsulatedContentInfo.getContentType(), org.bouncycastle.asn1.ASN1OctetString.getInstance(encapsulatedContentInfo.getContent()).getOctets());
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set == null) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.cms.CMSEnvelopedHelper.getHighResolutionOutputSizeshNQ4ISI(recipientInfos, this.getHighSpeedVideoFpsRanges, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSAuthenticatedSecureReadable(this.getHighSpeedVideoFpsRanges, encapsulatedContentInfo.getContentType(), cMSProcessableByteArray));
            return;
        }
        if (digestCalculatorProvider == null) {
            throw new org.bouncycastle.cms.CMSException("a digest calculator provider is required if authenticated attributes are present");
        }
        org.bouncycastle.asn1.ASN1EncodableVector all = new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set).getAll(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect);
        if (all.size() > 1) {
            throw new org.bouncycastle.cms.CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
        }
        if (all.size() > 0) {
            org.bouncycastle.asn1.cms.Attribute attribute = org.bouncycastle.asn1.cms.Attribute.getInstance(all.get(0));
            if (attribute.getAttrValues().size() != 1) {
                throw new org.bouncycastle.cms.CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
            }
            org.bouncycastle.asn1.cms.CMSAlgorithmProtection cMSAlgorithmProtection = org.bouncycastle.asn1.cms.CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
            if (!org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(cMSAlgorithmProtection.getDigestAlgorithm(), authenticatedData.getDigestAlgorithm())) {
                throw new org.bouncycastle.cms.CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
            }
            if (!org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(cMSAlgorithmProtection.getMacAlgorithm(), this.getHighSpeedVideoFpsRanges)) {
                throw new org.bouncycastle.cms.CMSException("CMS Algorithm Identifier Protection check failed for macAlgorithm");
            }
        }
        try {
            this.Camera2StreamConfigurationMap = org.bouncycastle.cms.CMSEnvelopedHelper.getHighSpeedVideoFpsRangesFor(recipientInfos, this.getHighSpeedVideoFpsRanges, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(authenticatedData.getDigestAlgorithm()), encapsulatedContentInfo.getContentType(), cMSProcessableByteArray), new org.bouncycastle.cms.AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthenticatedData.1
                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public final boolean getHighSpeedVideoFpsRangesFor() {
                    return false;
                }

                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public final org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI() {
                    return org.bouncycastle.cms.CMSAuthenticatedData.this.getHighSpeedVideoFpsRangesFor;
                }
            });
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digest calculator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public CMSAuthenticatedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this(contentInfo, (org.bouncycastle.operator.DigestCalculatorProvider) null);
    }

    public CMSAuthenticatedData(java.io.InputStream inputStream, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream), digestCalculatorProvider);
    }

    public CMSAuthenticatedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
