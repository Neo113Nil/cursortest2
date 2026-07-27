package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class H8 implements InterfaceC0918vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f6012a;

    public H8() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        String str = s8.f6568b;
        return ((L8) this.f6012a.f6279a.a(s8.f6580o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public H8(M8 m8) {
        this.f6012a = m8;
    }
}
