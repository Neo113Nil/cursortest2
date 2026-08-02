package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class CVCertificate extends org.bouncycastle.asn1.ASN1Object {
    private static int getHighSpeedVideoFpsRangesFor = 2;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.eac.CertificateBody getHighSpeedVideoFpsRanges;

    public CVCertificate(org.bouncycastle.asn1.ASN1InputStream aSN1InputStream) throws java.io.IOException {
        while (true) {
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                return;
            }
            if (!(readObject instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
                throw new java.io.IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
            }
            Camera2StreamConfigurationMap((org.bouncycastle.asn1.ASN1ApplicationSpecific) readObject);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        try {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERApplicationSpecific(false, 55, new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap)));
            return new org.bouncycastle.asn1.DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("unable to convert signature!");
        }
    }

    public byte[] getSignature() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public int getRole() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateHolderAuthorization().getAccessRights();
    }

    public org.bouncycastle.asn1.eac.CertificateHolderReference getHolderReference() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateHolderReference();
    }

    public int getHolderAuthorizationRole() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public org.bouncycastle.asn1.eac.Flags getHolderAuthorizationRights() throws java.io.IOException {
        return new org.bouncycastle.asn1.eac.Flags(this.getHighSpeedVideoFpsRanges.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getHolderAuthorization() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateHolderAuthorization().getOid();
    }

    public org.bouncycastle.asn1.eac.PackedDate getExpirationDate() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateExpirationDate();
    }

    public org.bouncycastle.asn1.eac.PackedDate getEffectiveDate() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificateEffectiveDate();
    }

    public int getCertificateType() {
        return this.getHighSpeedVideoFpsRanges.getCertificateType();
    }

    public org.bouncycastle.asn1.eac.CertificateBody getBody() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.eac.CertificationAuthorityReference getAuthorityReference() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getCertificationAuthorityReference();
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        int i;
        int i2;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("not a CARDHOLDER_CERTIFICATE :");
            sb.append(aSN1ApplicationSpecific.getApplicationTag());
            throw new java.io.IOException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                aSN1InputStream.close();
                if (this.getHighResolutionOutputSizeshNQ4ISI == (getHighSpeedVideoFpsRangesFor | getHighSpeedVideoSizes)) {
                    return;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid CARDHOLDER_CERTIFICATE :");
                sb2.append(aSN1ApplicationSpecific.getApplicationTag());
                throw new java.io.IOException(sb2.toString());
            }
            if (!(readObject instanceof org.bouncycastle.asn1.ASN1ApplicationSpecific)) {
                throw new java.io.IOException("Invalid Object, not an Iso7816CertificateStructure");
            }
            org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (org.bouncycastle.asn1.ASN1ApplicationSpecific) readObject;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.Camera2StreamConfigurationMap = aSN1ApplicationSpecific2.getContents();
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                i2 = getHighSpeedVideoFpsRangesFor;
            } else {
                if (applicationTag != 78) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid tag, not an Iso7816CertificateStructure :");
                    sb3.append(aSN1ApplicationSpecific2.getApplicationTag());
                    throw new java.io.IOException(sb3.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.eac.CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i = this.getHighResolutionOutputSizeshNQ4ISI;
                i2 = getHighSpeedVideoSizes;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i | i2;
        }
    }

    public static org.bouncycastle.asn1.eac.CVCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.eac.CVCertificate) {
            return (org.bouncycastle.asn1.eac.CVCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new org.bouncycastle.asn1.eac.CVCertificate(org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(obj));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString(), e);
        }
    }

    public CVCertificate(org.bouncycastle.asn1.eac.CertificateBody certificateBody, byte[] bArr) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = certificateBody;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI | getHighSpeedVideoSizes | getHighSpeedVideoFpsRangesFor;
    }

    private CVCertificate(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        Camera2StreamConfigurationMap(aSN1ApplicationSpecific);
    }
}
