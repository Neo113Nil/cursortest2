package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class MacData extends org.bouncycastle.asn1.ASN1Object {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    java.math.BigInteger Camera2StreamConfigurationMap;
    byte[] getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.DigestInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        if (!this.Camera2StreamConfigurationMap.equals(getHighSpeedVideoFpsRangesFor)) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getSalt() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.DigestInfo getMac() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getIterationCount() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.pkcs.MacData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.MacData) {
            return (org.bouncycastle.asn1.pkcs.MacData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.MacData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public MacData(org.bouncycastle.asn1.x509.DigestInfo digestInfo, byte[] bArr, int i) {
        this.getHighSpeedVideoSizes = digestInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        this.Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(i);
    }

    private MacData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.DigestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.Camera2StreamConfigurationMap = aSN1Sequence.size() == 3 ? org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).getValue() : getHighSpeedVideoFpsRangesFor;
    }
}
