package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class X509KeyUsage extends org.bouncycastle.asn1.ASN1Object {
    public static final int cRLSign = 2;
    public static final int dataEncipherment = 16;
    public static final int decipherOnly = 32768;
    public static final int digitalSignature = 128;
    public static final int encipherOnly = 1;
    public static final int keyAgreement = 8;
    public static final int keyCertSign = 4;
    public static final int keyEncipherment = 32;
    public static final int nonRepudiation = 64;
    private int Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.x509.KeyUsage(this.Camera2StreamConfigurationMap).toASN1Primitive();
    }

    public X509KeyUsage(int i) {
        this.Camera2StreamConfigurationMap = i;
    }
}
