package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class CMac implements org.bouncycastle.crypto.Mac {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private org.bouncycastle.crypto.BlockCipher getInputSizeshNQ4ISI;
    private int getOutputFormats;

    public CMac(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        int i2;
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > blockCipher.getBlockSize() * 8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MAC size must be less or equal to ");
            sb.append(blockCipher.getBlockSize() * 8);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getInputSizeshNQ4ISI = new org.bouncycastle.crypto.modes.CBCBlockCipher(blockCipher);
        this.getOutputFormats = i / 8;
        int blockSize = blockCipher.getBlockSize() * 8;
        switch (blockSize) {
            case 64:
            case 320:
                i2 = 27;
                break;
            case 128:
            case 192:
                i2 = 135;
                break;
            case 160:
                i2 = 45;
                break;
            case 224:
                i2 = 777;
                break;
            case 256:
                i2 = org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST;
                break;
            case 384:
                i2 = 4109;
                break;
            case 448:
                i2 = com.knotapi.knot.utilities.Constants.ID_SIMPLE_MOBILE;
                break;
            case 512:
                i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE;
                break;
            case com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                i2 = 655377;
                break;
            case 1024:
                i2 = 524355;
                break;
            case 2048:
                i2 = 548865;
                break;
            default:
                throw new java.lang.IllegalArgumentException("Unknown block size for CMAC: ".concat(java.lang.String.valueOf(blockSize)));
        }
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Pack.intToBigEndian(i2);
        this.getInputFormats = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoSizes = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i2 = (-i) & 255;
                int length2 = bArr.length - 3;
                byte b = bArr2[length2];
                byte[] bArr3 = this.getHighSpeedVideoSizesFor;
                bArr2[length2] = (byte) (b ^ (bArr3[1] & i2));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) ((bArr3[2] & i2) ^ bArr2[length3]);
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((i2 & bArr3[3]) ^ bArr2[length4]);
                return bArr2;
            }
            int i3 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i3 << 1));
            i = (i3 >>> 7) & 1;
        }
    }

    void getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = this.getInputSizeshNQ4ISI.getBlockSize();
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i3, i4);
            this.getInputSizeshNQ4ISI.processBlock(this.getHighSpeedVideoSizes, 0, this.getInputFormats, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                this.getInputSizeshNQ4ISI.processBlock(bArr, i, this.getInputFormats, 0);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, i2);
        this.getHighResolutionOutputSizeshNQ4ISI += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (i == bArr.length) {
            this.getInputSizeshNQ4ISI.processBlock(bArr, 0, this.getInputFormats, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i >= bArr.length) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputSizeshNQ4ISI.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        getHighSpeedVideoFpsRanges(cipherParameters);
        this.getInputSizeshNQ4ISI.init(true, cipherParameters);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        byte[] bArr2 = new byte[bArr.length];
        this.getInputSizeshNQ4ISI.processBlock(bArr, 0, bArr2, 0);
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr2);
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return this.getInputSizeshNQ4ISI.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.getHighResolutionOutputSizeshNQ4ISI == this.getInputSizeshNQ4ISI.getBlockSize()) {
            bArr2 = this.getHighSpeedVideoFpsRangesFor;
        } else {
            new org.bouncycastle.crypto.paddings.ISO7816d4Padding().addPadding(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            bArr2 = this.getHighSpeedVideoFpsRanges;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.getInputFormats;
            if (i2 >= bArr3.length) {
                this.getInputSizeshNQ4ISI.processBlock(this.getHighSpeedVideoSizes, 0, bArr3, 0);
                java.lang.System.arraycopy(this.getInputFormats, 0, bArr, i, this.getOutputFormats);
                reset();
                return this.getOutputFormats;
            }
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr2[i2]);
            i2++;
        }
    }

    public CMac(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
