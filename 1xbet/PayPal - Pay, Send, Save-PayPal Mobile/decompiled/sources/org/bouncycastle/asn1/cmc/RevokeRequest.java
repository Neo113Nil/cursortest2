package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class RevokeRequest extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.CRLReason getHighSpeedVideoSizes;
    private final org.bouncycastle.asn1.ASN1Integer getInputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.Camera2StreamConfigurationMap;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        if (aSN1UTF8String != null) {
            aSN1EncodableVector.add(aSN1UTF8String);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public void setPassphrase(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.Camera2StreamConfigurationMap = aSN1OctetString;
    }

    public void setInvalidityDate(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
    }

    public void setComment(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getInputFormats.getValue();
    }

    public org.bouncycastle.asn1.x509.CRLReason getReason() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1OctetString getPassphrase() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getPassPhrase() {
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.Camera2StreamConfigurationMap;
        if (aSN1OctetString != null) {
            return org.bouncycastle.util.Arrays.clone(aSN1OctetString.getOctets());
        }
        return null;
    }

    public org.bouncycastle.asn1.x500.X500Name getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getInvalidityDate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1UTF8String getCommentUTF8() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.DERUTF8String getComment() {
        org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String = this.getHighSpeedVideoFpsRanges;
        return (aSN1UTF8String == null || (aSN1UTF8String instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) aSN1UTF8String : new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges.getString());
    }

    public static org.bouncycastle.asn1.cmc.RevokeRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.RevokeRequest) {
            return (org.bouncycastle.asn1.cmc.RevokeRequest) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.RevokeRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RevokeRequest(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.CRLReason cRLReason, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighResolutionOutputSizeshNQ4ISI = x500Name;
        this.getInputFormats = aSN1Integer;
        this.getHighSpeedVideoSizes = cRLReason;
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
        this.Camera2StreamConfigurationMap = aSN1OctetString;
        this.getHighSpeedVideoFpsRanges = aSN1UTF8String;
    }

    private RevokeRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 3;
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 6) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.CRLReason.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() > 3 && (aSN1Sequence.getObjectAt(3).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1GeneralizedTime)) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
            i = 4;
        }
        if (aSN1Sequence.size() > i && (aSN1Sequence.getObjectAt(i).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1OctetString)) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i));
            i++;
        }
        if (aSN1Sequence.size() <= i || !(aSN1Sequence.getObjectAt(i).toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1UTF8String)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(i));
    }
}
