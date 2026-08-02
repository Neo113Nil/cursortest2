package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class XMSSPublicKeyParameters extends org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters implements org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface, org.bouncycastle.util.Encodable {
    private final int Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    private XMSSPublicKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder builder) {
        super(false, builder.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters = builder.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = xMSSParameters;
        if (xMSSParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.getHighSpeedVideoFpsRanges;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            } else {
                int i = treeDigestSize + 4;
                if (bArr.length != i + treeDigestSize) {
                    throw new java.lang.IllegalArgumentException("public key has wrong size");
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 0);
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(bArr, i, treeDigestSize);
                return;
            }
        }
        if (xMSSParameters.getHighSpeedVideoFpsRangesFor != null) {
            this.Camera2StreamConfigurationMap = xMSSParameters.getHighSpeedVideoFpsRangesFor.getOid();
        } else {
            this.Camera2StreamConfigurationMap = 0;
        }
        byte[] bArr2 = builder.getHighSpeedVideoFpsRangesFor;
        if (bArr2 == null) {
            this.getHighSpeedVideoFpsRangesFor = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.getHighSpeedVideoFpsRangesFor = bArr2;
        }
        byte[] bArr3 = builder.Camera2StreamConfigurationMap;
        if (bArr3 == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new java.lang.IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bArr3;
        }
    }

    public static class Builder {
        private final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getHighSpeedVideoSizes;
        private byte[] getHighSpeedVideoFpsRangesFor = null;
        private byte[] Camera2StreamConfigurationMap = null;
        private byte[] getHighSpeedVideoFpsRanges = null;

        public org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder withRoot(byte[] bArr) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder withPublicSeed(byte[] bArr) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder withPublicKey(byte[] bArr) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
            return this;
        }

        public org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters build() {
            return new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters(this, (byte) 0);
        }

        public Builder(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters) {
            this.getHighSpeedVideoSizes = xMSSParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public final byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.getHighSpeedVideoFpsRanges.getTreeDigestSize();
        int i = this.Camera2StreamConfigurationMap;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            org.bouncycastle.util.Pack.intToBigEndian(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighSpeedVideoFpsRangesFor, i2);
        org.bouncycastle.pqc.crypto.xmss.XMSSUtil.copyBytesAtOffset(bArr, this.getHighResolutionOutputSizeshNQ4ISI, i2 + treeDigestSize);
        return bArr;
    }

    public final byte[] getRoot() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighSpeedVideoFpsRangesFor);
    }

    public final byte[] getPublicSeed() {
        return org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final org.bouncycastle.pqc.crypto.xmss.XMSSParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws java.io.IOException {
        return toByteArray();
    }

    /* synthetic */ XMSSPublicKeyParameters(org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder builder, byte b) {
        this(builder);
    }
}
