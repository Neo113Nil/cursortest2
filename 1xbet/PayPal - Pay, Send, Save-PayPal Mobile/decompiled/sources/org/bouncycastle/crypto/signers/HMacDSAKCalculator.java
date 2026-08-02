package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class HMacDSAKCalculator implements org.bouncycastle.crypto.signers.DSAKCalculator {
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    private final byte[] Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.macs.HMac getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return true;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public java.math.BigInteger nextK() {
        int unsignedByteLength = org.bouncycastle.util.BigIntegers.getUnsignedByteLength(this.getHighResolutionOutputSizeshNQ4ISI);
        byte[] bArr = new byte[unsignedByteLength];
        while (true) {
            int i = 0;
            while (i < unsignedByteLength) {
                org.bouncycastle.crypto.macs.HMac hMac = this.getHighSpeedVideoFpsRanges;
                byte[] bArr2 = this.Camera2StreamConfigurationMap;
                hMac.update(bArr2, 0, bArr2.length);
                this.getHighSpeedVideoFpsRanges.doFinal(this.Camera2StreamConfigurationMap, 0);
                int min = java.lang.Math.min(unsignedByteLength - i, this.Camera2StreamConfigurationMap.length);
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, bArr, i, min);
                i += min;
            }
            java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
            if (highSpeedVideoFpsRanges.compareTo(getHighSpeedVideoSizes) > 0 && highSpeedVideoFpsRanges.compareTo(this.getHighResolutionOutputSizeshNQ4ISI) < 0) {
                return highSpeedVideoFpsRanges;
            }
            org.bouncycastle.crypto.macs.HMac hMac2 = this.getHighSpeedVideoFpsRanges;
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            hMac2.update(bArr3, 0, bArr3.length);
            this.getHighSpeedVideoFpsRanges.update((byte) 0);
            this.getHighSpeedVideoFpsRanges.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
            this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KeyParameter(this.getHighSpeedVideoFpsRangesFor));
            org.bouncycastle.crypto.macs.HMac hMac3 = this.getHighSpeedVideoFpsRanges;
            byte[] bArr4 = this.Camera2StreamConfigurationMap;
            hMac3.update(bArr4, 0, bArr4.length);
            this.getHighSpeedVideoFpsRanges.doFinal(this.Camera2StreamConfigurationMap, 0);
        }
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 1);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        int unsignedByteLength = org.bouncycastle.util.BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr2 = new byte[unsignedByteLength];
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger2);
        java.lang.System.arraycopy(asUnsignedByteArray, 0, bArr2, unsignedByteLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
        byte[] bArr3 = new byte[unsignedByteLength];
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        if (highSpeedVideoFpsRanges.compareTo(bigInteger) >= 0) {
            highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.subtract(bigInteger);
        }
        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(highSpeedVideoFpsRanges);
        java.lang.System.arraycopy(asUnsignedByteArray2, 0, bArr3, unsignedByteLength - asUnsignedByteArray2.length, asUnsignedByteArray2.length);
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KeyParameter(this.getHighSpeedVideoFpsRangesFor));
        org.bouncycastle.crypto.macs.HMac hMac = this.getHighSpeedVideoFpsRanges;
        byte[] bArr4 = this.Camera2StreamConfigurationMap;
        hMac.update(bArr4, 0, bArr4.length);
        this.getHighSpeedVideoFpsRanges.update((byte) 0);
        this.getHighSpeedVideoFpsRanges.update(bArr2, 0, unsignedByteLength);
        this.getHighSpeedVideoFpsRanges.update(bArr3, 0, unsignedByteLength);
        this.getHighSpeedVideoFpsRanges.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KeyParameter(this.getHighSpeedVideoFpsRangesFor));
        org.bouncycastle.crypto.macs.HMac hMac2 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr5 = this.Camera2StreamConfigurationMap;
        hMac2.update(bArr5, 0, bArr5.length);
        this.getHighSpeedVideoFpsRanges.doFinal(this.Camera2StreamConfigurationMap, 0);
        org.bouncycastle.crypto.macs.HMac hMac3 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr6 = this.Camera2StreamConfigurationMap;
        hMac3.update(bArr6, 0, bArr6.length);
        this.getHighSpeedVideoFpsRanges.update((byte) 1);
        this.getHighSpeedVideoFpsRanges.update(bArr2, 0, unsignedByteLength);
        this.getHighSpeedVideoFpsRanges.update(bArr3, 0, unsignedByteLength);
        this.getHighSpeedVideoFpsRanges.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KeyParameter(this.getHighSpeedVideoFpsRangesFor));
        org.bouncycastle.crypto.macs.HMac hMac4 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr7 = this.Camera2StreamConfigurationMap;
        hMac4.update(bArr7, 0, bArr7.length);
        this.getHighSpeedVideoFpsRanges.doFinal(this.Camera2StreamConfigurationMap, 0);
    }

    private java.math.BigInteger getHighSpeedVideoFpsRanges(byte[] bArr) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        return bArr.length * 8 > this.getHighResolutionOutputSizeshNQ4ISI.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.getHighResolutionOutputSizeshNQ4ISI.bitLength()) : bigInteger;
    }

    public HMacDSAKCalculator(org.bouncycastle.crypto.Digest digest) {
        org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(digest);
        this.getHighSpeedVideoFpsRanges = hMac;
        this.Camera2StreamConfigurationMap = new byte[hMac.getMacSize()];
        this.getHighSpeedVideoFpsRangesFor = new byte[hMac.getMacSize()];
    }
}
