package my.com.softspace.common.io;

/* loaded from: classes17.dex */
public final class CircleBufferOutputStream extends java.io.OutputStream {
    private final int Camera2StreamConfigurationMap;
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public CircleBufferOutputStream(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.getHighSpeedVideoFpsRanges = new byte[i];
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final int capacity() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor >= this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i2 + 1;
            bArr[i2] = (byte) i;
        }
    }

    public final int available() {
        return this.getHighSpeedVideoSizes ? this.Camera2StreamConfigurationMap : this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        java.lang.System.arraycopy(r8.getHighSpeedVideoFpsRanges, 0, r0, 0, r9);
        r2 = r8.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(r2, r9, r2, 0, r8.Camera2StreamConfigurationMap - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r8.getHighSpeedVideoSizes == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r8.getHighSpeedVideoFpsRangesFor = r8.Camera2StreamConfigurationMap - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r8.getHighSpeedVideoSizes = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r2 = r8.getHighSpeedVideoFpsRangesFor;
        r8.getHighSpeedVideoFpsRangesFor = r2 - java.lang.Math.min(r2, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] read(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.set(false);
        try {
            byte[] bArr = new byte[i];
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            while (true) {
                if (available() >= i) {
                    break;
                }
                sspog.SimpleLogger.d("[setSeed]", "wait for write buffer", new java.lang.Object[0]);
                java.lang.Thread.sleep(100L);
                if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(false)) {
                    return bArr;
                }
                if (java.lang.System.currentTimeMillis() - currentTimeMillis > 5000) {
                    sspog.SimpleLogger.d("[setSeed]", "dont wait more than 5 seconds. get whatever it has", new java.lang.Object[0]);
                    break;
                }
            }
        } catch (java.lang.InterruptedException unused) {
            return new byte[i];
        }
    }

    public final void interrupt() {
        this.getHighResolutionOutputSizeshNQ4ISI.set(true);
    }
}
