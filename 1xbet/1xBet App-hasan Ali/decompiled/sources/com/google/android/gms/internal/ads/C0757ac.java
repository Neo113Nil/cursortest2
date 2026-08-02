package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757ac implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f12660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802bc f12661c;

    public /* synthetic */ C0757ac(C0802bc c0802bc, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.f12659a = i;
        this.f12660b = uncaughtExceptionHandler;
        this.f12661c = c0802bc;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        switch (this.f12659a) {
            case 0:
                uncaughtExceptionHandler = this.f12660b;
                try {
                    try {
                        this.f12661c.g(th);
                    } finally {
                    }
                } catch (Throwable unused) {
                    U2.j.f("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
            default:
                uncaughtExceptionHandler = this.f12660b;
                try {
                    try {
                        this.f12661c.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    U2.j.f("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
