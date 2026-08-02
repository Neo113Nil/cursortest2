package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class DisplayText extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int CONTENT_TYPE_BMPSTRING = 1;
    public static final int CONTENT_TYPE_IA5STRING = 0;
    public static final int CONTENT_TYPE_UTF8STRING = 2;
    public static final int CONTENT_TYPE_VISIBLESTRING = 3;
    public static final int DISPLAY_TEXT_MAXIMUM_SIZE = 200;
    int getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1String getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return (org.bouncycastle.asn1.ASN1Primitive) this.getHighSpeedVideoSizes;
    }

    public java.lang.String getString() {
        return this.getHighSpeedVideoSizes.getString();
    }

    public static org.bouncycastle.asn1.x509.DisplayText getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getObject());
    }

    public static org.bouncycastle.asn1.x509.DisplayText getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ASN1String) {
            return new org.bouncycastle.asn1.x509.DisplayText((org.bouncycastle.asn1.ASN1String) obj);
        }
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.DisplayText)) {
            return (org.bouncycastle.asn1.x509.DisplayText) obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private DisplayText(org.bouncycastle.asn1.ASN1String aSN1String) {
        int i;
        this.getHighSpeedVideoSizes = aSN1String;
        if (aSN1String instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            i = 2;
        } else if (aSN1String instanceof org.bouncycastle.asn1.ASN1BMPString) {
            i = 1;
        } else if (aSN1String instanceof org.bouncycastle.asn1.ASN1IA5String) {
            i = 0;
        } else {
            if (!(aSN1String instanceof org.bouncycastle.asn1.ASN1VisibleString)) {
                throw new java.lang.IllegalArgumentException("unknown STRING type in DisplayText");
            }
            i = 3;
        }
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public DisplayText(java.lang.String str) {
        str = str.length() > 200 ? str.substring(0, 200) : str;
        this.getHighSpeedVideoFpsRangesFor = 2;
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERUTF8String(str);
    }

    public DisplayText(int i, java.lang.String str) {
        str = str.length() > 200 ? str.substring(0, 200) : str;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i != 0 ? i != 1 ? i != 2 ? i != 3 ? new org.bouncycastle.asn1.DERUTF8String(str) : new org.bouncycastle.asn1.DERVisibleString(str) : new org.bouncycastle.asn1.DERUTF8String(str) : new org.bouncycastle.asn1.DERBMPString(str) : new org.bouncycastle.asn1.DERIA5String(str);
    }
}
