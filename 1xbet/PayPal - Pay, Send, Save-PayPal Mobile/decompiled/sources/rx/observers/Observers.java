package rx.observers;

/* loaded from: classes18.dex */
public final class Observers {
    private static final rx.Observer<java.lang.Object> getHighSpeedVideoFpsRanges = new rx.Observer<java.lang.Object>() { // from class: rx.observers.Observers.1
        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onNext(java.lang.Object obj) {
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            throw new rx.exceptions.OnErrorNotImplementedException(th);
        }
    };

    private Observers() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> rx.Observer<T> empty() {
        return (rx.Observer<T>) getHighSpeedVideoFpsRanges;
    }

    public static <T> rx.Observer<T> create(final rx.functions.Action1<? super T> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        return new rx.Observer<T>() { // from class: rx.observers.Observers.2
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

    public static <T> rx.Observer<T> create(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<java.lang.Throwable> action12) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        return new rx.Observer<T>() { // from class: rx.observers.Observers.3
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

    public static <T> rx.Observer<T> create(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<java.lang.Throwable> action12, final rx.functions.Action0 action0) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        if (action0 == null) {
            throw new java.lang.IllegalArgumentException("onComplete can not be null");
        }
        return new rx.Observer<T>() { // from class: rx.observers.Observers.4
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
}
