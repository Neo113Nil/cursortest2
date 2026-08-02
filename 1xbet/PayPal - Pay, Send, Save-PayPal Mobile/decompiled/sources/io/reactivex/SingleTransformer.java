package io.reactivex;

/* loaded from: classes3.dex */
public interface SingleTransformer<Upstream, Downstream> {
    io.reactivex.SingleSource<Downstream> apply(io.reactivex.Single<Upstream> single);
}
