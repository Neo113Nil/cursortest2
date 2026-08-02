package r1;

import java.lang.Thread;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570a implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        System.exit(0);
    }
}
