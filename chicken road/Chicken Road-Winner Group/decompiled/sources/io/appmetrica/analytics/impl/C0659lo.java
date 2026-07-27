package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659lo implements InterfaceC0735om {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f7828a;

    public C0659lo(UtilityServiceProvider utilityServiceProvider) {
        this.f7828a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735om
    public final void a(C0605jm c0605jm) {
        this.f7828a.updateConfiguration(new UtilityServiceConfiguration(c0605jm.f7662v, c0605jm.f7661u));
    }
}
