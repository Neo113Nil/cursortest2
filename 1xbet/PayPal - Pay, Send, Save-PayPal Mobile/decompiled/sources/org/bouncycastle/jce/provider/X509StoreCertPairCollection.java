package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509StoreCertPairCollection extends org.bouncycastle.x509.X509StoreSpi {
    private org.bouncycastle.util.CollectionStore getHighSpeedVideoSizes;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof org.bouncycastle.x509.X509CollectionStoreParameters) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.util.CollectionStore(((org.bouncycastle.x509.X509CollectionStoreParameters) x509StoreParameters).getCollection());
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization parameters must be an instance of ");
        sb.append(org.bouncycastle.x509.X509CollectionStoreParameters.class.getName());
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector) {
        return this.getHighSpeedVideoSizes.getMatches(selector);
    }
}
