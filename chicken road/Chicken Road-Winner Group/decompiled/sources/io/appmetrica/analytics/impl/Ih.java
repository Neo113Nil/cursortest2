package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Ih extends C0459e5 {

    /* renamed from: w, reason: collision with root package name */
    public final String f6108w;

    /* renamed from: x, reason: collision with root package name */
    public final L6 f6109x;

    public Ih(Context context, X4 x4, C0898v4 c0898v4, L6 l6, C0605jm c0605jm, AbstractC0408c5 abstractC0408c5, InterfaceC1005z9 interfaceC1005z9) {
        this(context, x4, new C0609k0(), new TimePassedChecker(), new C0588j5(context, x4, c0898v4, abstractC0408c5, c0605jm, new Dh(l6), C0878ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0878ua.k().l(), interfaceC1005z9), l6, c0898v4);
    }

    @Override // io.appmetrica.analytics.impl.C0459e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C0898v4 c0898v4) {
        super.a(c0898v4);
        this.f6109x.a(this.f6108w, c0898v4.f8480i);
    }

    public Ih(Context context, X4 x4, C0609k0 c0609k0, TimePassedChecker timePassedChecker, C0588j5 c0588j5, L6 l6, C0898v4 c0898v4) {
        super(context, x4, c0609k0, timePassedChecker, c0588j5, c0898v4);
        this.f6108w = x4.b();
        this.f6109x = l6;
    }
}
