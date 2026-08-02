package io.reactivex;

/* loaded from: classes3.dex */
public interface FlowableConverter<T, R> {
    R apply(io.reactivex.Flowable<T> flowable);
}
