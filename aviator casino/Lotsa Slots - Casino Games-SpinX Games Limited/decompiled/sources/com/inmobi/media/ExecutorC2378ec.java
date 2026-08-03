package com.inmobi.media;

/* renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC2378ec implements java.util.concurrent.Executor {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f5177a = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f5177a.post(runnable);
    }
}
