package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1159jd implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14110a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f14111b;

    public ThreadFactoryC1159jd(int i) {
        this.f14110a = i;
        switch (i) {
            case 1:
                this.f14111b = new AtomicInteger(1);
                break;
            default:
                this.f14111b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14110a) {
            case 0:
                return new Thread(runnable, AbstractC2107A.q("AdWorker(SCION_TASK_EXECUTOR) #", this.f14111b.getAndIncrement()));
            default:
                return new Thread(runnable, AbstractC2107A.q("AdWorker(NG) #", this.f14111b.getAndIncrement()));
        }
    }
}
