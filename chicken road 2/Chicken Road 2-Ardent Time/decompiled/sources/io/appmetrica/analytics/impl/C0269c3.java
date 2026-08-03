package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269c3 implements io.appmetrica.analytics.impl.InterfaceC0729to {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H8 f5613a;

    public C0269c3() {
        this(new io.appmetrica.analytics.impl.H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        byte[] bArr = new byte[0];
        java.lang.String str = n8.f4712b;
        if (str != null) {
            try {
                bArr = android.util.Base64.decode(str, 0);
            } catch (java.lang.Throwable unused) {
            }
        }
        io.appmetrica.analytics.impl.H8 h8 = this.f5613a;
        return ((io.appmetrica.analytics.impl.G8) h8.f4373a.a(n8.f4725o)).a(bArr);
    }

    public C0269c3(io.appmetrica.analytics.impl.H8 h8) {
        this.f5613a = h8;
    }
}
