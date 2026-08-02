package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class CVCertificateRequest extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.eac.CertificateBody Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges = null;
    private final org.bouncycastle.asn1.ASN1ApplicationSpecific getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1ApplicationSpecific != null) {
            return aSN1ApplicationSpecific;
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        try {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERApplicationSpecific(false, 55, new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRanges)));
            return new org.bouncycastle.asn1.DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("unable to convert signature!");
        }
    }

    public boolean hasOuterSignature() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public org.bouncycastle.asn1.eac.PublicKeyDataObject getPublicKey() {
        return this.Camera2StreamConfigurationMap.getPublicKey();
    }

    public byte[] getOuterSignature() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getInnerSignature() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.eac.CertificateBody getCertificateBody() {
        return this.Camera2StreamConfigurationMap;
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("not a CARDHOLDER_CERTIFICATE in request:");
            sb.append(aSN1ApplicationSpecific.getApplicationTag());
            throw new java.io.IOException(sb.toString());
        }
        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16)).getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific2 = org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(objects.nextElement());
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.getHighSpeedVideoFpsRanges = aSN1ApplicationSpecific2.getContents();
                i |= 2;
            } else {
                if (applicationTag != 78) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid tag, not an CV Certificate Request element:");
                    sb2.append(aSN1ApplicationSpecific2.getApplicationTag());
                    throw new java.io.IOException(sb2.toString());
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.eac.CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i |= 1;
            }
        }
        if ((i & 3) != 0) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid CARDHOLDER_CERTIFICATE in request:");
        sb3.append(aSN1ApplicationSpecific.getApplicationTag());
        throw new java.io.IOException(sb3.toString());
    }

    public static org.bouncycastle.asn1.eac.CVCertificateRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.eac.CVCertificateRequest) {
            return (org.bouncycastle.asn1.eac.CVCertificateRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new org.bouncycastle.asn1.eac.CVCertificateRequest(org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(obj));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString(), e);
        }
    }

    private CVCertificateRequest(org.bouncycastle.asn1.ASN1ApplicationSpecific aSN1ApplicationSpecific) throws java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = aSN1ApplicationSpecific;
        if (!aSN1ApplicationSpecific.isConstructed() || aSN1ApplicationSpecific.getApplicationTag() != 7) {
            Camera2StreamConfigurationMap(aSN1ApplicationSpecific);
            return;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16));
        Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(0)));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)).getContents();
    }
}
