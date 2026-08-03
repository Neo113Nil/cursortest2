package com.ironsource;

/* renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3144l4 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Thread.UncaughtExceptionHandler f6366a;

    C3144l4(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6366a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        com.ironsource.C3162m4 c3162m4 = new com.ironsource.C3162m4(th);
        if (c3162m4.d()) {
            new com.ironsource.K5(c3162m4.b(), "" + java.lang.System.currentTimeMillis(), "Crash").a();
        }
        this.f6366a.uncaughtException(thread, th);
    }
}
