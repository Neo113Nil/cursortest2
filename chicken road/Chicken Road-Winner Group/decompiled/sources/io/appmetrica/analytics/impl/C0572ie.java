package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572ie implements InterfaceC0892uo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7543a;

    public C0572ie(String str) {
        this.f7543a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0892uo
    public final C0840so a(Object obj) {
        return obj == null ? new C0840so(this, false, B0.c.l(new StringBuilder(), this.f7543a, " is null.")) : new C0840so(this, true, "");
    }

    public final String a() {
        return this.f7543a;
    }
}
