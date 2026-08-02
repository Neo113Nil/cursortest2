package androidx.media3.common;

/* loaded from: classes7.dex */
public final class PriorityTaskManager {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private final java.util.PriorityQueue<java.lang.Integer> getHighSpeedVideoFpsRanges = new java.util.PriorityQueue<>(10, java.util.Collections.reverseOrder());
    private int getHighSpeedVideoSizes = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends java.io.IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PriorityTooLowException(int i, int i2) {
            super(r0.toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Priority too low [priority=");
            sb.append(i);
            sb.append(", highest=");
            sb.append(i2);
            sb.append("]");
        }
    }

    public final void add(int i) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRanges.add(java.lang.Integer.valueOf(i));
            this.getHighSpeedVideoSizes = java.lang.Math.max(this.getHighSpeedVideoSizes, i);
        }
    }

    public final void proceed(int i) throws java.lang.InterruptedException {
        synchronized (this.Camera2StreamConfigurationMap) {
            while (this.getHighSpeedVideoSizes != i) {
                this.Camera2StreamConfigurationMap.wait();
            }
        }
    }

    public final boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.Camera2StreamConfigurationMap) {
            z = this.getHighSpeedVideoSizes == i;
        }
        return z;
    }

    public final void proceedOrThrow(int i) throws androidx.media3.common.PriorityTaskManager.PriorityTooLowException {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizes != i) {
                throw new androidx.media3.common.PriorityTaskManager.PriorityTooLowException(i, this.getHighSpeedVideoSizes);
            }
        }
    }

    public final void remove(int i) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRanges.remove(java.lang.Integer.valueOf(i));
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.isEmpty() ? Integer.MIN_VALUE : ((java.lang.Integer) androidx.media3.common.util.Util.castNonNull(this.getHighSpeedVideoFpsRanges.peek())).intValue();
            this.Camera2StreamConfigurationMap.notifyAll();
        }
    }
}
