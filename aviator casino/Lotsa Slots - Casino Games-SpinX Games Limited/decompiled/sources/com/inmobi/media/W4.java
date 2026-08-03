package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W4 extends com.inmobi.media.AbstractC2873x5 implements java.lang.Thread.UncaughtExceptionHandler {
    public final java.lang.Thread.UncaughtExceptionHandler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.inmobi.media.C2898y5 listener) {
        super(listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void a() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.AbstractC2873x5
    public final void b() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this.b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        this.f5542a.a(new com.inmobi.media.X4(t, e));
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
