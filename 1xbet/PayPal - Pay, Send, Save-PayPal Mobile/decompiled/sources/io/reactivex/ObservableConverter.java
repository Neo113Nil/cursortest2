package io.reactivex;

/* loaded from: classes3.dex */
public interface ObservableConverter<T, R> {
    R apply(io.reactivex.Observable<T> observable);
}
