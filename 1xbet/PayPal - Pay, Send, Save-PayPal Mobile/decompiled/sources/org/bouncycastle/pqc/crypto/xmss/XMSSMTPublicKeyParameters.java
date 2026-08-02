package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSMTPublicKeyParameters extends org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyParameters implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getHighSpeedVideoFpsRanges;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = null;
        private byte[] getHighSpeedVideoFpsRangesFor = null;
        private byte[] getHighSpeedVideoSizes = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder withRoot(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder withPublicSeed(byte[] bArr) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder withPublicKey(byte[] bArr) {
            this.getHighSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters) {
            this.getHighSpeedVideoFpsRanges = xMSSMTParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.getHighResolutionOutputSizeshNQ4ISI.getTreeDigestSize();
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            org.bouncycastle.util.Pack.intToBigEndian(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoFpsRanges, i2);
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.Camera2StreamConfigurationMap, i2 + treeDigestSize);
        return bArr;
    }

    public final byte[] getRoot() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoFpsRanges);
    }

    public final byte[] getPublicSeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.Camera2StreamConfigurationMap);
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        return toByteArray();
    }

    /* synthetic */ XMSSMTPublicKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder builder, byte b) {
        this(builder);
    }

    private XMSSMTPublicKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder builder) {
        super(false, builder.getHighSpeedVideoFpsRanges.getTreeDigest());
        org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters xMSSMTParameters = builder.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.getHighSpeedVideoSizes;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            } else {
                int i = treeDigestSize + 4;
                if (bArr.length != i + treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("public key has wrong size");
                }
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0);
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
                this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i, treeDigestSize);
                return;
            }
        }
        if (xMSSMTParameters.getOid() != null) {
            this.getHighSpeedVideoFpsRangesFor = xMSSMTParameters.getOid().getOid();
        } else {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        byte[] bArr2 = builder.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr2 == null) {
            this.getHighSpeedVideoFpsRanges = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.getHighSpeedVideoFpsRanges = bArr2;
        }
        byte[] bArr3 = builder.getHighSpeedVideoFpsRangesFor;
        if (bArr3 == null) {
            this.Camera2StreamConfigurationMap = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.Camera2StreamConfigurationMap = bArr3;
        }
    }
}
