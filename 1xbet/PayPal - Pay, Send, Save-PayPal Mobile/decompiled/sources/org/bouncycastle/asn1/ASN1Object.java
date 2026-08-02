package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Object implements org.bouncycastle.asn1.ASN1Encodable, org.bouncycastle.util.Encodable {
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public abstract org.bouncycastle.asn1.ASN1Primitive toASN1Primitive();

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    public byte[] getEncoded(java.lang.String str) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            return toASN1Primitive().equals(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive());
        }
        return false;
    }

    public void encodeTo(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        toASN1Primitive().encodeTo(outputStream, str);
    }

    public void encodeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        toASN1Primitive().encodeTo(outputStream);
    }

    public static boolean hasEncodedTagValue(java.lang.Object obj, int i) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i;
    }
}
