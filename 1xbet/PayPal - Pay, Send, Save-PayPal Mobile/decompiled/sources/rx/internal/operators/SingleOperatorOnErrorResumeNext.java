package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOperatorOnErrorResumeNext<T> implements rx.Single.OnSubscribe<T> {
    private final rx.Single<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<java.lang.Throwable, ? extends rx.Single<? extends T>> getHighSpeedVideoFpsRangesFor;

    private SingleOperatorOnErrorResumeNext(rx.Single<? extends T> single, rx.functions.Func1<java.lang.Throwable, ? extends rx.Single<? extends T>> func1) {
        if (single == null) {
            throw new java.lang.NullPointerException("originalSingle must not be null");
        }
        if (func1 == null) {
            throw new java.lang.NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = single;
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    public static <T> rx.internal.operators.SingleOperatorOnErrorResumeNext<T> withFunction(rx.Single<? extends T> single, rx.functions.Func1<java.lang.Throwable, ? extends rx.Single<? extends T>> func1) {
        return new rx.internal.operators.SingleOperatorOnErrorResumeNext<>(single, func1);
    }

    public static <T> rx.internal.operators.SingleOperatorOnErrorResumeNext<T> withOther(rx.Single<? extends T> single, final rx.Single<? extends T> single2) {
        if (single2 == null) {
            throw new java.lang.NullPointerException("resumeSingleInCaseOfError must not be null");
        }
        return new rx.internal.operators.SingleOperatorOnErrorResumeNext<>(single, new rx.functions.Func1<java.lang.Throwable, rx.Single<? extends T>>() { // from class: rx.internal.operators.SingleOperatorOnErrorResumeNext.1
            @Override // rx.functions.Func1
            public final /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Throwable th) {
                return rx.Single.this;
            }
        });
    }

    @Override // rx.functions.Action1
    public final void call(final rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.SingleSubscriber<T> singleSubscriber2 = new rx.SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOperatorOnErrorResumeNext.2
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                singleSubscriber.onSuccess(t);
            }

            @Override // rx.SingleSubscriber
            public void onError(java.lang.Throwable th) {
                try {
                    rx.internal.operators.SingleOperatorOnErrorResumeNext.this.getHighSpeedVideoFpsRangesFor.call(th).subscribe(singleSubscriber);
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwOrReport(th2, (rx.SingleSubscriber<?>) singleSubscriber);
                }
            }
        };
        singleSubscriber.add(singleSubscriber2);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe((rx.SingleSubscriber<? super java.lang.Object>) singleSubscriber2);
    }
}
