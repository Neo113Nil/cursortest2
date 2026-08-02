package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class KDFCounterBytesGenerator implements org.bouncycastle.crypto.MacDerivationFunction {
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(androidx.collection.SieveCacheKt.NodeLinkMask);
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(2);
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final org.bouncycastle.crypto.Mac getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private byte[] getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.KDFCounterParameters)) {
            throw new java.lang.IllegalArgumentException("Wrong type of arguments given");
        }
        org.bouncycastle.crypto.params.KDFCounterParameters kDFCounterParameters = (org.bouncycastle.crypto.params.KDFCounterParameters) derivationParameters;
        this.getInputSizeshNQ4ISI.init(new org.bouncycastle.crypto.params.KeyParameter(kDFCounterParameters.getKI()));
        this.getHighResolutionOutputSizeshNQ4ISI = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.getHighSpeedVideoFpsRanges = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r = kDFCounterParameters.getR();
        this.getHighSpeedVideoSizesFor = new byte[r / 8];
        java.math.BigInteger multiply = getHighSpeedVideoSizes.pow(r).multiply(java.math.BigInteger.valueOf(this.getInputFormats));
        this.getOutputFormats = multiply.compareTo(Camera2StreamConfigurationMap) == 1 ? Integer.MAX_VALUE : multiply.intValue();
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public org.bouncycastle.crypto.Mac getMac() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Current KDFCTR may only be used for ");
            sb.append(this.getOutputFormats);
            sb.append(" bytes");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        if (i3 % this.getInputFormats == 0) {
            getHighSpeedVideoSizes();
        }
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        int i6 = this.getInputFormats;
        int i7 = i5 % i6;
        int min = java.lang.Math.min(i6 - i7, i2);
        java.lang.System.arraycopy(this.getOutputMinFrameDuration, i7, bArr, i, min);
        this.getHighSpeedVideoFpsRangesFor += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            getHighSpeedVideoSizes();
            min = java.lang.Math.min(this.getInputFormats, i8);
            java.lang.System.arraycopy(this.getOutputMinFrameDuration, 0, bArr, i, min);
            this.getHighSpeedVideoFpsRangesFor += min;
            i8 -= min;
        }
    }

    private void getHighSpeedVideoSizes() {
        int i = (this.getHighSpeedVideoFpsRangesFor / this.getInputFormats) + 1;
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new java.lang.IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i;
        org.bouncycastle.crypto.Mac mac = this.getInputSizeshNQ4ISI;
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        mac.update(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.Mac mac2 = this.getInputSizeshNQ4ISI;
        byte[] bArr3 = this.getHighSpeedVideoSizesFor;
        mac2.update(bArr3, 0, bArr3.length);
        org.bouncycastle.crypto.Mac mac3 = this.getInputSizeshNQ4ISI;
        byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
        mac3.update(bArr4, 0, bArr4.length);
        this.getInputSizeshNQ4ISI.doFinal(this.getOutputMinFrameDuration, 0);
    }

    public KDFCounterBytesGenerator(org.bouncycastle.crypto.Mac mac) {
        this.getInputSizeshNQ4ISI = mac;
        int macSize = mac.getMacSize();
        this.getInputFormats = macSize;
        this.getOutputMinFrameDuration = new byte[macSize];
    }
}
