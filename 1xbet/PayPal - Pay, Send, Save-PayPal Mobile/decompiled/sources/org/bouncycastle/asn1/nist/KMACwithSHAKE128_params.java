package org.bouncycastle.asn1.nist;

/* loaded from: classes17.dex */
public class KMACwithSHAKE128_params extends org.bouncycastle.asn1.ASN1Object {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[0];
    private final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        if (this.getHighSpeedVideoFpsRanges != 256) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges));
        }
        if (this.getHighSpeedVideoFpsRangesFor.length != 0) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(getCustomizationString()));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getOutputLength() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public byte[] getCustomizationString() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.nist.KMACwithSHAKE128_params getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.nist.KMACwithSHAKE128_params) {
            return (org.bouncycastle.asn1.nist.KMACwithSHAKE128_params) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.nist.KMACwithSHAKE128_params(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private KMACwithSHAKE128_params(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 2) {
            throw new java.lang.IllegalArgumentException("sequence size greater than 2");
        }
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        } else if (aSN1Sequence.size() != 1) {
            this.getHighSpeedVideoFpsRanges = 256;
            this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI;
        } else if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
            this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI;
        } else {
            this.getHighSpeedVideoFpsRanges = 256;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        }
    }

    public KMACwithSHAKE128_params(int i, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public KMACwithSHAKE128_params(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI;
    }
}
