package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class ValidationParams extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getSeed() {
        return this.getHighSpeedVideoFpsRangesFor.getBytes();
    }

    public java.math.BigInteger getPgenCounter() {
        return this.Camera2StreamConfigurationMap.getPositiveValue();
    }

    public static org.bouncycastle.asn1.x9.ValidationParams getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x9.ValidationParams getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.ValidationParams) {
            return (org.bouncycastle.asn1.x9.ValidationParams) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.ValidationParams(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ValidationParams(byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("'seed' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERBitString(bArr);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(i);
    }

    public ValidationParams(org.bouncycastle.asn1.DERBitString dERBitString, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            throw new java.lang.IllegalArgumentException("'seed' cannot be null");
        }
        if (aSN1Integer == null) {
            throw new java.lang.IllegalArgumentException("'pgenCounter' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = dERBitString;
        this.Camera2StreamConfigurationMap = aSN1Integer;
    }

    private ValidationParams(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
