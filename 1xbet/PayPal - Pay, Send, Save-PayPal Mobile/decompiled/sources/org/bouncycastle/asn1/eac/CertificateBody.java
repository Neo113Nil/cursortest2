package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class CertificateBody extends org.bouncycastle.asn1.ASN1Object {
    public static final int profileType = 127;
    public static final int requestType = 13;
    private org.bouncycastle.asn1.ASN1ApplicationSpecific Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ApplicationSpecific getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.eac.CertificateHolderAuthorization getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ApplicationSpecific getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1ApplicationSpecific getHighSpeedVideoSizes;
    private int getInputFormats;
    private org.bouncycastle.asn1.eac.PublicKeyDataObject getOutputFormats;
    private org.bouncycastle.asn1.ASN1ApplicationSpecific getOutputMinFrameDuration;

    private CertificateBody(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        this.getInputFormats = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 78) {
            throw new java.io.IOException("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
        }
        org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                aSN1InputStream.close();
                return;
            }
            if (!(readObject instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a valid iso7816 content : not a ASN1ApplicationSpecific Object :");
                sb.append(org.bouncycastle.asn1.eac.EACTags.encodeTag(aSN1ApplicationSpecific));
                sb.append(readObject.getClass());
                throw new java.io.IOException(sb.toString());
            }
            org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (org.bouncycastle.asn1.ASN1ApplicationSpecific) readObject;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 2) {
                getHighResolutionOutputSizeshNQ4ISI(aSN1ApplicationSpecific2);
            } else if (applicationTag == 32) {
                getHighSpeedVideoFpsRanges(aSN1ApplicationSpecific2);
            } else if (applicationTag == 41) {
                getHighSpeedVideoFpsRangesFor(aSN1ApplicationSpecific2);
            } else if (applicationTag == 73) {
                this.getOutputFormats = org.bouncycastle.asn1.eac.PublicKeyDataObject.getInstance(org.bouncycastle.asn1.eac.PublicKeyDataObject.getInstance(aSN1ApplicationSpecific2.getObject(16)));
                this.getInputFormats |= 4;
            } else if (applicationTag == 76) {
                this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.eac.CertificateHolderAuthorization(aSN1ApplicationSpecific2);
                this.getInputFormats |= 16;
            } else if (applicationTag == 36) {
                Camera2StreamConfigurationMap(aSN1ApplicationSpecific2);
            } else {
                if (applicationTag != 37) {
                    this.getInputFormats = 0;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Not a valid iso7816 ASN1ApplicationSpecific tag ");
                    sb2.append(aSN1ApplicationSpecific2.getApplicationTag());
                    throw new java.io.IOException(sb2.toString());
                }
                getHighSpeedVideoSizes(aSN1ApplicationSpecific2);
            }
        }
    }

    public CertificateBody(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific, org.bouncycastle.asn1.eac.CertificationAuthorityReference certificationAuthorityReference, org.bouncycastle.asn1.eac.PublicKeyDataObject publicKeyDataObject, org.bouncycastle.asn1.eac.CertificateHolderReference certificateHolderReference, org.bouncycastle.asn1.eac.CertificateHolderAuthorization certificateHolderAuthorization, org.bouncycastle.asn1.eac.PackedDate packedDate, org.bouncycastle.asn1.eac.PackedDate packedDate2) {
        this.getInputFormats = 0;
        getHighSpeedVideoFpsRangesFor(aSN1ApplicationSpecific);
        getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.asn1.DERApplicationSpecific(2, certificationAuthorityReference.getEncoded()));
        this.getOutputFormats = org.bouncycastle.asn1.eac.PublicKeyDataObject.getInstance(publicKeyDataObject);
        this.getInputFormats |= 4;
        getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.DERApplicationSpecific(32, certificateHolderReference.getEncoded()));
        this.getHighSpeedVideoFpsRanges = certificateHolderAuthorization;
        this.getInputFormats |= 16;
        try {
            getHighSpeedVideoSizes(new org.bouncycastle.asn1.DERApplicationSpecific(false, 37, new org.bouncycastle.asn1.DEROctetString(packedDate.getEncoding())));
            Camera2StreamConfigurationMap(new org.bouncycastle.asn1.DERApplicationSpecific(false, 36, new org.bouncycastle.asn1.DEROctetString(packedDate2.getEncoding())));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode dates: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        try {
            int i = this.getInputFormats;
            if (i != 127) {
                if (i != 13) {
                    return null;
                }
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
                aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERApplicationSpecific(false, 73, this.getOutputFormats));
                aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
                return new org.bouncycastle.asn1.DERApplicationSpecific(78, aSN1EncodableVector);
            }
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(7);
            aSN1EncodableVector2.add(this.getHighResolutionOutputSizeshNQ4ISI);
            aSN1EncodableVector2.add(this.getOutputMinFrameDuration);
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.DERApplicationSpecific(false, 73, this.getOutputFormats));
            aSN1EncodableVector2.add(this.getHighSpeedVideoFpsRangesFor);
            aSN1EncodableVector2.add(this.getHighSpeedVideoFpsRanges);
            aSN1EncodableVector2.add(this.getHighSpeedVideoSizes);
            aSN1EncodableVector2.add(this.Camera2StreamConfigurationMap);
            return new org.bouncycastle.asn1.DERApplicationSpecific(78, aSN1EncodableVector2);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public org.bouncycastle.asn1.eac.PublicKeyDataObject getPublicKey() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.eac.CertificationAuthorityReference getCertificationAuthorityReference() throws java.io.IOException {
        if ((this.getInputFormats & 2) == 2) {
            return new org.bouncycastle.asn1.eac.CertificationAuthorityReference(this.getOutputMinFrameDuration.getContents());
        }
        throw new java.io.IOException("Certification authority reference not set");
    }

    public int getCertificateType() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1ApplicationSpecific getCertificateProfileIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.eac.CertificateHolderReference getCertificateHolderReference() {
        return new org.bouncycastle.asn1.eac.CertificateHolderReference(this.getHighSpeedVideoFpsRangesFor.getContents());
    }

    public org.bouncycastle.asn1.eac.CertificateHolderAuthorization getCertificateHolderAuthorization() throws java.io.IOException {
        if ((this.getInputFormats & 16) == 16) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw new java.io.IOException("Certificate Holder Authorisation not set");
    }

    public org.bouncycastle.asn1.eac.PackedDate getCertificateExpirationDate() throws java.io.IOException {
        if ((this.getInputFormats & 64) == 64) {
            return new org.bouncycastle.asn1.eac.PackedDate(this.Camera2StreamConfigurationMap.getContents());
        }
        throw new java.io.IOException("certificate Expiration Date not set");
    }

    public org.bouncycastle.asn1.eac.PackedDate getCertificateEffectiveDate() {
        if ((this.getInputFormats & 32) == 32) {
            return new org.bouncycastle.asn1.eac.PackedDate(this.getHighSpeedVideoSizes.getContents());
        }
        return null;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.lang.IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 2) {
            throw new java.lang.IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
        }
        this.getOutputMinFrameDuration = aSN1ApplicationSpecific;
        this.getInputFormats |= 2;
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.lang.IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 41) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1ApplicationSpecific;
            this.getInputFormats |= 1;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :");
            sb.append(org.bouncycastle.asn1.eac.EACTags.encodeTag(aSN1ApplicationSpecific));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.lang.IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 32) {
            throw new java.lang.IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
        }
        this.getHighSpeedVideoFpsRangesFor = aSN1ApplicationSpecific;
        this.getInputFormats |= 8;
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.lang.IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 36) {
            throw new java.lang.IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
        }
        this.Camera2StreamConfigurationMap = aSN1ApplicationSpecific;
        this.getInputFormats |= 64;
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.lang.IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 37) {
            this.getHighSpeedVideoSizes = aSN1ApplicationSpecific;
            this.getInputFormats |= 32;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :");
            sb.append(org.bouncycastle.asn1.eac.EACTags.encodeTag(aSN1ApplicationSpecific));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static org.bouncycastle.asn1.eac.CertificateBody getInstance(java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof org.bouncycastle.asn1.eac.CertificateBody) {
            return (org.bouncycastle.asn1.eac.CertificateBody) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.eac.CertificateBody(org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(obj));
        }
        return null;
    }
}
