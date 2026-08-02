package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable th);

    void onSuccess(V v);
}
