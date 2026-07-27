package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932wc extends C0459e5 implements Ta, Sa {

    /* renamed from: w, reason: collision with root package name */
    public final C0781qg f8561w;

    /* renamed from: x, reason: collision with root package name */
    public final C0884ug f8562x;
    public final L6 y;

    public C0932wc(Context context, C0605jm c0605jm, X4 x4, C0898v4 c0898v4, C0781qg c0781qg, L6 l6, AbstractC0408c5 abstractC0408c5) {
        this(context, x4, c0898v4, new C0609k0(), new TimePassedChecker(), new C0983yc(context, x4, c0898v4, abstractC0408c5, c0605jm, new C0802rc(l6), C0878ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0878ua.k().x(), C0878ua.k().l(), new C0647lc()), c0781qg, l6);
    }

    @Override // io.appmetrica.analytics.impl.C0459e5
    public final void C() {
        this.f8561w.a(this.f8562x);
    }

    public final boolean D() {
        boolean optBoolean;
        zo zoVar = this.f7211t;
        synchronized (zoVar) {
            optBoolean = zoVar.f8715a.a().optBoolean("referrer_handled", false);
        }
        return optBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C0459e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C0898v4 c0898v4) {
        super.a(c0898v4);
        this.y.a(c0898v4.f8480i);
    }

    @Override // io.appmetrica.analytics.impl.C0459e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a() {
        zo zoVar = this.f7211t;
        synchronized (zoVar) {
            Ao ao = zoVar.f8715a;
            ao.a(ao.a().put("referrer_handled", true));
        }
    }

    public C0932wc(Context context, X4 x4, C0898v4 c0898v4, C0609k0 c0609k0, TimePassedChecker timePassedChecker, C0983yc c0983yc, C0781qg c0781qg, L6 l6) {
        super(context, x4, c0609k0, timePassedChecker, c0983yc, c0898v4);
        this.f8561w = c0781qg;
        C0463e9 k3 = k();
        k3.a(EnumC0569ib.EVENT_TYPE_REGULAR, new Mg(k3.b()));
        this.f8562x = c0983yc.a(this);
        this.y = l6;
        C0878ua.k().y().onMainReporterCreated(new Ak(this, c0898v4));
    }
}
