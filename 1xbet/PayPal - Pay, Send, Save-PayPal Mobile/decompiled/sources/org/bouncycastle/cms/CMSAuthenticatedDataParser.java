package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthenticatedDataParser extends org.bouncycastle.cms.CMSContentInfoParser {
    private org.bouncycastle.asn1.cms.AttributeTable Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.cms.AuthenticatedDataParser getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.cms.RecipientInformationStore getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private org.bouncycastle.cms.OriginatorInformation getInputFormats;
    private org.bouncycastle.asn1.cms.AttributeTable getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputFormats;
    private boolean getOutputMinFrameDuration;

    public byte[] getMacAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.getOutputFormats.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnauthAttrs() throws java.io.IOException {
        if (this.getInputSizeshNQ4ISI == null && this.getOutputMinFrameDuration) {
            org.bouncycastle.asn1.ASN1SetParser unauthAttrs = this.getHighSpeedVideoFpsRangesFor.getUnauthAttrs();
            this.getOutputMinFrameDuration = false;
            if (unauthAttrs != null) {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                while (true) {
                    org.bouncycastle.asn1.ASN1Encodable readObject = unauthAttrs.readObject();
                    if (readObject == null) {
                        break;
                    }
                    aSN1EncodableVector.add(((org.bouncycastle.asn1.ASN1SequenceParser) readObject).toASN1Primitive());
                }
                this.getInputSizeshNQ4ISI = new org.bouncycastle.asn1.cms.AttributeTable(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector));
            }
        }
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.cms.RecipientInformationStore getRecipientInfos() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.cms.OriginatorInformation getOriginatorInfo() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.getOutputFormats;
    }

    public java.lang.String getMacAlgOID() {
        return this.getOutputFormats.getAlgorithm().toString();
    }

    public byte[] getMac() throws java.io.IOException {
        if (this.getHighSpeedVideoSizesFor == null) {
            getAuthAttrs();
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRangesFor.getMac().getOctets();
        }
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizesFor);
    }

    public byte[] getContentDigest() {
        org.bouncycastle.asn1.cms.AttributeTable attributeTable = this.Camera2StreamConfigurationMap;
        if (attributeTable != null) {
            return org.bouncycastle.asn1.ASN1OctetString.getInstance(attributeTable.get(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getAuthAttrs() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
        if (this.Camera2StreamConfigurationMap == null && this.getHighResolutionOutputSizeshNQ4ISI && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap()) != null) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.AttributeTable(Camera2StreamConfigurationMap);
        }
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap == null && this.getHighResolutionOutputSizeshNQ4ISI) {
            org.bouncycastle.asn1.ASN1SetParser authAttrs = this.getHighSpeedVideoFpsRangesFor.getAuthAttrs();
            if (authAttrs != null) {
                this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Set) authAttrs.toASN1Primitive();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public CMSAuthenticatedDataParser(byte[] bArr, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr), digestCalculatorProvider);
    }

    public CMSAuthenticatedDataParser(byte[] bArr) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public CMSAuthenticatedDataParser(java.io.InputStream inputStream, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        super(inputStream);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        org.bouncycastle.asn1.cms.AuthenticatedDataParser authenticatedDataParser = new org.bouncycastle.asn1.cms.AuthenticatedDataParser((org.bouncycastle.asn1.ASN1SequenceParser) this._contentInfo.getContent(16));
        this.getHighSpeedVideoFpsRangesFor = authenticatedDataParser;
        org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo = authenticatedDataParser.getOriginatorInfo();
        if (originatorInfo != null) {
            this.getInputFormats = new org.bouncycastle.cms.OriginatorInformation(originatorInfo);
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(this.getHighSpeedVideoFpsRangesFor.getRecipientInfos().toASN1Primitive());
        this.getOutputFormats = this.getHighSpeedVideoFpsRangesFor.getMacAlgorithm();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm = this.getHighSpeedVideoFpsRangesFor.getDigestAlgorithm();
        if (digestAlgorithm == null) {
            org.bouncycastle.asn1.cms.ContentInfoParser encapsulatedContentInfo = this.getHighSpeedVideoFpsRangesFor.getEncapsulatedContentInfo();
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.CMSEnvelopedHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1Set, this.getOutputFormats, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSAuthenticatedSecureReadable(this.getOutputFormats, encapsulatedContentInfo.getContentType(), new org.bouncycastle.cms.CMSProcessableInputStream(((org.bouncycastle.asn1.ASN1OctetStringParser) encapsulatedContentInfo.getContent(4)).getOctetStream())));
            return;
        }
        if (digestCalculatorProvider == null) {
            throw new org.bouncycastle.cms.CMSException("a digest calculator provider is required if authenticated attributes are present");
        }
        org.bouncycastle.asn1.cms.ContentInfoParser encapsulatedContentInfo2 = this.getHighSpeedVideoFpsRangesFor.getEncapsulatedContentInfo();
        try {
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.CMSEnvelopedHelper.getHighSpeedVideoFpsRangesFor(aSN1Set, this.getOutputFormats, new org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(digestAlgorithm), encapsulatedContentInfo2.getContentType(), new org.bouncycastle.cms.CMSProcessableInputStream(((org.bouncycastle.asn1.ASN1OctetStringParser) encapsulatedContentInfo2.getContent(4)).getOctetStream())), new org.bouncycastle.cms.AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthenticatedDataParser.1
                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public final boolean getHighSpeedVideoFpsRangesFor() {
                    return false;
                }

                @Override // org.bouncycastle.cms.AuthAttributesProvider
                public final org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI() {
                    try {
                        return org.bouncycastle.cms.CMSAuthenticatedDataParser.this.Camera2StreamConfigurationMap();
                    } catch (java.io.IOException unused) {
                        throw new java.lang.IllegalStateException("can't parse authenticated attributes!");
                    }
                }
            });
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digest calculator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public CMSAuthenticatedDataParser(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        this(inputStream, (org.bouncycastle.operator.DigestCalculatorProvider) null);
    }
}
