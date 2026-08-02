package io.reactivex;

/* loaded from: classes3.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    org.reactivestreams.Publisher<Downstream> apply(io.reactivex.Flowable<Upstream> flowable);
}
