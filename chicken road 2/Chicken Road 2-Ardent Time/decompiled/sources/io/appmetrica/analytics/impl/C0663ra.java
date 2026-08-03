package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663ra extends io.appmetrica.analytics.impl.C0638qa {
    public C0663ra(int i2, int i3) {
        this(i2, new io.appmetrica.analytics.impl.C0689sa(i3));
    }

    public final int a(java.lang.String str) {
        return io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0638qa
    public final int b(java.lang.Object obj) {
        return io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes((java.lang.String) obj).length;
    }

    public C0663ra(int i2, io.appmetrica.analytics.impl.C0689sa c0689sa) {
        super(i2, c0689sa);
    }
}
