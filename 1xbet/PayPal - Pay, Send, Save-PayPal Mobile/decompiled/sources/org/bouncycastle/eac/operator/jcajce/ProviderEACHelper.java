package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
class ProviderEACHelper extends org.bouncycastle.eac.operator.jcajce.EACHelper {
    private final java.security.Provider Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    protected final java.security.Signature Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        return java.security.Signature.getInstance(str, this.Camera2StreamConfigurationMap);
    }

    ProviderEACHelper(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = provider;
    }
}
