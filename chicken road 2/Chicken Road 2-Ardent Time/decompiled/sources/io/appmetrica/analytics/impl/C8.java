package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class C8 implements io.appmetrica.analytics.impl.InterfaceC0729to {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H8 f4165a;

    public C8() {
        this(new io.appmetrica.analytics.impl.H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        java.lang.String str = n8.f4712b;
        return ((io.appmetrica.analytics.impl.G8) this.f4165a.f4373a.a(n8.f4725o)).a(str != null ? io.appmetrica.analytics.coreutils.internal.StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C8(io.appmetrica.analytics.impl.H8 h8) {
        this.f4165a = h8;
    }
}
