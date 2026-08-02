package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class RawEncodedKeySpec extends java.security.spec.EncodedKeySpec {
    @Override // java.security.spec.EncodedKeySpec
    public java.lang.String getFormat() {
        return "RAW";
    }

    public RawEncodedKeySpec(byte[] bArr) {
        super(bArr);
    }
}
