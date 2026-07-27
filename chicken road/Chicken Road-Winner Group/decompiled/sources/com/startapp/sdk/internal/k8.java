package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k8 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3952a;

    public k8(Handler handler) {
        this.f3952a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3952a.post(runnable);
    }
}
