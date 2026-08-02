package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSKeyParams extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getTreeDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getHeight() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.pqc.asn1.XMSSKeyParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSKeyParams) {
            return (org.bouncycastle.pqc.asn1.XMSSKeyParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSKeyParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private XMSSKeyParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public XMSSKeyParams(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
    }
}
