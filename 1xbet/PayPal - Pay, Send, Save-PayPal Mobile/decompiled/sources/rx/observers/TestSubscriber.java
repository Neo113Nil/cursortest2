package rx.observers;

/* loaded from: classes18.dex */
public class TestSubscriber<T> extends rx.Subscriber<T> {
    private static final rx.Observer<java.lang.Object> getHighSpeedVideoSizes = new rx.Observer<java.lang.Object>() { // from class: rx.observers.TestSubscriber.1
        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
        }

        @Override // rx.Observer
        public final void onNext(java.lang.Object obj) {
        }
    };
    private int Camera2StreamConfigurationMap;
    private final rx.Observer<T> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.Throwable> getHighSpeedVideoFpsRanges;
    private volatile java.lang.Thread getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.CountDownLatch getInputFormats;
    private final java.util.List<T> getInputSizeshNQ4ISI;
    private volatile int getOutputMinFrameDuration;

    public TestSubscriber(long j) {
        this(getHighSpeedVideoSizes, j);
    }

    public TestSubscriber(rx.Observer<T> observer, long j) {
        this.getInputFormats = new java.util.concurrent.CountDownLatch(1);
        this.getHighResolutionOutputSizeshNQ4ISI = observer;
        if (j >= 0) {
            request(j);
        }
        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public TestSubscriber(rx.Subscriber<T> subscriber) {
        this(subscriber, -1L);
    }

    public TestSubscriber(rx.Observer<T> observer) {
        this(observer, -1L);
    }

    public TestSubscriber() {
        this(-1L);
    }

    public static <T> rx.observers.TestSubscriber<T> create() {
        return new rx.observers.TestSubscriber<>();
    }

    public static <T> rx.observers.TestSubscriber<T> create(long j) {
        return new rx.observers.TestSubscriber<>(j);
    }

    public static <T> rx.observers.TestSubscriber<T> create(rx.Observer<T> observer, long j) {
        return new rx.observers.TestSubscriber<>(observer, j);
    }

    public static <T> rx.observers.TestSubscriber<T> create(rx.Subscriber<T> subscriber) {
        return new rx.observers.TestSubscriber<>((rx.Subscriber) subscriber);
    }

    public static <T> rx.observers.TestSubscriber<T> create(rx.Observer<T> observer) {
        return new rx.observers.TestSubscriber<>(observer);
    }

    @Override // rx.Observer
    public void onCompleted() {
        try {
            this.Camera2StreamConfigurationMap++;
            this.getHighSpeedVideoFpsRangesFor = java.lang.Thread.currentThread();
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        } finally {
            this.getInputFormats.countDown();
        }
    }

    @java.lang.Deprecated
    public java.util.List<rx.Notification<T>> getOnCompletedEvents() {
        int i = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(i != 0 ? i : 1);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(rx.Notification.createOnCompleted());
        }
        return arrayList;
    }

    public final int getCompletions() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        try {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Thread.currentThread();
            this.getHighSpeedVideoFpsRanges.add(th);
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        } finally {
            this.getInputFormats.countDown();
        }
    }

    public java.util.List<java.lang.Throwable> getOnErrorEvents() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Thread.currentThread();
        this.getInputSizeshNQ4ISI.add(t);
        this.getOutputMinFrameDuration = this.getInputSizeshNQ4ISI.size();
        this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
    }

    public final int getValueCount() {
        return this.getOutputMinFrameDuration;
    }

    public void requestMore(long j) {
        request(j);
    }

    public java.util.List<T> getOnNextEvents() {
        return this.getInputSizeshNQ4ISI;
    }

    public void assertReceivedOnNext(java.util.List<T> list) {
        if (this.getInputSizeshNQ4ISI.size() != list.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Number of items does not match. Provided: ");
            sb.append(list.size());
            sb.append("  Actual: ");
            sb.append(this.getInputSizeshNQ4ISI.size());
            sb.append(".\nProvided values: ");
            sb.append(list);
            sb.append("\nActual values: ");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            getHighSpeedVideoFpsRanges(list.get(i), i);
        }
    }

    private void getHighSpeedVideoFpsRanges(T t, int i) {
        T t2 = this.getInputSizeshNQ4ISI.get(i);
        if (t == null) {
            if (t2 != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value at index: ");
                sb.append(i);
                sb.append(" expected: [null] but was: [");
                sb.append(t2);
                sb.append("]\n");
                getHighResolutionOutputSizeshNQ4ISI(sb.toString());
                return;
            }
            return;
        }
        if (t.equals(t2)) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Value at index: ");
        sb2.append(i);
        sb2.append(" expected: [");
        sb2.append(t);
        sb2.append("] (");
        sb2.append(t.getClass().getSimpleName());
        sb2.append(") but was: [");
        sb2.append(t2);
        sb2.append("] (");
        sb2.append(t2 != null ? t2.getClass().getSimpleName() : "null");
        sb2.append(")\n");
        getHighResolutionOutputSizeshNQ4ISI(sb2.toString());
    }

    public final boolean awaitValueCount(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        while (j != 0 && this.getOutputMinFrameDuration < i) {
            try {
                timeUnit.sleep(1L);
                j--;
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.IllegalStateException("Interrupted", e);
            }
        }
        return this.getOutputMinFrameDuration >= i;
    }

    public void assertTerminalEvent() {
        if (this.getHighSpeedVideoFpsRanges.size() > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many onError events: ");
            sb.append(this.getHighSpeedVideoFpsRanges.size());
            getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        if (this.Camera2StreamConfigurationMap > 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Too many onCompleted events: ");
            sb2.append(this.Camera2StreamConfigurationMap);
            getHighResolutionOutputSizeshNQ4ISI(sb2.toString());
        }
        if (this.Camera2StreamConfigurationMap == 1 && this.getHighSpeedVideoFpsRanges.size() == 1) {
            getHighResolutionOutputSizeshNQ4ISI("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.Camera2StreamConfigurationMap == 0 && this.getHighSpeedVideoFpsRanges.isEmpty()) {
            getHighResolutionOutputSizeshNQ4ISI("No terminal events received.");
        }
    }

    public void assertUnsubscribed() {
        if (isUnsubscribed()) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI("Not unsubscribed.");
    }

    public void assertNoErrors() {
        if (getOnErrorEvents().isEmpty()) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI("Unexpected onError events");
    }

    public void awaitTerminalEvent() {
        try {
            this.getInputFormats.await();
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEvent(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            this.getInputFormats.await(j, timeUnit);
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException("Interrupted", e);
        }
    }

    public void awaitTerminalEventAndUnsubscribeOnTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (this.getInputFormats.await(j, timeUnit)) {
                return;
            }
            unsubscribe();
        } catch (java.lang.InterruptedException unused) {
            unsubscribe();
        }
    }

    public java.lang.Thread getLastSeenThread() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void assertCompleted() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            getHighResolutionOutputSizeshNQ4ISI("Not completed!");
        } else if (i > 1) {
            getHighResolutionOutputSizeshNQ4ISI("Completed multiple times: ".concat(java.lang.String.valueOf(i)));
        }
    }

    public void assertNotCompleted() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 1) {
            getHighResolutionOutputSizeshNQ4ISI("Completed!");
        } else if (i > 1) {
            getHighResolutionOutputSizeshNQ4ISI("Completed multiple times: ".concat(java.lang.String.valueOf(i)));
        }
    }

    public void assertError(java.lang.Class<? extends java.lang.Throwable> cls) {
        java.util.List<java.lang.Throwable> list = this.getHighSpeedVideoFpsRanges;
        if (list.isEmpty()) {
            getHighResolutionOutputSizeshNQ4ISI("No errors");
            return;
        }
        if (list.size() > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Multiple errors: ");
            sb.append(list.size());
            java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
            assertionError.initCause(new rx.exceptions.CompositeException(list));
            throw assertionError;
        }
        if (cls.isInstance(list.get(0))) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Exceptions differ; expected: ");
        sb2.append(cls);
        sb2.append(", actual: ");
        sb2.append(list.get(0));
        java.lang.AssertionError assertionError2 = new java.lang.AssertionError(sb2.toString());
        assertionError2.initCause(list.get(0));
        throw assertionError2;
    }

    public void assertError(java.lang.Throwable th) {
        java.util.List<java.lang.Throwable> list = this.getHighSpeedVideoFpsRanges;
        if (list.isEmpty()) {
            getHighResolutionOutputSizeshNQ4ISI("No errors");
            return;
        }
        if (list.size() > 1) {
            getHighResolutionOutputSizeshNQ4ISI("Multiple errors");
            return;
        }
        if (th.equals(list.get(0))) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Exceptions differ; expected: ");
        sb.append(th);
        sb.append(", actual: ");
        sb.append(list.get(0));
        getHighResolutionOutputSizeshNQ4ISI(sb.toString());
    }

    public void assertNoTerminalEvent() {
        java.util.List<java.lang.Throwable> list = this.getHighSpeedVideoFpsRanges;
        int i = this.Camera2StreamConfigurationMap;
        if (!list.isEmpty() || i > 0) {
            if (list.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Found ");
                sb.append(list.size());
                sb.append(" errors and ");
                sb.append(i);
                sb.append(" completion events instead of none");
                getHighResolutionOutputSizeshNQ4ISI(sb.toString());
                return;
            }
            if (list.size() == 1) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found ");
                sb2.append(list.size());
                sb2.append(" errors and ");
                sb2.append(i);
                sb2.append(" completion events instead of none");
                getHighResolutionOutputSizeshNQ4ISI(sb2.toString());
                return;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Found ");
            sb3.append(list.size());
            sb3.append(" errors and ");
            sb3.append(i);
            sb3.append(" completion events instead of none");
            getHighResolutionOutputSizeshNQ4ISI(sb3.toString());
        }
    }

    public void assertNoValues() {
        int size = this.getInputSizeshNQ4ISI.size();
        if (size != 0) {
            getHighResolutionOutputSizeshNQ4ISI("No onNext events expected yet some received: ".concat(java.lang.String.valueOf(size)));
        }
    }

    public void assertValueCount(int i) {
        int size = this.getInputSizeshNQ4ISI.size();
        if (size != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Number of onNext events differ; expected: ");
            sb.append(i);
            sb.append(", actual: ");
            sb.append(size);
            getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
    }

    public void assertValues(T... tArr) {
        assertReceivedOnNext(java.util.Arrays.asList(tArr));
    }

    public void assertValue(T t) {
        assertReceivedOnNext(java.util.Collections.singletonList(t));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int i = this.Camera2StreamConfigurationMap;
        sb.append(i);
        sb.append(" completion");
        if (i != 1) {
            sb.append(io.ktor.util.date.GMTDateParser.SECONDS);
        }
        sb.append(')');
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            int size = this.getHighSpeedVideoFpsRanges.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append(io.ktor.util.date.GMTDateParser.SECONDS);
            }
            sb.append(')');
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            if (this.getHighSpeedVideoFpsRanges.size() == 1) {
                assertionError.initCause(this.getHighSpeedVideoFpsRanges.get(0));
                throw assertionError;
            }
            assertionError.initCause(new rx.exceptions.CompositeException(this.getHighSpeedVideoFpsRanges));
            throw assertionError;
        }
        throw assertionError;
    }

    public final void assertValuesAndClear(T t, T... tArr) {
        assertValueCount(tArr.length + 1);
        getHighSpeedVideoFpsRanges(t, 0);
        int i = 0;
        while (i < tArr.length) {
            T t2 = tArr[i];
            i++;
            getHighSpeedVideoFpsRanges(t2, i);
        }
        this.getInputSizeshNQ4ISI.clear();
        this.getOutputMinFrameDuration = 0;
    }
}
