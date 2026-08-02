package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class KDFDoublePipelineIterationBytesGenerator implements org.bouncycastle.crypto.MacDerivationFunction {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private final org.bouncycastle.crypto.Mac getOutputMinFrameDuration;
    private boolean getOutputSizeshNQ4ISI;
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(androidx.collection.SieveCacheKt.NodeLinkMask);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters)) {
            throw new java.lang.IllegalArgumentException("Wrong type of arguments given");
        }
        org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters) derivationParameters;
        this.getOutputMinFrameDuration.init(new org.bouncycastle.crypto.params.KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.getHighSpeedVideoFpsRanges = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r = kDFDoublePipelineIterationParameters.getR();
        this.getHighSpeedVideoSizesFor = new byte[r / 8];
        int i = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            java.math.BigInteger multiply = Camera2StreamConfigurationMap.pow(r).multiply(java.math.BigInteger.valueOf(this.getInputFormats));
            if (multiply.compareTo(getHighSpeedVideoFpsRangesFor) != 1) {
                i = multiply.intValue();
            }
        }
        this.getInputSizeshNQ4ISI = i;
        this.getOutputSizeshNQ4ISI = kDFDoublePipelineIterationParameters.useCounter();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public org.bouncycastle.crypto.Mac getMac() {
        return this.getOutputMinFrameDuration;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.getInputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Current KDFCTR may only be used for ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(" bytes");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        if (i3 % this.getInputFormats == 0) {
            getHighSpeedVideoSizes();
        }
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = this.getInputFormats;
        int i7 = i5 % i6;
        int min = java.lang.Math.min(i6 - i7, i2);
        java.lang.System.arraycopy(this.getOutputFormats, i7, bArr, i, min);
        this.getHighResolutionOutputSizeshNQ4ISI += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            getHighSpeedVideoSizes();
            min = java.lang.Math.min(this.getInputFormats, i8);
            java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, i, min);
            this.getHighResolutionOutputSizeshNQ4ISI += min;
            i8 -= min;
        }
    }

    private void getHighSpeedVideoSizes() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            org.bouncycastle.crypto.Mac mac = this.getOutputMinFrameDuration;
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            mac.update(bArr, 0, bArr.length);
            this.getOutputMinFrameDuration.doFinal(this.getHighSpeedVideoSizes, 0);
        } else {
            org.bouncycastle.crypto.Mac mac2 = this.getOutputMinFrameDuration;
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            mac2.update(bArr2, 0, bArr2.length);
            this.getOutputMinFrameDuration.doFinal(this.getHighSpeedVideoSizes, 0);
        }
        org.bouncycastle.crypto.Mac mac3 = this.getOutputMinFrameDuration;
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.getOutputSizeshNQ4ISI) {
            int i = (this.getHighResolutionOutputSizeshNQ4ISI / this.getInputFormats) + 1;
            byte[] bArr4 = this.getHighSpeedVideoSizesFor;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new java.lang.IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i;
            this.getOutputMinFrameDuration.update(bArr4, 0, bArr4.length);
        }
        org.bouncycastle.crypto.Mac mac4 = this.getOutputMinFrameDuration;
        byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
        mac4.update(bArr5, 0, bArr5.length);
        this.getOutputMinFrameDuration.doFinal(this.getOutputFormats, 0);
    }

    public KDFDoublePipelineIterationBytesGenerator(org.bouncycastle.crypto.Mac mac) {
        this.getOutputMinFrameDuration = mac;
        int macSize = mac.getMacSize();
        this.getInputFormats = macSize;
        this.getHighSpeedVideoSizes = new byte[macSize];
        this.getOutputFormats = new byte[macSize];
    }
}
