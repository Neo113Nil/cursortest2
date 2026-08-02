package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSPrivateKeyParameters extends org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    volatile org.bouncycastle.pqc.crypto.xmss.BDS getHighSpeedVideoFpsRangesFor;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputMinFrameDuration;

    private XMSSPrivateKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder builder) {
        super(true, builder.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = builder.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = xMSSParameters;
        if (xMSSParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr != null) {
            int height = xMSSParameters.getHeight();
            int bigEndianToInt = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0);
            if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(height, bigEndianToInt)) {
                throw new java.lang.IllegalArgumentException("index out of bounds");
            }
            this.getOutputMinFrameDuration = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            int i = treeDigestSize + 4;
            this.getInputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i, treeDigestSize);
            int i2 = i + treeDigestSize;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i2, treeDigestSize);
            int i3 = i2 + treeDigestSize;
            this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize);
            int i4 = i3 + treeDigestSize;
            try {
                org.bouncycastle.pqc.crypto.xmss.BDS bds = (org.bouncycastle.pqc.crypto.xmss.BDS) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i4, bArr.length - i4), org.bouncycastle.pqc.crypto.xmss.BDS.class);
                if (bds.getIndex() != bigEndianToInt) {
                    throw new java.lang.IllegalStateException("serialized BDS has wrong index");
                }
                this.getHighSpeedVideoFpsRangesFor = bds.withWOTSDigest(builder.getHighSpeedVideoSizes.getTreeDigestOID());
                return;
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalArgumentException(e.getMessage(), e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArr2 = builder.getInputFormats;
        if (bArr2 == null) {
            this.getOutputMinFrameDuration = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.getOutputMinFrameDuration = bArr2;
        }
        byte[] bArr3 = builder.getOutputFormats;
        if (bArr3 == null) {
            this.getInputSizeshNQ4ISI = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.getInputSizeshNQ4ISI = bArr3;
        }
        byte[] bArr4 = builder.getInputSizeshNQ4ISI;
        if (bArr4 == null) {
            this.getHighSpeedVideoFpsRanges = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.getHighSpeedVideoFpsRanges = bArr4;
        }
        byte[] bArr5 = builder.getHighSpeedVideoSizesFor;
        if (bArr5 == null) {
            this.Camera2StreamConfigurationMap = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.Camera2StreamConfigurationMap = bArr5;
        }
        org.bouncycastle.pqc.crypto.xmss.BDS bds2 = builder.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = bds2 == null ? (builder.getHighSpeedVideoFpsRangesFor >= (1 << xMSSParameters.getHeight()) + (-2) || bArr4 == null || bArr2 == null) ? new org.bouncycastle.pqc.crypto.xmss.BDS(xMSSParameters, (1 << xMSSParameters.getHeight()) - 1, builder.getHighSpeedVideoFpsRangesFor) : new org.bouncycastle.pqc.crypto.xmss.BDS(xMSSParameters, bArr4, bArr2, (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().build(), builder.getHighSpeedVideoFpsRangesFor) : bds2;
        if (builder.getHighSpeedVideoFpsRanges >= 0 && builder.getHighSpeedVideoFpsRanges != this.getHighSpeedVideoFpsRangesFor.getMaxIndex()) {
            throw new java.lang.IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoSizes;
        private int getHighSpeedVideoFpsRangesFor = 0;
        private int getHighSpeedVideoFpsRanges = -1;
        private byte[] getInputFormats = null;
        private byte[] getOutputFormats = null;
        private byte[] getInputSizeshNQ4ISI = null;
        private byte[] getHighSpeedVideoSizesFor = null;
        private org.bouncycastle.pqc.crypto.xmss.BDS Camera2StreamConfigurationMap = null;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withSecretKeySeed(byte[] bArr) {
            this.getInputFormats = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withSecretKeyPRF(byte[] bArr) {
            this.getOutputFormats = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withRoot(byte[] bArr) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withPublicSeed(byte[] bArr) {
            this.getInputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withPrivateKey(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withMaxIndex(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withIndex(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withBDSState(org.bouncycastle.pqc.crypto.xmss.BDS bds) {
            this.Camera2StreamConfigurationMap = bds;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters) {
            this.getHighSpeedVideoSizes = xMSSParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        byte[] concatenate;
        synchronized (this) {
            int treeDigestSize = this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize();
            int i = treeDigestSize + 4;
            int i2 = i + treeDigestSize;
            int i3 = i2 + treeDigestSize;
            byte[] bArr = new byte[treeDigestSize + i3];
            org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor.getIndex(), bArr, 0);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getOutputMinFrameDuration, 4);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getInputSizeshNQ4ISI, i);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoFpsRanges, i2);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.Camera2StreamConfigurationMap, i3);
            try {
                concatenate = org.bouncycastle.util.Arrays.concatenate(bArr, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.serialize(this.getHighSpeedVideoFpsRangesFor));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new java.lang.RuntimeException(sb.toString());
            }
        }
        return concatenate;
    }

    final org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getIndex() < this.getHighSpeedVideoFpsRangesFor.getMaxIndex() ? this.getHighSpeedVideoFpsRangesFor.getNextState(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().build()) : new org.bouncycastle.pqc.crypto.xmss.BDS(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getMaxIndex(), this.getHighSpeedVideoFpsRangesFor.getMaxIndex() + 1);
        }
        return this;
    }

    public final long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.getHighSpeedVideoFpsRangesFor.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    public final byte[] getSecretKeySeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getOutputMinFrameDuration);
    }

    public final byte[] getSecretKeyPRF() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getInputSizeshNQ4ISI);
    }

    public final byte[] getRoot() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.Camera2StreamConfigurationMap);
    }

    public final byte[] getPublicSeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoFpsRanges);
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters getNextKey() {
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
    }

    public final int getIndex() {
        return this.getHighSpeedVideoFpsRangesFor.getIndex();
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters extractKeyShard(int i) {
        org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters build;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j = i;
            if (j > getUsagesRemaining()) {
                throw new java.lang.IllegalArgumentException("usageCount exceeds usages remaining");
            }
            build = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(this.getHighResolutionOutputSizeshNQ4ISI).withSecretKeySeed(this.getOutputMinFrameDuration).withSecretKeyPRF(this.getInputSizeshNQ4ISI).withPublicSeed(this.getHighSpeedVideoFpsRanges).withRoot(this.Camera2StreamConfigurationMap).withIndex(getIndex()).withBDSState(this.getHighSpeedVideoFpsRangesFor.withMaxIndex((this.getHighSpeedVideoFpsRangesFor.getIndex() + i) - 1, this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestOID())).build();
            if (j == getUsagesRemaining()) {
                this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.xmss.BDS(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getMaxIndex(), getIndex() + i);
            } else {
                org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().build();
                for (int i2 = 0; i2 != i; i2++) {
                    this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getNextState(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, oTSHashAddress);
                }
            }
        }
        return build;
    }

    /* synthetic */ XMSSPrivateKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder builder, byte b) {
        this(builder);
    }
}
