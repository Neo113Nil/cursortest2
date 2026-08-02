package rx.internal.util;

/* loaded from: classes18.dex */
public final class RxThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
    public static final java.util.concurrent.ThreadFactory NONE = new java.util.concurrent.ThreadFactory() { // from class: rx.internal.util.RxThreadFactory.1
        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            throw new java.lang.AssertionError("No threads allowed.");
        }
    };
    private static final long serialVersionUID = -8841098858898482335L;
    final java.lang.String getHighSpeedVideoSizes;

    public RxThreadFactory(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(incrementAndGet());
        java.lang.Thread thread = new java.lang.Thread(runnable, sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
