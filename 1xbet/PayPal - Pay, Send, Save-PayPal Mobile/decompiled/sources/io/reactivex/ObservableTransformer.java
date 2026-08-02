package io.reactivex;

/* loaded from: classes3.dex */
public interface ObservableTransformer<Upstream, Downstream> {
    io.reactivex.ObservableSource<Downstream> apply(io.reactivex.Observable<Upstream> observable);
}
