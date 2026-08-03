package com.ironsource;

/* loaded from: classes5.dex */
public final class S6 implements com.ironsource.Ef {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.S6.a f5959a;

    public interface a {

        /* renamed from: com.ironsource.S6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0127a {
            void cancel();
        }

        com.ironsource.S6.a.InterfaceC0127a a(java.lang.Runnable runnable, long j);
    }

    public static final class b extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ java.lang.Runnable b;

        b(java.lang.Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Ef
    public com.ironsource.Ef.a a(java.lang.Runnable task, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        return new com.ironsource.Ef.a(this.f5959a.a(a(task), kotlin.time.Duration.m12157getInWholeMillisecondsimpl(j)));
    }

    public S6(com.ironsource.S6.a handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5959a = handler;
    }

    public /* synthetic */ S6(com.ironsource.S6.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.ironsource.T6.a(new android.os.Handler(android.os.Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.Ef
    public com.ironsource.Ef.a a(com.ironsource.Ef.b task, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        return a(task.a(), j);
    }

    private final com.ironsource.AbstractRunnableC3136ke a(java.lang.Runnable runnable) {
        return runnable instanceof com.ironsource.AbstractRunnableC3136ke ? (com.ironsource.AbstractRunnableC3136ke) runnable : new com.ironsource.S6.b(runnable);
    }
}
