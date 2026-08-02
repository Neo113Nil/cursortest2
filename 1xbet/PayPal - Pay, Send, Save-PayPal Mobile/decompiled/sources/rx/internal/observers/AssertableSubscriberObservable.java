package rx.internal.observers;

/* loaded from: classes18.dex */
public class AssertableSubscriberObservable<T> extends rx.Subscriber<T> implements rx.observers.AssertableSubscriber<T> {
    private final rx.observers.TestSubscriber<T> getHighSpeedVideoFpsRangesFor;

    public AssertableSubscriberObservable(rx.observers.TestSubscriber<T> testSubscriber) {
        this.getHighSpeedVideoFpsRangesFor = testSubscriber;
    }

    public static <T> rx.internal.observers.AssertableSubscriberObservable<T> create(long j) {
        rx.observers.TestSubscriber testSubscriber = new rx.observers.TestSubscriber(j);
        rx.internal.observers.AssertableSubscriberObservable<T> assertableSubscriberObservable = new rx.internal.observers.AssertableSubscriberObservable<>(testSubscriber);
        assertableSubscriberObservable.add(testSubscriber);
        return assertableSubscriberObservable;
    }

    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
    public void onStart() {
        this.getHighSpeedVideoFpsRangesFor.onStart();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.getHighSpeedVideoFpsRangesFor.onCompleted();
    }

    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
    public void setProducer(rx.Producer producer) {
        this.getHighSpeedVideoFpsRangesFor.setProducer(producer);
    }

    @Override // rx.observers.AssertableSubscriber
    public final int getCompletions() {
        return this.getHighSpeedVideoFpsRangesFor.getCompletions();
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.onError(th);
    }

    @Override // rx.observers.AssertableSubscriber
    public java.util.List<java.lang.Throwable> getOnErrorEvents() {
        return this.getHighSpeedVideoFpsRangesFor.getOnErrorEvents();
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.getHighSpeedVideoFpsRangesFor.onNext(t);
    }

    @Override // rx.observers.AssertableSubscriber
    public final int getValueCount() {
        return this.getHighSpeedVideoFpsRangesFor.getValueCount();
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> requestMore(long j) {
        this.getHighSpeedVideoFpsRangesFor.requestMore(j);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public java.util.List<T> getOnNextEvents() {
        return this.getHighSpeedVideoFpsRangesFor.getOnNextEvents();
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertReceivedOnNext(java.util.List<T> list) {
        this.getHighSpeedVideoFpsRangesFor.assertReceivedOnNext(list);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> awaitValueCount(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.getHighSpeedVideoFpsRangesFor.awaitValueCount(i, j, timeUnit)) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Did not receive enough values in time. Expected: ");
        sb.append(i);
        sb.append(", Actual: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getValueCount());
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertTerminalEvent() {
        this.getHighSpeedVideoFpsRangesFor.assertTerminalEvent();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertUnsubscribed() {
        this.getHighSpeedVideoFpsRangesFor.assertUnsubscribed();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertNoErrors() {
        this.getHighSpeedVideoFpsRangesFor.assertNoErrors();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> awaitTerminalEvent() {
        this.getHighSpeedVideoFpsRangesFor.awaitTerminalEvent();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> awaitTerminalEvent(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.getHighSpeedVideoFpsRangesFor.awaitTerminalEvent(j, timeUnit);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.getHighSpeedVideoFpsRangesFor.awaitTerminalEventAndUnsubscribeOnTimeout(j, timeUnit);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public java.lang.Thread getLastSeenThread() {
        return this.getHighSpeedVideoFpsRangesFor.getLastSeenThread();
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertCompleted() {
        this.getHighSpeedVideoFpsRangesFor.assertCompleted();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertNotCompleted() {
        this.getHighSpeedVideoFpsRangesFor.assertNotCompleted();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertError(java.lang.Class<? extends java.lang.Throwable> cls) {
        this.getHighSpeedVideoFpsRangesFor.assertError(cls);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.assertError(th);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertNoTerminalEvent() {
        this.getHighSpeedVideoFpsRangesFor.assertNoTerminalEvent();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertNoValues() {
        this.getHighSpeedVideoFpsRangesFor.assertNoValues();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertValueCount(int i) {
        this.getHighSpeedVideoFpsRangesFor.assertValueCount(i);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertValues(T... tArr) {
        this.getHighSpeedVideoFpsRangesFor.assertValues(tArr);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public rx.observers.AssertableSubscriber<T> assertValue(T t) {
        this.getHighSpeedVideoFpsRangesFor.assertValue(t);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> assertValuesAndClear(T t, T... tArr) {
        this.getHighSpeedVideoFpsRangesFor.assertValuesAndClear(t, tArr);
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> perform(rx.functions.Action0 action0) {
        action0.call();
        return this;
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor.toString();
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> assertResult(T... tArr) {
        this.getHighSpeedVideoFpsRangesFor.assertValues(tArr);
        this.getHighSpeedVideoFpsRangesFor.assertNoErrors();
        this.getHighSpeedVideoFpsRangesFor.assertCompleted();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> assertFailure(java.lang.Class<? extends java.lang.Throwable> cls, T... tArr) {
        this.getHighSpeedVideoFpsRangesFor.assertValues(tArr);
        this.getHighSpeedVideoFpsRangesFor.assertError(cls);
        this.getHighSpeedVideoFpsRangesFor.assertNotCompleted();
        return this;
    }

    @Override // rx.observers.AssertableSubscriber
    public final rx.observers.AssertableSubscriber<T> assertFailureAndMessage(java.lang.Class<? extends java.lang.Throwable> cls, java.lang.String str, T... tArr) {
        this.getHighSpeedVideoFpsRangesFor.assertValues(tArr);
        this.getHighSpeedVideoFpsRangesFor.assertError(cls);
        this.getHighSpeedVideoFpsRangesFor.assertNotCompleted();
        java.lang.String message = this.getHighSpeedVideoFpsRangesFor.getOnErrorEvents().get(0).getMessage();
        if (message == str || (str != null && str.equals(message))) {
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error message differs. Expected: '");
        sb.append(str);
        sb.append("', Received: '");
        sb.append(message);
        sb.append("'");
        throw new java.lang.AssertionError(sb.toString());
    }
}
