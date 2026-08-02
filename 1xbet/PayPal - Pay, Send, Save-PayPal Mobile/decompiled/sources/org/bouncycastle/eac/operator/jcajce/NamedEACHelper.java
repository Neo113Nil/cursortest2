package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
class NamedEACHelper extends org.bouncycastle.eac.operator.jcajce.EACHelper {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    protected final java.security.Signature Camera2StreamConfigurationMap(java.lang.String str) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {
        return java.security.Signature.getInstance(str, this.getHighSpeedVideoFpsRangesFor);
    }

    NamedEACHelper(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
