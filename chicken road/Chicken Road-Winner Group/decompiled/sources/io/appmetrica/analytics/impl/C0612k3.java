package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612k3 implements InterfaceC0918vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f7681a;

    public C0612k3() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        byte[] bArr = new byte[0];
        String str = s8.f6568b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        M8 m8 = this.f7681a;
        return ((L8) m8.f6279a.a(s8.f6580o)).a(bArr);
    }

    public C0612k3(M8 m8) {
        this.f7681a = m8;
    }
}
