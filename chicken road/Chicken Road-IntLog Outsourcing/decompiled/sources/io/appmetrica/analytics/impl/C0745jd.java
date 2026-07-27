package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745jd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8536a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1141yl f8537b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8538c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f8539d;

    public C0745jd(IHandlerExecutor iHandlerExecutor, Fd fd, String str, SystemTimeProvider systemTimeProvider) {
        this.f8536a = iHandlerExecutor;
        this.f8537b = fd;
        this.f8538c = str;
        this.f8539d = systemTimeProvider;
    }

    public static final void a(C0745jd c0745jd, List list) {
        Vj vj = AbstractC1010tj.f9323a;
        C0797ld c0797ld = new C0797ld(c0745jd.f8537b, c0745jd.f8538c, c0745jd.f8539d, list);
        vj.getClass();
        vj.a(new Jj(c0797ld));
    }

    public final void a(ArrayList arrayList) {
        this.f8536a.execute(new B3.c(this, 17, arrayList));
    }
}
