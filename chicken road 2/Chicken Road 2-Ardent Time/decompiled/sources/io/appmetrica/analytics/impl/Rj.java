package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rj extends io.appmetrica.analytics.impl.AbstractC0386gh {
    public Rj(io.appmetrica.analytics.impl.E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0386gh, io.appmetrica.analytics.impl.InterfaceC0412hh
    public final boolean a(java.lang.Boolean bool) {
        return !this.f5990a.isRestrictedForSdk() && ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool, java.lang.Boolean.TRUE)).booleanValue();
    }
}
