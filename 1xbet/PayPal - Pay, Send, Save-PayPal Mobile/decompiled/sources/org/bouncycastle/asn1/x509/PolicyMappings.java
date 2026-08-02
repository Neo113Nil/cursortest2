package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PolicyMappings extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.PolicyMappings getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.PolicyMappings) {
            return (org.bouncycastle.asn1.x509.PolicyMappings) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.PolicyMappings(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PolicyMappings(org.bouncycastle.asn1.x509.CertPolicyId[] certPolicyIdArr, org.bouncycastle.asn1.x509.CertPolicyId[] certPolicyIdArr2) {
        this.Camera2StreamConfigurationMap = null;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(certPolicyIdArr.length);
        for (int i = 0; i != certPolicyIdArr.length; i++) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
            aSN1EncodableVector2.add(certPolicyIdArr[i]);
            aSN1EncodableVector2.add(certPolicyIdArr2[i]);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public PolicyMappings(org.bouncycastle.asn1.x509.CertPolicyId certPolicyId, org.bouncycastle.asn1.x509.CertPolicyId certPolicyId2) {
        this.Camera2StreamConfigurationMap = null;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(certPolicyId);
        aSN1EncodableVector.add(certPolicyId2);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    private PolicyMappings(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
    }

    public PolicyMappings(java.util.Hashtable hashtable) {
        this.Camera2StreamConfigurationMap = null;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(hashtable.size());
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            java.lang.String str = (java.lang.String) keys.nextElement();
            java.lang.String str2 = (java.lang.String) hashtable.get(str);
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
            aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str2));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
