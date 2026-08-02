package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTPrivateKeyParameters extends org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyParameters implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final byte[] Camera2StreamConfigurationMap;
    volatile org.bouncycastle.pqc.crypto.xmss.BDSStateMap getHighResolutionOutputSizeshNQ4ISI;
    private volatile long getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizesFor;
    private volatile boolean getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighResolutionOutputSizeshNQ4ISI;
        private long Camera2StreamConfigurationMap = 0;
        private long getHighSpeedVideoFpsRangesFor = -1;
        private byte[] getInputFormats = null;
        private byte[] getInputSizeshNQ4ISI = null;
        private byte[] getOutputFormats = null;
        private byte[] getOutputMinFrameDuration = null;
        private org.bouncycastle.pqc.crypto.xmss.BDSStateMap getHighSpeedVideoSizes = null;
        private byte[] getHighSpeedVideoFpsRanges = null;
        private org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoSizesFor = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withSecretKeySeed(byte[] bArr) {
            this.getInputFormats = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withSecretKeyPRF(byte[] bArr) {
            this.getInputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withRoot(byte[] bArr) {
            this.getOutputMinFrameDuration = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withPublicSeed(byte[] bArr) {
            this.getOutputFormats = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withPrivateKey(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            this.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI.getXMSSParameters();
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withMaxIndex(long j) {
            this.getHighSpeedVideoFpsRangesFor = j;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withIndex(long j) {
            this.Camera2StreamConfigurationMap = j;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withBDSState(org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap) {
            if (bDSStateMap.getMaxIndex() == 0) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(bDSStateMap, (1 << this.getHighResolutionOutputSizeshNQ4ISI.getHeight()) - 1);
                return this;
            }
            this.getHighSpeedVideoSizes = bDSStateMap;
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters) {
            this.getHighResolutionOutputSizeshNQ4ISI = xMSSMTParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        byte[] concatenate;
        synchronized (this) {
            int treeDigestSize = this.getHighSpeedVideoFpsRangesFor.getTreeDigestSize();
            int height = (this.getHighSpeedVideoFpsRangesFor.getHeight() + 7) / 8;
            int i = height + treeDigestSize;
            int i2 = i + treeDigestSize;
            int i3 = i2 + treeDigestSize;
            byte[] bArr = new byte[treeDigestSize + i3];
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(this.getHighSpeedVideoFpsRanges, height), 0);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getOutputMinFrameDuration, height);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoSizesFor, i);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.Camera2StreamConfigurationMap, i2);
            org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getOutputFormats, i3);
            try {
                concatenate = org.bouncycastle.util.Arrays.concatenate(bArr, org.bouncycastle.pqc.crypto.xmss.XMSSUtil.serialize(this.getHighResolutionOutputSizeshNQ4ISI));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("error serializing bds state: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        }
        return concatenate;
    }

    final org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters getHighSpeedVideoFpsRangesFor() {
        synchronized (this) {
            if (getIndex() < this.getHighResolutionOutputSizeshNQ4ISI.getMaxIndex()) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
                this.getHighSpeedVideoFpsRanges++;
            } else {
                this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getMaxIndex() + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(this.getHighResolutionOutputSizeshNQ4ISI.getMaxIndex());
            }
            this.getInputSizeshNQ4ISI = false;
        }
        return this;
    }

    public final long getUsagesRemaining() {
        long maxIndex;
        long index;
        synchronized (this) {
            maxIndex = this.getHighResolutionOutputSizeshNQ4ISI.getMaxIndex();
            index = getIndex();
        }
        return (maxIndex - index) + 1;
    }

    public final byte[] getSecretKeySeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getOutputMinFrameDuration);
    }

    public final byte[] getSecretKeyPRF() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoSizesFor);
    }

    public final byte[] getRoot() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getOutputFormats);
    }

    public final byte[] getPublicSeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.Camera2StreamConfigurationMap);
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters getNextKey() {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
    }

    public final long getIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters extractKeyShard(int i) {
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters build;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j = i;
            if (j > getUsagesRemaining()) {
                throw new java.lang.IllegalArgumentException("usageCount exceeds usages remaining");
            }
            build = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(this.getHighSpeedVideoFpsRangesFor).withSecretKeySeed(this.getOutputMinFrameDuration).withSecretKeyPRF(this.getHighSpeedVideoSizesFor).withPublicSeed(this.Camera2StreamConfigurationMap).withRoot(this.getOutputFormats).withIndex(getIndex()).withBDSState(new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(this.getHighResolutionOutputSizeshNQ4ISI, (getIndex() + j) - 1)).build();
            for (int i2 = 0; i2 != i; i2++) {
                getHighSpeedVideoFpsRangesFor();
            }
        }
        return build;
    }

    /* synthetic */ XMSSMTPrivateKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder builder, byte b) {
        this(builder);
    }

    private XMSSMTPrivateKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder builder) {
        super(true, builder.getHighResolutionOutputSizeshNQ4ISI.getTreeDigest());
        org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.getHighSpeedVideoFpsRanges;
        if (bArr == null) {
            this.getHighSpeedVideoFpsRanges = builder.Camera2StreamConfigurationMap;
            byte[] bArr2 = builder.getInputFormats;
            if (bArr2 == null) {
                this.getOutputMinFrameDuration = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                this.getOutputMinFrameDuration = bArr2;
            }
            byte[] bArr3 = builder.getInputSizeshNQ4ISI;
            if (bArr3 == null) {
                this.getHighSpeedVideoSizesFor = new byte[treeDigestSize];
            } else {
                if (bArr3.length != treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                this.getHighSpeedVideoSizesFor = bArr3;
            }
            byte[] bArr4 = builder.getOutputFormats;
            if (bArr4 == null) {
                this.Camera2StreamConfigurationMap = new byte[treeDigestSize];
            } else {
                if (bArr4.length != treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                this.Camera2StreamConfigurationMap = bArr4;
            }
            byte[] bArr5 = builder.getOutputMinFrameDuration;
            if (bArr5 == null) {
                this.getOutputFormats = new byte[treeDigestSize];
            } else {
                if (bArr5.length != treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("size of root needs to be equal size of digest");
                }
                this.getOutputFormats = bArr5;
            }
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap = builder.getHighSpeedVideoSizes;
            if (bDSStateMap == null) {
                if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), builder.Camera2StreamConfigurationMap) || bArr4 == null || bArr2 == null) {
                    bDSStateMap = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(builder.getHighSpeedVideoFpsRangesFor + 1);
                } else {
                    bDSStateMap = new org.bouncycastle.pqc.crypto.xmss.BDSStateMap(xMSSMTParameters, builder.Camera2StreamConfigurationMap, bArr4, bArr2);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bDSStateMap;
            if (builder.getHighSpeedVideoFpsRangesFor >= 0 && builder.getHighSpeedVideoFpsRangesFor != this.getHighResolutionOutputSizeshNQ4ISI.getMaxIndex()) {
                throw new java.lang.IllegalArgumentException("maxIndex set but not reflected in state");
            }
            return;
        }
        if (builder.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.NullPointerException("xmss == null");
        }
        int height = xMSSMTParameters.getHeight();
        int i = (height + 7) / 8;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.bytesToXBigEndian(bArr, 0, i);
        if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(height, this.getHighSpeedVideoFpsRanges)) {
            throw new java.lang.IllegalArgumentException("index out of bounds");
        }
        this.getOutputMinFrameDuration = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i, treeDigestSize);
        int i2 = i + treeDigestSize;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i2, treeDigestSize);
        int i3 = i2 + treeDigestSize;
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize);
        int i4 = i3 + treeDigestSize;
        this.getOutputFormats = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i4, treeDigestSize);
        int i5 = i4 + treeDigestSize;
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = ((org.bouncycastle.pqc.crypto.xmss.BDSStateMap) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i5, bArr.length - i5), org.bouncycastle.pqc.crypto.xmss.BDSStateMap.class)).withWOTSDigest(builder.getHighSpeedVideoSizesFor.getTreeDigestOID());
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage(), e);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.IllegalArgumentException(e2.getMessage(), e2);
        }
    }
}
