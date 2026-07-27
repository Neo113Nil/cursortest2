package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663m2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0699nc f7834a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f7835b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7837d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f7838e = new G0.m(20, this);

    public C0663m2(C0699nc c0699nc, IHandlerExecutor iHandlerExecutor, long j3) {
        this.f7834a = c0699nc;
        this.f7835b = iHandlerExecutor;
        this.f7836c = j3;
    }

    public static final void a(C0663m2 c0663m2) {
        C0725oc c0725oc = c0663m2.f7834a.f7933a;
        Bi bi = c0725oc.f6447h;
        bi.f5774c.a(c0725oc.f6442b.f6382a);
    }
}
