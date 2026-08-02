package androidx.core.provider;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class SelfDestructiveThread {
    android.os.HandlerThread Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    android.os.Handler getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final int getOutputMinFrameDuration;
    final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private android.os.Handler.Callback getHighSpeedVideoSizes = new android.os.Handler.Callback() { // from class: androidx.core.provider.SelfDestructiveThread.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                androidx.core.provider.SelfDestructiveThread selfDestructiveThread = androidx.core.provider.SelfDestructiveThread.this;
                synchronized (selfDestructiveThread.getHighSpeedVideoFpsRangesFor) {
                    if (!selfDestructiveThread.getHighSpeedVideoFpsRanges.hasMessages(1)) {
                        selfDestructiveThread.Camera2StreamConfigurationMap.quit();
                        selfDestructiveThread.Camera2StreamConfigurationMap = null;
                        selfDestructiveThread.getHighSpeedVideoFpsRanges = null;
                    }
                }
                return true;
            }
            if (i != 1) {
                return true;
            }
            androidx.core.provider.SelfDestructiveThread selfDestructiveThread2 = androidx.core.provider.SelfDestructiveThread.this;
            ((java.lang.Runnable) message.obj).run();
            synchronized (selfDestructiveThread2.getHighSpeedVideoFpsRangesFor) {
                selfDestructiveThread2.getHighSpeedVideoFpsRanges.removeMessages(0);
                android.os.Handler handler = selfDestructiveThread2.getHighSpeedVideoFpsRanges;
                handler.sendMessageDelayed(handler.obtainMessage(0), selfDestructiveThread2.getHighResolutionOutputSizeshNQ4ISI);
            }
            return true;
        }
    };
    private int getInputSizeshNQ4ISI = 0;

    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoSizesFor = str;
        this.getOutputMinFrameDuration = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = this.Camera2StreamConfigurationMap != null;
        }
        return z;
    }

    public int getGeneration() {
        int i;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            i = this.getInputSizeshNQ4ISI;
        }
        return i;
    }

    private void getHighSpeedVideoSizes(java.lang.Runnable runnable) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.Camera2StreamConfigurationMap == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration);
                this.Camera2StreamConfigurationMap = handlerThread;
                handlerThread.start();
                this.getHighSpeedVideoFpsRanges = new android.os.Handler(this.Camera2StreamConfigurationMap.getLooper(), this.getHighSpeedVideoSizes);
                this.getInputSizeshNQ4ISI++;
            }
            this.getHighSpeedVideoFpsRanges.removeMessages(0);
            android.os.Handler handler = this.getHighSpeedVideoFpsRanges;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void postAndReply(final java.util.concurrent.Callable<T> callable, final androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> replyCallback) {
        final android.os.Handler highSpeedVideoSizes = androidx.core.provider.CalleeHandler.getHighSpeedVideoSizes();
        getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2
            @Override // java.lang.Runnable
            public void run() {
                final java.lang.Object obj;
                try {
                    obj = callable.call();
                } catch (java.lang.Exception unused) {
                    obj = null;
                }
                highSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        replyCallback.onReply(obj);
                    }
                });
            }
        });
    }

    public <T> T postAndWait(final java.util.concurrent.Callable<T> callable, int i) throws java.lang.InterruptedException {
        final java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        final java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        getHighSpeedVideoSizes(new java.lang.Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (java.lang.Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (java.lang.InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new java.lang.InterruptedException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        } finally {
            reentrantLock.unlock();
        }
    }
}
