package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PollRepContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer[] Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIFreeText[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighResolutionOutputSizeshNQ4ISI.length);
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.length; i++) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(3);
            aSN1EncodableVector2.add(this.getHighResolutionOutputSizeshNQ4ISI[i]);
            aSN1EncodableVector2.add(this.Camera2StreamConfigurationMap[i]);
            org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText = this.getHighSpeedVideoSizes[i];
            if (pKIFreeText != null) {
                aSN1EncodableVector2.add(pKIFreeText);
            }
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length;
    }

    public org.bouncycastle.asn1.cmp.PKIFreeText getReason(int i) {
        return this.getHighSpeedVideoSizes[i];
    }

    public org.bouncycastle.asn1.ASN1Integer getCheckAfter(int i) {
        return this.Camera2StreamConfigurationMap[i];
    }

    public org.bouncycastle.asn1.ASN1Integer getCertReqId(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI[i];
    }

    public static org.bouncycastle.asn1.cmp.PollRepContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PollRepContent) {
            return (org.bouncycastle.asn1.cmp.PollRepContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PollRepContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PollRepContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer[aSN1Sequence.size()];
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer[aSN1Sequence.size()];
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cmp.PKIFreeText[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i));
            this.getHighResolutionOutputSizeshNQ4ISI[i] = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0));
            this.Camera2StreamConfigurationMap[i] = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1));
            if (aSN1Sequence2.size() > 2) {
                this.getHighSpeedVideoSizes[i] = org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(aSN1Sequence2.getObjectAt(2));
            }
        }
    }

    public PollRepContent(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2, org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer[]{aSN1Integer};
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer[]{aSN1Integer2};
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cmp.PKIFreeText[]{pKIFreeText};
    }

    public PollRepContent(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2) {
        this(aSN1Integer, aSN1Integer2, null);
    }
}
