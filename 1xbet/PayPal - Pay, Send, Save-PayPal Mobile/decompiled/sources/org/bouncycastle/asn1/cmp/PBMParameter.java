package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PBMParameter extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getSalt() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getOwf() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMac() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Integer getIterationCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmp.PBMParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PBMParameter) {
            return (org.bouncycastle.asn1.cmp.PBMParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PBMParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PBMParameter(byte[] bArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        this(new org.bouncycastle.asn1.DEROctetString(bArr), algorithmIdentifier, new org.bouncycastle.asn1.ASN1Integer(i), algorithmIdentifier2);
    }

    private PBMParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }

    public PBMParameter(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Integer;
        this.Camera2StreamConfigurationMap = algorithmIdentifier2;
    }
}
