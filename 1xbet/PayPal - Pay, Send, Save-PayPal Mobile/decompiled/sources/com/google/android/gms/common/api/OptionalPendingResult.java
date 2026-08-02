package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public abstract class OptionalPendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public abstract R get();

    public abstract boolean isDone();
}
