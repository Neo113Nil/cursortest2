package com.digitalturbine.ignite.authenticator.utils.concurency;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5161a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ConcurrencyUtil#" + this.f5161a.getAndIncrement());
    }
}
