package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class GMSSPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.Camera2StreamConfigurationMap));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getPublicKey() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public static org.bouncycastle.pqc.asn1.GMSSPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.GMSSPublicKey) {
            return (org.bouncycastle.pqc.asn1.GMSSPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.GMSSPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GMSSPublicKey(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.Camera2StreamConfigurationMap = bArr;
    }

    private GMSSPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size of seq = ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
