package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBlockingSubscribe {
    private FlowableBlockingSubscribe() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Subscriber<? super T> subscriber) {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        io.reactivex.internal.subscribers.BlockingSubscriber blockingSubscriber = new io.reactivex.internal.subscribers.BlockingSubscriber(linkedBlockingQueue);
        publisher.subscribe(blockingSubscriber);
        while (!blockingSubscriber.isCancelled()) {
            try {
                java.lang.Object poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    if (blockingSubscriber.isCancelled()) {
                        return;
                    }
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    poll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.isCancelled() || publisher == io.reactivex.internal.subscribers.BlockingSubscriber.TERMINATED || io.reactivex.internal.util.NotificationLite.acceptFull(poll, subscriber)) {
                    return;
                }
            } catch (java.lang.InterruptedException e) {
                blockingSubscriber.cancel();
                subscriber.onError(e);
                return;
            }
        }
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> publisher) {
        io.reactivex.internal.util.BlockingIgnoringReceiver blockingIgnoringReceiver = new io.reactivex.internal.util.BlockingIgnoringReceiver();
        io.reactivex.internal.subscribers.LambdaSubscriber lambdaSubscriber = new io.reactivex.internal.subscribers.LambdaSubscriber(io.reactivex.internal.functions.Functions.emptyConsumer(), blockingIgnoringReceiver, blockingIgnoringReceiver, io.reactivex.internal.functions.Functions.REQUEST_MAX);
        publisher.subscribe(lambdaSubscriber);
        io.reactivex.internal.util.BlockingHelper.awaitForComplete(blockingIgnoringReceiver, lambdaSubscriber);
        java.lang.Throwable th = blockingIgnoringReceiver.error;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(org.reactivestreams.Publisher<? extends T> publisher, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer2, "onError is null");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onComplete is null");
        subscribe(publisher, new io.reactivex.internal.subscribers.LambdaSubscriber(consumer, consumer2, action, io.reactivex.internal.functions.Functions.REQUEST_MAX));
    }
}
