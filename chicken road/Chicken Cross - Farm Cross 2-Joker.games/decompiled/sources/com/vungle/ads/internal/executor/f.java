package com.vungle.ads.internal.executor;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f11915a;
    public final /* synthetic */ Runnable b;

    public f(Runnable runnable, Runnable runnable2) {
        this.f11915a = runnable;
        this.b = runnable2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Runnable runnable = this.f11915a;
        if (runnable instanceof com.vungle.ads.internal.task.i) {
            return ((com.vungle.ads.internal.task.i) runnable).compareTo(other);
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = j.b;
        Runnable runnable = this.f11915a;
        Runnable runnable2 = this.b;
        try {
            runnable.run();
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }
}
