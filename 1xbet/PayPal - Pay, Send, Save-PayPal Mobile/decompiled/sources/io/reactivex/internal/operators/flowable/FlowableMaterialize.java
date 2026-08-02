package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMaterialize<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Notification<T>> {
    public FlowableMaterialize(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Notification<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMaterialize.MaterializeSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class MaterializeSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, io.reactivex.Notification<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public final /* synthetic */ void onDrop(java.lang.Object obj) {
            io.reactivex.Notification notification = (io.reactivex.Notification) obj;
            if (notification.isOnError()) {
                io.reactivex.plugins.RxJavaPlugins.onError(notification.getError());
            }
        }

        MaterializeSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Notification<T>> subscriber) {
            super(subscriber);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.produced++;
            this.actual.onNext(io.reactivex.Notification.createOnNext(t));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            complete(io.reactivex.Notification.createOnError(th));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(io.reactivex.Notification.createOnComplete());
        }
    }
}
