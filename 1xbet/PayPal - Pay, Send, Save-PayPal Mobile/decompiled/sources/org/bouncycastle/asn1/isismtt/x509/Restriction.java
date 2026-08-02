package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class Restriction extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x500.DirectoryString Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap.toASN1Primitive();
    }

    public org.bouncycastle.asn1.x500.DirectoryString getRestriction() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.isismtt.x509.Restriction getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.isismtt.x509.Restriction) {
            return (org.bouncycastle.asn1.isismtt.x509.Restriction) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.isismtt.x509.Restriction(org.bouncycastle.asn1.x500.DirectoryString.getInstance(obj));
        }
        return null;
    }

    private Restriction(org.bouncycastle.asn1.x500.DirectoryString directoryString) {
        this.Camera2StreamConfigurationMap = directoryString;
    }

    public Restriction(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x500.DirectoryString(str);
    }
}
