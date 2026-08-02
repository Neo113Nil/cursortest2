package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class SPHINCS256KeyParams extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getTreeDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public static final org.bouncycastle.pqc.asn1.SPHINCS256KeyParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.SPHINCS256KeyParams) {
            return (org.bouncycastle.pqc.asn1.SPHINCS256KeyParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.SPHINCS256KeyParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SPHINCS256KeyParams(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = algorithmIdentifier;
    }

    private SPHINCS256KeyParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
