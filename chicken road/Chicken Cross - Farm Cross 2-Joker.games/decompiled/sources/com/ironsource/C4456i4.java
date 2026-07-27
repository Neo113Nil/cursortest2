package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4456i4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8241a;

    C4456i4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8241a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C4473j4 c4473j4 = new C4473j4(th);
        if (c4473j4.d()) {
            new I5(c4473j4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f8241a.uncaughtException(thread, th);
    }
}
