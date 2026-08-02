package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
abstract class SPHINCSPlusEngine {
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final int getHighSpeedVideoSizesFor;
    final int getInputFormats;
    final int getInputSizeshNQ4ISI;
    final int getOutputFormats;
    final int getOutputMinFrameDuration;
    final boolean getOutputMinFrameDurationlomOqCM;
    final int getOutputSizes;
    final int getOutputStallDurationlomOqCM = 4;

    abstract byte[] Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2);

    abstract byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2, byte[] bArr3);

    abstract byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3);

    abstract org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    abstract byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs);

    abstract byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2);

    static class Sha256Engine extends org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine {
        private final byte[] getOutputSizeshNQ4ISI;
        private final byte[] getOutputStallDuration;
        private final org.bouncycastle.crypto.generators.MGF1BytesGenerator getValidOutputFormatsForInputhNQ4ISI;
        private final byte[] isOutputSupportedFor;
        private final org.bouncycastle.crypto.macs.HMac isOutputSupportedForhNQ4ISI;
        private final org.bouncycastle.crypto.Digest toString;
        private final org.bouncycastle.crypto.Digest unwrapAs;

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i = ((this.getHighResolutionOutputSizeshNQ4ISI * this.getHighSpeedVideoSizes) + 7) / 8;
            int i2 = this.Camera2StreamConfigurationMap / this.getHighSpeedVideoFpsRanges;
            int i3 = this.Camera2StreamConfigurationMap - i2;
            int i4 = (i2 + 7) / 8;
            int i5 = (i3 + 7) / 8;
            int i6 = i + i4 + i5;
            byte[] bArr5 = new byte[i6];
            byte[] bArr6 = new byte[this.toString.getDigestSize()];
            this.toString.update(bArr, 0, bArr.length);
            this.toString.update(bArr2, 0, bArr2.length);
            this.toString.update(bArr3, 0, bArr3.length);
            this.toString.update(bArr4, 0, bArr4.length);
            this.toString.doFinal(bArr6, 0);
            byte[] bArr7 = new byte[i6];
            this.getValidOutputFormatsForInputhNQ4ISI.init(new org.bouncycastle.crypto.params.MGFParameters(org.bouncycastle.util.Arrays.concatenate(bArr, bArr2, bArr6)));
            this.getValidOutputFormatsForInputhNQ4ISI.generateBytes(bArr7, 0, i6);
            for (int i7 = 0; i7 < i6; i7++) {
                bArr7[i7] = (byte) (bArr7[i7] ^ bArr5[i7]);
            }
            byte[] bArr8 = new byte[8];
            java.lang.System.arraycopy(bArr7, i, bArr8, 8 - i5, i5);
            long bigEndianToLong = org.bouncycastle.util.Pack.bigEndianToLong(bArr8, 0);
            byte[] bArr9 = new byte[4];
            java.lang.System.arraycopy(bArr7, i5 + i, bArr9, 4 - i4, i4);
            return new org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest(bigEndianToLong & ((-1) >>> (64 - i3)), org.bouncycastle.util.Pack.bigEndianToInt(bArr9, 0) & ((-1) >>> (32 - i2)), org.bouncycastle.util.Arrays.copyOfRange(bArr7, 0, i));
        }

        private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            org.bouncycastle.crypto.generators.MGF1BytesGenerator mGF1BytesGenerator = new org.bouncycastle.crypto.generators.MGF1BytesGenerator(new org.bouncycastle.crypto.digests.SHA256Digest());
            mGF1BytesGenerator.init(new org.bouncycastle.crypto.params.MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            for (int i = 0; i < bArr2.length; i++) {
                bArr3[i] = (byte) (bArr3[i] ^ bArr2[i]);
            }
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2) {
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(adrs);
            if (this.getOutputMinFrameDurationlomOqCM) {
                bArr2 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.util.Arrays.concatenate(bArr, highSpeedVideoFpsRanges), bArr2);
            }
            this.unwrapAs.update(bArr, 0, bArr.length);
            this.unwrapAs.update(this.isOutputSupportedFor, 0, 64 - this.getHighSpeedVideoSizesFor);
            this.unwrapAs.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
            this.unwrapAs.update(bArr2, 0, bArr2.length);
            this.unwrapAs.doFinal(this.getOutputSizeshNQ4ISI, 0);
            return org.bouncycastle.util.Arrays.copyOfRange(this.getOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.isOutputSupportedForhNQ4ISI.init(new org.bouncycastle.crypto.params.KeyParameter(bArr));
            this.isOutputSupportedForhNQ4ISI.update(bArr2, 0, bArr2.length);
            this.isOutputSupportedForhNQ4ISI.update(bArr3, 0, bArr3.length);
            this.isOutputSupportedForhNQ4ISI.doFinal(this.getOutputStallDuration, 0);
            return org.bouncycastle.util.Arrays.copyOfRange(this.getOutputStallDuration, 0, this.getHighSpeedVideoSizesFor);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
            int length = bArr.length;
            this.unwrapAs.update(bArr, 0, bArr.length);
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(adrs);
            this.unwrapAs.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
            this.unwrapAs.doFinal(this.getOutputSizeshNQ4ISI, 0);
            return org.bouncycastle.util.Arrays.copyOfRange(this.getOutputSizeshNQ4ISI, 0, length);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr2, bArr3);
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(adrs);
            if (this.getOutputMinFrameDurationlomOqCM) {
                concatenate = getHighSpeedVideoFpsRangesFor(org.bouncycastle.util.Arrays.concatenate(bArr, highSpeedVideoFpsRanges), concatenate);
            }
            this.unwrapAs.update(bArr, 0, bArr.length);
            this.unwrapAs.update(this.isOutputSupportedFor, 0, 64 - this.getHighSpeedVideoSizesFor);
            this.unwrapAs.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
            this.unwrapAs.update(concatenate, 0, concatenate.length);
            this.unwrapAs.doFinal(this.getOutputSizeshNQ4ISI, 0);
            return org.bouncycastle.util.Arrays.copyOfRange(this.getOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public final byte[] Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2) {
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(adrs);
            if (this.getOutputMinFrameDurationlomOqCM) {
                bArr2 = getHighSpeedVideoFpsRangesFor(org.bouncycastle.util.Arrays.concatenate(bArr, highSpeedVideoFpsRanges), bArr2);
            }
            this.unwrapAs.update(bArr, 0, bArr.length);
            this.unwrapAs.update(this.isOutputSupportedFor, 0, 64 - bArr.length);
            this.unwrapAs.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
            this.unwrapAs.update(bArr2, 0, bArr2.length);
            this.unwrapAs.doFinal(this.getOutputSizeshNQ4ISI, 0);
            return org.bouncycastle.util.Arrays.copyOfRange(this.getOutputSizeshNQ4ISI, 0, this.getHighSpeedVideoSizesFor);
        }

        private static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
            byte[] bArr = new byte[22];
            java.lang.System.arraycopy(adrs.getHighSpeedVideoFpsRanges, 3, bArr, 0, 1);
            java.lang.System.arraycopy(adrs.getHighSpeedVideoFpsRanges, 8, bArr, 1, 8);
            java.lang.System.arraycopy(adrs.getHighSpeedVideoFpsRanges, 19, bArr, 9, 1);
            java.lang.System.arraycopy(adrs.getHighSpeedVideoFpsRanges, 20, bArr, 10, 12);
            return bArr;
        }

        public Sha256Engine(boolean z, int i, int i2, int i3, int i4, int i5) {
            super(z, i, 16, i2, i3, i4, i5);
            org.bouncycastle.crypto.generators.MGF1BytesGenerator mGF1BytesGenerator;
            this.isOutputSupportedFor = new byte[64];
            org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest = new org.bouncycastle.crypto.digests.SHA256Digest();
            this.unwrapAs = sHA256Digest;
            if (i == 32) {
                this.toString = new org.bouncycastle.crypto.digests.SHA512Digest();
                this.isOutputSupportedForhNQ4ISI = new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512Digest());
                mGF1BytesGenerator = new org.bouncycastle.crypto.generators.MGF1BytesGenerator(new org.bouncycastle.crypto.digests.SHA512Digest());
            } else {
                this.toString = new org.bouncycastle.crypto.digests.SHA256Digest();
                this.isOutputSupportedForhNQ4ISI = new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA256Digest());
                mGF1BytesGenerator = new org.bouncycastle.crypto.generators.MGF1BytesGenerator(new org.bouncycastle.crypto.digests.SHA256Digest());
            }
            this.getValidOutputFormatsForInputhNQ4ISI = mGF1BytesGenerator;
            this.getOutputSizeshNQ4ISI = new byte[sHA256Digest.getDigestSize()];
            this.getOutputStallDuration = new byte[this.isOutputSupportedForhNQ4ISI.getMacSize()];
        }
    }

    static class Shake256Engine extends org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine {
        private final org.bouncycastle.crypto.Xof getOutputSizeshNQ4ISI;

        private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(adrs.getHighSpeedVideoFpsRanges, 0, adrs.getHighSpeedVideoFpsRanges.length);
            this.getOutputSizeshNQ4ISI.doFinal(bArr3, 0, length);
            for (int i = 0; i < bArr2.length; i++) {
                bArr3[i] = (byte) (bArr3[i] ^ bArr2[i]);
            }
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2) {
            if (this.getOutputMinFrameDurationlomOqCM) {
                bArr2 = getHighResolutionOutputSizeshNQ4ISI(bArr, adrs, bArr2);
            }
            int i = this.getHighSpeedVideoSizesFor;
            byte[] bArr3 = new byte[i];
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(adrs.getHighSpeedVideoFpsRanges, 0, adrs.getHighSpeedVideoFpsRanges.length);
            this.getOutputSizeshNQ4ISI.update(bArr2, 0, bArr2.length);
            this.getOutputSizeshNQ4ISI.doFinal(bArr3, 0, i);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(bArr2, 0, bArr2.length);
            this.getOutputSizeshNQ4ISI.update(bArr3, 0, bArr3.length);
            int i = this.getHighSpeedVideoSizesFor;
            byte[] bArr4 = new byte[i];
            this.getOutputSizeshNQ4ISI.doFinal(bArr4, 0, i);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(adrs.getHighSpeedVideoFpsRanges, 0, adrs.getHighSpeedVideoFpsRanges.length);
            byte[] bArr2 = new byte[this.getHighSpeedVideoSizesFor];
            this.getOutputSizeshNQ4ISI.doFinal(bArr2, 0, this.getHighSpeedVideoSizesFor);
            return bArr2;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i = ((this.getHighResolutionOutputSizeshNQ4ISI * this.getHighSpeedVideoSizes) + 7) / 8;
            int i2 = this.Camera2StreamConfigurationMap / this.getHighSpeedVideoFpsRanges;
            int i3 = this.Camera2StreamConfigurationMap - i2;
            int i4 = (i2 + 7) / 8;
            int i5 = (i3 + 7) / 8;
            int i6 = i + i4 + i5;
            byte[] bArr5 = new byte[i6];
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(bArr2, 0, bArr2.length);
            this.getOutputSizeshNQ4ISI.update(bArr3, 0, bArr3.length);
            this.getOutputSizeshNQ4ISI.update(bArr4, 0, bArr4.length);
            this.getOutputSizeshNQ4ISI.doFinal(bArr5, 0, i6);
            byte[] bArr6 = new byte[8];
            java.lang.System.arraycopy(bArr5, i, bArr6, 8 - i5, i5);
            long bigEndianToLong = org.bouncycastle.util.Pack.bigEndianToLong(bArr6, 0);
            byte[] bArr7 = new byte[4];
            java.lang.System.arraycopy(bArr5, i5 + i, bArr7, 4 - i4, i4);
            return new org.bouncycastle.pqc.crypto.sphincsplus.IndexedDigest(bigEndianToLong & ((-1) >>> (64 - i3)), org.bouncycastle.util.Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i2)), org.bouncycastle.util.Arrays.copyOfRange(bArr5, 0, i));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(bArr2, bArr3);
            if (this.getOutputMinFrameDurationlomOqCM) {
                concatenate = getHighResolutionOutputSizeshNQ4ISI(bArr, adrs, concatenate);
            }
            int i = this.getHighSpeedVideoSizesFor;
            byte[] bArr4 = new byte[i];
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(adrs.getHighSpeedVideoFpsRanges, 0, adrs.getHighSpeedVideoFpsRanges.length);
            this.getOutputSizeshNQ4ISI.update(concatenate, 0, concatenate.length);
            this.getOutputSizeshNQ4ISI.doFinal(bArr4, 0, i);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        final byte[] Camera2StreamConfigurationMap(byte[] bArr, org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs, byte[] bArr2) {
            if (this.getOutputMinFrameDurationlomOqCM) {
                bArr2 = getHighResolutionOutputSizeshNQ4ISI(bArr, adrs, bArr2);
            }
            int i = this.getHighSpeedVideoSizesFor;
            byte[] bArr3 = new byte[i];
            this.getOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
            this.getOutputSizeshNQ4ISI.update(adrs.getHighSpeedVideoFpsRanges, 0, adrs.getHighSpeedVideoFpsRanges.length);
            this.getOutputSizeshNQ4ISI.update(bArr2, 0, bArr2.length);
            this.getOutputSizeshNQ4ISI.doFinal(bArr3, 0, i);
            return bArr3;
        }

        public Shake256Engine(boolean z, int i, int i2, int i3, int i4, int i5) {
            super(z, i, 16, i2, i3, i4, i5);
            this.getOutputSizeshNQ4ISI = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        }
    }

    public SPHINCSPlusEngine(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        this.getHighSpeedVideoSizesFor = i;
        int i8 = (i * 8) / 4;
        this.getInputSizeshNQ4ISI = i8;
        if (i <= 8) {
            i7 = 2;
        } else {
            if (i > 136) {
                if (i > 256) {
                    throw new java.lang.IllegalArgumentException("cannot precompute SPX_WOTS_LEN2 for n outside {2, .., 256}");
                }
                this.getOutputMinFrameDuration = 4;
                this.getOutputSizes = 16;
                this.getOutputFormats = i8 + this.getOutputMinFrameDuration;
                this.getOutputMinFrameDurationlomOqCM = z;
                this.getHighSpeedVideoFpsRanges = i3;
                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                this.getHighSpeedVideoSizes = i5;
                this.Camera2StreamConfigurationMap = i6;
                this.getHighSpeedVideoFpsRangesFor = i6 / i3;
                this.getInputFormats = 1 << i4;
            }
            i7 = 3;
        }
        this.getOutputMinFrameDuration = i7;
        this.getOutputSizes = 16;
        this.getOutputFormats = i8 + this.getOutputMinFrameDuration;
        this.getOutputMinFrameDurationlomOqCM = z;
        this.getHighSpeedVideoFpsRanges = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        this.getHighSpeedVideoSizes = i5;
        this.Camera2StreamConfigurationMap = i6;
        this.getHighSpeedVideoFpsRangesFor = i6 / i3;
        this.getInputFormats = 1 << i4;
    }
}
