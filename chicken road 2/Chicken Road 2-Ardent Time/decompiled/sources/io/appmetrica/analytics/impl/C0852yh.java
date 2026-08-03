package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852yh extends io.appmetrica.analytics.impl.AbstractC0386gh {
    public C0852yh(io.appmetrica.analytics.impl.E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0386gh, io.appmetrica.analytics.impl.InterfaceC0412hh
    public final boolean a(java.lang.Boolean bool) {
        return !this.f5990a.isRestrictedForSdk() && ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool, java.lang.Boolean.TRUE)).booleanValue();
    }
}
