package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class POPODecKeyChallContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.Challenge[] toChallengeArray() {
        int size = this.getHighSpeedVideoSizes.size();
        org.bouncycastle.asn1.cmp.Challenge[] challengeArr = new org.bouncycastle.asn1.cmp.Challenge[size];
        for (int i = 0; i != size; i++) {
            challengeArr[i] = org.bouncycastle.asn1.cmp.Challenge.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return challengeArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.POPODecKeyChallContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.POPODecKeyChallContent) {
            return (org.bouncycastle.asn1.cmp.POPODecKeyChallContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.POPODecKeyChallContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private POPODecKeyChallContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }
}
