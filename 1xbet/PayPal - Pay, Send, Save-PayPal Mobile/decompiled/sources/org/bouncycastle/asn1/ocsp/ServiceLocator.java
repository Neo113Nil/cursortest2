package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class ServiceLocator extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x500.X500Name getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.x509.AuthorityInformationAccess getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.x509.AuthorityInformationAccess authorityInformationAccess = this.getHighSpeedVideoFpsRangesFor;
        if (authorityInformationAccess != null) {
            aSN1EncodableVector.add(authorityInformationAccess);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AuthorityInformationAccess getLocator() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.ServiceLocator getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.ServiceLocator) {
            return (org.bouncycastle.asn1.ocsp.ServiceLocator) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.ServiceLocator(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ServiceLocator(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence.size() == 2 ? org.bouncycastle.asn1.x509.AuthorityInformationAccess.getInstance(aSN1Sequence.getObjectAt(1)) : null;
    }
}
