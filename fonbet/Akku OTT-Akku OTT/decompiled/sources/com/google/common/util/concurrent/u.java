package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public interface u<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
