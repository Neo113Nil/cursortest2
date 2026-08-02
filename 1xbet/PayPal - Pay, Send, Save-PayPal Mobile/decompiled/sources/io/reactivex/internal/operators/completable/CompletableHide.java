package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableHide extends io.reactivex.Completable {
    final io.reactivex.CompletableSource Camera2StreamConfigurationMap;

    public CompletableHide(io.reactivex.CompletableSource completableSource) {
        this.Camera2StreamConfigurationMap = completableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.completable.CompletableHide.HideCompletableObserver(completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class HideCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;

        HideCompletableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
