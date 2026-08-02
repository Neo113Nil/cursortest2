package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public class XMSSMTSigner implements org.bouncycastle.pqc.crypto.StateAwareMessageSigner {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters getHighSpeedVideoSizes;
    private org.bouncycastle.pqc.crypto.xmss.XMSSParameters getInputFormats;
    private org.bouncycastle.pqc.crypto.xmss.WOTSPlus getOutputMinFrameDuration;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] byteArray;
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        if (!this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("signer not initialized for signature generation");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = this.getHighSpeedVideoSizes;
        if (xMSSMTPrivateKeyParameters == null) {
            throw new java.lang.IllegalStateException("signing key no longer usable");
        }
        synchronized (xMSSMTPrivateKeyParameters) {
            if (this.getHighSpeedVideoSizes.getUsagesRemaining() <= 0) {
                throw new java.lang.IllegalStateException("no usages of private key remaining");
            }
            if (this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                throw new java.lang.IllegalStateException("not initialized");
            }
            try {
                org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                long index = this.getHighSpeedVideoSizes.getIndex();
                this.getHighResolutionOutputSizeshNQ4ISI.getHeight();
                int height = this.getInputFormats.getHeight();
                if (this.getHighSpeedVideoSizes.getUsagesRemaining() <= 0) {
                    throw new java.lang.IllegalStateException("index out of bounds");
                }
                byte[] highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.getSecretKeyPRF(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(index, 32));
                byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getRoot(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(index, this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize()));
                org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions keyedHashFunctions = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
                if (concatenate.length != keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI * 3) {
                    throw new java.lang.IllegalArgumentException("wrong key length");
                }
                byte[] highResolutionOutputSizeshNQ4ISI = keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI(2, concatenate, bArr);
                this.getHighSpeedVideoFpsRangesFor = true;
                org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature build = new org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder(this.getHighResolutionOutputSizeshNQ4ISI).withIndex(index).withRandom(highSpeedVideoFpsRangesFor).build();
                long treeIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(index, height);
                int leafIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(index, height);
                this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(new byte[this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize()], this.getHighSpeedVideoSizes.getPublicSeed());
                org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
                if (bDSStateMap.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(0)) == null || leafIndex == 0) {
                    bDSStateMap.getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(0), new org.bouncycastle.pqc.crypto.xmss.BDS(this.getInputFormats, this.getHighSpeedVideoSizes.getPublicSeed(), this.getHighSpeedVideoSizes.getSecretKeySeed(), oTSHashAddress));
                }
                build.getReducedSignatures().add(new org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder(this.getInputFormats).withWOTSPlusSignature(getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI, oTSHashAddress)).withAuthPath(bDSStateMap.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(0)).getAuthenticationPath()).build());
                for (int i = 1; i < this.getHighResolutionOutputSizeshNQ4ISI.getLayers(); i++) {
                    org.bouncycastle.pqc.crypto.xmss.XMSSNode root = bDSStateMap.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(i - 1)).getRoot();
                    int leafIndex2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(treeIndex, height);
                    treeIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(treeIndex, height);
                    org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress2 = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(i).withTreeAddress(treeIndex).withOTSAddress(leafIndex2).build();
                    org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature highSpeedVideoSizes = getHighSpeedVideoSizes(root.getValue(), oTSHashAddress2);
                    if (bDSStateMap.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(i)) == null || org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isNewBDSInitNeeded(index, height, i)) {
                        bDSStateMap.getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.util.Integers.valueOf(i), new org.bouncycastle.pqc.crypto.xmss.BDS(this.getInputFormats, this.getHighSpeedVideoSizes.getPublicSeed(), this.getHighSpeedVideoSizes.getSecretKeySeed(), oTSHashAddress2));
                    }
                    build.getReducedSignatures().add(new org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder(this.getInputFormats).withWOTSPlusSignature(highSpeedVideoSizes).withAuthPath(bDSStateMap.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(i)).getAuthenticationPath()).build());
                }
                byteArray = build.toByteArray();
            } finally {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("message == null");
        }
        if (bArr2 == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.NullPointerException("publicKey == null");
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature build = new org.bouncycastle.pqc.crypto.xmss.XMSSMTSignature.Builder(this.getHighResolutionOutputSizeshNQ4ISI).withSignature(bArr2).build();
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(build.getRandom(), this.getHighSpeedVideoFpsRanges.getRoot(), org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(build.getIndex(), this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize()));
        org.bouncycastle.pqc.crypto.xmss.KeyedHashFunctions keyedHashFunctions = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
        if (concatenate.length != keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI * 3) {
            throw new java.lang.IllegalArgumentException("wrong key length");
        }
        byte[] highResolutionOutputSizeshNQ4ISI = keyedHashFunctions.getHighResolutionOutputSizeshNQ4ISI(2, concatenate, bArr);
        long index = build.getIndex();
        int height = this.getInputFormats.getHeight();
        long treeIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(index, height);
        int leafIndex = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(index, height);
        this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(new byte[this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize()], this.getHighSpeedVideoFpsRanges.getPublicSeed());
        org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
        org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSVerifierUtil.getHighSpeedVideoSizes(this.getOutputMinFrameDuration, height, highResolutionOutputSizeshNQ4ISI, build.getReducedSignatures().get(0), oTSHashAddress, leafIndex);
        int i = 1;
        while (i < this.getHighResolutionOutputSizeshNQ4ISI.getLayers()) {
            org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature xMSSReducedSignature = build.getReducedSignatures().get(i);
            int leafIndex2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getLeafIndex(treeIndex, height);
            long treeIndex2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getTreeIndex(treeIndex, height);
            highSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSVerifierUtil.getHighSpeedVideoSizes(this.getOutputMinFrameDuration, height, highSpeedVideoSizes.getValue(), xMSSReducedSignature, (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(i).withTreeAddress(treeIndex2).withOTSAddress(leafIndex2).build(), leafIndex2);
            i++;
            treeIndex = treeIndex2;
        }
        return org.bouncycastle.util.Arrays.constantTimeAreEqual(highSpeedVideoSizes.getValue(), this.getHighSpeedVideoFpsRanges.getRoot());
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters parameters;
        if (z) {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor = false;
            org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizes = xMSSMTPrivateKeyParameters;
            parameters = xMSSMTPrivateKeyParameters.getParameters();
        } else {
            this.Camera2StreamConfigurationMap = false;
            org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) cipherParameters;
            this.getHighSpeedVideoFpsRanges = xMSSMTPublicKeyParameters;
            parameters = xMSSMTPublicKeyParameters.getParameters();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = parameters;
        this.getInputFormats = parameters.getXMSSParameters();
        this.getOutputMinFrameDuration = this.getHighResolutionOutputSizeshNQ4ISI.getWOTSPlus();
    }

    public long getUsagesRemaining() {
        return this.getHighSpeedVideoSizes.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getUpdatedPrivateKey() {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters;
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters nextKey;
        if (!this.getHighSpeedVideoFpsRangesFor) {
            xMSSMTPrivateKeyParameters = this.getHighSpeedVideoSizes;
            nextKey = xMSSMTPrivateKeyParameters != null ? xMSSMTPrivateKeyParameters.getNextKey() : null;
            return xMSSMTPrivateKeyParameters;
        }
        xMSSMTPrivateKeyParameters = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = nextKey;
        return xMSSMTPrivateKeyParameters;
    }

    private org.bouncycastle.pqc.crypto.xmss.WOTSPlusSignature getHighSpeedVideoSizes(byte[] bArr, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize()) {
            throw new java.lang.IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = this.getOutputMinFrameDuration;
        wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getSecretKeySeed(), oTSHashAddress), this.getHighSpeedVideoSizes.getPublicSeed());
        return this.getOutputMinFrameDuration.getHighSpeedVideoSizes(bArr, oTSHashAddress);
    }
}
