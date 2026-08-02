package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIHeader extends org.bouncycastle.asn1.ASN1Object {
    public static final int CMP_1999 = 1;
    public static final int CMP_2000 = 2;
    public static final org.bouncycastle.asn1.x509.GeneralName NULL_NAME = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(new org.bouncycastle.asn1.DERSequence()));
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cmp.PKIFreeText getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1OctetString getInputFormats;
    private org.bouncycastle.asn1.ASN1OctetString getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralName getOutputFormats;
    private org.bouncycastle.asn1.ASN1OctetString getOutputMinFrameDuration;
    private org.bouncycastle.asn1.ASN1OctetString getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.asn1.ASN1OctetString getOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(12);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getOutputFormats);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRanges;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getOutputMinFrameDuration;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2 = this.getInputFormats;
        if (aSN1OctetString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString2));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString3 = this.getOutputMinFrameDurationlomOqCM;
        if (aSN1OctetString3 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 4, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString3));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString4 = this.getOutputSizeshNQ4ISI;
        if (aSN1OctetString4 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 5, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString4));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString5 = this.getInputSizeshNQ4ISI;
        if (aSN1OctetString5 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 6, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString5));
        }
        org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText = this.getHighSpeedVideoSizes;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 7, (org.bouncycastle.asn1.ASN1Encodable) pKIFreeText));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 8, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getTransactionID() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public org.bouncycastle.asn1.ASN1OctetString getSenderNonce() {
        return this.getOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getSenderKID() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.x509.GeneralName getSender() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralName getRecipient() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1OctetString getRecipNonce() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1OctetString getRecipKID() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1Integer getPvno() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getProtectionAlg() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getMessageTime() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cmp.InfoTypeAndValue[] getGeneralInfo() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr = new org.bouncycastle.asn1.cmp.InfoTypeAndValue[size];
        for (int i = 0; i < size; i++) {
            infoTypeAndValueArr[i] = org.bouncycastle.asn1.cmp.InfoTypeAndValue.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return infoTypeAndValueArr;
    }

    public org.bouncycastle.asn1.cmp.PKIFreeText getFreeText() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.PKIHeader getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIHeader) {
            return (org.bouncycastle.asn1.cmp.PKIHeader) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIHeader(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PKIHeader(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x509.GeneralName.getInstance(objects.nextElement());
        this.getOutputFormats = org.bouncycastle.asn1.x509.GeneralName.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            switch (aSN1TaggedObject.getTagNo()) {
                case 0:
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
                    break;
                case 1:
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
                    break;
                case 2:
                    this.getOutputMinFrameDuration = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 3:
                    this.getInputFormats = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 4:
                    this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 5:
                    this.getOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 6:
                    this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, true);
                    break;
                case 7:
                    this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(aSN1TaggedObject, true);
                    break;
                case 8:
                    this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true);
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag number: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    private PKIHeader(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoSizesFor = generalName;
        this.getOutputFormats = generalName2;
    }

    public PKIHeader(int i, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this(new org.bouncycastle.asn1.ASN1Integer(i), generalName, generalName2);
    }
}
