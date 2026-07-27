package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596jd {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7620a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0992yl f7621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7622c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f7623d;

    public C0596jd(IHandlerExecutor iHandlerExecutor, Fd fd, String str, SystemTimeProvider systemTimeProvider) {
        this.f7620a = iHandlerExecutor;
        this.f7621b = fd;
        this.f7622c = str;
        this.f7623d = systemTimeProvider;
    }

    public static final void a(C0596jd c0596jd, List list) {
        Vj vj = AbstractC0861tj.f8372a;
        C0648ld c0648ld = new C0648ld(c0596jd.f7621b, c0596jd.f7622c, c0596jd.f7623d, list);
        vj.getClass();
        vj.a(new Jj(c0648ld));
    }

    public final void a(ArrayList arrayList) {
        this.f7620a.execute(new D1.a(this, 15, arrayList));
    }
}
