package org.bouncycastle.cert.selector;

/* loaded from: classes17.dex */
class MSOutlookKeyIdCalculator {
    static byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.SHA1Digest sHA1Digest = new org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.SHA1Digest();
        byte[] bArr = new byte[org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.SHA1Digest.getHighSpeedVideoFpsRangesFor()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            sHA1Digest.getHighSpeedVideoFpsRanges(encoded, encoded.length);
            sHA1Digest.getHighSpeedVideoSizes();
            org.bouncycastle.util.Pack.intToBigEndian(sHA1Digest.Camera2StreamConfigurationMap, bArr, 0);
            org.bouncycastle.util.Pack.intToBigEndian(sHA1Digest.getHighSpeedVideoFpsRangesFor, bArr, 4);
            org.bouncycastle.util.Pack.intToBigEndian(sHA1Digest.getHighSpeedVideoSizes, bArr, 8);
            org.bouncycastle.util.Pack.intToBigEndian(sHA1Digest.getHighSpeedVideoFpsRanges, bArr, 12);
            org.bouncycastle.util.Pack.intToBigEndian(sHA1Digest.getHighResolutionOutputSizeshNQ4ISI, bArr, 16);
            sHA1Digest.Camera2StreamConfigurationMap();
            return bArr;
        } catch (java.io.IOException unused) {
            return new byte[0];
        }
    }

    static abstract class GeneralDigest {
        private long Camera2StreamConfigurationMap;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[4];
        private int getHighSpeedVideoSizes = 0;

        protected abstract void Camera2StreamConfigurationMap(byte[] bArr, int i);

        protected abstract void getHighSpeedVideoFpsRanges();

        protected abstract void getHighSpeedVideoFpsRangesFor(long j);

        public final void getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
            int i2 = 0;
            while (this.getHighSpeedVideoSizes != 0 && i > 0) {
                getHighResolutionOutputSizeshNQ4ISI(bArr[i2]);
                i2++;
                i--;
            }
            while (i > this.getHighResolutionOutputSizeshNQ4ISI.length) {
                Camera2StreamConfigurationMap(bArr, i2);
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                i2 += bArr2.length;
                i -= bArr2.length;
                this.Camera2StreamConfigurationMap += bArr2.length;
            }
            while (i > 0) {
                getHighResolutionOutputSizeshNQ4ISI(bArr[i2]);
                i2++;
                i--;
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI(byte b) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            int i2 = i + 1;
            this.getHighSpeedVideoSizes = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                Camera2StreamConfigurationMap(bArr, 0);
                this.getHighSpeedVideoSizes = 0;
            }
            this.Camera2StreamConfigurationMap++;
        }

        public void Camera2StreamConfigurationMap() {
            this.Camera2StreamConfigurationMap = 0L;
            this.getHighSpeedVideoSizes = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i >= bArr.length) {
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public final void getHighSpeedVideoSizes() {
            long j = this.Camera2StreamConfigurationMap;
            byte b = Byte.MIN_VALUE;
            while (true) {
                getHighResolutionOutputSizeshNQ4ISI(b);
                if (this.getHighSpeedVideoSizes == 0) {
                    getHighSpeedVideoFpsRangesFor(j << 3);
                    getHighSpeedVideoFpsRanges();
                    return;
                }
                b = 0;
            }
        }

        protected GeneralDigest() {
        }
    }

    static class SHA1Digest extends org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        private int getInputSizeshNQ4ISI;
        private int[] getOutputFormats = new int[80];

        public static int getHighSpeedVideoFpsRangesFor() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected final void getHighSpeedVideoFpsRanges() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.getOutputFormats;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 << 1) | (i2 >>> 31);
            }
            int i3 = this.Camera2StreamConfigurationMap;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighSpeedVideoSizes;
            int i6 = this.getHighSpeedVideoFpsRanges;
            int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i8 = 0;
            int i9 = 0;
            while (i8 < 4) {
                int i10 = ((i3 << 5) | (i3 >>> 27)) + (((~i4) & i6) | (i5 & i4));
                int[] iArr2 = this.getOutputFormats;
                int i11 = i7 + i10 + iArr2[i9] + 1518500249;
                int i12 = (i4 << 30) | (i4 >>> 2);
                int i13 = i6 + ((i11 << 5) | (i11 >>> 27)) + (((~i3) & i5) | (i12 & i3)) + iArr2[i9 + 1] + 1518500249;
                int i14 = (i3 << 30) | (i3 >>> 2);
                int i15 = i5 + ((i13 << 5) | (i13 >>> 27)) + (((~i11) & i12) | (i14 & i11)) + iArr2[i9 + 2] + 1518500249;
                i7 = (i11 << 30) | (i11 >>> 2);
                i4 = i12 + ((i15 << 5) | (i15 >>> 27)) + (((~i13) & i14) | (i7 & i13)) + iArr2[i9 + 3] + 1518500249;
                i6 = (i13 << 30) | (i13 >>> 2);
                i3 = i14 + ((i4 << 5) | (i4 >>> 27)) + (((~i15) & i7) | (i6 & i15)) + iArr2[i9 + 4] + 1518500249;
                i5 = (i15 << 30) | (i15 >>> 2);
                i8++;
                i9 += 5;
            }
            int i16 = 0;
            while (i16 < 4) {
                int[] iArr3 = this.getOutputFormats;
                int i17 = i7 + ((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6) + iArr3[i9] + 1859775393;
                int i18 = (i4 << 30) | (i4 >>> 2);
                int i19 = i6 + ((i17 << 5) | (i17 >>> 27)) + ((i3 ^ i18) ^ i5) + iArr3[i9 + 1] + 1859775393;
                int i20 = (i3 << 30) | (i3 >>> 2);
                int i21 = i5 + ((i19 << 5) | (i19 >>> 27)) + ((i17 ^ i20) ^ i18) + iArr3[i9 + 2] + 1859775393;
                i7 = (i17 << 30) | (i17 >>> 2);
                i4 = i18 + ((i21 << 5) | (i21 >>> 27)) + ((i19 ^ i7) ^ i20) + iArr3[i9 + 3] + 1859775393;
                i6 = (i19 << 30) | (i19 >>> 2);
                i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + ((i21 ^ i6) ^ i7) + iArr3[i9 + 4] + 1859775393;
                i5 = (i21 << 30) | (i21 >>> 2);
                i16++;
                i9 += 5;
            }
            int i22 = 0;
            while (i22 < 4) {
                int[] iArr4 = this.getOutputFormats;
                int i23 = i7 + (((((i3 << 5) | (i3 >>> 27)) + (((i5 | i6) & i4) | (i5 & i6))) + iArr4[i9]) - 1894007588);
                int i24 = (i4 << 30) | (i4 >>> 2);
                int i25 = i6 + (((((i23 << 5) | (i23 >>> 27)) + (((i24 | i5) & i3) | (i24 & i5))) + iArr4[i9 + 1]) - 1894007588);
                int i26 = (i3 << 30) | (i3 >>> 2);
                int i27 = i5 + (((((i25 << 5) | (i25 >>> 27)) + (((i26 | i24) & i23) | (i26 & i24))) + iArr4[i9 + 2]) - 1894007588);
                i7 = (i23 << 30) | (i23 >>> 2);
                i4 = i24 + (((((i27 << 5) | (i27 >>> 27)) + (((i7 | i26) & i25) | (i7 & i26))) + iArr4[i9 + 3]) - 1894007588);
                i6 = (i25 << 30) | (i25 >>> 2);
                i3 = i26 + (((((i4 << 5) | (i4 >>> 27)) + (((i6 | i7) & i27) | (i6 & i7))) + iArr4[i9 + 4]) - 1894007588);
                i5 = (i27 << 30) | (i27 >>> 2);
                i22++;
                i9 += 5;
            }
            int i28 = 0;
            while (i28 <= 3) {
                int[] iArr5 = this.getOutputFormats;
                int i29 = i7 + (((((i3 << 5) | (i3 >>> 27)) + ((i4 ^ i5) ^ i6)) + iArr5[i9]) - 899497514);
                int i30 = (i4 << 30) | (i4 >>> 2);
                int i31 = i6 + (((((i29 << 5) | (i29 >>> 27)) + ((i3 ^ i30) ^ i5)) + iArr5[i9 + 1]) - 899497514);
                int i32 = (i3 << 30) | (i3 >>> 2);
                int i33 = i5 + (((((i31 << 5) | (i31 >>> 27)) + ((i29 ^ i32) ^ i30)) + iArr5[i9 + 2]) - 899497514);
                i7 = (i29 << 30) | (i29 >>> 2);
                i4 = i30 + (((((i33 << 5) | (i33 >>> 27)) + ((i31 ^ i7) ^ i32)) + iArr5[i9 + 3]) - 899497514);
                i6 = (i31 << 30) | (i31 >>> 2);
                i3 = i32 + (((((i4 << 5) | (i4 >>> 27)) + ((i33 ^ i6) ^ i7)) + iArr5[i9 + 4]) - 899497514);
                i5 = (i33 << 30) | (i33 >>> 2);
                i28++;
                i9 += 5;
            }
            this.Camera2StreamConfigurationMap += i3;
            this.getHighSpeedVideoFpsRangesFor += i4;
            this.getHighSpeedVideoSizes += i5;
            this.getHighSpeedVideoFpsRanges += i6;
            this.getHighResolutionOutputSizeshNQ4ISI += i7;
            this.getInputSizeshNQ4ISI = 0;
            for (int i34 = 0; i34 < 16; i34++) {
                this.getOutputFormats[i34] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public final void Camera2StreamConfigurationMap() {
            super.Camera2StreamConfigurationMap();
            this.Camera2StreamConfigurationMap = 1732584193;
            this.getHighSpeedVideoFpsRangesFor = -271733879;
            this.getHighSpeedVideoSizes = -1732584194;
            this.getHighSpeedVideoFpsRanges = 271733878;
            this.getHighResolutionOutputSizeshNQ4ISI = -1009589776;
            this.getInputSizeshNQ4ISI = 0;
            int i = 0;
            while (true) {
                int[] iArr = this.getOutputFormats;
                if (i == iArr.length) {
                    return;
                }
                iArr[i] = 0;
                i++;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected final void Camera2StreamConfigurationMap(byte[] bArr, int i) {
            byte b = bArr[i];
            byte b2 = bArr[i + 1];
            byte b3 = bArr[i + 2];
            byte b4 = bArr[i + 3];
            int[] iArr = this.getOutputFormats;
            int i2 = this.getInputSizeshNQ4ISI;
            iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
            int i3 = i2 + 1;
            this.getInputSizeshNQ4ISI = i3;
            if (i3 == 16) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected final void getHighSpeedVideoFpsRangesFor(long j) {
            if (this.getInputSizeshNQ4ISI > 14) {
                getHighSpeedVideoFpsRanges();
            }
            int[] iArr = this.getOutputFormats;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        public SHA1Digest() {
            Camera2StreamConfigurationMap();
        }
    }

    MSOutlookKeyIdCalculator() {
    }
}
