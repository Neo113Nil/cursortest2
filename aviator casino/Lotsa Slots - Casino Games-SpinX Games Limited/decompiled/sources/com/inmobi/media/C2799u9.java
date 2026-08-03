package com.inmobi.media;

/* renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2799u9 implements com.inmobi.media.InterfaceC2772t9 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Ph f5484a;
    public final com.inmobi.media.C2361dk b;

    public C2799u9(android.content.Context context, double d, com.inmobi.media.Ib logLevel, boolean z, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.b = new com.inmobi.media.C2361dk();
        if (z) {
            return;
        }
        com.inmobi.media.Ph ph = new com.inmobi.media.Ph(context, d, logLevel, j, i);
        this.f5484a = ph;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(ph);
        com.inmobi.media.Tb.b(ph);
    }

    public final void a(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.a(com.inmobi.media.Ib.b, tag, message);
        }
        if (this.b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void b(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.a(com.inmobi.media.Ib.c, tag, message);
        }
        if (this.b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void c(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.a(com.inmobi.media.Ib.f4763a, tag, message);
        }
        if (this.b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void d(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.a(com.inmobi.media.Ib.d, tag, message);
        }
        if (this.b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(java.lang.String tag, java.lang.String message, java.lang.Exception error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.a(com.inmobi.media.Ib.c, tag, message + "\nError: " + kotlin.ExceptionsKt.stackTraceToString(error));
        }
        if (this.b != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public final void a(boolean z) {
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.b(z);
        }
        if (z) {
            return;
        }
        com.inmobi.media.Ph ph2 = this.f5484a;
        if (ph2 == null || !ph2.f.a()) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
            com.inmobi.media.Tb.a(this.f5484a);
            this.f5484a = null;
        }
    }

    public final void a() {
        com.inmobi.media.Ph ph = this.f5484a;
        if (ph != null) {
            ph.b();
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        com.inmobi.media.Tb.a(this.f5484a);
    }
}
