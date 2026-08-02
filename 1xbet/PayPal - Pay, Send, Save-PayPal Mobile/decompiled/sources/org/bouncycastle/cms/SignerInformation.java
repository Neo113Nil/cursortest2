package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerInformation {
    private final org.bouncycastle.cms.CMSProcessable Camera2StreamConfigurationMap;
    protected final org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithm;
    protected final org.bouncycastle.asn1.x509.AlgorithmIdentifier encryptionAlgorithm;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.cms.SignerId getHighSpeedVideoSizes;
    private final byte[] getInputFormats;
    private org.bouncycastle.asn1.cms.AttributeTable getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.AttributeTable getOutputFormats;
    protected final org.bouncycastle.asn1.cms.SignerInfo info;
    protected final org.bouncycastle.asn1.ASN1Set signedAttributeSet;
    protected final org.bouncycastle.asn1.ASN1Set unsignedAttributeSet;

    private boolean getHighSpeedVideoFpsRangesFor(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
        java.lang.String highSpeedVideoSizes = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes(getEncryptionAlgOID());
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = signerInformationVerifier.getContentVerifier(this.encryptionAlgorithm, this.info.getDigestAlgorithm());
            try {
                java.io.OutputStream outputStream = contentVerifier.getOutputStream();
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    org.bouncycastle.operator.DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(getDigestAlgorithmID());
                    if (this.Camera2StreamConfigurationMap != null) {
                        java.io.OutputStream outputStream2 = digestCalculator.getOutputStream();
                        if (this.signedAttributeSet != null) {
                            this.Camera2StreamConfigurationMap.write(outputStream2);
                            outputStream.write(getEncodedSignedAttributes());
                        } else if (contentVerifier instanceof org.bouncycastle.operator.RawContentVerifier) {
                            this.Camera2StreamConfigurationMap.write(outputStream2);
                        } else {
                            org.bouncycastle.util.io.TeeOutputStream teeOutputStream = new org.bouncycastle.util.io.TeeOutputStream(outputStream2, outputStream);
                            this.Camera2StreamConfigurationMap.write(teeOutputStream);
                            teeOutputStream.close();
                        }
                        outputStream2.close();
                    } else {
                        if (this.signedAttributeSet == null) {
                            throw new org.bouncycastle.cms.CMSException("data not encapsulated in signature - use detached constructor.");
                        }
                        outputStream.write(getEncodedSignedAttributes());
                    }
                    this.getHighSpeedVideoFpsRangesFor = digestCalculator.getDigest();
                } else if (this.signedAttributeSet == null) {
                    org.bouncycastle.cms.CMSProcessable cMSProcessable = this.Camera2StreamConfigurationMap;
                    if (cMSProcessable != null) {
                        cMSProcessable.write(outputStream);
                    }
                } else {
                    outputStream.write(getEncodedSignedAttributes());
                }
                outputStream.close();
                org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.CMSAttributes.contentType, "content-type");
                if (Camera2StreamConfigurationMap != null) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        throw new org.bouncycastle.cms.CMSException("[For counter signatures,] the signedAttributes field MUST NOT contain a content-type attribute");
                    }
                    if (!(Camera2StreamConfigurationMap instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier)) {
                        throw new org.bouncycastle.cms.CMSException("content-type attribute value not of ASN.1 type 'OBJECT IDENTIFIER'");
                    }
                    if (!((org.bouncycastle.asn1.ASN1ObjectIdentifier) Camera2StreamConfigurationMap).equals((org.bouncycastle.asn1.ASN1Primitive) this.getHighSpeedVideoFpsRanges)) {
                        throw new org.bouncycastle.cms.CMSException("content-type attribute value does not match eContentType");
                    }
                } else if (!this.getHighResolutionOutputSizeshNQ4ISI && this.signedAttributeSet != null) {
                    throw new org.bouncycastle.cms.CMSException("The content-type attribute type MUST be present whenever signed attributes are present in signed-data");
                }
                org.bouncycastle.asn1.cms.AttributeTable signedAttributes = getSignedAttributes();
                org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes = getUnsignedAttributes();
                if (unsignedAttributes != null && unsignedAttributes.getAll(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect).size() > 0) {
                    throw new org.bouncycastle.cms.CMSException("A cmsAlgorithmProtect attribute MUST be a signed attribute");
                }
                if (signedAttributes != null) {
                    org.bouncycastle.asn1.ASN1EncodableVector all = signedAttributes.getAll(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect);
                    if (all.size() > 1) {
                        throw new org.bouncycastle.cms.CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
                    }
                    if (all.size() > 0) {
                        org.bouncycastle.asn1.cms.Attribute attribute = org.bouncycastle.asn1.cms.Attribute.getInstance(all.get(0));
                        if (attribute.getAttrValues().size() != 1) {
                            throw new org.bouncycastle.cms.CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                        }
                        org.bouncycastle.asn1.cms.CMSAlgorithmProtection cMSAlgorithmProtection = org.bouncycastle.asn1.cms.CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
                        if (!org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(cMSAlgorithmProtection.getDigestAlgorithm(), this.info.getDigestAlgorithm())) {
                            throw new org.bouncycastle.cms.CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                        }
                        if (!org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(cMSAlgorithmProtection.getSignatureAlgorithm(), this.info.getDigestEncryptionAlgorithm())) {
                            throw new org.bouncycastle.cms.CMSException("CMS Algorithm Identifier Protection check failed for signatureAlgorithm");
                        }
                    }
                }
                org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest, "message-digest");
                if (Camera2StreamConfigurationMap2 != null) {
                    if (!(Camera2StreamConfigurationMap2 instanceof org.bouncycastle.asn1.ASN1OctetString)) {
                        throw new org.bouncycastle.cms.CMSException("message-digest attribute value not of ASN.1 type 'OCTET STRING'");
                    }
                    if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.asn1.ASN1OctetString) Camera2StreamConfigurationMap2).getOctets())) {
                        throw new org.bouncycastle.cms.CMSSignerDigestMismatchException("message-digest attribute value does not match calculated value");
                    }
                } else if (this.signedAttributeSet != null) {
                    throw new org.bouncycastle.cms.CMSException("the message-digest signed attribute type MUST be present when there are any signed attributes present");
                }
                if (signedAttributes != null && signedAttributes.getAll(org.bouncycastle.asn1.cms.CMSAttributes.counterSignature).size() > 0) {
                    throw new org.bouncycastle.cms.CMSException("A countersignature attribute MUST NOT be a signed attribute");
                }
                org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes2 = getUnsignedAttributes();
                if (unsignedAttributes2 != null) {
                    org.bouncycastle.asn1.ASN1EncodableVector all2 = unsignedAttributes2.getAll(org.bouncycastle.asn1.cms.CMSAttributes.counterSignature);
                    for (int i = 0; i < all2.size(); i++) {
                        if (org.bouncycastle.asn1.cms.Attribute.getInstance(all2.get(i)).getAttrValues().size() <= 0) {
                            throw new org.bouncycastle.cms.CMSException("A countersignature attribute MUST contain at least one AttributeValue");
                        }
                    }
                }
                try {
                    if (this.signedAttributeSet != null || this.getHighSpeedVideoFpsRangesFor == null || !(contentVerifier instanceof org.bouncycastle.operator.RawContentVerifier)) {
                        return contentVerifier.verify(getSignature());
                    }
                    org.bouncycastle.operator.RawContentVerifier rawContentVerifier = (org.bouncycastle.operator.RawContentVerifier) contentVerifier;
                    return highSpeedVideoSizes.equals("RSA") ? rawContentVerifier.verify(new org.bouncycastle.asn1.x509.DigestInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.digestAlgorithm.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE), this.getHighSpeedVideoFpsRangesFor).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER), getSignature()) : rawContentVerifier.verify(this.getHighSpeedVideoFpsRangesFor, getSignature());
                } catch (java.io.IOException e) {
                    throw new org.bouncycastle.cms.CMSException("can't process mime object to create signature.", e);
                }
            } catch (java.io.IOException e2) {
                throw new org.bouncycastle.cms.CMSException("can't process mime object to create signature.", e2);
            } catch (org.bouncycastle.operator.OperatorCreationException e3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't create digest calculator: ");
                sb.append(e3.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e3);
            }
        } catch (org.bouncycastle.operator.OperatorCreationException e4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("can't create content verifier: ");
            sb2.append(e4.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e4);
        }
    }

    public byte[] getDigestAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.digestAlgorithm.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting digest parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public byte[] getEncryptionAlgParams() {
        try {
            org.bouncycastle.asn1.ASN1Encodable parameters = this.encryptionAlgorithm.getParameters();
            if (parameters != null) {
                return parameters.toASN1Primitive().getEncoded();
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public boolean verify(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.Time highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (!signerInformationVerifier.hasAssociatedCertificate() || highSpeedVideoFpsRangesFor == null || signerInformationVerifier.getAssociatedCertificate().isValidOn(highSpeedVideoFpsRangesFor.getDate())) {
            return getHighSpeedVideoFpsRangesFor(signerInformationVerifier);
        }
        throw new org.bouncycastle.cms.CMSVerifierCertificateNotValidException("verifier not valid at signingTime");
    }

    public org.bouncycastle.asn1.cms.SignerInfo toASN1Structure() {
        return this.info;
    }

    public boolean isCounterSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getVersion() {
        return this.info.getVersion().intValueExact();
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnsignedAttributes() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.unsignedAttributeSet;
        if (aSN1Set != null && this.getOutputFormats == null) {
            this.getOutputFormats = new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
        }
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getSignedAttributes() {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.signedAttributeSet;
        if (aSN1Set != null && this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new org.bouncycastle.asn1.cms.AttributeTable(aSN1Set);
        }
        return this.getInputSizeshNQ4ISI;
    }

    public byte[] getSignature() {
        return org.bouncycastle.util.Arrays.clone(this.getInputFormats);
    }

    public org.bouncycastle.cms.SignerId getSID() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getEncryptionAlgOID() {
        return this.encryptionAlgorithm.getAlgorithm().getId();
    }

    public byte[] getEncodedSignedAttributes() throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.signedAttributeSet;
        if (aSN1Set != null) {
            return aSN1Set.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        }
        return null;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmID() {
        return this.digestAlgorithm;
    }

    public java.lang.String getDigestAlgOID() {
        return this.digestAlgorithm.getAlgorithm().getId();
    }

    public org.bouncycastle.cms.SignerInformationStore getCounterSignatures() {
        org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes == null) {
            return new org.bouncycastle.cms.SignerInformationStore(new java.util.ArrayList(0));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.bouncycastle.asn1.ASN1EncodableVector all = unsignedAttributes.getAll(org.bouncycastle.asn1.cms.CMSAttributes.counterSignature);
        for (int i = 0; i < all.size(); i++) {
            org.bouncycastle.asn1.ASN1Set attrValues = ((org.bouncycastle.asn1.cms.Attribute) all.get(i)).getAttrValues();
            attrValues.size();
            java.util.Enumeration objects = attrValues.getObjects();
            while (objects.hasMoreElements()) {
                arrayList.add(new org.bouncycastle.cms.SignerInformation(org.bouncycastle.asn1.cms.SignerInfo.getInstance(objects.nextElement()), null, new org.bouncycastle.cms.CMSProcessableByteArray(getSignature()), null));
            }
        }
        return new org.bouncycastle.cms.SignerInformationStore(arrayList);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getContentDigest() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            return org.bouncycastle.util.Arrays.clone(bArr);
        }
        throw new java.lang.IllegalStateException("method can only be called after verify.");
    }

    public static org.bouncycastle.cms.SignerInformation replaceUnsignedAttributes(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.asn1.cms.AttributeTable attributeTable) {
        org.bouncycastle.asn1.cms.SignerInfo signerInfo = signerInformation.info;
        return new org.bouncycastle.cms.SignerInformation(new org.bouncycastle.asn1.cms.SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), attributeTable != null ? new org.bouncycastle.asn1.DERSet(attributeTable.toASN1EncodableVector()) : null), signerInformation.getHighSpeedVideoFpsRanges, signerInformation.Camera2StreamConfigurationMap, null);
    }

    private org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1EncodableVector all;
        int size;
        org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.getAll(aSN1ObjectIdentifier).size() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(str);
            sb.append(" attribute MUST NOT be an unsigned attribute");
            throw new org.bouncycastle.cms.CMSException(sb.toString());
        }
        org.bouncycastle.asn1.cms.AttributeTable signedAttributes = getSignedAttributes();
        if (signedAttributes == null || (size = (all = signedAttributes.getAll(aSN1ObjectIdentifier)).size()) == 0) {
            return null;
        }
        if (size != 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the ");
            sb2.append(str);
            sb2.append(" attribute");
            throw new org.bouncycastle.cms.CMSException(sb2.toString());
        }
        org.bouncycastle.asn1.ASN1Set attrValues = ((org.bouncycastle.asn1.cms.Attribute) all.get(0)).getAttrValues();
        if (attrValues.size() == 1) {
            return attrValues.getObjectAt(0).toASN1Primitive();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("A ");
        sb3.append(str);
        sb3.append(" attribute MUST have a single attribute value");
        throw new org.bouncycastle.cms.CMSException(sb3.toString());
    }

    private org.bouncycastle.asn1.cms.Time getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.CMSAttributes.signingTime, "signing-time");
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        try {
            return org.bouncycastle.asn1.cms.Time.getInstance(Camera2StreamConfigurationMap);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new org.bouncycastle.cms.CMSException("signing-time attribute value not a valid 'Time' structure");
        }
    }

    public static org.bouncycastle.cms.SignerInformation addCounterSigners(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.cms.SignerInformationStore signerInformationStore) {
        org.bouncycastle.asn1.cms.SignerInfo signerInfo = signerInformation.info;
        org.bouncycastle.asn1.cms.AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = unsignedAttributes != null ? unsignedAttributes.toASN1EncodableVector() : new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            aSN1EncodableVector2.add(it.next().toASN1Structure());
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.counterSignature, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector2)));
        return new org.bouncycastle.cms.SignerInformation(new org.bouncycastle.asn1.cms.SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector)), signerInformation.getHighSpeedVideoFpsRanges, signerInformation.Camera2StreamConfigurationMap, null);
    }

    protected SignerInformation(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.asn1.cms.SignerInfo signerInfo) {
        this.info = signerInfo;
        this.getHighSpeedVideoFpsRanges = signerInformation.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = signerInformation.isCounterSignature();
        this.getHighSpeedVideoSizes = signerInformation.getSID();
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.getInputFormats = signerInfo.getEncryptedDigest().getOctets();
        this.Camera2StreamConfigurationMap = signerInformation.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = signerInformation.getHighSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = getSignedAttributes();
        this.getOutputFormats = getUnsignedAttributes();
    }

    protected SignerInformation(org.bouncycastle.cms.SignerInformation signerInformation) {
        this(signerInformation, signerInformation.info);
    }

    SignerInformation(org.bouncycastle.asn1.cms.SignerInfo signerInfo, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.cms.CMSProcessable cMSProcessable, byte[] bArr) {
        org.bouncycastle.cms.SignerId signerId;
        this.info = signerInfo;
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier == null;
        org.bouncycastle.asn1.cms.SignerIdentifier sid = signerInfo.getSID();
        boolean isTagged = sid.isTagged();
        org.bouncycastle.asn1.ASN1Encodable id = sid.getId();
        if (isTagged) {
            signerId = new org.bouncycastle.cms.SignerId(org.bouncycastle.asn1.ASN1OctetString.getInstance(id).getOctets());
        } else {
            org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(id);
            signerId = new org.bouncycastle.cms.SignerId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        }
        this.getHighSpeedVideoSizes = signerId;
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.getInputFormats = signerInfo.getEncryptedDigest().getOctets();
        this.Camera2StreamConfigurationMap = cMSProcessable;
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }
}
