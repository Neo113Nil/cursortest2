package org.bouncycastle.asn1.mozilla;

/* loaded from: classes17.dex */
public class SignedPublicKeyAndChallenge extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(1));
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return org.bouncycastle.asn1.ASN1BitString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(2));
    }

    public org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge getPublicKeyAndChallenge() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge) {
            return (org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SignedPublicKeyAndChallenge(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge.getInstance(aSN1Sequence.getObjectAt(0));
    }
}
