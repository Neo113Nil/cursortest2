package androidx.media3.common.util;

/* loaded from: classes7.dex */
public class ConditionVariable {
    private boolean getHighSpeedVideoFpsRanges;
    private final androidx.media3.common.util.Clock getHighSpeedVideoFpsRangesFor;

    public ConditionVariable() {
        this(androidx.media3.common.util.Clock.DEFAULT);
    }

    public ConditionVariable(androidx.media3.common.util.Clock clock) {
        this.getHighSpeedVideoFpsRangesFor = clock;
    }

    public boolean open() {
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges = true;
            notifyAll();
            return true;
        }
    }

    public boolean close() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = false;
        }
        return z;
    }

    public void block() throws java.lang.InterruptedException {
        synchronized (this) {
            while (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor.onThreadBlocked();
                wait();
            }
        }
    }

    public boolean block(long j) throws java.lang.InterruptedException {
        synchronized (this) {
            if (j <= 0) {
                return this.getHighSpeedVideoFpsRanges;
            }
            long elapsedRealtime = this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                block();
            } else {
                while (!this.getHighSpeedVideoFpsRanges && elapsedRealtime < j2) {
                    this.getHighSpeedVideoFpsRangesFor.onThreadBlocked();
                    wait(j2 - elapsedRealtime);
                    elapsedRealtime = this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
                }
            }
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public void blockUninterruptible() {
        synchronized (this) {
            boolean z = false;
            while (!this.getHighSpeedVideoFpsRanges) {
                try {
                    this.getHighSpeedVideoFpsRangesFor.onThreadBlocked();
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    public boolean blockUninterruptible(long j) {
        synchronized (this) {
            if (j <= 0) {
                return this.getHighSpeedVideoFpsRanges;
            }
            long elapsedRealtime = this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            if (j2 < elapsedRealtime) {
                blockUninterruptible();
            } else {
                boolean z = false;
                while (!this.getHighSpeedVideoFpsRanges && elapsedRealtime < j2) {
                    try {
                        this.getHighSpeedVideoFpsRangesFor.onThreadBlocked();
                        wait(j2 - elapsedRealtime);
                    } catch (java.lang.InterruptedException unused) {
                        z = true;
                    }
                    elapsedRealtime = this.getHighSpeedVideoFpsRangesFor.elapsedRealtime();
                }
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public boolean isOpen() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoFpsRanges;
        }
        return z;
    }
}
