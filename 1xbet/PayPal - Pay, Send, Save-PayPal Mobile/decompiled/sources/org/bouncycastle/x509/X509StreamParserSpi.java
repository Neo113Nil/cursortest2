package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public abstract class X509StreamParserSpi {
    public abstract void engineInit(java.io.InputStream inputStream);

    public abstract java.lang.Object engineRead() throws org.bouncycastle.x509.util.StreamParsingException;

    public abstract java.util.Collection engineReadAll() throws org.bouncycastle.x509.util.StreamParsingException;
}
