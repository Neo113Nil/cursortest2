package io.reactivex;

/* loaded from: classes3.dex */
public interface MaybeTransformer<Upstream, Downstream> {
    io.reactivex.MaybeSource<Downstream> apply(io.reactivex.Maybe<Upstream> maybe);
}
