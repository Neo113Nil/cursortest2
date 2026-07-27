package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643fe implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8185a;

    public C0643fe(String str) {
        this.f8185a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Collection<Object> collection) {
        return AbstractC0860no.a((Collection) collection) ? new C0989so(this, false, AbstractC0279e.h(new StringBuilder(), this.f8185a, " is null or empty.")) : new C0989so(this, true, "");
    }
}
