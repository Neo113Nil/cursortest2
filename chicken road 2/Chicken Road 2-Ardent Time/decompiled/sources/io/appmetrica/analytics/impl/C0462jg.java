package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462jg implements io.appmetrica.analytics.impl.InterfaceC0359fg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6195a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f6196b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ve f6197c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L7 f6198d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0669rg f6199e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f6200f;

    public C0462jg(io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler) {
        this(c0801wi, ve, handler, ve.s());
    }

    public final void a() {
        if (this.f6195a) {
            return;
        }
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f6196b;
        io.appmetrica.analytics.impl.ResultReceiverC0721tg resultReceiverC0721tg = new io.appmetrica.analytics.impl.ResultReceiverC0721tg(this.f6200f, this);
        c0801wi.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0721tg);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger anonymousInstance = io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", "", 4098, 0, anonymousInstance);
        m3.f4825m = bundle;
        io.appmetrica.analytics.impl.F4 f4 = c0801wi.f7025a;
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, f4), f4, 1, (java.util.Map) null);
    }

    public C0462jg(io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler, boolean z2) {
        this(c0801wi, ve, handler, z2, new io.appmetrica.analytics.impl.L7(z2), new io.appmetrica.analytics.impl.C0669rg());
    }

    public C0462jg(io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler, boolean z2, io.appmetrica.analytics.impl.L7 l7, io.appmetrica.analytics.impl.C0669rg c0669rg) {
        this.f6196b = c0801wi;
        this.f6197c = ve;
        this.f6195a = z2;
        this.f6198d = l7;
        this.f6199e = c0669rg;
        this.f6200f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0359fg
    public final void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        java.lang.String str = c0566ng == null ? null : c0566ng.f6533a;
        if (this.f6195a) {
            return;
        }
        synchronized (this) {
            io.appmetrica.analytics.impl.L7 l7 = this.f6198d;
            this.f6199e.getClass();
            l7.f4597d = io.appmetrica.analytics.impl.C0669rg.a(str);
            l7.a();
        }
    }

    public final synchronized void a(io.appmetrica.analytics.DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            io.appmetrica.analytics.impl.L7 l7 = this.f6198d;
            l7.f4596c = deferredDeeplinkParametersListener;
            if (l7.f4594a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f6197c.u();
        } catch (java.lang.Throwable th) {
            this.f6197c.u();
            throw th;
        }
    }

    public final synchronized void a(io.appmetrica.analytics.DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            io.appmetrica.analytics.impl.L7 l7 = this.f6198d;
            l7.f4595b = deferredDeeplinkListener;
            if (l7.f4594a) {
                l7.a(1);
            } else {
                l7.a();
            }
            this.f6197c.u();
        } catch (java.lang.Throwable th) {
            this.f6197c.u();
            throw th;
        }
    }
}
