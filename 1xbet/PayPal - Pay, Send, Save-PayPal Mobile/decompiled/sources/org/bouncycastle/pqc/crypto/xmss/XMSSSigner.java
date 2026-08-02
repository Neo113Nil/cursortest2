package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSSigner implements org.bouncycastle.pqc.crypto.StateAwareMessageSigner {
    private org.bouncycastle.pqc.crypto.xmss.XMSSParameters Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions getHighSpeedVideoSizes;
    private org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters getHighSpeedVideoSizesFor;
    private org.bouncycastle.pqc.crypto.xmss.WOTSPlus getOutputFormats;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] byteArray;
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("signer not initialized for signature generation");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        if (xMSSPrivateKeyParameters == null) {
            throw new java.lang.IllegalStateException("signing key no longer usable");
        }
        synchronized (xMSSPrivateKeyParameters) {
            if (this.getHighSpeedVideoFpsRangesFor.getUsagesRemaining() <= 0) {
                throw new org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException("no usages of private key remaining");
            }
            if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getAuthenticationPath().isEmpty()) {
                throw new java.lang.IllegalStateException("not initialized");
            }
            try {
                int index = this.getHighSpeedVideoFpsRangesFor.getIndex();
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                long j = index;
                byte[] highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getSecretKeyPRF(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(j, 32));
                byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor.getRoot(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(j, this.Camera2StreamConfigurationMap.getTreeDigestSize()));
                org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions keyedHashFunctions = this.getHighSpeedVideoSizes;
                if (concatenate.length != keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI * 3) {
                    throw new java.lang.IllegalArgumentException("wrong key length");
                }
                byte[] highResolutionOutputSizeshNQ4ISI = keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI(2, concatenate, bArr);
                org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withOTSAddress(index).build();
                if (highResolutionOutputSizeshNQ4ISI.length != this.Camera2StreamConfigurationMap.getTreeDigestSize()) {
                    throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
                }
                if (oTSHashAddress == null) {
                    throw new java.lang.NullPointerException("otsHashAddress == null");
                }
                org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = this.getOutputFormats;
                wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getSecretKeySeed(), oTSHashAddress), this.getHighSpeedVideoFpsRangesFor.getPublicSeed());
                byteArray = new org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder(this.Camera2StreamConfigurationMap).withIndex(index).withRandom(highSpeedVideoFpsRangesFor).withWOTSPlusSignature(this.getOutputFormats.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, oTSHashAddress)).withAuthPath(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getAuthenticationPath()).build().toByteArray();
            } finally {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters parameters;
        if (z) {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoFpsRangesFor = xMSSPrivateKeyParameters;
            parameters = xMSSPrivateKeyParameters.getParameters();
        } else {
            this.getHighSpeedVideoFpsRanges = false;
            org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizesFor = xMSSPublicKeyParameters;
            parameters = xMSSPublicKeyParameters.getParameters();
        }
        this.Camera2StreamConfigurationMap = parameters;
        org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(parameters.Camera2StreamConfigurationMap);
        this.getOutputFormats = wOTSPlus;
        this.getHighSpeedVideoSizes = wOTSPlus.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        org.bouncycastle.pqc.crypto.xmss.XMSSSignature build = new org.bouncycastle.pqc.crypto.xmss.XMSSSignature.Builder(this.Camera2StreamConfigurationMap).withSignature(bArr2).build();
        int index = build.getIndex();
        this.getOutputFormats.getHighSpeedVideoFpsRanges(new byte[this.Camera2StreamConfigurationMap.getTreeDigestSize()], this.getHighSpeedVideoSizesFor.getPublicSeed());
        long j = index;
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(build.getRandom(), this.getHighSpeedVideoSizesFor.getRoot(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(j, this.Camera2StreamConfigurationMap.getTreeDigestSize()));
        org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions keyedHashFunctions = this.getHighSpeedVideoSizes;
        if (concatenate.length != keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI * 3) {
            throw new java.lang.IllegalArgumentException("wrong key length");
        }
        byte[] highResolutionOutputSizeshNQ4ISI = keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI(2, concatenate, bArr);
        int height = this.Camera2StreamConfigurationMap.getHeight();
        return org.bouncycastle.util.Arrays.constantTimeAreEqual(org.bouncycastle.pqc.crypto.xmss.XMSSVerifierUtil.getHighSpeedVideoSizes(this.getOutputFormats, height, highResolutionOutputSizeshNQ4ISI, build, (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withOTSAddress(index).build(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(j, height)).getValue(), this.getHighSpeedVideoSizesFor.getRoot());
    }

    public long getUsagesRemaining() {
        return this.getHighSpeedVideoFpsRangesFor.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getUpdatedPrivateKey() {
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                xMSSPrivateKeyParameters = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = null;
            } else {
                xMSSPrivateKeyParameters = this.getHighSpeedVideoFpsRangesFor;
                if (xMSSPrivateKeyParameters != null) {
                    this.getHighSpeedVideoFpsRangesFor = xMSSPrivateKeyParameters.getNextKey();
                }
            }
        }
        return xMSSPrivateKeyParameters;
    }
}
