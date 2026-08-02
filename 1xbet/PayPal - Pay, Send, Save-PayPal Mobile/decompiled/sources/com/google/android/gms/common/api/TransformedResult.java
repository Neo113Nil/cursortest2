package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public abstract class TransformedResult<R extends com.google.android.gms.common.api.Result> {
    public abstract void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> resultCallbacks);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform);
}
