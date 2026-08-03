package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516li implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f6372a;

    public C0516li(java.util.Map<java.lang.String, ?> map) {
        this.f6372a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.String str) {
        if (!this.f6372a.containsKey(str)) {
            return new io.appmetrica.analytics.impl.C0652qo(this, true, "");
        }
        return new io.appmetrica.analytics.impl.C0652qo(this, false, "Failed to activate AppMetrica with provided apiKey ApiKey " + str + " has already been used by another reporter.");
    }
}
