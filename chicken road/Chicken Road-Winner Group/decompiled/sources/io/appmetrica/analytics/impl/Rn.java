package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes.dex */
public final class Rn implements InterfaceC0918vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f6537a;

    public Rn() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(s8.f6568b);
        } catch (Throwable unused) {
        }
        byte[] a3 = ((L8) this.f6537a.f6279a.a(s8.f6580o)).a(bArr);
        return a3 == null ? new byte[0] : a3;
    }

    public Rn(M8 m8) {
        this.f6537a = m8;
    }

    public final M8 a() {
        return this.f6537a;
    }
}
