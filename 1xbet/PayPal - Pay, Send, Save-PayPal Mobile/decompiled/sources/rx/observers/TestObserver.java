package rx.observers;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public class TestObserver<T> implements rx.Observer<T> {
    private static final rx.Observer<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new rx.Observer<java.lang.Object>() { // from class: rx.observers.TestObserver.1
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
    private final java.util.List<java.lang.Throwable> Camera2StreamConfigurationMap;
    private final rx.Observer<T> getHighSpeedVideoFpsRanges;
    private final java.util.List<T> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<rx.Notification<T>> getHighSpeedVideoSizes;

    public TestObserver(rx.Observer<T> observer) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = observer;
    }

    public TestObserver() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = (rx.Observer<T>) getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.getHighSpeedVideoSizes.add(rx.Notification.createOnCompleted());
        this.getHighSpeedVideoFpsRanges.onCompleted();
    }

    public java.util.List<rx.Notification<T>> getOnCompletedEvents() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoSizes);
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap.add(th);
        this.getHighSpeedVideoFpsRanges.onError(th);
    }

    public java.util.List<java.lang.Throwable> getOnErrorEvents() {
        return java.util.Collections.unmodifiableList(this.Camera2StreamConfigurationMap);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.getHighSpeedVideoFpsRangesFor.add(t);
        this.getHighSpeedVideoFpsRanges.onNext(t);
    }

    public java.util.List<T> getOnNextEvents() {
        return java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
    }

    public java.util.List<java.lang.Object> getEvents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.getHighSpeedVideoFpsRangesFor);
        arrayList.add(this.Camera2StreamConfigurationMap);
        arrayList.add(this.getHighSpeedVideoSizes);
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public void assertReceivedOnNext(java.util.List<T> list) {
        if (this.getHighSpeedVideoFpsRangesFor.size() != list.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Number of items does not match. Provided: ");
            sb.append(list.size());
            sb.append("  Actual: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.size());
            sb.append(".\nProvided values: ");
            sb.append(list);
            sb.append("\nActual values: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            T t2 = this.getHighSpeedVideoFpsRangesFor.get(i);
            if (t == null) {
                if (t2 != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Value at index: ");
                    sb2.append(i);
                    sb2.append(" expected to be [null] but was: [");
                    sb2.append(t2);
                    sb2.append("]\n");
                    getHighResolutionOutputSizeshNQ4ISI(sb2.toString());
                }
            } else if (!t.equals(t2)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Value at index: ");
                sb3.append(i);
                sb3.append(" expected to be [");
                sb3.append(t);
                sb3.append("] (");
                sb3.append(t.getClass().getSimpleName());
                sb3.append(") but was: [");
                sb3.append(t2);
                sb3.append("] (");
                sb3.append(t2 != null ? t2.getClass().getSimpleName() : "null");
                sb3.append(")\n");
                getHighResolutionOutputSizeshNQ4ISI(sb3.toString());
            }
        }
    }

    public void assertTerminalEvent() {
        if (this.Camera2StreamConfigurationMap.size() > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many onError events: ");
            sb.append(this.Camera2StreamConfigurationMap.size());
            getHighResolutionOutputSizeshNQ4ISI(sb.toString());
        }
        if (this.getHighSpeedVideoSizes.size() > 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Too many onCompleted events: ");
            sb2.append(this.getHighSpeedVideoSizes.size());
            getHighResolutionOutputSizeshNQ4ISI(sb2.toString());
        }
        if (this.getHighSpeedVideoSizes.size() == 1 && this.Camera2StreamConfigurationMap.size() == 1) {
            getHighResolutionOutputSizeshNQ4ISI("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.getHighSpeedVideoSizes.isEmpty() && this.Camera2StreamConfigurationMap.isEmpty()) {
            getHighResolutionOutputSizeshNQ4ISI("No terminal events received.");
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int size = this.getHighSpeedVideoSizes.size();
        sb.append(size);
        sb.append(" completion");
        if (size != 1) {
            sb.append(io.ktor.util.date.GMTDateParser.SECONDS);
        }
        sb.append(')');
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            int size2 = this.Camera2StreamConfigurationMap.size();
            sb.append(" (+");
            sb.append(size2);
            sb.append(" error");
            if (size2 != 1) {
                sb.append(io.ktor.util.date.GMTDateParser.SECONDS);
            }
            sb.append(')');
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError(sb.toString());
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            if (this.Camera2StreamConfigurationMap.size() == 1) {
                assertionError.initCause(this.Camera2StreamConfigurationMap.get(0));
                throw assertionError;
            }
            assertionError.initCause(new rx.exceptions.CompositeException(this.Camera2StreamConfigurationMap));
            throw assertionError;
        }
        throw assertionError;
    }
}
