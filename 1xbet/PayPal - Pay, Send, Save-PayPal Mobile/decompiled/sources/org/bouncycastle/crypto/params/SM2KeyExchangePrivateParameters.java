package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class SM2KeyExchangePrivateParameters implements org.bouncycastle.crypto.CipherParameters {
    private final org.bouncycastle.crypto.params.ECPrivateKeyParameters Camera2StreamConfigurationMap;
    private final org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.math.ec.ECPoint getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighSpeedVideoSizes;

    public boolean isInitiator() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.math.ec.ECPoint getStaticPublicPoint() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.crypto.params.ECPrivateKeyParameters getStaticPrivateKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.math.ec.ECPoint getEphemeralPublicPoint() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.params.ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }

    public SM2KeyExchangePrivateParameters(boolean z, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters, org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters2) {
        if (eCPrivateKeyParameters == null) {
            throw new java.lang.NullPointerException("staticPrivateKey cannot be null");
        }
        if (eCPrivateKeyParameters2 == null) {
            throw new java.lang.NullPointerException("ephemeralPrivateKey cannot be null");
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            throw new java.lang.IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        org.bouncycastle.math.ec.FixedPointCombMultiplier fixedPointCombMultiplier = new org.bouncycastle.math.ec.FixedPointCombMultiplier();
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = eCPrivateKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters.getD()).normalize();
        this.getHighSpeedVideoSizes = eCPrivateKeyParameters2;
        this.getHighSpeedVideoFpsRangesFor = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters2.getD()).normalize();
    }
}
