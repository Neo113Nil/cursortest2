package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class DVCSRequestInformation extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.GeneralNames getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.PolicyInformation getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.x509.GeneralNames getInputFormats;
    private org.bouncycastle.asn1.dvcs.DVCSTime getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.dvcs.ServiceType getOutputMinFrameDuration;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DVCSRequestInformation {\n");
        if (this.getHighSpeedVideoSizesFor != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("version: ");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("service: ");
        sb2.append(this.getOutputMinFrameDuration);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        stringBuffer.append(sb2.toString());
        if (this.Camera2StreamConfigurationMap != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("nonce: ");
            sb3.append(this.Camera2StreamConfigurationMap);
            sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb3.toString());
        }
        if (this.getInputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("requestTime: ");
            sb4.append(this.getInputSizeshNQ4ISI);
            sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb4.toString());
        }
        if (this.getInputFormats != null) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("requester: ");
            sb5.append(this.getInputFormats);
            sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb5.toString());
        }
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestPolicy: ");
            sb6.append(this.getHighSpeedVideoSizes);
            sb6.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb6.toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dvcs: ");
            sb7.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb7.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb7.toString());
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("dataLocations: ");
            sb8.append(this.getHighSpeedVideoFpsRanges);
            sb8.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb8.toString());
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("extensions: ");
            sb9.append(this.getHighSpeedVideoFpsRangesFor);
            sb9.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            stringBuffer.append(sb9.toString());
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(9);
        if (this.getHighSpeedVideoSizesFor != 1) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
        }
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        }
        org.bouncycastle.asn1.dvcs.DVCSTime dVCSTime = this.getInputSizeshNQ4ISI;
        if (dVCSTime != null) {
            aSN1EncodableVector.add(dVCSTime);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = {this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[i];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, i2, aSN1Encodable));
            }
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.dvcs.ServiceType getService() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getRequester() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.dvcs.DVCSTime getRequestTime() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.PolicyInformation getRequestPolicy() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getNonce() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getDataLocations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getDVCS() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.dvcs.DVCSRequestInformation getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.DVCSRequestInformation getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.DVCSRequestInformation) {
            return (org.bouncycastle.asn1.dvcs.DVCSRequestInformation) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.DVCSRequestInformation(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DVCSRequestInformation(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        this.getHighSpeedVideoSizesFor = 1;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
            i = 1;
        } else {
            this.getHighSpeedVideoSizesFor = 1;
            i = 0;
        }
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.dvcs.ServiceType.getInstance(aSN1Sequence.getObjectAt(i));
        for (int i2 = i + 1; i2 < aSN1Sequence.size(); i2++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i2);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1Integer) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(objectAt).getValue();
            } else if (!(objectAt instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) && (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getInputFormats = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
                } else if (tagNo == 2) {
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 3) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 4) {
                        throw new java.lang.IllegalArgumentException("unknown tag number encountered: ".concat(java.lang.String.valueOf(tagNo)));
                    }
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1TaggedObject, false);
                }
            } else {
                this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.dvcs.DVCSTime.getInstance(objectAt);
            }
        }
    }
}
