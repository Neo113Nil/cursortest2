package rx.observers;

/* loaded from: classes18.dex */
public class SafeSubscriber<T> extends rx.Subscriber<T> {
    boolean Camera2StreamConfigurationMap;
    private final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

    public SafeSubscriber(rx.Subscriber<? super T> subscriber) {
        super(subscriber);
        this.getHighSpeedVideoFpsRangesFor = subscriber;
    }

    @Override // rx.Observer
    public void onCompleted() {
        rx.exceptions.UnsubscribeFailedException unsubscribeFailedException;
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        try {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                rx.exceptions.Exceptions.throwIfFatal(th);
                rx.plugins.RxJavaHooks.onError(th);
                throw new rx.exceptions.OnCompletedFailedException(th.getMessage(), th);
            } catch (java.lang.Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        rx.exceptions.Exceptions.throwIfFatal(th);
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        _onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        try {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, this);
        }
    }

    protected void _onError(java.lang.Throwable th) {
        rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
        try {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            try {
                unsubscribe();
            } catch (java.lang.Throwable th2) {
                rx.plugins.RxJavaHooks.onError(th2);
                throw new rx.exceptions.OnErrorFailedException(th2);
            }
        } catch (rx.exceptions.OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (java.lang.Throwable th3) {
                rx.plugins.RxJavaHooks.onError(th3);
                throw new rx.exceptions.OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th3)));
            }
        } catch (java.lang.Throwable th4) {
            rx.plugins.RxJavaHooks.onError(th4);
            try {
                unsubscribe();
                throw new rx.exceptions.OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th4)));
            } catch (java.lang.Throwable th5) {
                rx.plugins.RxJavaHooks.onError(th5);
                throw new rx.exceptions.OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th4, th5)));
            }
        }
    }

    public rx.Subscriber<? super T> getActual() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
