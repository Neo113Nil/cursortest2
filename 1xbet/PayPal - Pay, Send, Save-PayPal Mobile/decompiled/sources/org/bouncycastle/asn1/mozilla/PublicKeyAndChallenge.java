package org.bouncycastle.asn1.mozilla;

/* loaded from: classes17.dex */
public class PublicKeyAndChallenge extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1IA5String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1IA5String getChallengeIA5() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.DERIA5String getChallenge() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighResolutionOutputSizeshNQ4ISI;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighResolutionOutputSizeshNQ4ISI.getString(), false);
    }

    public static org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge) {
            return (org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private PublicKeyAndChallenge(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = aSN1Sequence;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
