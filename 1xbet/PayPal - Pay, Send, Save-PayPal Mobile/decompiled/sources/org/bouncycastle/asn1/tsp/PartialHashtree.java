package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class PartialHashtree extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[][] getValues() {
        int size = this.Camera2StreamConfigurationMap.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i != size; i++) {
            bArr[i] = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i)).getOctets());
        }
        return bArr;
    }

    public int getValueCount() {
        return this.Camera2StreamConfigurationMap.size();
    }

    public boolean containsHash(byte[] bArr) {
        java.util.Enumeration objects = this.Camera2StreamConfigurationMap.getObjects();
        while (objects.hasMoreElements()) {
            if (org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr, org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement()).getOctets())) {
                return true;
            }
        }
        return false;
    }

    public static org.bouncycastle.asn1.tsp.PartialHashtree getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.PartialHashtree) {
            return (org.bouncycastle.asn1.tsp.PartialHashtree) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.PartialHashtree(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PartialHashtree(byte[][] bArr) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(bArr.length);
        for (int i = 0; i != bArr.length; i++) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr[i])));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public PartialHashtree(byte[] bArr) {
        this(new byte[][]{bArr});
    }

    private PartialHashtree(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            if (!(aSN1Sequence.getObjectAt(i) instanceof org.bouncycastle.asn1.DEROctetString)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in constructor: ");
                sb.append(aSN1Sequence.getObjectAt(i).getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }
}
