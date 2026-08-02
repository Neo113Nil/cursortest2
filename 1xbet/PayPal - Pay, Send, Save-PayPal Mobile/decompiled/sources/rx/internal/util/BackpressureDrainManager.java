package rx.internal.util;

/* loaded from: classes18.dex */
public final class BackpressureDrainManager extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
    private static final long serialVersionUID = 2826241102729529449L;
    volatile boolean Camera2StreamConfigurationMap;
    boolean getHighSpeedVideoFpsRanges;
    final rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback getHighSpeedVideoFpsRangesFor;
    java.lang.Throwable getHighSpeedVideoSizes;

    public interface BackpressureQueueCallback {
        boolean accept(java.lang.Object obj);

        void complete(java.lang.Throwable th);

        java.lang.Object peek();

        java.lang.Object poll();
    }

    public BackpressureDrainManager(rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback backpressureQueueCallback) {
        this.getHighSpeedVideoFpsRangesFor = backpressureQueueCallback;
    }

    public final boolean isTerminated() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void terminate() {
        this.Camera2StreamConfigurationMap = true;
    }

    public final void terminate(java.lang.Throwable th) {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoSizes = th;
        this.Camera2StreamConfigurationMap = true;
    }

    public final void terminateAndDrain() {
        this.Camera2StreamConfigurationMap = true;
        drain();
    }

    public final void terminateAndDrain(java.lang.Throwable th) {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoSizes = th;
        this.Camera2StreamConfigurationMap = true;
        drain();
    }

    @Override // rx.Producer
    public final void request(long j) {
        boolean z;
        long j2;
        if (j != 0) {
            while (true) {
                long j3 = get();
                boolean z2 = true;
                z = j3 == 0;
                if (j3 == Long.MAX_VALUE) {
                    break;
                }
                if (j == Long.MAX_VALUE) {
                    j2 = j;
                } else {
                    j2 = j3 <= Long.MAX_VALUE - j ? j3 + j : Long.MAX_VALUE;
                    z2 = z;
                }
                if (compareAndSet(j3, j2)) {
                    z = z2;
                    break;
                }
            }
            if (z) {
                drain();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
    
        r13.getHighSpeedVideoFpsRanges = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drain() {
        java.lang.Throwable th;
        rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback backpressureQueueCallback;
        java.lang.Throwable th2;
        boolean z;
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            boolean z2 = true;
            this.getHighSpeedVideoFpsRanges = true;
            boolean z3 = this.Camera2StreamConfigurationMap;
            long j = get();
            try {
                backpressureQueueCallback = this.getHighSpeedVideoFpsRangesFor;
            } catch (java.lang.Throwable th3) {
                th = th3;
                z2 = false;
            }
            while (true) {
                int i = 0;
                while (true) {
                    try {
                        if (j <= 0 && !z3) {
                            break;
                        }
                        if (z3) {
                            if (backpressureQueueCallback.peek() != null) {
                                if (j == 0) {
                                    break;
                                }
                            } else {
                                backpressureQueueCallback.complete(this.getHighSpeedVideoSizes);
                                return;
                            }
                        }
                        java.lang.Object poll = backpressureQueueCallback.poll();
                        if (poll == null) {
                            break;
                        }
                        if (backpressureQueueCallback.accept(poll)) {
                            return;
                        }
                        j--;
                        i++;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        if (!z2) {
                            synchronized (this) {
                                this.getHighSpeedVideoFpsRanges = false;
                            }
                        }
                        throw th;
                    }
                }
                synchronized (this) {
                    try {
                        z3 = this.Camera2StreamConfigurationMap;
                        z = backpressureQueueCallback.peek() != null;
                    } catch (java.lang.Throwable th5) {
                        th2 = th5;
                    }
                    try {
                        if (get() != Long.MAX_VALUE) {
                            long addAndGet = addAndGet(-i);
                            if ((addAndGet == 0 || !z) && (!z3 || z)) {
                                break;
                            } else {
                                j = addAndGet;
                            }
                        } else {
                            if (!z && !z3) {
                                this.getHighSpeedVideoFpsRanges = false;
                                return;
                            }
                            j = Long.MAX_VALUE;
                        }
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        throw th2;
                    }
                }
                throw th;
            }
        }
    }
}
