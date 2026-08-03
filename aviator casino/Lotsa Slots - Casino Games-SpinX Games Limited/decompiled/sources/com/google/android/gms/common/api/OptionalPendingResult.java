package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public abstract class OptionalPendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    public abstract R get();

    public abstract boolean isDone();
}
