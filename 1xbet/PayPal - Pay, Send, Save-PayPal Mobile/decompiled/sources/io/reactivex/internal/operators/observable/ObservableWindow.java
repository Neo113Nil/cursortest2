package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWindow<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final long getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public ObservableWindow(io.reactivex.ObservableSource<T> observableSource, long j, long j2, int i) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        if (this.getHighSpeedVideoFpsRangesFor == this.getHighResolutionOutputSizeshNQ4ISI) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindow.WindowExactObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindow.WindowSkipObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;
        io.reactivex.subjects.UnicastSubject<T> getOutputFormats;
        long getOutputMinFrameDuration;

        WindowExactObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, int i) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoSizes = j;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputFormats;
            if (unicastSubject == null && !this.getHighSpeedVideoFpsRanges) {
                unicastSubject = io.reactivex.subjects.UnicastSubject.create(this.getHighResolutionOutputSizeshNQ4ISI, this);
                this.getOutputFormats = unicastSubject;
                this.Camera2StreamConfigurationMap.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
                long j = this.getOutputMinFrameDuration + 1;
                this.getOutputMinFrameDuration = j;
                if (j >= this.getHighSpeedVideoSizes) {
                    this.getOutputMinFrameDuration = 0L;
                    this.getOutputFormats = null;
                    unicastSubject.onComplete();
                    if (this.getHighSpeedVideoFpsRanges) {
                        this.getHighSpeedVideoFpsRangesFor.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputFormats;
            if (unicastSubject != null) {
                this.getOutputFormats = null;
                unicastSubject.onError(th);
            }
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputFormats;
            if (unicastSubject != null) {
                this.getOutputFormats = null;
                unicastSubject.onComplete();
            }
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor.dispose();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowSkipObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;
        long getInputFormats;
        io.reactivex.disposables.Disposable getOutputFormats;
        final long getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> getInputSizeshNQ4ISI = new java.util.ArrayDeque<>();

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, long j2, int i) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoSizes = j;
            this.getOutputMinFrameDuration = j2;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.getInputSizeshNQ4ISI;
            long j = this.getInputFormats;
            long j2 = this.getOutputMinFrameDuration;
            if (j % j2 == 0 && !this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizesFor.getAndIncrement();
                io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRangesFor, this);
                arrayDeque.offer(create);
                this.Camera2StreamConfigurationMap.onNext(create);
            }
            long j3 = this.getHighSpeedVideoFpsRanges + 1;
            java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.getHighSpeedVideoSizes) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getOutputFormats.dispose();
                    return;
                }
                this.getHighSpeedVideoFpsRanges = j3 - j2;
            } else {
                this.getHighSpeedVideoFpsRanges = j3;
            }
            this.getInputFormats = j + 1;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.getInputSizeshNQ4ISI;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.getInputSizeshNQ4ISI;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoSizesFor.decrementAndGet() == 0 && this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getOutputFormats.dispose();
            }
        }
    }
}
