package com.inmobi.media;

/* loaded from: classes5.dex */
public final /* synthetic */ class Q extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0 {
    public Q(java.lang.Object obj) {
        super(0, obj, com.inmobi.media.U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        com.inmobi.media.U u = (com.inmobi.media.U) this.receiver;
        u.getClass();
        u.n = com.inmobi.media.Xi.d.get();
        com.inmobi.media.ExecutorC2378ec executorC2378ec = (com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue();
        com.inmobi.media.O runnable = u.m;
        executorC2378ec.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC2378ec.f5177a.postAtFrontOfQueue(runnable);
        return kotlin.Unit.INSTANCE;
    }
}
