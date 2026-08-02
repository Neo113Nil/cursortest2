package org.bouncycastle.eac.jcajce;

/* loaded from: classes17.dex */
class ProviderEACHelper implements org.bouncycastle.eac.jcajce.EACHelper {
    private final java.security.Provider Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.eac.jcajce.EACHelper
    public final java.security.KeyFactory Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        return java.security.KeyFactory.getInstance(str, this.Camera2StreamConfigurationMap);
    }

    ProviderEACHelper(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = provider;
    }
}
