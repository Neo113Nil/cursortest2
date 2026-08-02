package org.bouncycastle.pqc.asn1;

/* loaded from: classes17.dex */
public class ParSet extends org.bouncycastle.asn1.ASN1Object {
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    private ParSet(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sie of seqOfParams = ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int intValueExact = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        if (intValueExact <= 0) {
            throw new java.lang.IllegalArgumentException("BigInteger not in Range: ".concat(java.lang.String.valueOf(intValueExact)));
        }
        this.getHighSpeedVideoSizes = intValueExact;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(1);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(2);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.getHighSpeedVideoSizes || aSN1Sequence3.size() != this.getHighSpeedVideoSizes || aSN1Sequence4.size() != this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalArgumentException("invalid size of sequences");
        }
        this.getHighSpeedVideoFpsRangesFor = new int[aSN1Sequence2.size()];
        this.getHighSpeedVideoFpsRanges = new int[aSN1Sequence3.size()];
        this.getHighResolutionOutputSizeshNQ4ISI = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            int intValueExact2 = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence2.getObjectAt(i)).intValueExact();
            if (intValueExact2 <= 0) {
                throw new java.lang.IllegalArgumentException("BigInteger not in Range: ".concat(java.lang.String.valueOf(intValueExact2)));
            }
            iArr[i] = intValueExact2;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int intValueExact3 = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence3.getObjectAt(i)).intValueExact();
            if (intValueExact3 <= 0) {
                throw new java.lang.IllegalArgumentException("BigInteger not in Range: ".concat(java.lang.String.valueOf(intValueExact3)));
            }
            iArr2[i] = intValueExact3;
            int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int intValueExact4 = ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence4.getObjectAt(i)).intValueExact();
            if (intValueExact4 <= 0) {
                throw new java.lang.IllegalArgumentException("BigInteger not in Range: ".concat(java.lang.String.valueOf(intValueExact4)));
            }
            iArr3[i] = intValueExact4;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.length; i++) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor[i]));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRanges[i]));
            aSN1EncodableVector3.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI[i]));
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector4 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector4.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes));
        aSN1EncodableVector4.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector4);
    }

    public int[] getW() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public int getT() {
        return this.getHighSpeedVideoSizes;
    }

    public int[] getK() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int[] getH() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.pqc.asn1.ParSet getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.pqc.asn1.ParSet) {
            return (org.bouncycastle.pqc.asn1.ParSet) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.pqc.asn1.ParSet(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = iArr;
        this.getHighSpeedVideoFpsRanges = iArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = iArr3;
    }
}
