package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class GeneralNames extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.GeneralName[] getHighResolutionOutputSizeshNQ4ISI;

    public GeneralNames(org.bouncycastle.asn1.x509.GeneralName[] generalNameArr) {
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[generalNameArr.length];
        java.lang.System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        this.getHighResolutionOutputSizeshNQ4ISI = generalNameArr2;
    }

    public org.bouncycastle.asn1.x509.GeneralName[] getNames() {
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[generalNameArr.length];
        java.lang.System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        return generalNameArr2;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("GeneralNames:");
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.getHighResolutionOutputSizeshNQ4ISI[i]);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static org.bouncycastle.asn1.x509.GeneralNames getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new org.bouncycastle.asn1.x509.GeneralNames(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.GeneralNames getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.GeneralNames) {
            return (org.bouncycastle.asn1.x509.GeneralNames) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.GeneralNames(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.GeneralNames fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, aSN1ObjectIdentifier));
    }

    public GeneralNames(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.GeneralName[]{generalName};
    }

    private GeneralNames(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.GeneralName[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(i));
        }
    }
}
