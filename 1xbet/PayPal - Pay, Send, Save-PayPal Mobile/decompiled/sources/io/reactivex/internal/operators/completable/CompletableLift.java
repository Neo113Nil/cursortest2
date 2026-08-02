package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableLift extends io.reactivex.Completable {
    final io.reactivex.CompletableSource Camera2StreamConfigurationMap;
    final io.reactivex.CompletableOperator getHighSpeedVideoFpsRanges;

    public CompletableLift(io.reactivex.CompletableSource completableSource, io.reactivex.CompletableOperator completableOperator) {
        this.Camera2StreamConfigurationMap = completableSource;
        this.getHighSpeedVideoFpsRanges = completableOperator;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            this.Camera2StreamConfigurationMap.subscribe(this.getHighSpeedVideoFpsRanges.apply(completableObserver));
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
