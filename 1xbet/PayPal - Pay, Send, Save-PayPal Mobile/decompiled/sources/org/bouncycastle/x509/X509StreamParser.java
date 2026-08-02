package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509StreamParser implements org.bouncycastle.x509.util.StreamParser {
    private org.bouncycastle.x509.X509StreamParserSpi Camera2StreamConfigurationMap;
    private java.security.Provider getHighSpeedVideoFpsRangesFor;

    public static org.bouncycastle.x509.X509StreamParser getInstance(java.lang.String str) throws org.bouncycastle.x509.NoSuchParserException {
        try {
            org.bouncycastle.x509.X509Util.Implementation Camera2StreamConfigurationMap = org.bouncycastle.x509.X509Util.Camera2StreamConfigurationMap("X509StreamParser", str);
            return new org.bouncycastle.x509.X509StreamParser(Camera2StreamConfigurationMap.Camera2StreamConfigurationMap, (org.bouncycastle.x509.X509StreamParserSpi) Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.bouncycastle.x509.NoSuchParserException(e.getMessage());
        }
    }

    public static org.bouncycastle.x509.X509StreamParser getInstance(java.lang.String str, java.security.Provider provider) throws org.bouncycastle.x509.NoSuchParserException {
        try {
            org.bouncycastle.x509.X509Util.Implementation highSpeedVideoFpsRangesFor = org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRangesFor("X509StreamParser", str, provider);
            return new org.bouncycastle.x509.X509StreamParser(highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap, (org.bouncycastle.x509.X509StreamParserSpi) highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.bouncycastle.x509.NoSuchParserException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.x509.util.StreamParser
    public java.util.Collection readAll() throws org.bouncycastle.x509.util.StreamParsingException {
        return this.Camera2StreamConfigurationMap.engineReadAll();
    }

    @Override // org.bouncycastle.x509.util.StreamParser
    public java.lang.Object read() throws org.bouncycastle.x509.util.StreamParsingException {
        return this.Camera2StreamConfigurationMap.engineRead();
    }

    public void init(byte[] bArr) {
        this.Camera2StreamConfigurationMap.engineInit(new java.io.ByteArrayInputStream(bArr));
    }

    public void init(java.io.InputStream inputStream) {
        this.Camera2StreamConfigurationMap.engineInit(inputStream);
    }

    public java.security.Provider getProvider() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.x509.X509StreamParser getInstance(java.lang.String str, java.lang.String str2) throws org.bouncycastle.x509.NoSuchParserException, java.security.NoSuchProviderException {
        return getInstance(str, org.bouncycastle.x509.X509Util.getHighSpeedVideoFpsRanges(str2));
    }

    private X509StreamParser(java.security.Provider provider, org.bouncycastle.x509.X509StreamParserSpi x509StreamParserSpi) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = x509StreamParserSpi;
    }
}
