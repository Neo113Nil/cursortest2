package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Wj extends AbstractC0652lh {
    public Wj(L6 l6) {
        super(l6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0652lh, io.appmetrica.analytics.impl.InterfaceC0678mh
    public final boolean a(Boolean bool) {
        return !this.f7814a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
