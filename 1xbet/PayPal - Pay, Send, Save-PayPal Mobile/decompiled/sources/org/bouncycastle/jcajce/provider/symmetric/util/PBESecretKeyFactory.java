package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class PBESecretKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof javax.crypto.spec.PBEKeySpec)) {
            throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
        }
        javax.crypto.spec.PBEKeySpec pBEKeySpec = (javax.crypto.spec.PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, pBEKeySpec, null);
        }
        return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, pBEKeySpec, this.getHighResolutionOutputSizeshNQ4ISI ? org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(pBEKeySpec, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges) : org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(pBEKeySpec, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    public PBESecretKeyFactory(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, int i, int i2, int i3, int i4) {
        super(str, aSN1ObjectIdentifier);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getHighSpeedVideoFpsRanges = i4;
    }
}
