package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
enum zzee implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
