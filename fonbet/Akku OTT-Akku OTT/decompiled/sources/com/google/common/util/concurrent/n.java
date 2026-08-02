package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public interface n<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}
