package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ApiCallResultLatch.java */
/* loaded from: classes6.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f8969a = new CountDownLatch(1);
    private final AtomicReference<T> b = new AtomicReference<>();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public T a(long j) throws InterruptedException {
        if (this.f8969a.await(j, TimeUnit.MILLISECONDS)) {
            return this.b.get();
        }
        return null;
    }

    public boolean a(T t) {
        if (!this.c.compareAndSet(false, true)) {
            return false;
        }
        this.b.set(t);
        this.f8969a.countDown();
        return true;
    }
}
