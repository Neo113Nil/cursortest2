package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public abstract class X509StoreSpi {
    public abstract java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector);

    public abstract void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters);
}
