package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class RecipientInformation {
    private org.bouncycastle.cms.AuthAttributesProvider Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cms.RecipientOperator getHighSpeedVideoFpsRangesFor;
    protected org.bouncycastle.asn1.x509.AlgorithmIdentifier keyEncAlg;
    protected org.bouncycastle.asn1.x509.AlgorithmIdentifier messageAlgorithm;
    protected org.bouncycastle.cms.RecipientId rid;
    protected org.bouncycastle.cms.CMSSecureReadable secureReadable;

    protected abstract org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException, java.io.IOException;

    public byte[] getContentDigest() {
        org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable = this.secureReadable;
        if (cMSSecureReadable instanceof org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) {
            return ((org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) cMSSecureReadable).Camera2StreamConfigurationMap.getDigest();
        }
        return null;
    }

    public byte[] getKeyEncryptionAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.keyEncAlg.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public org.bouncycastle.cms.RecipientId getRID() {
        return this.rid;
    }

    public byte[] getMac() {
        if (this.getHighSpeedVideoFpsRanges == null && this.getHighSpeedVideoFpsRangesFor.isMacBased()) {
            if (this.Camera2StreamConfigurationMap != null) {
                try {
                    org.bouncycastle.util.io.Streams.drain(this.getHighSpeedVideoFpsRangesFor.getInputStream(new java.io.ByteArrayInputStream(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER))));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to drain input: ");
                    sb.append(e.getMessage());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            }
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getMac();
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.keyEncAlg;
    }

    public java.lang.String getKeyEncryptionAlgOID() {
        return this.keyEncAlg.getAlgorithm().getId();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.secureReadable.Camera2StreamConfigurationMap();
    }

    public org.bouncycastle.cms.CMSTypedStream getContentStream(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = getRecipientOperator(recipient);
        org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider = this.Camera2StreamConfigurationMap;
        if (authAttributesProvider == null) {
            return new org.bouncycastle.cms.CMSTypedStream(this.secureReadable.Camera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getInputStream(this.secureReadable.getHighSpeedVideoFpsRanges()));
        }
        if (!authAttributesProvider.getHighSpeedVideoFpsRangesFor()) {
            return new org.bouncycastle.cms.CMSTypedStream(this.secureReadable.Camera2StreamConfigurationMap(), this.secureReadable.getHighSpeedVideoFpsRanges());
        }
        this.getHighSpeedVideoFpsRangesFor.getAADStream().write(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        return new org.bouncycastle.cms.CMSTypedStream(this.secureReadable.Camera2StreamConfigurationMap(), this.getHighSpeedVideoFpsRangesFor.getInputStream(this.secureReadable.getHighSpeedVideoFpsRanges()));
    }

    public byte[] getContent(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(getContentStream(recipient).getContentStream());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse internal stream: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    RecipientInformation(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        this.keyEncAlg = algorithmIdentifier;
        this.messageAlgorithm = algorithmIdentifier2;
        this.secureReadable = cMSSecureReadable;
        this.Camera2StreamConfigurationMap = authAttributesProvider;
    }
}
