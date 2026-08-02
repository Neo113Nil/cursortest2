package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class BodyOnSubscribe<T> implements rx.Observable.OnSubscribe<T> {
    private final rx.Observable.OnSubscribe<retrofit2.Response<T>> getHighSpeedVideoSizes;

    @Override // rx.functions.Action1
    public final /* synthetic */ void call(java.lang.Object obj) {
        this.getHighSpeedVideoSizes.call(new retrofit2.adapter.rxjava.BodyOnSubscribe.BodySubscriber((rx.Subscriber) obj));
    }

    BodyOnSubscribe(rx.Observable.OnSubscribe<retrofit2.Response<T>> onSubscribe) {
        this.getHighSpeedVideoSizes = onSubscribe;
    }

    static class BodySubscriber<R> extends rx.Subscriber<retrofit2.Response<R>> {
        private final rx.Subscriber<? super R> Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRangesFor;

        @Override // rx.Observer
        public /* synthetic */ void onNext(java.lang.Object obj) {
            java.lang.Throwable e;
            retrofit2.Response response = (retrofit2.Response) obj;
            if (response.isSuccessful()) {
                this.Camera2StreamConfigurationMap.onNext((java.lang.Object) response.body());
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            retrofit2.adapter.rxjava.HttpException httpException = new retrofit2.adapter.rxjava.HttpException(response);
            try {
                this.Camera2StreamConfigurationMap.onError(httpException);
            } catch (rx.exceptions.OnCompletedFailedException e2) {
                e = e2;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (rx.exceptions.OnErrorFailedException e3) {
                e = e3;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (rx.exceptions.OnErrorNotImplementedException e4) {
                e = e4;
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                e = new rx.exceptions.CompositeException(httpException, th);
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            }
        }

        BodySubscriber(rx.Subscriber<? super R> subscriber) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap.onError(th);
                return;
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(assertionError);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onCompleted();
        }
    }
}
