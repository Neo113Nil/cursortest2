package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes.dex */
public class Gn implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0892uo f6003a;

    public Gn(InterfaceC0892uo interfaceC0892uo) {
        this.f6003a = interfaceC0892uo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Object obj) {
        C0840so a3 = this.f6003a.a(obj);
        if (a3.f8320a) {
            return a3;
        }
        throw new ValidationException(a3.f8321b);
    }

    public final InterfaceC0892uo a() {
        return this.f6003a;
    }
}
