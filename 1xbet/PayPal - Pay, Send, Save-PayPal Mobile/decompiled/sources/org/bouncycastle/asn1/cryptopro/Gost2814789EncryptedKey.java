package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class Gost2814789EncryptedKey extends org.bouncycastle.asn1.ASN1Object {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
        if (this.getHighSpeedVideoFpsRanges != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor)));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public byte[] getMaskKey() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public byte[] getMacKey() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getEncryptedKey() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey) {
            return (org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr3);
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2) {
        this(bArr, null, bArr2);
    }

    private Gost2814789EncryptedKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
            this.getHighSpeedVideoFpsRanges = null;
        } else {
            if (aSN1Sequence.size() != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown sequence length: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false).getOctets());
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        }
    }
}
