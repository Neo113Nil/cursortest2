package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808lo implements InterfaceC0884om {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f8753a;

    public C0808lo(UtilityServiceProvider utilityServiceProvider) {
        this.f8753a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0884om
    public final void a(C0754jm c0754jm) {
        this.f8753a.updateConfiguration(new UtilityServiceConfiguration(c0754jm.f8580v, c0754jm.f8579u));
    }
}
