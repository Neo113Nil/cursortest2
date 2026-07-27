package com.startapp.sdk.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class u5 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4411a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4412b;

    public u5(String str) {
        this.f4412b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "startapp-" + this.f4412b + TokenBuilder.TOKEN_DELIMITER + this.f4411a.incrementAndGet());
    }
}
