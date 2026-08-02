package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSTypedStream {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    protected java.io.InputStream _in;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.io.InputStream getContentStream() {
        return this._in;
    }

    public void drain() throws java.io.IOException {
        org.bouncycastle.util.io.Streams.drain(this._in);
        this._in.close();
    }

    public CMSTypedStream(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.InputStream inputStream, int i) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this._in = new org.bouncycastle.cms.CMSTypedStream.FullReaderStream(new java.io.BufferedInputStream(inputStream, i));
    }

    public CMSTypedStream(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.InputStream inputStream) {
        this(aSN1ObjectIdentifier, inputStream, 32768);
    }

    protected CMSTypedStream(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
    }

    static class FullReaderStream extends java.io.FilterInputStream {
        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (i2 == 0) {
                return 0;
            }
            int readFully = org.bouncycastle.util.io.Streams.readFully(((java.io.FilterInputStream) this).in, bArr, i, i2);
            if (readFully > 0) {
                return readFully;
            }
            return -1;
        }

        FullReaderStream(java.io.InputStream inputStream) {
            super(inputStream);
        }
    }

    public CMSTypedStream(java.lang.String str, java.io.InputStream inputStream, int i) {
        this(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), inputStream, i);
    }

    public CMSTypedStream(java.lang.String str, java.io.InputStream inputStream) {
        this(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), inputStream, 32768);
    }

    public CMSTypedStream(java.io.InputStream inputStream) {
        this(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.data.getId(), inputStream, 32768);
    }
}
