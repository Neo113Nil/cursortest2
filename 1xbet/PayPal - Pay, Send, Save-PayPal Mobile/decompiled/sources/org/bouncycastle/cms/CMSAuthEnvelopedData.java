package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthEnvelopedData implements org.bouncycastle.util.Encodable {
    org.bouncycastle.cms.RecipientInformationStore Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoSizes;
    private org.bouncycastle.cms.OriginatorInformation getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Set getInputFormats;

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.getHighSpeedVideoSizes;
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
        return this.getHighSpeedVideoSizesFor;
    }

    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public org.bouncycastle.asn1.cms.AttributeTable getAuthAttrs() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set == null) {
            return null;
        }
        return new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
    }

    public CMSAuthEnvelopedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSAuthEnvelopedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoSizes = contentInfo;
        org.bouncycastle.asn1.cms.AuthEnvelopedData authEnvelopedData = org.bouncycastle.asn1.cms.AuthEnvelopedData.getInstance(contentInfo.getContent());
        if (authEnvelopedData.getOriginatorInfo() != null) {
            this.getHighSpeedVideoSizesFor = new org.bouncycastle.cms.OriginatorInformation(authEnvelopedData.getOriginatorInfo());
        }
        org.bouncycastle.asn1.ASN1Set recipientInfos = authEnvelopedData.getRecipientInfos();
        final org.bouncycastle.asn1.cms.EncryptedContentInfo authEncryptedContentInfo = authEnvelopedData.getAuthEncryptedContentInfo();
        this.getHighSpeedVideoFpsRanges = authEncryptedContentInfo.getContentEncryptionAlgorithm();
        this.getHighResolutionOutputSizeshNQ4ISI = authEnvelopedData.getMac().getOctets();
        org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable = new org.bouncycastle.cms.CMSSecureReadable() { // from class: org.bouncycastle.cms.CMSAuthEnvelopedData.1
            @Override // org.bouncycastle.cms.CMSSecureReadable
            public final java.io.InputStream getHighSpeedVideoFpsRanges() throws java.io.IOException, org.bouncycastle.cms.CMSException {
                return new java.io.ByteArrayInputStream(org.bouncycastle.util.Arrays.concatenate(authEncryptedContentInfo.getEncryptedContent().getOctets(), org.bouncycastle.cms.CMSAuthEnvelopedData.this.getHighResolutionOutputSizeshNQ4ISI));
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap() {
                return authEncryptedContentInfo.getContentType();
            }
        };
        this.getHighSpeedVideoFpsRangesFor = authEnvelopedData.getAuthAttrs();
        this.getInputFormats = authEnvelopedData.getUnauthAttrs();
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor != null ? org.bouncycastle.cms.CMSEnvelopedHelper.getHighSpeedVideoFpsRangesFor(recipientInfos, this.getHighSpeedVideoFpsRanges, cMSSecureReadable, new org.bouncycastle.cms.AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthEnvelopedData.2
            @Override // org.bouncycastle.cms.AuthAttributesProvider
            public final boolean getHighSpeedVideoFpsRangesFor() {
                return true;
            }

            @Override // org.bouncycastle.cms.AuthAttributesProvider
            public final org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI() {
                return org.bouncycastle.cms.CMSAuthEnvelopedData.this.getHighSpeedVideoFpsRangesFor;
            }
        }) : org.bouncycastle.cms.CMSEnvelopedHelper.getHighResolutionOutputSizeshNQ4ISI(recipientInfos, this.getHighSpeedVideoFpsRanges, cMSSecureReadable);
    }

    public CMSAuthEnvelopedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
