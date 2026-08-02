package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableLift<R, T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.ObservableOperator<? extends R, ? super T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableLift(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableOperator<? extends R, ? super T> observableOperator) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = observableOperator;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        try {
            io.reactivex.Observer<? super java.lang.Object> apply = this.getHighResolutionOutputSizeshNQ4ISI.apply(observer);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Operator ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" returned a null Observer");
            this.source.subscribe((io.reactivex.Observer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(apply, sb.toString()));
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
