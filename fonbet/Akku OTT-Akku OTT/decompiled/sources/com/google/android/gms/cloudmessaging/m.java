package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Executor {
    public static final /* synthetic */ m a = new m();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
