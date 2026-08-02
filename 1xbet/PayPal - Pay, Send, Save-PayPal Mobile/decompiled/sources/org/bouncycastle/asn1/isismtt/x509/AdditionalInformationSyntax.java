package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class AdditionalInformationSyntax extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x500.DirectoryString getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
    }

    public org.bouncycastle.asn1.x500.DirectoryString getInformation() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.isismtt.x509.AdditionalInformationSyntax getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.isismtt.x509.AdditionalInformationSyntax) {
            return (org.bouncycastle.asn1.isismtt.x509.AdditionalInformationSyntax) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.isismtt.x509.AdditionalInformationSyntax(org.bouncycastle.asn1.x500.DirectoryString.getInstance(obj));
        }
        return null;
    }

    private AdditionalInformationSyntax(org.bouncycastle.asn1.x500.DirectoryString directoryString) {
        this.getHighResolutionOutputSizeshNQ4ISI = directoryString;
    }

    public AdditionalInformationSyntax(java.lang.String str) {
        this(new org.bouncycastle.asn1.x500.DirectoryString(str));
    }
}
