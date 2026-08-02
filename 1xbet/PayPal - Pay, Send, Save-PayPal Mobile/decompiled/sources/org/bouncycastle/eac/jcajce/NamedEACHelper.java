package org.bouncycastle.eac.jcajce;

/* loaded from: classes17.dex */
class NamedEACHelper implements org.bouncycastle.eac.jcajce.EACHelper {
    private final java.lang.String Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.eac.jcajce.EACHelper
    public final java.security.KeyFactory Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {
        return java.security.KeyFactory.getInstance(str, this.Camera2StreamConfigurationMap);
    }

    NamedEACHelper(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }
}
