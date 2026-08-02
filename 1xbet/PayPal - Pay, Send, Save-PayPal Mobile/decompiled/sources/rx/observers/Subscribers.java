package rx.observers;

/* loaded from: classes18.dex */
public final class Subscribers {
    private Subscribers() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> rx.Subscriber<T> empty() {
        return from(rx.observers.Observers.empty());
    }

    public static <T> rx.Subscriber<T> from(final rx.Observer<? super T> observer) {
        return new rx.Subscriber<T>() { // from class: rx.observers.Subscribers.1
            @Override // rx.Observer
            public final void onCompleted() {
                rx.Observer.this.onCompleted();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.Observer.this.onError(th);
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                rx.Observer.this.onNext(t);
            }
        };
    }

    public static <T> rx.Subscriber<T> create(final rx.functions.Action1<? super T> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        return new rx.Subscriber<T>() { // from class: rx.observers.Subscribers.2
            @Override // rx.Observer
            public final void onCompleted() {
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                throw new rx.exceptions.OnErrorNotImplementedException(th);
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                rx.functions.Action1.this.call(t);
            }
        };
    }

    public static <T> rx.Subscriber<T> create(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<java.lang.Throwable> action12) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        return new rx.Subscriber<T>() { // from class: rx.observers.Subscribers.3
            @Override // rx.Observer
            public final void onCompleted() {
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.functions.Action1.this.call(th);
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                action1.call(t);
            }
        };
    }

    public static <T> rx.Subscriber<T> create(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<java.lang.Throwable> action12, final rx.functions.Action0 action0) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        if (action0 == null) {
            throw new java.lang.IllegalArgumentException("onComplete can not be null");
        }
        return new rx.Subscriber<T>() { // from class: rx.observers.Subscribers.4
            @Override // rx.Observer
            public final void onCompleted() {
                rx.functions.Action0.this.call();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                action12.call(th);
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                action1.call(t);
            }
        };
    }

    public static <T> rx.Subscriber<T> wrap(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.observers.Subscribers.5
            @Override // rx.Observer
            public final void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                subscriber.onNext(t);
            }
        };
    }
}
