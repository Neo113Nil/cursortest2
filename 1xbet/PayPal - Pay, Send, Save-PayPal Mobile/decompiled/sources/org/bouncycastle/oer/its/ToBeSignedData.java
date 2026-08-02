package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ToBeSignedData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.HeaderInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.SignedDataPayload getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.oer.its.SignedDataPayload Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.HeaderInfo getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.ToBeSignedData.Builder setPayload(org.bouncycastle.oer.its.SignedDataPayload signedDataPayload) {
            this.Camera2StreamConfigurationMap = signedDataPayload;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedData.Builder setHeaderInfo(org.bouncycastle.oer.its.HeaderInfo headerInfo) {
            this.getHighResolutionOutputSizeshNQ4ISI = headerInfo;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedData createToBeSignedData() {
            return new org.bouncycastle.oer.its.ToBeSignedData(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI});
    }

    public org.bouncycastle.oer.its.SignedDataPayload getPayload() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.HeaderInfo getHeaderInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.ToBeSignedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.ToBeSignedData) {
            return (org.bouncycastle.oer.its.ToBeSignedData) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.ToBeSignedData.Builder().setPayload(org.bouncycastle.oer.its.SignedDataPayload.getInstance(aSN1Sequence.getObjectAt(0))).setHeaderInfo(org.bouncycastle.oer.its.HeaderInfo.getInstance(aSN1Sequence.getObjectAt(1))).createToBeSignedData();
    }

    public ToBeSignedData(org.bouncycastle.oer.its.SignedDataPayload signedDataPayload, org.bouncycastle.oer.its.HeaderInfo headerInfo) {
        this.getHighSpeedVideoSizes = signedDataPayload;
        this.getHighResolutionOutputSizeshNQ4ISI = headerInfo;
    }
}
