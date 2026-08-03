package com.ironsource;

/* renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3256r9 {

    /* renamed from: a, reason: collision with root package name */
    private final android.os.Handler f6581a;

    /* renamed from: com.ironsource.r9$a */
    public static final class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ java.lang.Runnable b;

        a(java.lang.Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3256r9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.ke] */
    private final void c(java.lang.Runnable runnable) {
        com.ironsource.C3256r9.a aVar = runnable instanceof com.ironsource.AbstractRunnableC3136ke ? (com.ironsource.AbstractRunnableC3136ke) runnable : new com.ironsource.C3256r9.a(runnable);
        if (java.lang.Thread.currentThread().getId() == this.f6581a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final android.os.Handler a() {
        return this.f6581a;
    }

    public final void b(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C3256r9(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6581a = handler;
    }

    public static /* synthetic */ void a(com.ironsource.C3256r9 c3256r9, com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3256r9.a(abstractRunnableC3136ke, j);
    }

    public /* synthetic */ C3256r9(android.os.Handler handler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.os.Handler(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(com.ironsource.AbstractRunnableC3136ke task, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.f6581a.postDelayed(task, j);
    }

    public final void a(com.ironsource.AbstractRunnableC3136ke task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        this.f6581a.removeCallbacks(task);
    }

    public final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
