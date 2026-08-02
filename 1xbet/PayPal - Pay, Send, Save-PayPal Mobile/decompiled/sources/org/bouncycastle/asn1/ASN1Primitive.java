package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Primitive extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return this;
    }

    abstract boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive);

    abstract boolean getHighResolutionOutputSizeshNQ4ISI();

    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return this;
    }

    abstract int getHighSpeedVideoSizes(boolean z) throws java.io.IOException;

    abstract void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException;

    @Override // org.bouncycastle.asn1.ASN1Object
    public abstract int hashCode();

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this;
    }

    public final boolean equals(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return this == aSN1Primitive || Camera2StreamConfigurationMap(aSN1Primitive);
    }

    public final boolean equals(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (this != aSN1Encodable) {
            return aSN1Encodable != null && Camera2StreamConfigurationMap(aSN1Encodable.toASN1Primitive());
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.bouncycastle.asn1.ASN1Encodable) && Camera2StreamConfigurationMap(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive());
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public void encodeTo(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1OutputStream.create(outputStream, str).getHighSpeedVideoFpsRanges(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public void encodeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1OutputStream.create(outputStream).getHighSpeedVideoFpsRanges(this);
    }

    public static org.bouncycastle.asn1.ASN1Primitive fromByteArray(byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream(bArr);
        try {
            org.bouncycastle.asn1.ASN1Primitive readObject = aSN1InputStream.readObject();
            if (aSN1InputStream.available() == 0) {
                return readObject;
            }
            throw new java.io.IOException("Extra data detected in stream");
        } catch (java.lang.ClassCastException unused) {
            throw new java.io.IOException("cannot recognise object in stream");
        }
    }

    ASN1Primitive() {
    }
}
