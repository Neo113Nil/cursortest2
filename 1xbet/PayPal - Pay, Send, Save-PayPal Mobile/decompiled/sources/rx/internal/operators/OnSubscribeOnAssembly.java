package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeOnAssembly<T> implements rx.Observable.OnSubscribe<T> {
    public static volatile boolean fullStackTrace;
    final java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
    final rx.Observable.OnSubscribe<T> getHighSpeedVideoFpsRanges;

    public OnSubscribeOnAssembly(rx.Observable.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoFpsRanges = onSubscribe;
    }

    static java.lang.String Camera2StreamConfigurationMap() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Assembly trace:");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String obj = stackTraceElement.toString();
            if (fullStackTrace || (stackTraceElement.getLineNumber() > 1 && !obj.contains("RxJavaHooks.") && !obj.contains("OnSubscribeOnAssembly") && !obj.contains(".junit.runner") && !obj.contains(".junit4.runner") && !obj.contains(".junit.internal") && !obj.contains("sun.reflect") && !obj.contains("java.lang.Thread.") && !obj.contains("ThreadPoolExecutor") && !obj.contains("org.apache.catalina.") && !obj.contains("org.apache.tomcat."))) {
                sb.append("\n at ");
                sb.append(obj);
            }
        }
        sb.append("\nOriginal exception:");
        return sb.toString();
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRanges.call(new rx.internal.operators.OnSubscribeOnAssembly.OnAssemblySubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }

    static final class OnAssemblySubscriber<T> extends rx.Subscriber<T> {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        public OnAssemblySubscriber(rx.Subscriber<? super T> subscriber, java.lang.String str) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            new rx.exceptions.AssemblyStackTraceException(this.getHighResolutionOutputSizeshNQ4ISI).attachTo(th);
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }
    }
}
