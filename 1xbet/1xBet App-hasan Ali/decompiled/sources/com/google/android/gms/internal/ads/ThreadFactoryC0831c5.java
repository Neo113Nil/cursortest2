package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0831c5 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12969a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12970b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12971c;

    public ThreadFactoryC0831c5() {
        this.f12969a = 0;
        this.f12971c = Executors.defaultThreadFactory();
        this.f12970b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f12969a) {
            case 0:
                AtomicInteger atomicInteger = this.f12970b;
                Thread newThread = ((ThreadFactory) this.f12971c).newThread(runnable);
                newThread.setName("gads-" + atomicInteger.getAndIncrement());
                return newThread;
            default:
                return new Thread(runnable, "AdWorker(" + ((String) this.f12971c) + ") #" + this.f12970b.getAndIncrement());
        }
    }

    public ThreadFactoryC0831c5(String str) {
        this.f12969a = 1;
        this.f12971c = str;
        this.f12970b = new AtomicInteger(1);
    }
}
