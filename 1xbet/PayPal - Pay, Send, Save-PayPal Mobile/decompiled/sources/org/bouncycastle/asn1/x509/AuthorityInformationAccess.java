package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AuthorityInformationAccess extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AccessDescription[] getHighSpeedVideoFpsRangesFor;

    public AuthorityInformationAccess(org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptionArr) {
        org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptionArr2 = new org.bouncycastle.asn1.x509.AccessDescription[accessDescriptionArr.length];
        java.lang.System.arraycopy(accessDescriptionArr, 0, accessDescriptionArr2, 0, accessDescriptionArr.length);
        this.getHighSpeedVideoFpsRangesFor = accessDescriptionArr2;
    }

    public org.bouncycastle.asn1.x509.AccessDescription[] getAccessDescriptions() {
        org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptionArr = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptionArr2 = new org.bouncycastle.asn1.x509.AccessDescription[accessDescriptionArr.length];
        java.lang.System.arraycopy(accessDescriptionArr, 0, accessDescriptionArr2, 0, accessDescriptionArr.length);
        return accessDescriptionArr2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthorityInformationAccess: Oid(");
        sb.append(this.getHighSpeedVideoFpsRangesFor[0].getAccessMethod().getId());
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRangesFor);
    }

    public static org.bouncycastle.asn1.x509.AuthorityInformationAccess getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AuthorityInformationAccess) {
            return (org.bouncycastle.asn1.x509.AuthorityInformationAccess) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AuthorityInformationAccess(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.AuthorityInformationAccess fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.authorityInfoAccess));
    }

    public AuthorityInformationAccess(org.bouncycastle.asn1.x509.AccessDescription accessDescription) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.AccessDescription[]{accessDescription};
    }

    private AuthorityInformationAccess(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0) {
            throw new java.lang.IllegalArgumentException("sequence may not be empty");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.AccessDescription[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.getHighSpeedVideoFpsRangesFor[i] = org.bouncycastle.asn1.x509.AccessDescription.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }

    public AuthorityInformationAccess(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this(new org.bouncycastle.asn1.x509.AccessDescription(aSN1ObjectIdentifier, generalName));
    }
}
