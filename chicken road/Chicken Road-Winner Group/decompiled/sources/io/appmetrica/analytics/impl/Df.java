package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Df extends C0956xa {
    public Df(int i3) {
        super(i3);
    }

    @Override // io.appmetrica.analytics.impl.C0956xa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z3) {
        if (z3 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z3.f6883b) + 12;
    }
}
