package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class IssuingDistributionPoint extends org.bouncycastle.asn1.ASN1Object {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.DistributionPointName getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Sequence getInputFormats;
    private org.bouncycastle.asn1.x509.ReasonFlags getOutputFormats;

    public java.lang.String toString() {
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(lineSeparator);
        org.bouncycastle.asn1.x509.DistributionPointName distributionPointName = this.getHighSpeedVideoSizes;
        if (distributionPointName != null) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "distributionPoint", distributionPointName.toString());
        }
        boolean z = this.Camera2StreamConfigurationMap;
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "onlyContainsUserCerts", z ? "true" : "false");
        }
        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (z2) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "onlyContainsCACerts", z2 ? "true" : "false");
        }
        org.bouncycastle.asn1.x509.ReasonFlags reasonFlags = this.getOutputFormats;
        if (reasonFlags != null) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "onlySomeReasons", reasonFlags.toString());
        }
        boolean z3 = this.getHighSpeedVideoFpsRangesFor;
        if (z3) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "onlyContainsAttributeCerts", z3 ? "true" : "false");
        }
        boolean z4 = this.getHighSpeedVideoFpsRanges;
        if (z4) {
            getHighResolutionOutputSizeshNQ4ISI(stringBuffer, lineSeparator, "indirectCRL", z4 ? "true" : "false");
        }
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getInputFormats;
    }

    public boolean onlyContainsUserCerts() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean onlyContainsCACerts() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean onlyContainsAttributeCerts() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isIndirectCRL() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.ReasonFlags getOnlySomeReasons() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x509.DistributionPointName getDistributionPoint() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.IssuingDistributionPoint getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.IssuingDistributionPoint getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.IssuingDistributionPoint) {
            return (org.bouncycastle.asn1.x509.IssuingDistributionPoint) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.IssuingDistributionPoint(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(io.ktor.sse.ServerSentEventKt.COLON);
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public IssuingDistributionPoint(org.bouncycastle.asn1.x509.DistributionPointName distributionPointName, boolean z, boolean z2, org.bouncycastle.asn1.x509.ReasonFlags reasonFlags, boolean z3, boolean z4) {
        this.getHighSpeedVideoSizes = distributionPointName;
        this.getHighSpeedVideoFpsRanges = z3;
        this.getHighSpeedVideoFpsRangesFor = z4;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.Camera2StreamConfigurationMap = z;
        this.getOutputFormats = reasonFlags;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) distributionPointName));
        }
        if (z) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(true)));
        }
        if (z2) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(true)));
        }
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) reasonFlags));
        }
        if (z3) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 4, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(true)));
        }
        if (z4) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 5, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.asn1.ASN1Boolean.getInstance(true)));
        }
        this.getInputFormats = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public IssuingDistributionPoint(org.bouncycastle.asn1.x509.DistributionPointName distributionPointName, boolean z, boolean z2) {
        this(distributionPointName, false, false, null, z, z2);
    }

    private IssuingDistributionPoint(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getInputFormats = aSN1Sequence;
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 3) {
                this.getOutputFormats = new org.bouncycastle.asn1.x509.ReasonFlags(org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false));
            } else if (tagNo == 4) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else {
                if (tagNo != 5) {
                    throw new java.lang.IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            }
        }
    }
}
