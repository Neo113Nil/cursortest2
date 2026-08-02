package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PollReqContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.ASN1Integer[][] getCertReqIds() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.ASN1Integer[][] aSN1IntegerArr = new org.bouncycastle.asn1.ASN1Integer[size][];
        for (int i = 0; i != size; i++) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i);
            int size2 = aSN1Sequence.size();
            org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr2 = new org.bouncycastle.asn1.ASN1Integer[size2];
            for (int i2 = 0; i2 != size2; i2++) {
                aSN1IntegerArr2[i2] = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i2));
            }
            aSN1IntegerArr[i] = aSN1IntegerArr2;
        }
        return aSN1IntegerArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger[] getCertReqIdValues() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[size];
        for (int i = 0; i != size; i++) {
            bigIntegerArr[i] = org.bouncycastle.asn1.ASN1Integer.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i)).getObjectAt(0)).getValue();
        }
        return bigIntegerArr;
    }

    private static org.bouncycastle.asn1.DERSequence[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr) {
        int length = aSN1IntegerArr.length;
        org.bouncycastle.asn1.DERSequence[] dERSequenceArr = new org.bouncycastle.asn1.DERSequence[length];
        for (int i = 0; i != length; i++) {
            dERSequenceArr[i] = new org.bouncycastle.asn1.DERSequence(aSN1IntegerArr[i]);
        }
        return dERSequenceArr;
    }

    private static org.bouncycastle.asn1.ASN1Integer[] getHighSpeedVideoSizes(java.math.BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr = new org.bouncycastle.asn1.ASN1Integer[length];
        for (int i = 0; i != length; i++) {
            aSN1IntegerArr[i] = new org.bouncycastle.asn1.ASN1Integer(bigIntegerArr[i]);
        }
        return aSN1IntegerArr;
    }

    public static org.bouncycastle.asn1.cmp.PollReqContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PollReqContent) {
            return (org.bouncycastle.asn1.cmp.PollReqContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PollReqContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PollReqContent(org.bouncycastle.asn1.ASN1Integer[] aSN1IntegerArr) {
        this(new org.bouncycastle.asn1.DERSequence(Camera2StreamConfigurationMap(aSN1IntegerArr)));
    }

    public PollReqContent(java.math.BigInteger[] bigIntegerArr) {
        this(getHighSpeedVideoSizes(bigIntegerArr));
    }

    private PollReqContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }

    public PollReqContent(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this(new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.DERSequence(aSN1Integer)));
    }

    public PollReqContent(java.math.BigInteger bigInteger) {
        this(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }
}
