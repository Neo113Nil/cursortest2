package com.inmobi.media;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4096t5 extends U5 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4096t5(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, V5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.U5
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.U5
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        this.f6883a.a(new C4124u5(t, e));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
