package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes.dex */
public class Gn implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1041uo f6848a;

    public Gn(InterfaceC1041uo interfaceC1041uo) {
        this.f6848a = interfaceC1041uo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Object obj) {
        C0989so a6 = this.f6848a.a(obj);
        if (a6.f9268a) {
            return a6;
        }
        throw new ValidationException(a6.f9269b);
    }

    public final InterfaceC1041uo a() {
        return this.f6848a;
    }
}
