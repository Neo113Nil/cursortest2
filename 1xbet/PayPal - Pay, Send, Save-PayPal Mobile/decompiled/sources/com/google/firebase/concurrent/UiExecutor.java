package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
public enum UiExecutor implements java.util.concurrent.Executor {
    INSTANCE;

    private static final android.os.Handler HANDLER = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        HANDLER.post(runnable);
    }
}
