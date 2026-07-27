package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371ak extends C0459e5 {
    public C0371ak(Context context, C0605jm c0605jm, X4 x4, C0898v4 c0898v4, InterfaceC0678mh interfaceC0678mh, AbstractC0408c5 abstractC0408c5, W4 w4) {
        this(context, x4, new C0609k0(), new TimePassedChecker(), new C0588j5(context, x4, c0898v4, abstractC0408c5, c0605jm, interfaceC0678mh, C0878ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0878ua.k().l(), w4), c0898v4);
    }

    @Override // io.appmetrica.analytics.impl.C0459e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C0371ak(Context context, X4 x4, C0609k0 c0609k0, TimePassedChecker timePassedChecker, C0588j5 c0588j5, C0898v4 c0898v4) {
        super(context, x4, c0609k0, timePassedChecker, c0588j5, c0898v4);
    }
}
