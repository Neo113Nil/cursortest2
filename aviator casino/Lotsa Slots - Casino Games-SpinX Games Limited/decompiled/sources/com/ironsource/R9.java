package com.ironsource;

/* loaded from: classes5.dex */
public final class R9 extends android.os.HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private android.os.Handler f5948a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R9(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        a(this, task, 0L, 2, null);
    }

    public final void b(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.f5948a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    public static /* synthetic */ void a(com.ironsource.R9 r9, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        r9.a(runnable, j);
    }

    public final void a(java.lang.Runnable task, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.f5948a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }

    public final void a() {
        this.f5948a = new android.os.Handler(getLooper());
    }
}
