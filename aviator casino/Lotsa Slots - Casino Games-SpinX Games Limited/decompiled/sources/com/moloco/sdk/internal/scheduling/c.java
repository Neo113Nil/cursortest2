package com.moloco.sdk.internal.scheduling;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.scheduling.c f7189a = new com.moloco.sdk.internal.scheduling.c();
    public static final kotlinx.coroutines.CoroutineScope b = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo());
    public static final kotlinx.coroutines.CoroutineScope c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getDefault());
    public static final int d = 8;

    public final kotlinx.coroutines.CoroutineScope a() {
        return c;
    }

    public final kotlinx.coroutines.CoroutineScope b() {
        return b;
    }
}
