package io.appmetrica.analytics.impl;

import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494fe implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7290a;

    public C0494fe(String str) {
        this.f7290a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Collection<Object> collection) {
        return AbstractC0711no.a((Collection) collection) ? new C0840so(this, false, B0.c.l(new StringBuilder(), this.f7290a, " is null or empty.")) : new C0840so(this, true, "");
    }
}
