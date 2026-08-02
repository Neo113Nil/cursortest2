package rx.internal.util;

/* loaded from: classes18.dex */
public class RxRingBuffer implements rx.Subscription {
    public static final int SIZE;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Queue<java.lang.Object> getHighSpeedVideoSizes;
    public volatile java.lang.Object terminalState;

    static {
        int i = rx.internal.util.PlatformDependent.isAndroid() ? 16 : 128;
        java.lang.String property = java.lang.System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = java.lang.Integer.parseInt(property);
            } catch (java.lang.NumberFormatException e) {
                java.io.PrintStream printStream = java.lang.System.err;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to set 'rx.buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
            }
        }
        SIZE = i;
    }

    public static rx.internal.util.RxRingBuffer getSpscInstance() {
        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
            return new rx.internal.util.RxRingBuffer(false, SIZE);
        }
        return new rx.internal.util.RxRingBuffer();
    }

    public static rx.internal.util.RxRingBuffer getSpmcInstance() {
        if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
            return new rx.internal.util.RxRingBuffer(true, SIZE);
        }
        return new rx.internal.util.RxRingBuffer();
    }

    private RxRingBuffer(java.util.Queue<java.lang.Object> queue, int i) {
        this.getHighSpeedVideoSizes = queue;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    private RxRingBuffer(boolean z, int i) {
        this.getHighSpeedVideoSizes = z ? new rx.internal.util.unsafe.SpmcArrayQueue<>(i) : new rx.internal.util.unsafe.SpscArrayQueue<>(i);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void release() {
        synchronized (this) {
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        release();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    RxRingBuffer() {
        this(new rx.internal.util.atomic.SpscAtomicArrayQueue(r0), r0);
        int i = SIZE;
    }

    public void onNext(java.lang.Object obj) throws rx.exceptions.MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoSizes;
            z = false;
            if (queue != null) {
                z2 = !queue.offer(rx.internal.operators.NotificationLite.next(obj));
            } else {
                z2 = false;
                z = true;
            }
        }
        if (z) {
            throw new java.lang.IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z2) {
            throw new rx.exceptions.MissingBackpressureException();
        }
    }

    public void onCompleted() {
        if (this.terminalState == null) {
            this.terminalState = rx.internal.operators.NotificationLite.completed();
        }
    }

    public void onError(java.lang.Throwable th) {
        if (this.terminalState == null) {
            this.terminalState = rx.internal.operators.NotificationLite.error(th);
        }
    }

    public int available() {
        return this.getHighResolutionOutputSizeshNQ4ISI - count();
    }

    public int capacity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int count() {
        java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoSizes;
        if (queue == null) {
            return 0;
        }
        return queue.size();
    }

    public boolean isEmpty() {
        java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoSizes;
        return queue == null || queue.isEmpty();
    }

    public java.lang.Object poll() {
        synchronized (this) {
            java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoSizes;
            if (queue == null) {
                return null;
            }
            java.lang.Object poll = queue.poll();
            java.lang.Object obj = this.terminalState;
            if (poll == null && obj != null && queue.peek() == null) {
                this.terminalState = null;
                poll = obj;
            }
            return poll;
        }
    }

    public java.lang.Object peek() {
        synchronized (this) {
            java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoSizes;
            if (queue == null) {
                return null;
            }
            java.lang.Object peek = queue.peek();
            java.lang.Object obj = this.terminalState;
            if (peek == null && obj != null) {
                if (queue.peek() == null) {
                    peek = obj;
                }
            }
            return peek;
        }
    }

    public boolean isCompleted(java.lang.Object obj) {
        return rx.internal.operators.NotificationLite.isCompleted(obj);
    }

    public boolean isError(java.lang.Object obj) {
        return rx.internal.operators.NotificationLite.isError(obj);
    }

    public java.lang.Object getValue(java.lang.Object obj) {
        return rx.internal.operators.NotificationLite.getValue(obj);
    }

    public boolean accept(java.lang.Object obj, rx.Observer observer) {
        return rx.internal.operators.NotificationLite.accept(observer, obj);
    }

    public java.lang.Throwable asError(java.lang.Object obj) {
        return rx.internal.operators.NotificationLite.getError(obj);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.getHighSpeedVideoSizes == null;
    }
}
