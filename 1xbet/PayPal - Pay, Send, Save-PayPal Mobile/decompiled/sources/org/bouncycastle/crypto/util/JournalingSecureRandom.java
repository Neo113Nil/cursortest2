package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class JournalingSecureRandom extends java.security.SecureRandom {
    private static byte[] getHighSpeedVideoFpsRangesFor = new byte[0];
    private final java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.util.JournalingSecureRandom.TranscriptStream getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public void reset() {
        this.getHighSpeedVideoSizes = 0;
        if (this.getHighSpeedVideoFpsRanges.length == 0) {
            this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        if (this.getHighSpeedVideoSizes >= this.getHighSpeedVideoFpsRanges.length) {
            this.Camera2StreamConfigurationMap.nextBytes(bArr);
        } else {
            int i = 0;
            while (i != bArr.length) {
                int i2 = this.getHighSpeedVideoSizes;
                byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
                if (i2 >= bArr2.length) {
                    break;
                }
                this.getHighSpeedVideoSizes = i2 + 1;
                bArr[i] = bArr2[i2];
                i++;
            }
            if (i != bArr.length) {
                int length = bArr.length - i;
                byte[] bArr3 = new byte[length];
                this.Camera2StreamConfigurationMap.nextBytes(bArr3);
                java.lang.System.arraycopy(bArr3, 0, bArr, i, length);
            }
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to record transcript: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public byte[] getTranscript() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
    }

    public byte[] getFullTranscript() {
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        return i == bArr.length ? this.getHighResolutionOutputSizeshNQ4ISI.toByteArray() : org.bouncycastle.util.Arrays.clone(bArr);
    }

    public void clear() {
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRanges, (byte) 0);
        this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
    }

    class TranscriptStream extends java.io.ByteArrayOutputStream {
        public final void Camera2StreamConfigurationMap() {
            org.bouncycastle.util.Arrays.fill(this.buf, (byte) 0);
        }

        /* synthetic */ TranscriptStream(org.bouncycastle.crypto.util.JournalingSecureRandom journalingSecureRandom, byte b) {
            this();
        }

        private TranscriptStream() {
        }
    }

    public JournalingSecureRandom(byte[] bArr, java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.util.JournalingSecureRandom.TranscriptStream(this, (byte) 0);
        this.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = secureRandom;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public JournalingSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.util.JournalingSecureRandom.TranscriptStream(this, (byte) 0);
        this.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = secureRandom;
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor;
    }

    public JournalingSecureRandom() {
        this(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }
}
