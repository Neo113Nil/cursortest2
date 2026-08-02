package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class RoleSyntax extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Name: ");
        sb.append(getRoleNameAsString());
        sb.append(" - Auth: ");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(sb.toString());
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRanges;
        if (generalNames == null || generalNames.getNames().length == 0) {
            stringBuffer.append(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);
        } else {
            java.lang.String[] roleAuthorityAsString = getRoleAuthorityAsString();
            stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST).append(roleAuthorityAsString[0]);
            for (int i = 1; i < roleAuthorityAsString.length; i++) {
                stringBuffer.append(", ").append(roleAuthorityAsString[i]);
            }
            stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRanges;
        if (generalNames != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) generalNames));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) this.getHighResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.lang.String getRoleNameAsString() {
        return ((org.bouncycastle.asn1.ASN1String) this.getHighResolutionOutputSizeshNQ4ISI.getName()).getString();
    }

    public org.bouncycastle.asn1.x509.GeneralName getRoleName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String[] getRoleAuthorityAsString() {
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRanges;
        if (generalNames == null) {
            return new java.lang.String[0];
        }
        org.bouncycastle.asn1.x509.GeneralName[] names = generalNames.getNames();
        java.lang.String[] strArr = new java.lang.String[names.length];
        for (int i = 0; i < names.length; i++) {
            org.bouncycastle.asn1.ASN1Encodable name2 = names[i].getName();
            if (name2 instanceof org.bouncycastle.asn1.ASN1String) {
                strArr[i] = ((org.bouncycastle.asn1.ASN1String) name2).getString();
            } else {
                strArr[i] = name2.toString();
            }
        }
        return strArr;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getRoleAuthority() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.RoleSyntax getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.RoleSyntax) {
            return (org.bouncycastle.asn1.x509.RoleSyntax) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.RoleSyntax(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RoleSyntax(org.bouncycastle.asn1.x509.GeneralNames generalNames, org.bouncycastle.asn1.x509.GeneralName generalName) {
        if (generalName == null || generalName.getTagNo() != 6 || ((org.bouncycastle.asn1.ASN1String) generalName.getName()).getString().equals("")) {
            throw new java.lang.IllegalArgumentException("the role name MUST be non empty and MUST use the URI option of GeneralName");
        }
        this.getHighSpeedVideoFpsRanges = generalNames;
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
    }

    public RoleSyntax(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this(null, generalName);
    }

    private RoleSyntax(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new java.lang.IllegalArgumentException("Unknown tag in RoleSyntax");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject, true);
            }
        }
    }

    public RoleSyntax(java.lang.String str) {
        this(new org.bouncycastle.asn1.x509.GeneralName(6, str == null ? "" : str));
    }
}
