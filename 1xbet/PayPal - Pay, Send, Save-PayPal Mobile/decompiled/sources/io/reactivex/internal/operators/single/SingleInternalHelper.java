package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleInternalHelper {
    private SingleInternalHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.util.concurrent.Callable<java.util.NoSuchElementException> emptyThrower() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.NoSuchElementCallable.INSTANCE;
    }

    /* loaded from: classes17.dex */
    enum ToFlowable implements io.reactivex.functions.Function<io.reactivex.SingleSource, org.reactivestreams.Publisher> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ org.reactivestreams.Publisher apply(io.reactivex.SingleSource singleSource) throws java.lang.Exception {
            return new io.reactivex.internal.operators.single.SingleToFlowable(singleSource);
        }
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, org.reactivestreams.Publisher<? extends T>> toFlowable() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowable.INSTANCE;
    }

    /* loaded from: classes17.dex */
    static final class ToFlowableIterator<T> implements java.util.Iterator<io.reactivex.Flowable<T>> {
        private final java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoSizes;

        ToFlowableIterator(java.util.Iterator<? extends io.reactivex.SingleSource<? extends T>> it) {
            this.getHighSpeedVideoSizes = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ java.lang.Object next() {
            return new io.reactivex.internal.operators.single.SingleToFlowable(this.getHighSpeedVideoSizes.next());
        }
    }

    /* loaded from: classes17.dex */
    static final class ToFlowableIterable<T> implements java.lang.Iterable<io.reactivex.Flowable<T>> {
        private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoFpsRangesFor;

        ToFlowableIterable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
            this.getHighSpeedVideoFpsRangesFor = iterable;
        }

        @Override // java.lang.Iterable
        public final java.util.Iterator<io.reactivex.Flowable<T>> iterator() {
            return new io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowableIterator(this.getHighSpeedVideoFpsRangesFor.iterator());
        }
    }

    public static <T> java.lang.Iterable<? extends io.reactivex.Flowable<T>> iterableToFlowable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
        return new io.reactivex.internal.operators.single.SingleInternalHelper.ToFlowableIterable(iterable);
    }

    /* loaded from: classes17.dex */
    enum ToObservable implements io.reactivex.functions.Function<io.reactivex.SingleSource, io.reactivex.Observable> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ io.reactivex.Observable apply(io.reactivex.SingleSource singleSource) throws java.lang.Exception {
            return new io.reactivex.internal.operators.single.SingleToObservable(singleSource);
        }
    }

    public static <T> io.reactivex.functions.Function<io.reactivex.SingleSource<? extends T>, io.reactivex.Observable<? extends T>> toObservable() {
        return io.reactivex.internal.operators.single.SingleInternalHelper.ToObservable.INSTANCE;
    }

    /* loaded from: classes17.dex */
    enum NoSuchElementCallable implements java.util.concurrent.Callable<java.util.NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.util.NoSuchElementException call() throws java.lang.Exception {
            return new java.util.NoSuchElementException();
        }
    }
}
