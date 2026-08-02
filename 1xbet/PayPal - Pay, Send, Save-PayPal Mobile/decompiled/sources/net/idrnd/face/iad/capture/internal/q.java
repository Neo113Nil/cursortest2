package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class q extends java.util.concurrent.ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.Function1 f6998a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(net.idrnd.face.iad.capture.internal.d0 d0Var) {
        super(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "");
        this.f6998a = d0Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (((java.lang.Boolean) this.f6998a.invoke(this)).booleanValue()) {
            super.execute(runnable);
        }
    }
}
