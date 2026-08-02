package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class XMSSMTKeyParams extends org.bouncycastle.asn1.ASN1Object {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getTreeDigest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getLayers() {
        return this.getHighSpeedVideoSizes;
    }

    public int getHeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.pqc.asn1.XMSSMTKeyParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.XMSSMTKeyParams) {
            return (org.bouncycastle.pqc.asn1.XMSSMTKeyParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.XMSSMTKeyParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private XMSSMTKeyParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).intValueExact();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).intValueExact();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }

    public XMSSMTKeyParams(int i, int i2, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
    }
}
