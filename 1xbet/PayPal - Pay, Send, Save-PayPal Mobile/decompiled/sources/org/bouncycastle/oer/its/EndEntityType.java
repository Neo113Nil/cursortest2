package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class EndEntityType extends org.bouncycastle.asn1.ASN1Object {

    /* renamed from: app, reason: collision with root package name */
    public static final int f7052app = 128;
    public static final int enrol = 64;
    private final org.bouncycastle.asn1.ASN1BitString Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.EndEntityType getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.EndEntityType) {
            return (org.bouncycastle.oer.its.EndEntityType) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.EndEntityType(org.bouncycastle.asn1.DERBitString.getInstance(obj));
        }
        return null;
    }

    public EndEntityType(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.Camera2StreamConfigurationMap = dERBitString;
    }

    public EndEntityType(int i) {
        this(new org.bouncycastle.asn1.DERBitString(i));
    }
}
