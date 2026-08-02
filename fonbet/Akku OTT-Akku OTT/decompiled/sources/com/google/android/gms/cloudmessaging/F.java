package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements Executor {
    public static final /* synthetic */ F a = new F();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
