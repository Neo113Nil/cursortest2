package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509StoreCRLCollection extends org.bouncycastle.x509.X509StoreSpi {
    private org.bouncycastle.util.CollectionStore getHighSpeedVideoSizes;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof org.bouncycastle.x509.X509CollectionStoreParameters)) {
            throw new java.lang.IllegalArgumentException(x509StoreParameters.toString());
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.util.CollectionStore(((org.bouncycastle.x509.X509CollectionStoreParameters) x509StoreParameters).getCollection());
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector) {
        return this.getHighSpeedVideoSizes.getMatches(selector);
    }
}
