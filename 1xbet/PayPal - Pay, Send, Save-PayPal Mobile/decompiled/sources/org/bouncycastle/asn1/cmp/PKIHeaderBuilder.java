package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIHeaderBuilder {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cmp.PKIFreeText getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1OctetString getInputFormats;
    private org.bouncycastle.asn1.ASN1OctetString getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralName getOutputFormats;
    private org.bouncycastle.asn1.x509.GeneralName getOutputMinFrameDuration;
    private org.bouncycastle.asn1.ASN1OctetString getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.asn1.ASN1OctetString getOutputSizes;

    public org.bouncycastle.asn1.cmp.PKIHeader build() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(12);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighSpeedVideoSizes;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoSizesFor;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2 = this.getInputFormats;
        if (aSN1OctetString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString2));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString3 = this.getOutputSizes;
        if (aSN1OctetString3 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 4, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString3));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString4 = this.getOutputMinFrameDurationlomOqCM;
        if (aSN1OctetString4 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 5, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString4));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString5 = this.getInputSizeshNQ4ISI;
        if (aSN1OctetString5 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 6, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString5));
        }
        org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText = this.getHighResolutionOutputSizeshNQ4ISI;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 7, (org.bouncycastle.asn1.ASN1Encodable) pKIFreeText));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 8, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = null;
        this.getOutputSizes = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getInputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = null;
        return org.bouncycastle.asn1.cmp.PKIHeader.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setGeneralInfo(org.bouncycastle.asn1.cmp.InfoTypeAndValue infoTypeAndValue) {
        return setGeneralInfo(new org.bouncycastle.asn1.DERSequence(infoTypeAndValue));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setGeneralInfo(org.bouncycastle.asn1.cmp.InfoTypeAndValue[] infoTypeAndValueArr) {
        return setGeneralInfo(infoTypeAndValueArr != null ? new org.bouncycastle.asn1.DERSequence(infoTypeAndValueArr) : null);
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setTransactionID(byte[] bArr) {
        return setTransactionID(bArr == null ? null : new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setTransactionID(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getOutputSizes = aSN1OctetString;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setSenderNonce(byte[] bArr) {
        return setSenderNonce(bArr == null ? null : new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setSenderNonce(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getOutputMinFrameDurationlomOqCM = aSN1OctetString;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setSenderKID(byte[] bArr) {
        return setSenderKID(bArr == null ? null : new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setSenderKID(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoSizesFor = aSN1OctetString;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setRecipNonce(byte[] bArr) {
        return setRecipNonce(bArr == null ? null : new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setRecipNonce(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getInputSizeshNQ4ISI = aSN1OctetString;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setRecipKID(byte[] bArr) {
        return setRecipKID(bArr == null ? null : new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setRecipKID(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getInputFormats = aSN1OctetString;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setProtectionAlg(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setMessageTime(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighSpeedVideoSizes = aSN1GeneralizedTime;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setGeneralInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
        return this;
    }

    public org.bouncycastle.asn1.cmp.PKIHeaderBuilder setFreeText(org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText) {
        this.getHighResolutionOutputSizeshNQ4ISI = pKIFreeText;
        return this;
    }

    private PKIHeaderBuilder(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this.Camera2StreamConfigurationMap = aSN1Integer;
        this.getOutputFormats = generalName;
        this.getOutputMinFrameDuration = generalName2;
    }

    public PKIHeaderBuilder(int i, org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.x509.GeneralName generalName2) {
        this(new org.bouncycastle.asn1.ASN1Integer(i), generalName, generalName2);
    }
}
