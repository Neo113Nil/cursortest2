package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
class DefaultEACHelper extends org.bouncycastle.eac.operator.jcajce.EACHelper {
    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    protected final java.security.Signature Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        return java.security.Signature.getInstance(str);
    }

    DefaultEACHelper() {
    }
}
