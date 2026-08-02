package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class ThreadedSeedGenerator {

    class SeedGenerator implements java.lang.Runnable {
        private volatile boolean Camera2StreamConfigurationMap;
        private volatile int getHighSpeedVideoFpsRanges;

        @Override // java.lang.Runnable
        public void run() {
            while (!this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges++;
            }
        }

        public final byte[] getHighSpeedVideoFpsRanges(int i, boolean z) {
            java.lang.Thread thread = new java.lang.Thread(this);
            byte[] bArr = new byte[i];
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = false;
            thread.start();
            if (!z) {
                i *= 8;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                while (this.getHighSpeedVideoFpsRanges == i2) {
                    try {
                        java.lang.Thread.sleep(1L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
                i2 = this.getHighSpeedVideoFpsRanges;
                if (z) {
                    bArr[i3] = (byte) (i2 & 255);
                } else {
                    int i4 = i3 / 8;
                    bArr[i4] = (byte) ((bArr[i4] << 1) | (i2 & 1));
                }
            }
            this.Camera2StreamConfigurationMap = true;
            return bArr;
        }

        /* synthetic */ SeedGenerator(org.bouncycastle.crypto.prng.ThreadedSeedGenerator threadedSeedGenerator, byte b) {
            this();
        }

        private SeedGenerator() {
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = false;
        }
    }

    public byte[] generateSeed(int i, boolean z) {
        return new org.bouncycastle.crypto.prng.ThreadedSeedGenerator.SeedGenerator(this, (byte) 0).getHighSpeedVideoFpsRanges(i, z);
    }
}
