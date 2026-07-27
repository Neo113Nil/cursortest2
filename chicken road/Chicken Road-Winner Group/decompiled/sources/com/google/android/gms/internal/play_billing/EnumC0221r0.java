package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0221r0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0221r0 f2804a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0221r0[] f2805b;

    static {
        EnumC0221r0 enumC0221r0 = new EnumC0221r0("INSTANCE", 0);
        f2804a = enumC0221r0;
        f2805b = new EnumC0221r0[]{enumC0221r0};
    }

    public static EnumC0221r0[] values() {
        return (EnumC0221r0[]) f2805b.clone();
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
