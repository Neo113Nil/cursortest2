package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class GCFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private static final byte[] getHighSpeedVideoFpsRangesFor = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, com.google.common.base.Ascii.CAN, -2, -84, -108, 0, -19, 7, 18, com.visa.cbp.getEncExpo.startTransaction, -122, -36, -62, -17, 76, -87, 43};
    private boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.modes.CFBBlockCipher getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.getHighSpeedVideoSizes = 0L;
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize(), bArr2, i2);
        return this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoSizes = 0L;
        this.getHighResolutionOutputSizeshNQ4ISI.init(z, cipherParameters);
        this.Camera2StreamConfigurationMap = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithSBox) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithSBox) cipherParameters).getParameters();
        }
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.KeyParameter) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.String algorithmName = this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(algorithmName.substring(0, algorithmName.indexOf(47)));
        sb.append("/G");
        sb.append(algorithmName.substring(algorithmName.indexOf(47) + 1));
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        long j = this.getHighSpeedVideoSizes;
        if (j > 0 && j % okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE == 0) {
            org.bouncycastle.crypto.BlockCipher underlyingCipher = this.getHighResolutionOutputSizeshNQ4ISI.getUnderlyingCipher();
            underlyingCipher.init(false, this.getHighSpeedVideoFpsRanges);
            byte[] bArr = new byte[32];
            byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
            underlyingCipher.processBlock(bArr2, 0, bArr, 0);
            underlyingCipher.processBlock(bArr2, 8, bArr, 8);
            underlyingCipher.processBlock(bArr2, 16, bArr, 16);
            underlyingCipher.processBlock(bArr2, 24, bArr, 24);
            org.bouncycastle.crypto.params.KeyParameter keyParameter = new org.bouncycastle.crypto.params.KeyParameter(bArr);
            this.getHighSpeedVideoFpsRanges = keyParameter;
            underlyingCipher.init(true, keyParameter);
            byte[] currentIV = this.getHighResolutionOutputSizeshNQ4ISI.getCurrentIV();
            underlyingCipher.processBlock(currentIV, 0, currentIV, 0);
            this.getHighResolutionOutputSizeshNQ4ISI.init(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.params.ParametersWithIV(this.getHighSpeedVideoFpsRanges, currentIV));
        }
        this.getHighSpeedVideoSizes++;
        return this.getHighResolutionOutputSizeshNQ4ISI.calculateByte(b);
    }

    public GCFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        this.getHighSpeedVideoSizes = 0L;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.modes.CFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
