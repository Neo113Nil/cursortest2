package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lf implements io.appmetrica.analytics.impl.InterfaceC0729to, io.appmetrica.analytics.impl.InterfaceC0843y8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0843y8
    public final int a(io.appmetrica.analytics.impl.I8 i8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        return android.text.TextUtils.isEmpty(n8.f4712b) ? new byte[0] : android.util.Base64.decode(n8.f4712b, 0);
    }
}
