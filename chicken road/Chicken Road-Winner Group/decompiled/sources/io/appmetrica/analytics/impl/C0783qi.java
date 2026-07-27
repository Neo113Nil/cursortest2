package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783qi implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8169a;

    public C0783qi(Map<String, ?> map) {
        this.f8169a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(String str) {
        return this.f8169a.containsKey(str) ? new C0840so(this, false, B0.c.k("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new C0840so(this, true, "");
    }
}
