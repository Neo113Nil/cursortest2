package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
final class ASN1UniversalTypes {
    static org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRangesFor(int i) {
        switch (i) {
            case 1:
                return org.bouncycastle.asn1.ASN1Boolean.getHighSpeedVideoFpsRanges;
            case 2:
                return org.bouncycastle.asn1.ASN1Integer.getHighSpeedVideoSizes;
            case 3:
                return org.bouncycastle.asn1.ASN1BitString.getHighSpeedVideoFpsRangesFor;
            case 4:
                return org.bouncycastle.asn1.ASN1OctetString.Camera2StreamConfigurationMap;
            case 5:
                return org.bouncycastle.asn1.ASN1Null.getHighSpeedVideoFpsRanges;
            case 6:
                return org.bouncycastle.asn1.ASN1ObjectIdentifier.Camera2StreamConfigurationMap;
            case 7:
                return org.bouncycastle.asn1.ASN1ObjectDescriptor.getHighSpeedVideoFpsRanges;
            case 8:
                return org.bouncycastle.asn1.ASN1External.getHighSpeedVideoFpsRanges;
            case 9:
            case 11:
            case 14:
            case 15:
            case 29:
            default:
                return null;
            case 10:
                return org.bouncycastle.asn1.ASN1Enumerated.getHighResolutionOutputSizeshNQ4ISI;
            case 12:
                return org.bouncycastle.asn1.ASN1UTF8String.getHighResolutionOutputSizeshNQ4ISI;
            case 13:
                return org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoSizes;
            case 16:
                return org.bouncycastle.asn1.ASN1Sequence.getHighSpeedVideoFpsRangesFor;
            case 17:
                return org.bouncycastle.asn1.ASN1Set.getHighSpeedVideoFpsRangesFor;
            case 18:
                return org.bouncycastle.asn1.ASN1NumericString.getHighResolutionOutputSizeshNQ4ISI;
            case 19:
                return org.bouncycastle.asn1.ASN1PrintableString.getHighResolutionOutputSizeshNQ4ISI;
            case 20:
                return org.bouncycastle.asn1.ASN1T61String.getHighSpeedVideoFpsRanges;
            case 21:
                return org.bouncycastle.asn1.ASN1VideotexString.Camera2StreamConfigurationMap;
            case 22:
                return org.bouncycastle.asn1.ASN1IA5String.getHighSpeedVideoFpsRangesFor;
            case 23:
                return org.bouncycastle.asn1.ASN1UTCTime.getHighSpeedVideoSizes;
            case 24:
                return org.bouncycastle.asn1.ASN1GeneralizedTime.getHighSpeedVideoFpsRangesFor;
            case 25:
                return org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI;
            case 26:
                return org.bouncycastle.asn1.ASN1VisibleString.getHighSpeedVideoFpsRangesFor;
            case 27:
                return org.bouncycastle.asn1.ASN1GeneralString.getHighSpeedVideoFpsRanges;
            case 28:
                return org.bouncycastle.asn1.ASN1UniversalString.getHighSpeedVideoSizes;
            case 30:
                return org.bouncycastle.asn1.ASN1BMPString.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    private ASN1UniversalTypes() {
    }
}
