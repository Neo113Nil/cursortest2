package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509Store implements org.bouncycastle.util.Store {
    private org.bouncycastle.x509.X509StoreSpi Camera2StreamConfigurationMap;
    private java.security.Provider getHighSpeedVideoFpsRangesFor;

    public static org.bouncycastle.x509.X509Store getInstance(java.lang.String str, org.bouncycastle.x509.X509StoreParameters x509StoreParameters) throws org.bouncycastle.x509.NoSuchStoreException {
        try {
            org.bouncycastle.x509.X509Util.Implementation Camera2StreamConfigurationMap = org.bouncycastle.x509.X509Util.Camera2StreamConfigurationMap("X509Store", str);
            org.bouncycastle.x509.X509StoreSpi x509StoreSpi = (org.bouncycastle.x509.X509StoreSpi) Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            x509StoreSpi.engineInit(x509StoreParameters);
            return new org.bouncycastle.x509.X509Store(Camera2StreamConfigurationMap.Camera2StreamConfigurationMap, x509StoreSpi);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.bouncycastle.x509.NoSuchStoreException(e.getMessage());
        }
    }

    public static org.bouncycastle.x509.X509Store getInstance(java.lang.String str, org.bouncycastle.x509.X509StoreParameters x509StoreParameters, java.security.Provider provider) throws org.bouncycastle.x509.NoSuchStoreException {
        try {
            org.bouncycastle.x509.X509Util.Implementation highSpeedVideoFpsRangesFor = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor("X509Store", str, provider);
            org.bouncycastle.x509.X509StoreSpi x509StoreSpi = (org.bouncycastle.x509.X509StoreSpi) highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            x509StoreSpi.engineInit(x509StoreParameters);
            return new org.bouncycastle.x509.X509Store(highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap, x509StoreSpi);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.bouncycastle.x509.NoSuchStoreException(e.getMessage());
        }
    }

    public java.security.Provider getProvider() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.util.Store
    public java.util.Collection getMatches(org.bouncycastle.util.Selector selector) {
        return this.Camera2StreamConfigurationMap.engineGetMatches(selector);
    }

    public static org.bouncycastle.x509.X509Store getInstance(java.lang.String str, org.bouncycastle.x509.X509StoreParameters x509StoreParameters, java.lang.String str2) throws org.bouncycastle.x509.NoSuchStoreException, java.security.NoSuchProviderException {
        return getInstance(str, x509StoreParameters, org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRanges(str2));
    }

    private X509Store(java.security.Provider provider, org.bouncycastle.x509.X509StoreSpi x509StoreSpi) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = x509StoreSpi;
    }
}
