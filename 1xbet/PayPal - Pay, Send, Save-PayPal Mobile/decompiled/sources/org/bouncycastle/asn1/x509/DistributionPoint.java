package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class DistributionPoint extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.DistributionPointName Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.ReasonFlags getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(lineSeparator);
        org.bouncycastle.asn1.x509.DistributionPointName distributionPointName = this.Camera2StreamConfigurationMap;
        if (distributionPointName != null) {
            Camera2StreamConfigurationMap(stringBuffer, lineSeparator, "distributionPoint", distributionPointName.toString());
        }
        org.bouncycastle.asn1.x509.ReasonFlags reasonFlags = this.getHighResolutionOutputSizeshNQ4ISI;
        if (reasonFlags != null) {
            Camera2StreamConfigurationMap(stringBuffer, lineSeparator, "reasons", reasonFlags.toString());
        }
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRangesFor;
        if (generalNames != null) {
            Camera2StreamConfigurationMap(stringBuffer, lineSeparator, "cRLIssuer", generalNames.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.DistributionPointName distributionPointName = this.Camera2StreamConfigurationMap;
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, distributionPointName));
        }
        org.bouncycastle.asn1.x509.ReasonFlags reasonFlags = this.getHighResolutionOutputSizeshNQ4ISI;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) reasonFlags));
        }
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRangesFor;
        if (generalNames != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) generalNames));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.ReasonFlags getReasons() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.DistributionPointName getDistributionPoint() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getCRLIssuer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.DistributionPoint getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.DistributionPoint getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.DistributionPoint)) {
            return (org.bouncycastle.asn1.x509.DistributionPoint) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.DistributionPoint((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid DistributionPoint: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(io.ktor.sse.ServerSentEventKt.COLON);
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public DistributionPoint(org.bouncycastle.asn1.x509.DistributionPointName distributionPointName, org.bouncycastle.asn1.x509.ReasonFlags reasonFlags, org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.Camera2StreamConfigurationMap = distributionPointName;
        this.getHighResolutionOutputSizeshNQ4ISI = reasonFlags;
        this.getHighSpeedVideoFpsRangesFor = generalNames;
    }

    public DistributionPoint(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.ReasonFlags(org.bouncycastle.asn1.DERBitString.getInstance(aSN1TaggedObject, false));
            } else {
                if (tagNo != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown tag encountered in structure: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
            }
        }
    }
}
