package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDoOnEach<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoSizes;

    public ObservableDoOnEach(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = consumer;
        this.getHighSpeedVideoSizes = consumer2;
        this.getHighResolutionOutputSizeshNQ4ISI = action;
        this.getHighSpeedVideoFpsRangesFor = action2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDoOnEach.DoOnEachObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class DoOnEachObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoSizes;
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizesFor;
        io.reactivex.disposables.Disposable getInputFormats;

        DoOnEachObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoSizesFor = consumer;
            this.getHighSpeedVideoSizes = consumer2;
            this.getHighResolutionOutputSizeshNQ4ISI = action;
            this.getHighSpeedVideoFpsRangesFor = action2;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputFormats, disposable)) {
                this.getInputFormats = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getInputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputFormats.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                this.getHighSpeedVideoSizesFor.accept(t);
                this.getHighSpeedVideoFpsRanges.onNext(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getInputFormats.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            try {
                this.getHighSpeedVideoSizes.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.getHighSpeedVideoFpsRanges.onError(th);
            try {
                this.getHighSpeedVideoFpsRangesFor.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.run();
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRanges.onComplete();
                try {
                    this.getHighSpeedVideoFpsRangesFor.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }
}
