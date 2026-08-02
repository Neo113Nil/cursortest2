package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class ResultOnSubscribe<T> implements rx.Observable.OnSubscribe<retrofit2.adapter.rxjava.Result<T>> {
    private final rx.Observable.OnSubscribe<retrofit2.Response<T>> getHighSpeedVideoSizes;

    @Override // rx.functions.Action1
    public final /* synthetic */ void call(java.lang.Object obj) {
        this.getHighSpeedVideoSizes.call(new retrofit2.adapter.rxjava.ResultOnSubscribe.ResultSubscriber((rx.Subscriber) obj));
    }

    ResultOnSubscribe(rx.Observable.OnSubscribe<retrofit2.Response<T>> onSubscribe) {
        this.getHighSpeedVideoSizes = onSubscribe;
    }

    static class ResultSubscriber<R> extends rx.Subscriber<retrofit2.Response<R>> {
        private final rx.Subscriber<? super retrofit2.adapter.rxjava.Result<R>> getHighResolutionOutputSizeshNQ4ISI;

        @Override // rx.Observer
        public /* synthetic */ void onNext(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(retrofit2.adapter.rxjava.Result.response((retrofit2.Response) obj));
        }

        ResultSubscriber(rx.Subscriber<? super retrofit2.adapter.rxjava.Result<R>> subscriber) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            java.lang.Throwable compositeException;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(retrofit2.adapter.rxjava.Result.error(th));
                this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
            } catch (java.lang.Throwable th2) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th2);
                } catch (rx.exceptions.OnCompletedFailedException e) {
                    e = e;
                    compositeException = e;
                    rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
                } catch (rx.exceptions.OnErrorFailedException e2) {
                    e = e2;
                    compositeException = e;
                    rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
                } catch (rx.exceptions.OnErrorNotImplementedException e3) {
                    e = e3;
                    compositeException = e;
                    rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
                } catch (java.lang.Throwable th3) {
                    rx.exceptions.Exceptions.throwIfFatal(th3);
                    compositeException = new rx.exceptions.CompositeException(th2, th3);
                    rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(compositeException);
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        }
    }
}
