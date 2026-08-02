package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableLift<R, T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.FlowableOperator<? extends R, ? super T> Camera2StreamConfigurationMap;

    public FlowableLift(io.reactivex.Flowable<T> flowable, io.reactivex.FlowableOperator<? extends R, ? super T> flowableOperator) {
        super(flowable);
        this.Camera2StreamConfigurationMap = flowableOperator;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        try {
            org.reactivestreams.Subscriber<? super java.lang.Object> apply = this.Camera2StreamConfigurationMap.apply(subscriber);
            if (apply == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Operator ");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(" returned a null Subscriber");
                throw new java.lang.NullPointerException(sb.toString());
            }
            this.source.subscribe(apply);
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
