package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639qb implements io.appmetrica.analytics.impl.InterfaceC0703so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.String str) {
        return str == null ? new io.appmetrica.analytics.impl.C0652qo(this, false, "key is null") : str.startsWith(io.appmetrica.analytics.impl.G7.f4323b) ? new io.appmetrica.analytics.impl.C0652qo(this, false, "key starts with appmetrica") : str.length() > 200 ? new io.appmetrica.analytics.impl.C0652qo(this, false, "key length more then 200 characters") : new io.appmetrica.analytics.impl.C0652qo(this, true, "");
    }
}
