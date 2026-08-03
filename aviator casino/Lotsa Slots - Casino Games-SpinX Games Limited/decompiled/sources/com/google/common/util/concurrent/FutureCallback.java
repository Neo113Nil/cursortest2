package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable t);

    void onSuccess(@com.google.common.util.concurrent.ParametricNullness V result);
}
