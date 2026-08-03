package com.inmobi.media;

/* renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312c extends com.inmobi.media.AbstractC2873x5 {
    public final long b;
    public final kotlin.jvm.functions.Function0 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final android.os.Handler f;
    public kotlinx.coroutines.CoroutineScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312c(long j, final com.inmobi.media.C2898y5 listener) {
        super(listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = j;
        this.c = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2312c.a(com.inmobi.media.C2312c.this, listener);
            }
        };
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final kotlin.Unit a(com.inmobi.media.C2312c c2312c, com.inmobi.media.InterfaceC2847w5 interfaceC2847w5) {
        if (c2312c.d.get()) {
            if (c2312c.f.hasMessages(2023)) {
                c2312c.f.removeMessages(2023);
                if (!android.os.Debug.isDebuggerConnected() && !android.os.Debug.waitingForDebugger() && c2312c.e.get()) {
                    java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
                    ((com.inmobi.media.C2898y5) interfaceC2847w5).a(new com.inmobi.media.C2654oo(stackTrace));
                }
            }
            c2312c.e.getAndSet(true);
            c2312c.f.sendEmptyMessage(2023);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void b() {
        if (this.d.getAndSet(false)) {
            this.d.set(false);
            this.e.set(false);
            com.inmobi.media.J3.a(this.g);
        }
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ANRWatchDog", "name");
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("ANRWatchDog", false));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor));
        this.g = CoroutineScope;
        if (CoroutineScope != null) {
            com.inmobi.media.J3.a(CoroutineScope, 0L, this.b, new com.inmobi.media.C2286b(this.c));
        }
    }
}
