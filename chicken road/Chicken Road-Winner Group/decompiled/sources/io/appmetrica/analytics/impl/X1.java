package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f6810e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Ma f6811a;

    /* renamed from: b, reason: collision with root package name */
    public final C0977y6 f6812b = C0587j4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C0900v6 f6813c = new C0900v6();

    /* renamed from: d, reason: collision with root package name */
    public final Fn f6814d = new Fn();

    public X1(C0796r6 c0796r6) {
        this.f6811a = c0796r6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f6810e.set(true);
            Ma ma = this.f6811a;
            C0994yn apply = this.f6813c.apply(thread);
            Fn fn = this.f6814d;
            Thread a3 = fn.f5966a.a();
            ArrayList a4 = fn.a(a3, thread);
            if (thread != a3) {
                try {
                    stackTraceElementArr = fn.f5966a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a3.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a4.add(0, (C0994yn) fn.f5967b.apply(a3, stackTraceElementArr));
            }
            ma.a(th, new V(apply, a4, this.f6812b.f8632a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
