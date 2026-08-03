package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850yf extends io.appmetrica.analytics.impl.C0638qa {
    public C0850yf(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.C0638qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(io.appmetrica.analytics.impl.Z z2) {
        if (z2 == null) {
            return 0;
        }
        return io.appmetrica.analytics.coreutils.internal.StringUtils.getUtf8BytesLength(z2.f5368b) + 12;
    }
}
