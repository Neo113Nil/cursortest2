package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CertificatePolicies extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.PolicyInformation[] getHighResolutionOutputSizeshNQ4ISI;

    public CertificatePolicies(org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr) {
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr2 = new org.bouncycastle.asn1.x509.PolicyInformation[policyInformationArr.length];
        java.lang.System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, policyInformationArr.length);
        this.getHighResolutionOutputSizeshNQ4ISI = policyInformationArr2;
    }

    public org.bouncycastle.asn1.x509.PolicyInformation[] getPolicyInformation() {
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr2 = new org.bouncycastle.asn1.x509.PolicyInformation[policyInformationArr.length];
        java.lang.System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, policyInformationArr.length);
        return policyInformationArr2;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.length; i++) {
            if (stringBuffer.length() != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CertificatePolicies: [");
        sb.append((java.lang.Object) stringBuffer);
        sb.append("]");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.PolicyInformation getPolicyInformation(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == policyInformationArr.length) {
                return null;
            }
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) policyInformationArr[i].getPolicyIdentifier())) {
                return this.getHighResolutionOutputSizeshNQ4ISI[i];
            }
            i++;
        }
    }

    public static org.bouncycastle.asn1.x509.CertificatePolicies getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.CertificatePolicies getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CertificatePolicies) {
            return (org.bouncycastle.asn1.x509.CertificatePolicies) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.CertificatePolicies(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.CertificatePolicies fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.certificatePolicies));
    }

    public CertificatePolicies(org.bouncycastle.asn1.x509.PolicyInformation policyInformation) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.PolicyInformation[]{policyInformation};
    }

    private CertificatePolicies(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.PolicyInformation[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }
}
