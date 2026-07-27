package com.startapp.sdk.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class i0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f3848a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                if (si.a(th) != null) {
                    if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th.getMessage())) {
                        try {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3848a;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    }
                    d9.a(th, e9.f3619g);
                }
                try {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f3848a;
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th);
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            } catch (Throwable unused) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f3848a;
                if (uncaughtExceptionHandler3 != null) {
                    uncaughtExceptionHandler3.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
    }
}
