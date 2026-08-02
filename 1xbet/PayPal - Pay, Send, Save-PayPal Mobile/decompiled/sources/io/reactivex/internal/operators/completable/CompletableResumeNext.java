package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableResumeNext extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableResumeNext(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.CompletableSource> function) {
        this.getHighSpeedVideoSizes = completableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        completableObserver.onSubscribe(sequentialDisposable);
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext(completableObserver, sequentialDisposable));
    }

    /* loaded from: classes17.dex */
    final class ResumeNext implements io.reactivex.CompletableObserver {
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;

        ResumeNext(io.reactivex.CompletableObserver completableObserver, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
            this.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.CompletableSource apply = io.reactivex.internal.operators.completable.CompletableResumeNext.this.getHighResolutionOutputSizeshNQ4ISI.apply(th);
                if (apply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(nullPointerException);
                    return;
                }
                apply.subscribe(new io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext.OnErrorObserver());
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th2, th));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.update(disposable);
        }

        final class OnErrorObserver implements io.reactivex.CompletableObserver {
            OnErrorObserver() {
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext.this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext.this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.operators.completable.CompletableResumeNext.ResumeNext.this.getHighSpeedVideoFpsRangesFor.update(disposable);
            }
        }
    }
}
