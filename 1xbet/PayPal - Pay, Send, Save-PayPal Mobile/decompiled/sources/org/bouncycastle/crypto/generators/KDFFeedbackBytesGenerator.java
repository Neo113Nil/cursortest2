package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class KDFFeedbackBytesGenerator implements org.bouncycastle.crypto.MacDerivationFunction {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizesFor;
    private final org.bouncycastle.crypto.Mac getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private int getOutputMinFrameDuration;
    private boolean getOutputStallDuration;
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(androidx.collection.SieveCacheKt.NodeLinkMask);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.KDFFeedbackParameters)) {
            throw new java.lang.IllegalArgumentException("Wrong type of arguments given");
        }
        org.bouncycastle.crypto.params.KDFFeedbackParameters kDFFeedbackParameters = (org.bouncycastle.crypto.params.KDFFeedbackParameters) derivationParameters;
        this.getInputFormats.init(new org.bouncycastle.crypto.params.KeyParameter(kDFFeedbackParameters.getKI()));
        this.getHighSpeedVideoFpsRangesFor = kDFFeedbackParameters.getFixedInputData();
        int r = kDFFeedbackParameters.getR();
        this.getInputSizeshNQ4ISI = new byte[r / 8];
        int i = Integer.MAX_VALUE;
        if (kDFFeedbackParameters.useCounter()) {
            java.math.BigInteger multiply = Camera2StreamConfigurationMap.pow(r).multiply(java.math.BigInteger.valueOf(this.getHighSpeedVideoFpsRanges));
            if (multiply.compareTo(getHighSpeedVideoSizes) != 1) {
                i = multiply.intValue();
            }
        }
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoSizesFor = kDFFeedbackParameters.getIV();
        this.getOutputStallDuration = kDFFeedbackParameters.useCounter();
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public org.bouncycastle.crypto.Mac getMac() {
        return this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.getOutputMinFrameDuration) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Current KDFCTR may only be used for ");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(" bytes");
            throw new org.bouncycastle.crypto.DataLengthException(sb.toString());
        }
        if (i3 % this.getHighSpeedVideoFpsRanges == 0) {
            getHighSpeedVideoSizes();
        }
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = this.getHighSpeedVideoFpsRanges;
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
            min = java.lang.Math.min(this.getHighSpeedVideoFpsRanges, i8);
            java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, i, min);
            this.getHighResolutionOutputSizeshNQ4ISI += min;
            i8 -= min;
        }
    }

    private void getHighSpeedVideoSizes() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            org.bouncycastle.crypto.Mac mac = this.getInputFormats;
            byte[] bArr = this.getHighSpeedVideoSizesFor;
            mac.update(bArr, 0, bArr.length);
        } else {
            org.bouncycastle.crypto.Mac mac2 = this.getInputFormats;
            byte[] bArr2 = this.getOutputFormats;
            mac2.update(bArr2, 0, bArr2.length);
        }
        if (this.getOutputStallDuration) {
            int i = (this.getHighResolutionOutputSizeshNQ4ISI / this.getHighSpeedVideoFpsRanges) + 1;
            byte[] bArr3 = this.getInputSizeshNQ4ISI;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new java.lang.IllegalStateException("Unsupported size of counter i");
                        }
                        bArr3[0] = (byte) (i >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i;
            this.getInputFormats.update(bArr3, 0, bArr3.length);
        }
        org.bouncycastle.crypto.Mac mac3 = this.getInputFormats;
        byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
        mac3.update(bArr4, 0, bArr4.length);
        this.getInputFormats.doFinal(this.getOutputFormats, 0);
    }

    public KDFFeedbackBytesGenerator(org.bouncycastle.crypto.Mac mac) {
        this.getInputFormats = mac;
        int macSize = mac.getMacSize();
        this.getHighSpeedVideoFpsRanges = macSize;
        this.getOutputFormats = new byte[macSize];
    }
}
