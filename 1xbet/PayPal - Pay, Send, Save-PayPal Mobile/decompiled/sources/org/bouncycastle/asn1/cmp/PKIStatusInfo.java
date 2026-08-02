package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIStatusInfo extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.cmp.PKIFreeText Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText = this.Camera2StreamConfigurationMap;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(pKIFreeText);
        }
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getHighSpeedVideoSizes;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(aSN1BitString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIFreeText getStatusString() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public org.bouncycastle.asn1.ASN1BitString getFailInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.PKIStatusInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmp.PKIStatusInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIStatusInfo) {
            return (org.bouncycastle.asn1.cmp.PKIStatusInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIStatusInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIStatusInfo(org.bouncycastle.asn1.cmp.PKIStatus pKIStatus, org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText, org.bouncycastle.asn1.cmp.PKIFailureInfo pKIFailureInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.Camera2StreamConfigurationMap = pKIFreeText;
        this.getHighSpeedVideoSizes = pKIFailureInfo;
    }

    public PKIStatusInfo(org.bouncycastle.asn1.cmp.PKIStatus pKIStatus, org.bouncycastle.asn1.cmp.PKIFreeText pKIFreeText) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.Camera2StreamConfigurationMap = pKIFreeText;
    }

    public PKIStatusInfo(org.bouncycastle.asn1.cmp.PKIStatus pKIStatus) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
    }

    private PKIStatusInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1BitString aSN1BitString;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        if (aSN1Sequence.size() > 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(aSN1Sequence.getObjectAt(1));
            aSN1BitString = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
        } else {
            if (aSN1Sequence.size() <= 1) {
                return;
            }
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (!(objectAt instanceof org.bouncycastle.asn1.ASN1BitString)) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIFreeText.getInstance(objectAt);
                return;
            }
            aSN1BitString = org.bouncycastle.asn1.ASN1BitString.getInstance(objectAt);
        }
        this.getHighSpeedVideoSizes = aSN1BitString;
    }
}
