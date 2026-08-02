package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class BiometricData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1IA5String getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoSizes;
        if (aSN1IA5String != null) {
            aSN1EncodableVector.add(aSN1IA5String);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData getTypeOfBiometricData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1IA5String getSourceDataUriIA5() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.DERIA5String getSourceDataUri() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoSizes;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoSizes.getString(), false);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1OctetString getBiometricDataHash() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.qualified.BiometricData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.qualified.BiometricData) {
            return (org.bouncycastle.asn1.x509.qualified.BiometricData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.qualified.BiometricData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BiometricData(org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData typeOfBiometricData, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1IA5String aSN1IA5String) {
        this.getHighSpeedVideoFpsRangesFor = typeOfBiometricData;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
        this.getHighSpeedVideoSizes = aSN1IA5String;
    }

    public BiometricData(org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData typeOfBiometricData, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = typeOfBiometricData;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
        this.getHighSpeedVideoSizes = null;
    }

    private BiometricData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1IA5String.getInstance(objects.nextElement());
        }
    }
}
