package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class X1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f7685e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Ma f7686a;

    /* renamed from: b, reason: collision with root package name */
    public final C1126y6 f7687b = C0736j4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C1049v6 f7688c = new C1049v6();

    /* renamed from: d, reason: collision with root package name */
    public final Fn f7689d = new Fn();

    public X1(C0945r6 c0945r6) {
        this.f7686a = c0945r6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f7685e.set(true);
            Ma ma = this.f7686a;
            C1143yn apply = this.f7688c.apply(thread);
            Fn fn = this.f7689d;
            Thread a6 = fn.f6811a.a();
            ArrayList a7 = fn.a(a6, thread);
            if (thread != a6) {
                try {
                    stackTraceElementArr = fn.f6811a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a6.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a7.add(0, (C1143yn) fn.f6812b.apply(a6, stackTraceElementArr));
            }
            ma.a(th, new V(apply, a7, this.f7687b.f9591a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
