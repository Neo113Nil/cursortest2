package rx.observers;

/* loaded from: classes18.dex */
public interface AssertableSubscriber<T> extends rx.Observer<T>, rx.Subscription {
    rx.observers.AssertableSubscriber<T> assertCompleted();

    rx.observers.AssertableSubscriber<T> assertError(java.lang.Class<? extends java.lang.Throwable> cls);

    rx.observers.AssertableSubscriber<T> assertError(java.lang.Throwable th);

    rx.observers.AssertableSubscriber<T> assertFailure(java.lang.Class<? extends java.lang.Throwable> cls, T... tArr);

    rx.observers.AssertableSubscriber<T> assertFailureAndMessage(java.lang.Class<? extends java.lang.Throwable> cls, java.lang.String str, T... tArr);

    rx.observers.AssertableSubscriber<T> assertNoErrors();

    rx.observers.AssertableSubscriber<T> assertNoTerminalEvent();

    rx.observers.AssertableSubscriber<T> assertNoValues();

    rx.observers.AssertableSubscriber<T> assertNotCompleted();

    rx.observers.AssertableSubscriber<T> assertReceivedOnNext(java.util.List<T> list);

    rx.observers.AssertableSubscriber<T> assertResult(T... tArr);

    rx.observers.AssertableSubscriber<T> assertTerminalEvent();

    rx.observers.AssertableSubscriber<T> assertUnsubscribed();

    rx.observers.AssertableSubscriber<T> assertValue(T t);

    rx.observers.AssertableSubscriber<T> assertValueCount(int i);

    rx.observers.AssertableSubscriber<T> assertValues(T... tArr);

    rx.observers.AssertableSubscriber<T> assertValuesAndClear(T t, T... tArr);

    rx.observers.AssertableSubscriber<T> awaitTerminalEvent();

    rx.observers.AssertableSubscriber<T> awaitTerminalEvent(long j, java.util.concurrent.TimeUnit timeUnit);

    rx.observers.AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j, java.util.concurrent.TimeUnit timeUnit);

    rx.observers.AssertableSubscriber<T> awaitValueCount(int i, long j, java.util.concurrent.TimeUnit timeUnit);

    int getCompletions();

    java.lang.Thread getLastSeenThread();

    java.util.List<java.lang.Throwable> getOnErrorEvents();

    java.util.List<T> getOnNextEvents();

    int getValueCount();

    @Override // rx.Subscription
    boolean isUnsubscribed();

    void onStart();

    rx.observers.AssertableSubscriber<T> perform(rx.functions.Action0 action0);

    rx.observers.AssertableSubscriber<T> requestMore(long j);

    void setProducer(rx.Producer producer);

    @Override // rx.Subscription
    void unsubscribe();
}
