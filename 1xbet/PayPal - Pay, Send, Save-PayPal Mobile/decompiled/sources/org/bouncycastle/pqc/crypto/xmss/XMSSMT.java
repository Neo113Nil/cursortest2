package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMT {
    private org.bouncycastle.pqc.crypto.xmss.XMSSParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters getHighSpeedVideoSizes;

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters, org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters) {
        new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRanges.getTreeDigestSize()], this.getHighSpeedVideoSizes.getPublicSeed());
        this.getHighSpeedVideoSizes = xMSSMTPrivateKeyParameters;
        this.getHighSpeedVideoFpsRangesFor = xMSSMTPublicKeyParameters;
    }

    public final void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("privateKey == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters build = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRanges).withPrivateKey(bArr).build();
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters build2 = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(this.getHighSpeedVideoFpsRanges).withPublicKey(bArr2).build();
        if (!org.bouncycastle.util.Arrays.areEqual(build.getRoot(), build2.getRoot())) {
            throw new java.lang.IllegalStateException("root of private key and public key do not match");
        }
        if (!org.bouncycastle.util.Arrays.areEqual(build.getPublicSeed(), build2.getPublicSeed())) {
            throw new java.lang.IllegalStateException("public seed of private key and public key do not match");
        }
        new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRanges.getTreeDigestSize()], build.getPublicSeed());
        this.getHighSpeedVideoSizes = build;
        this.getHighSpeedVideoFpsRangesFor = build2;
    }

    public final boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.text.ParseException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (bArr3 == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner xMSSMTSigner = new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner();
        xMSSMTSigner.init(false, new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
        return xMSSMTSigner.verifySignature(bArr, bArr2);
    }

    public final byte[] sign(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner xMSSMTSigner = new org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner();
        xMSSMTSigner.init(true, this.getHighSpeedVideoSizes);
        byte[] generateSignature = xMSSMTSigner.generateSignature(bArr);
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) xMSSMTSigner.getUpdatedPrivateKey();
        this.getHighSpeedVideoSizes = xMSSMTPrivateKeyParameters;
        getHighSpeedVideoFpsRanges(xMSSMTPrivateKeyParameters, this.getHighSpeedVideoFpsRangesFor);
        return generateSignature;
    }

    protected final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getXMSS() {
        return this.Camera2StreamConfigurationMap;
    }

    public final byte[] getPublicSeed() {
        return this.getHighSpeedVideoSizes.getPublicSeed();
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getParams() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void generateKeys() {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator xMSSMTKeyPairGenerator = new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator();
        xMSSMTKeyPairGenerator.init(new org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters(getParams(), this.getHighResolutionOutputSizeshNQ4ISI));
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = xMSSMTKeyPairGenerator.generateKeyPair();
        this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) generateKeyPair.getPrivate();
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) generateKeyPair.getPublic();
        this.getHighSpeedVideoFpsRangesFor = xMSSMTPublicKeyParameters;
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, xMSSMTPublicKeyParameters);
    }

    public final byte[] exportPublicKey() {
        return this.getHighSpeedVideoFpsRangesFor.toByteArray();
    }

    public final byte[] exportPrivateKey() {
        return this.getHighSpeedVideoSizes.toByteArray();
    }

    public XMSSMT(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters, java.security.SecureRandom secureRandom) {
        if (xMSSMTParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        this.getHighSpeedVideoFpsRanges = xMSSMTParameters;
        this.Camera2StreamConfigurationMap = xMSSMTParameters.getXMSSParameters();
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(xMSSMTParameters).build();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(xMSSMTParameters).build();
    }
}
