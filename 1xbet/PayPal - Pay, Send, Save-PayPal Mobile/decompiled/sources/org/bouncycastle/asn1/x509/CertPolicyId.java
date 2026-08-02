package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CertPolicyId extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getId() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getId();
    }

    public static org.bouncycastle.asn1.x509.CertPolicyId getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CertPolicyId) {
            return (org.bouncycastle.asn1.x509.CertPolicyId) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.CertPolicyId(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(obj));
        }
        return null;
    }

    private CertPolicyId(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }
}
