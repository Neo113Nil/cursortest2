package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721ie implements InterfaceC1041uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8454a;

    public C0721ie(String str) {
        this.f8454a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1041uo
    public final C0989so a(Object obj) {
        return obj == null ? new C0989so(this, false, AbstractC0279e.h(new StringBuilder(), this.f8454a, " is null.")) : new C0989so(this, true, "");
    }

    public final String a() {
        return this.f8454a;
    }
}
