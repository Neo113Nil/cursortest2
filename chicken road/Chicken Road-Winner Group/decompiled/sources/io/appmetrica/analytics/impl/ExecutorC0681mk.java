package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0681mk implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f7867a;

    public ExecutorC0681mk(Handler handler) {
        this.f7867a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7867a.post(runnable);
    }
}
