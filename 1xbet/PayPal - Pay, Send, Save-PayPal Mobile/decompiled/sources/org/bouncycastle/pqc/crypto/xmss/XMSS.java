package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSS {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.xmss.WOTSPlus getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters getHighSpeedVideoSizes;

    public XMSS(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters, java.security.SecureRandom secureRandom) {
        if (xMSSParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        this.getHighSpeedVideoFpsRangesFor = xMSSParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap = secureRandom;
    }

    protected void setIndex(int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(this.getHighSpeedVideoSizes.getSecretKeySeed()).withSecretKeyPRF(this.getHighSpeedVideoSizes.getSecretKeyPRF()).withPublicSeed(this.getHighSpeedVideoSizes.getPublicSeed()).withRoot(this.getHighSpeedVideoSizes.getRoot()).withBDSState(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor).build();
    }

    protected void setPublicSeed(byte[] bArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(this.getHighSpeedVideoSizes.getSecretKeySeed()).withSecretKeyPRF(this.getHighSpeedVideoSizes.getSecretKeyPRF()).withPublicSeed(bArr).withRoot(getRoot()).withBDSState(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor).build();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withRoot(getRoot()).withPublicSeed(bArr).build();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()], bArr);
    }

    protected void setRoot(byte[] bArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(this.getHighSpeedVideoSizes.getSecretKeySeed()).withSecretKeyPRF(this.getHighSpeedVideoSizes.getSecretKeyPRF()).withPublicSeed(getPublicSeed()).withRoot(bArr).withBDSState(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor).build();
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withRoot(bArr).withPublicSeed(getPublicSeed()).build();
    }

    protected org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature wotsSign(byte[] bArr, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()) {
            throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = this.getHighResolutionOutputSizeshNQ4ISI;
        wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getSecretKeySeed(), oTSHashAddress), getPublicSeed());
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(bArr, oTSHashAddress);
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.text.ParseException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (bArr3 == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSSigner xMSSSigner = new org.bouncycastle.pqc.crypto.xmss.XMSSSigner();
        xMSSSigner.init(false, new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
        return xMSSSigner.verifySignature(bArr, bArr2);
    }

    public byte[] sign(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSSigner xMSSSigner = new org.bouncycastle.pqc.crypto.xmss.XMSSSigner();
        xMSSSigner.init(true, this.getHighSpeedVideoSizes);
        byte[] generateSignature = xMSSSigner.generateSignature(bArr);
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) xMSSSigner.getUpdatedPrivateKey();
        this.getHighSpeedVideoSizes = xMSSPrivateKeyParameters;
        importState(xMSSPrivateKeyParameters, this.getHighSpeedVideoFpsRanges);
        return generateSignature;
    }

    public void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("privateKey == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters build = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withPrivateKey(bArr).build();
        org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters build2 = new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withPublicKey(bArr2).build();
        if (!org.bouncycastle.util.Arrays.areEqual(build.getRoot(), build2.getRoot())) {
            throw new java.lang.IllegalStateException("root of private key and public key do not match");
        }
        if (!org.bouncycastle.util.Arrays.areEqual(build.getPublicSeed(), build2.getPublicSeed())) {
            throw new java.lang.IllegalStateException("public seed of private key and public key do not match");
        }
        this.getHighSpeedVideoSizes = build;
        this.getHighSpeedVideoFpsRanges = build2;
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()], this.getHighSpeedVideoSizes.getPublicSeed());
    }

    public void importState(org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters, org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters) {
        if (!org.bouncycastle.util.Arrays.areEqual(xMSSPrivateKeyParameters.getRoot(), xMSSPublicKeyParameters.getRoot())) {
            throw new java.lang.IllegalStateException("root of private key and public key do not match");
        }
        if (!org.bouncycastle.util.Arrays.areEqual(xMSSPrivateKeyParameters.getPublicSeed(), xMSSPublicKeyParameters.getPublicSeed())) {
            throw new java.lang.IllegalStateException("public seed of private key and public key do not match");
        }
        this.getHighSpeedVideoSizes = xMSSPrivateKeyParameters;
        this.getHighSpeedVideoFpsRanges = xMSSPublicKeyParameters;
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()], this.getHighSpeedVideoSizes.getPublicSeed());
    }

    protected org.bouncycastle.pqc.crypto.xmss.WOTSPlus getWOTSPlus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getRoot() {
        return this.getHighSpeedVideoSizes.getRoot();
    }

    public byte[] getPublicSeed() {
        return this.getHighSpeedVideoSizes.getPublicSeed();
    }

    public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters getPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.pqc.crypto.xmss.XMSSParameters getParams() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getIndex() {
        return this.getHighSpeedVideoSizes.getIndex();
    }

    public void generateKeys() {
        org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator xMSSKeyPairGenerator = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator();
        xMSSKeyPairGenerator.init(new org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters(getParams(), this.Camera2StreamConfigurationMap));
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = xMSSKeyPairGenerator.generateKeyPair();
        this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) generateKeyPair.getPrivate();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) generateKeyPair.getPublic();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(new byte[this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize()], this.getHighSpeedVideoSizes.getPublicSeed());
    }

    public org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters exportPublicKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters exportPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }
}
