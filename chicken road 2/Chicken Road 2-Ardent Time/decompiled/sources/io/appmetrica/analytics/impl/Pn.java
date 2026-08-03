package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pn implements io.appmetrica.analytics.impl.InterfaceC0729to {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H8 f4852a;

    public Pn() {
        this(new io.appmetrica.analytics.impl.H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0729to
    public final byte[] a(io.appmetrica.analytics.impl.N8 n8, io.appmetrica.analytics.impl.C0489kh c0489kh) {
        byte[] bArr = new byte[0];
        try {
            bArr = io.appmetrica.analytics.coreutils.internal.io.Base64Utils.decompressBase64GzipAsBytes(n8.f4712b);
        } catch (java.lang.Throwable unused) {
        }
        byte[] a2 = ((io.appmetrica.analytics.impl.G8) this.f4852a.f4373a.a(n8.f4725o)).a(bArr);
        return a2 == null ? new byte[0] : a2;
    }

    public Pn(io.appmetrica.analytics.impl.H8 h8) {
        this.f4852a = h8;
    }

    public final io.appmetrica.analytics.impl.H8 a() {
        return this.f4852a;
    }
}
