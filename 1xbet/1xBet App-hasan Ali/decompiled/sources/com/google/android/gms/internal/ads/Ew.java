package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Ew implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public static final Ew f8627k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ew[] f8628l;

    static {
        Ew ew = new Ew("INSTANCE", 0);
        f8627k = ew;
        f8628l = new Ew[]{ew};
    }

    public static Ew[] values() {
        return (Ew[]) f8628l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
