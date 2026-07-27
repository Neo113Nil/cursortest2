package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761k3 implements InterfaceC1067vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f8600a;

    public C0761k3() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        byte[] bArr = new byte[0];
        String str = s8.f7435b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        M8 m8 = this.f8600a;
        return ((L8) m8.f7135a.a(s8.f7448o)).a(bArr);
    }

    public C0761k3(M8 m8) {
        this.f8600a = m8;
    }
}
