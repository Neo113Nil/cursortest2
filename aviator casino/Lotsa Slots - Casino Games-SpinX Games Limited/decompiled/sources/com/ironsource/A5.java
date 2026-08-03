package com.ironsource;

/* loaded from: classes5.dex */
final class A5 extends android.os.HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private android.os.Handler f5610a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void a(java.lang.Runnable task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        android.os.Handler handler = this.f5610a;
        if (handler != null) {
            handler.post(task);
        }
    }

    public final void a() {
        this.f5610a = new android.os.Handler(getLooper());
    }
}
