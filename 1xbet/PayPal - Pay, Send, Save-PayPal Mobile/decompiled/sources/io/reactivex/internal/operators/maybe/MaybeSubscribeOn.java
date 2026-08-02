package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeSubscribeOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public MaybeSubscribeOn(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.Scheduler scheduler) {
        super(maybeSource);
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeSubscribeOn.SubscribeOnMaybeObserver subscribeOnMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeSubscribeOn.SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.getHighSpeedVideoFpsRangesFor.replace(this.getHighSpeedVideoSizes.scheduleDirect(new io.reactivex.internal.operators.maybe.MaybeSubscribeOn.SubscribeTask(subscribeOnMaybeObserver, this.source)));
    }

    /* loaded from: classes17.dex */
    static final class SubscribeTask<T> implements java.lang.Runnable {
        final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        SubscribeTask(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<T> maybeSource) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.getHighSpeedVideoFpsRangesFor = maybeSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRangesFor.subscribe(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class SubscribeOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();

        SubscribeOnMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
