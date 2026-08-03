package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I9 implements java.util.concurrent.ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4761a;
    public final java.lang.String b;

    public I9(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f4761a = z;
        this.b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "r");
        try {
            java.lang.Thread thread = new java.lang.Thread(r, this.b);
            thread.setDaemon(this.f4761a);
            return thread;
        } catch (java.lang.InternalError e) {
            e.toString();
            return null;
        }
    }
}
