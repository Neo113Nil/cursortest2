package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableMergeDelayErrorIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRangesFor;

    public CompletableMergeDelayErrorIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> iterable) {
        this.getHighSpeedVideoFpsRangesFor = iterable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.iterator(), "The source iterator returned is null");
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = new io.reactivex.internal.util.AtomicThrowable();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (compositeDisposable.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            atomicThrowable.addThrowable(th);
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    atomicThrowable.addThrowable(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    java.lang.Throwable terminate = atomicThrowable.terminate();
                    if (terminate == null) {
                        completableObserver.onComplete();
                        return;
                    } else {
                        completableObserver.onError(terminate);
                        return;
                    }
                }
                return;
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            completableObserver.onError(th3);
        }
    }
}
