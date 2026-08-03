package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279cd {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f5652a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0752ul f5653b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5654c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f5655d;

    public C0279cd(io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, io.appmetrica.analytics.impl.AbstractC0848yd abstractC0848yd, java.lang.String str, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f5652a = iHandlerExecutor;
        this.f5653b = abstractC0848yd;
        this.f5654c = str;
        this.f5655d = systemTimeProvider;
    }

    public static final void a(io.appmetrica.analytics.impl.C0279cd c0279cd, java.util.List list) {
        io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
        io.appmetrica.analytics.impl.C0330ed c0330ed = new io.appmetrica.analytics.impl.C0330ed(c0279cd.f5653b, c0279cd.f5654c, c0279cd.f5655d, list);
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Ej(c0330ed));
    }

    public final void a(java.util.ArrayList arrayList) {
        this.f5652a.execute(new F0.c(6, this, arrayList));
    }
}
